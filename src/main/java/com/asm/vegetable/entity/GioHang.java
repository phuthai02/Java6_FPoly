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
public class GioHang implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private GioHangPK giohang_id;
	
	@ManyToOne 
	@JoinColumn(name = "nguoidung_id",insertable = false,updatable = false)
	private NguoiDung nguoidung;
	
	@ManyToOne 
	@JoinColumn(name = "sanpham_id",insertable = false,updatable = false)
	private RauCuQua sanpham;
	
	@Column
	private int soluong;
	
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

	public GioHangPK getGiohang_id() {
		return giohang_id;
	}

	public void setGiohang_id(GioHangPK giohang_id) {
		this.giohang_id = giohang_id;
	}

	public NguoiDung getNguoidung() {
		return nguoidung;
	}

	public void setNguoidung(NguoiDung nguoidung) {
		this.nguoidung = nguoidung;
	}

	public RauCuQua getSanpham() {
		return sanpham;
	}

	public void setSanpham(RauCuQua sanpham) {
		this.sanpham = sanpham;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
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
