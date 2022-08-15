package com.asm.vegetable.api;



import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.asm.vegetable.dto.RauCuQuaDto;
import com.asm.vegetable.entity.NguoiDung;
import com.asm.vegetable.entity.RauCuQua;
import com.asm.vegetable.service.NguoiDungService;
import com.asm.vegetable.service.RauCuQuaService;

@Controller
@RequestMapping("/api/products")
public class RauCuQuaApi {
	@Autowired
	private RauCuQuaService service;
	@Autowired
	private NguoiDungService userService;
	
	public RauCuQuaApi(RauCuQuaService service) {
		this.service = service;
	}

	@GetMapping("")
	public String getRauCuQua(@RequestParam(name = "page",required = false,defaultValue = "0") Integer pageNumber,
			@RequestParam(name = "name",required = false) String name,Model model
			){
			Page<RauCuQua> page;
			page=service.search("%"+name+"%",pageNumber);
			model.addAttribute("products", page);
		return "view/dstrangchu";
	}
	
	@GetMapping("/type")
	public String getRauCuQuaByTheLoai(@RequestParam(name = "page",required = false,defaultValue = "0") Integer pageNumber,
			@RequestParam(name = "theloai",required = false) String theloai,Model model
			){
			Page<RauCuQua> page;
			page=service.findByTheLoai(theloai,pageNumber);
			model.addAttribute("products", page);
		return "view/dstrangchu";
	}
	
	@GetMapping("/admin")
	public String getRauCuQuaAdmin(@RequestParam(name = "page",required = false,defaultValue = "0") Integer pageNumber,
			@RequestParam(name = "name",required = false) String name,Model model
			){
			Page<RauCuQua> page;
			page=service.adminSearch("%"+name+"%",pageNumber);
			model.addAttribute("products", page);
		return "view/dsraucuqua";
	}
	
	@GetMapping("/type/admin")
	public String getRauCuQuaByTheLoaiAdmin(@RequestParam(name = "page",required = false,defaultValue = "0") Integer pageNumber,
			@RequestParam(name = "theloai",required = false) String theloai,Model model
			){
			Page<RauCuQua> page;
			page=service.adminFindByTheLoai(theloai,pageNumber);
			model.addAttribute("products", page);
		return "view/dsraucuqua";
	}
	
	@PostMapping("/admin/create")
	public String createRauCuQua(@Valid RauCuQuaDto dto, BindingResult result, HttpServletRequest request,
			@RequestParam(name = "hinhanh") MultipartFile img){
		try {
			String email = request.getUserPrincipal().getName();
			NguoiDung u = (NguoiDung) userService.findByEmail(email);
			RauCuQua p = dto.dtoToEntity();
			p.setNguoitao(u.getId()+"");
			p.setNgaytao(new Date());
			if (!img.isEmpty()) {
				String fileName = new SimpleDateFormat("ddMMyyyyHHmmss").format(new Date());
				File file = new File(
						new File("src\\main\\resources\\static\\images").getAbsolutePath() + "/" + fileName);
				if (!file.exists()) {
					file.mkdirs();
				}
				img.transferTo(file);
				p.setHinhanh(fileName);
			} else {
				return null;
			}
			p = service.create(p);
			
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
		return "done";
	}
	
//	@DeleteMapping("/admin/delete")
//	public String delete(@RequestParam(name = "chk[]",required = false) Long[] chk, Model model){
//		List<Long> listDelete = new ArrayList<Long>();
//		System.out.println("123");
//		for (Long id : lstId) {
//			listDelete.add(id);
//		}
//		service.delete(listDelete);
//		Page<RauCuQua> page = service.getPage(0, false);
//		model.addAttribute("products", page);
//		return "view/dsraucuqua";
//	}
	
}