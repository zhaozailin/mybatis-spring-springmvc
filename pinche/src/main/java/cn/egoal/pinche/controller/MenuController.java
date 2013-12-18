package cn.egoal.pinche.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.egoal.pinche.domain.Menu;
import cn.egoal.pinche.service.MenuService;

@Controller
@RequestMapping(value="/man")
public class MenuController {
	@Autowired
	private MenuService manService;

	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String getCreateForm(Menu menu) {
		System.out.println("test mybatis:" + manService.fun());
		System.out.println("test httpRequest:" + menu);
		return "showMessage";
	}
}
