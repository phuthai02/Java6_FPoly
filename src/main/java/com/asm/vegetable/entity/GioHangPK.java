package com.asm.vegetable.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class GioHangPK implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "nguoidung_id",insertable = false,updatable = false)
	private Long nguoidung_id;
	@Column(name="sanpham_id",insertable = false,updatable = false)
	private Long sanpham_id;
	public Long getNguoidung_id() {
		return nguoidung_id;
	}
	public void setNguoidung_id(Long nguoidung_id) {
		this.nguoidung_id = nguoidung_id;
	}
	public Long getSanpham_id() {
		return sanpham_id;
	}
	public void setSanpham_id(Long sanpham_id) {
		this.sanpham_id = sanpham_id;
	}
	
}
