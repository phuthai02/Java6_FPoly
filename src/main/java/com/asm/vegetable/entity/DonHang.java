package com.asm.vegetable.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class DonHang implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String madonhang;
	
	@ManyToOne
	@JoinColumn(name="nguoidung_id",insertable = false,updatable = false)
	private NguoiDung nguoidung;
	
	@OneToMany(mappedBy = "donhang")
	private List<DonHangChiTiet> dhangctiet;

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
	public String getMadonhang() {
		return madonhang;
	}
	public void setMadonhang(String madonhang) {
		this.madonhang = madonhang;
	}
	public NguoiDung getNguoidung() {
		return nguoidung;
	}
	public void setNguoidung(NguoiDung nguoidung) {
		this.nguoidung = nguoidung;
	}
	public List<DonHangChiTiet> getDhangctiet() {
		return dhangctiet;
	}
	public void setDhangctiet(List<DonHangChiTiet> dhangctiet) {
		this.dhangctiet = dhangctiet;
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
	


}
