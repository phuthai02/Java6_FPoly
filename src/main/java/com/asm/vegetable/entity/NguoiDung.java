package com.asm.vegetable.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class NguoiDung implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String email;
	@Column
	private String matkhau;
	@Column
	private String hoten;
	@Column
	private Date ngaysinh;
	@Column
	private boolean gioitinh;
	@Column
	private String diachi;
	@Column
	private String hinhanh;
	@Column
	private String vaitro;
	// default
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String trangthai;
	@Column
	private String nguoitao;
	@Column
	private Date ngaytao;
	@Column
	private String nguoicnhap;
	@Column
	private Date ngaycnhap;
	
	@OneToMany(mappedBy = "nguoidung")
	private List<GioHang> giohang;
	
	@OneToMany(mappedBy = "nguoidung")
	private List<DonHang> donhang;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}

	public String getNguoitao() {
		return nguoitao;
	}

	public void setNguoitao(String nguoitao) {
		this.nguoitao = nguoitao;
	}

	public Date getNgaytao() {
		return ngaytao;
	}

	public void setNgaytao(Date ngaytao) {
		this.ngaytao = ngaytao;
	}

	public String getNguoicnhap() {
		return nguoicnhap;
	}

	public void setNguoicnhap(String nguoicnhap) {
		this.nguoicnhap = nguoicnhap;
	}

	public Date getNgaycnhap() {
		return ngaycnhap;
	}

	public void setNgaycnhap(Date ngaycnhap) {
		this.ngaycnhap = ngaycnhap;
	}

	public List<GioHang> getGiohang() {
		return giohang;
	}

	public void setGiohang(List<GioHang> giohang) {
		this.giohang = giohang;
	}

	public List<DonHang> getDonhang() {
		return donhang;
	}

	public void setDonhang(List<DonHang> donhang) {
		this.donhang = donhang;
	}

	public String getVaitro() {
		return vaitro;
	}

	public void setVaitro(String vaitro) {
		this.vaitro = vaitro;
	}
	

}
