package org.imooc.controller.content;

import org.imooc.bean.Orders;
import org.imooc.dto.AdDto;
import org.imooc.dto.OrdersDto;
import org.imooc.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	private OrdersService ordersService;

	/**
	 * 初始化
	 * @param model
	 * @param ordersDto
	 * @return
	 */
	@RequestMapping
	public String init(Model model, OrdersDto ordersDto)
	{
		model.addAttribute("list", ordersService.searchByPage(ordersDto));
		model.addAttribute("searchParam", ordersDto);
		return "/content/orderList";
	}

	/**
	 * 查询
	 * @param model
	 * @param ordersDto
	 * @return
	 */
	@RequestMapping("/search")
	public String search(Model model, OrdersDto ordersDto) {
		model.addAttribute("list", ordersService.searchByPage(ordersDto));
		model.addAttribute("searchParam", ordersDto);
		return "/content/orderList";
	}
}