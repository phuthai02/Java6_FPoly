package com.asm.vegetable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.asm.vegetable.entity.GioHang;
import com.asm.vegetable.entity.GioHangPK;
import com.asm.vegetable.repository.GioHangRepository;
import com.asm.vegetable.util.AppConstraint;

@Service
public class GioHangService {
	@Autowired
	private GioHangRepository rep;
	
	public GioHang create(GioHang obj) {
		obj.setId(null);
		return rep.save(obj);
	}

	public GioHang update(GioHang obj) {
		return rep.save(obj);
	}

	public GioHangPK delete(GioHangPK id) {
		 rep.deleteById(id);
		return id;
	}
	
	public GioHang findById(GioHangPK id) {
		if(rep.findById(id).isPresent()) {
			return rep.findById(id).get();
		} else return null;
	}
	
	public List<GioHang> getAll() {
		return rep.findAll();
	}
	
	public Page<GioHang> getPage(int pageIndex, Boolean sortType) {
		if (sortType) {
			return rep.findAll(PageRequest.of(pageIndex, AppConstraint.pageSize, Sort.by("id").ascending()));
		} else {
			return rep.findAll(PageRequest.of(pageIndex, AppConstraint.pageSize, Sort.by("id").descending()));
		}
	}
	
	public List<GioHangPK> delete(List<GioHangPK> listId) {
		if (listId != null) {
			List<GioHang> listDelete = rep.findAllById(listId);
			rep.deleteAll(listDelete);
			return listId;
		} else
			return null;
	}

}
