package com.asm.vegetable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.asm.vegetable.entity.NguoiDung;
import com.asm.vegetable.repository.NguoiDungRepository;
import com.asm.vegetable.util.AppConstraint;

@Service
public class NguoiDungService {
	@Autowired
	private NguoiDungRepository rep;
	
	public NguoiDung create(NguoiDung obj) {
		obj.setId(null);
		return rep.save(obj);
	}

	public NguoiDung update(NguoiDung obj) {
		return rep.save(obj);
	}

	public Long delete(Long id) {
		 rep.deleteById(id);
		return id;
	}
	
	public NguoiDung findById(Long id) {
		if(rep.findById(id).isPresent()) {
			return rep.findById(id).get();
		} else return null;
	}
	
	public List<NguoiDung> getAll() {
		return rep.findAll();
	}
	
	public Page<NguoiDung> getPage(int pageIndex, Boolean sortType) {
		if (sortType) {
			return rep.findAll(PageRequest.of(pageIndex, AppConstraint.pageSize, Sort.by("id").ascending()));
		} else {
			return rep.findAll(PageRequest.of(pageIndex, AppConstraint.pageSize, Sort.by("id").descending()));
		}
	}
	
	public NguoiDung findByEmail(String email) {
		return rep.findByEmail(email);
	}
	
	public List<Long> delete(List<Long> listId) {
		if (listId != null) {
			List<NguoiDung> listDelete = rep.findAllById(listId);
			rep.deleteAll(listDelete);
			return listId;
		} else
			return null;
	}

}
