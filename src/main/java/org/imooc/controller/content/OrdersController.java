package org.imooc.controller.content;

import org.imooc.bean.Orders;
import org.imooc.dto.AdDto;
import org.imooc.dto.BusinessDto;
import org.imooc.dto.OrdersDto;
import org.imooc.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {

	@Autowired
	private OrdersService ordersService;
	
	@RequestMapping
	public String init(Model model, OrdersDto ordersDto, HttpServletRequest request)
	{
		model.addAttribute("list", ordersService.searchByPage(ordersDto));
		model.addAttribute("searchParam", ordersDto);
		return "/content/orderList";
	}
}