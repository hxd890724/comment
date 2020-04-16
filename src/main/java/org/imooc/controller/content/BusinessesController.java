package org.imooc.controller.content;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;
import org.imooc.constant.DicTypeConst;
import org.imooc.constant.PageCodeEnum;
import org.imooc.dto.BusinessDto;
import org.imooc.service.BusinessService;
import org.imooc.service.DicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/businesses")
@Slf4j
public class BusinessesController {

	@Resource
	private DicService dicService;

	@Resource
	private BusinessService businessService;

	/**
	 * 商户列表
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String search(Model model, BusinessDto dto, HttpServletRequest request) {
		model.addAttribute("list", businessService.searchByPage(dto));
		model.addAttribute("searchParam", dto);
		return "/content/businessList";
	}

	/**
	 * 商户新增页初始化
	 */
	@RequestMapping(value = "/addPage", method = RequestMethod.GET)
	public String addInit(Model model) {
		model.addAttribute("cityList", dicService.getListByType(DicTypeConst.CITY));
		model.addAttribute("categoryList", dicService.getListByType(DicTypeConst.CATEGORY));
		return "/content/businessAdd";
	}

	/**
	 * 商户新增
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(BusinessDto dto, RedirectAttributes redirectAttributes) {
		if(businessService.add(dto)) {
			redirectAttributes.addFlashAttribute(PageCodeEnum.KEY, PageCodeEnum.ADD_SUCCESS);
		} else {
			redirectAttributes.addFlashAttribute(PageCodeEnum.KEY, PageCodeEnum.ADD_FAIL);
		}
		return "redirect:/businesses";
	}

	/**
	 * 商户修改页初始化
	 */
	@RequestMapping(value = "/modifyPage/{id}", method = RequestMethod.GET)
	public String modifyInit(Model model, @PathVariable("id") Long id) {
		model.addAttribute("cityList", dicService.getListByType(DicTypeConst.CITY));
		model.addAttribute("categoryList", dicService.getListByType(DicTypeConst.CATEGORY));
		model.addAttribute("modifyObj", businessService.getById(id));
		return "/content/businessModify";
	}

    /**
     * 商户修改
     */
	@RequestMapping(value = "/toModify/{id}", method = RequestMethod.POST)
	public String modify(@PathVariable("id") Long id, BusinessDto dto, RedirectAttributes redirectAttributes) {
		dto.setId(id);
		if(businessService.modify(dto)) {
			redirectAttributes.addFlashAttribute(PageCodeEnum.KEY, PageCodeEnum.MODIFY_SUCCESS);
			return "redirect:/businesses";
		} else {
			redirectAttributes.addFlashAttribute(PageCodeEnum.KEY, PageCodeEnum.MODIFY_FAIL);
			return "redirect:/businesses/modifyPage/"+id;
		}
	}

	/**
	 * 删除商户
	 */
	@RequestMapping(value = "/remove/{id}", method = RequestMethod.GET)
	public String remove(@PathVariable("id") Long id, RedirectAttributes redirectAttributes) {
		if(businessService.delete(id)){
			redirectAttributes.addFlashAttribute(PageCodeEnum.KEY, PageCodeEnum.REMOVE_SUCCESS);
			return "redirect:/businesses";
		} else{
			redirectAttributes.addFlashAttribute(PageCodeEnum.KEY, PageCodeEnum.REMOVE_FAIL);
			return "redirect:/businesses/remove/"+id;
		}
	}
}