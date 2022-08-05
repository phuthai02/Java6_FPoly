package com.asm.vegetable.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.asm.vegetable.entity.RauCuQua;
import com.asm.vegetable.repository.RauCuQuaRepository;

@Service
public class RauCuQuaService {
	@Autowired
	private RauCuQuaRepository rep;
	
	public RauCuQua create(RauCuQua obj) {
		obj.setId(null);
		return rep.save(obj);
	}

	public RauCuQua update(RauCuQua obj) {
		return rep.save(obj);
	}

	public Long delete(Long id) {
		 rep.deleteById(id);
		return id;
	}
	
	public RauCuQua findById(Long id) {
		if(rep.findById(id).isPresent()) {
			return rep.findById(id).get();
		} else return null;
	}
	
	public List<RauCuQua> getAll() {
		return rep.findAll();
	}
	
	public Page<RauCuQua> getPage(int pageIndex, Boolean sortType) {
		if (sortType) {
			return rep.findAll(PageRequest.of(pageIndex, 10, Sort.by("id").ascending()));
		} else {
			return rep.findAll(PageRequest.of(pageIndex, 10, Sort.by("id").descending()));
		}
	}
	
	public List<Long> delete(List<Long> listId) {
		if (listId != null) {
			List<RauCuQua> listDelete = rep.findAllById(listId);
			rep.deleteAll(listDelete);
			return listId;
		} else
			return null;
	}

}
