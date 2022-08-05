package com.asm.vegetable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.asm.vegetable.entity.NguoiDung;

@Repository
public interface NguoiDungRepository extends JpaRepository<NguoiDung, Long> {
	@Query("select o from NguoiDung o where o.email like ?1")
	NguoiDung findByEmail(String email);
}
