package com.asm.vegetable.dto;

import java.math.BigDecimal;
import java.util.Date;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import com.asm.vegetable.adapter.DtoAdapter;
import com.asm.vegetable.entity.RauCuQua;

public class RauCuQuaDto implements DtoAdapter<RauCuQua>{
	
	@NotBlank(message = "Không được bỏ trống họ tên :))")
	private String ten;
	@NotBlank(message = "Không được bỏ trống khối lượng :))")
	@Positive(message = "Là số nguyên lớn hơn 0")
	private Double khoiluong;
	@NotBlank(message = "Không được bỏ trống ngày nhập :))")
	private Date ngaynhap;
	@NotBlank(message = "Không được bỏ trống hạn sử dụng :))")
	private Date hansudung;
	@NotBlank(message = "Không được bỏ trống số lượng :))")
	@Positive(message = "Là số nguyên lớn hơn 0")
	private Integer soluong;
	@NotBlank(message = "Không được bỏ trống hình ảnh :))")
	private String hinhanh;
	@NotBlank(message = "Không được bỏ trống giá tiền :))")
	@Positive(message = "Là số nguyên lớn hơn 0")
	private BigDecimal giatien;
	@NotBlank(message = "Không được bỏ trống thể loại :))")
	private String theloai;
	// default
	private Long id;
	
	
	
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

	@Override
	public RauCuQua dtoToEntity() {
		RauCuQua rcq = new RauCuQua();
		rcq.setId(this.getId());
		rcq.setTen(this.getTen());
		rcq.setKhoiluong(this.getKhoiluong());
		rcq.setNgaynhap(this.getNgaynhap());
		rcq.setHansudung(this.getHansudung());
		rcq.setSoluong(this.getSoluong());
		rcq.setHinhanh(this.getHinhanh());
		rcq.setGiatien(this.getGiatien());
		rcq.setTheloai(this.getTheloai());
		return rcq;
	}
}
