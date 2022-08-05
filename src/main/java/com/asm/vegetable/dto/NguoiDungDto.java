package com.asm.vegetable.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.asm.vegetable.adapter.DtoAdapter;

import com.asm.vegetable.entity.NguoiDung;

public class NguoiDungDto implements DtoAdapter<NguoiDung> {

	@NotBlank(message = "Không được bỏ trống email :))")
	private String email;
	@NotBlank(message = "Không được bỏ trống mật khẩu :))")
	private String matkhau;
	@Size(max = 16, min = 8, message = "Mật khẩu lớn hơn 8 và nhỏ hơn 16 ký tự :))")
	@NotBlank(message = "Không được bỏ trống họ tên :))")
	private String hoten;
	@NotBlank(message = "Không được bỏ trống ngày sinh :))")
	private Date ngaysinh;
	@NotBlank(message = "Không được bỏ trống giới tính :))")
	private boolean gioitinh;
	@NotBlank(message = "Không được bỏ trống địa chỉ :))")
	private String diachi;
	@NotBlank(message = "Không được bỏ trống hình ảnh :))")
	private String hinhanh;
	@NotBlank(message = "Không được bỏ trống vai trò :))")
	private String vaitro;
	// default
	private Long id;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatkhau() {
		return matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public boolean isGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public String getVaitro() {
		return vaitro;
	}

	public void setVaitro(String vaitro) {
		this.vaitro = vaitro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public NguoiDung dtoToEntity() {
		NguoiDung nguoidung = new NguoiDung();
		nguoidung.setDiachi(this.getDiachi());
		nguoidung.setEmail(this.getEmail());
		nguoidung.setGioitinh(this.isGioitinh());
		nguoidung.setHinhanh(this.getHinhanh());
		nguoidung.setHoten(this.getHoten());
		nguoidung.setId(this.getId());
		nguoidung.setMatkhau(this.getMatkhau());
		nguoidung.setNgaysinh(this.getNgaysinh());
		nguoidung.setVaitro(this.getVaitro());
		return nguoidung;
	}

}
