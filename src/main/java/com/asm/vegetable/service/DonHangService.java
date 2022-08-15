package com.asm.vegetable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.asm.vegetable.entity.DonHang;
import com.asm.vegetable.repository.DonHangRepository;
import com.asm.vegetable.util.AppConstraint;

@Service
public class DonHangService {
	@Autowired
	private DonHangRepository rep;
	
	public DonHang create(DonHang obj) {
		obj.setId(null);
		return rep.save(obj);
	}

	public DonHang update(DonHang obj) {
		return rep.save(obj);
	}

	public Long delete(Long id) {
		 rep.deleteById(id);
		return id;
	}
	
	public DonHang findById(Long id) {
		if(rep.findById(id).isPresent()) {
			return rep.findById(id).get();
		} else return null;
	}
	
	public List<DonHang> getAll() {
		return rep.findAll();
	}
	
	public Page<DonHang> getPage(int pageIndex, Boolean sortType) {
		if (sortType) {
			return rep.findAll(PageRequest.of(pageIndex, AppConstraint.pageSize, Sort.by("id").ascending()));
		} else {
			return rep.findAll(PageRequest.of(pageIndex, AppConstraint.pageSize, Sort.by("id").descending()));
		}
	}
	
	public List<Long> delete(List<Long> listId) {
		if (listId != null) {
			List<DonHang> listDelete = rep.findAllById(listId);
			rep.deleteAll(listDelete);
			return listId;
		} else
			return null;
	}

}
