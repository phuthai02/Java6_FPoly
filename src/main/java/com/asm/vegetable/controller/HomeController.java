package com.asm.vegetable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asm.vegetable.entity.RauCuQua;
import com.asm.vegetable.service.RauCuQuaService;

@Controller
@RequestMapping("/raucuqua")
public class HomeController {
	@Autowired
	private RauCuQuaService service;

	@GetMapping("")
	public String getProducts(Model model) {
		Page<RauCuQua> page = service.search("%%", 0);
		model.addAttribute("products", page);
		return "user/trangchu";
	}
	
	@GetMapping("/admin/product")
	public String getProductManagement(Model model) {
		Page<RauCuQua> page = service.adminSearch("%%", 0);
		model.addAttribute("products", page);
		return "admin/sanpham/danhsach";
	}


	@GetMapping("/admin/product/create")
	public String getProductCreate(Model model) {
		return "admin/sanpham/them";
	}
	
	@GetMapping("/admin/product/update")
	public String getProductUpdate(Model model) {
		return "admin/sanpham/sua";
	}
}