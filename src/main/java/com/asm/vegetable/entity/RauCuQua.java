package com.asm.vegetable.entity;



import java.io.Serializable;
import java.math.BigDecimal;
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
public class RauCuQua implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String ten;
	@Column
	private Double khoiluong;
	@Column
	private Date ngaynhap;
	@Column
	private Date hansudung;
	@Column
	private Integer soluong;
	@Column
	private String hinhanh;
	@Column
	private BigDecimal giatien;
	@Column
	private String theloai;
	
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
	
	@OneToMany(mappedBy = "sanpham")
	private List<GioHang> giohang;
	
	@OneToMany(mappedBy = "sanpham")
	private List<DonHangChiTiet> dhangctiet;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Double getKhoiluong() {
		return khoiluong;
	}

	public void setKhoiluong(Double khoiluong) {
		this.khoiluong = khoiluong;
	}

	public Date getNgaynhap() {
		return ngaynhap;
	}

	public void setNgaynhap(Date ngaynhap) {
		this.ngaynhap = ngaynhap;
	}

	public Date getHansudung() {
		return hansudung;
	}

	public void setHansudung(Date hansudung) {
		this.hansudung = hansudung;
	}

	public Integer getSoluong() {
		return soluong;
	}

	public void setSoluong(Integer soluong) {
		this.soluong = soluong;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public BigDecimal getGiatien() {
		return giatien;
	}

	public void setGiatien(BigDecimal giatien) {
		this.giatien = giatien;
	}

	public String getTheloai() {
		return theloai;
	}

	public void setTheloai(String theloai) {
		this.theloai = theloai;
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

	public List<DonHangChiTiet> getDhangctiet() {
		return dhangctiet;
	}

	public void setDhangctiet(List<DonHangChiTiet> dhangctiet) {
		this.dhangctiet = dhangctiet;
	}
	
	
}
