package com.asm.vegetable.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class DonHangChiTiet implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private DonHangPK donhangchitiet_id;
	
	@ManyToOne 
	@JoinColumn(name = "donhang_id",insertable = false,updatable = false)
	private DonHang donhang;
	
	@ManyToOne 
	@JoinColumn(name = "sanpham_id",insertable = false,updatable = false)
	private RauCuQua sanpham;
	
	@Column
	private Long soluong;

	// default
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

	public DonHangPK getDonhangchitiet_id() {
		return donhangchitiet_id;
	}

	public void setDonhangchitiet_id(DonHangPK donhangchitiet_id) {
		this.donhangchitiet_id = donhangchitiet_id;
	}

	public DonHang getDonhang() {
		return donhang;
	}

	public void setDonhang(DonHang donhang) {
		this.donhang = donhang;
	}

	public RauCuQua getSanpham() {
		return sanpham;
	}

	public void setSanpham(RauCuQua sanpham) {
		this.sanpham = sanpham;
	}

	public Long getSoluong() {
		return soluong;
	}

	public void setSoluong(Long soluong) {
		this.soluong = soluong;
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
