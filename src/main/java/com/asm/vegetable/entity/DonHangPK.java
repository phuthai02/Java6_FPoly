package com.asm.vegetable.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DonHangPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "donhang_id",insertable = false,updatable = false)
	private Long donhang_id;
	@Column(name="sanpham_id",insertable = false,updatable = false)
	private Long sanpham_id;
	public Long getDonhang_id() {
		return donhang_id;
	}
	public void setDonhang_id(Long donhang_id) {
		this.donhang_id = donhang_id;
	}
	public Long getSanpham_id() {
		return sanpham_id;
	}
	public void setSanpham_id(Long sanpham_id) {
		this.sanpham_id = sanpham_id;
	}
	

}
