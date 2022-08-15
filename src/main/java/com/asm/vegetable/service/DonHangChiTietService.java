package com.asm.vegetable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.asm.vegetable.entity.DonHangChiTiet;
import com.asm.vegetable.entity.DonHangPK;
import com.asm.vegetable.repository.DonHangChiTietRepository;
import com.asm.vegetable.util.AppConstraint;

@Service
public class DonHangChiTietService {
	@Autowired
	private DonHangChiTietRepository rep;
	
	public DonHangChiTiet create(DonHangChiTiet obj) {
		obj.setId(null);
		return rep.save(obj);
	}

	public DonHangChiTiet update(DonHangChiTiet obj) {
		return rep.save(obj);
	}

	public DonHangPK delete(DonHangPK id) {
		 rep.deleteById(id);
		return id;
	}
	
	public DonHangChiTiet findById(DonHangPK id) {
		if(rep.findById(id).isPresent()) {
			return rep.findById(id).get();
		} else return null;
	}
	
	public List<DonHangChiTiet> getAll() {
		return rep.findAll();
	}
	
	public Page<DonHangChiTiet> getPage(int pageIndex, Boolean sortType) {
		if (sortType) {
			return rep.findAll(PageRequest.of(pageIndex, AppConstraint.pageSize, Sort.by("id").ascending()));
		} else {
			return rep.findAll(PageRequest.of(pageIndex, AppConstraint.pageSize, Sort.by("id").descending()));
		}
	}
	
	public List<DonHangPK> delete(List<DonHangPK> listId) {
		if (listId != null) {
			List<DonHangChiTiet> listDelete = rep.findAllById(listId);
			rep.deleteAll(listDelete);
			return listId;
		} else
			return null;
	}

}
