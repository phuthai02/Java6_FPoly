package com.asm.vegetable.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.asm.vegetable.entity.NguoiDung;
import com.asm.vegetable.service.NguoiDungService;
import com.asm.vegetable.util.AppConstraint;

@EnableWebSecurity
public class SpringSecurityConfiguration implements UserDetailsService {
	@Autowired
	private NguoiDungService service;

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		// @formatter:off
		http.authorizeHttpRequests(authz -> authz.antMatchers("/","/api/**","/raucuqua/**","/css/**","/images/**","/js/**","/bootstrap/**","/sanpham/**").permitAll()
//				.antMatchers("/admin/**").hasRole("admin")
//				.anyRequest().hasRole("user")
				).formLogin().defaultSuccessUrl("/raucuqua").permitAll().and()
			.logout().permitAll();
		;
		// @formatter:on
		return http.build();
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		NguoiDung u = service.findByEmail(email);
		if (u == null) {
			throw new UsernameNotFoundException(email);
		} else {
			UserDetails user = User.builder().username(u.getEmail()).password(u.getMatkhau())
					.roles(u.getVaitro().equalsIgnoreCase("admin") ? AppConstraint.ROLE_ADMIN : AppConstraint.ROLE_USER)
					.disabled(u.getTrangthai().equalsIgnoreCase("ACTV") ? AppConstraint.ACTIVE : AppConstraint.IN_ACTIVE ).build();
			return user;
		}
	}
}