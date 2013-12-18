package cn.egoal.pinche.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.egoal.pinche.domain.Menu;
import cn.egoal.pinche.mapper.MenuMapper;

@Service
public class MenuService {
	
	@Autowired
	private MenuMapper menuMapper;
	
	public Menu fun() {
		return menuMapper.getMenuByName("a");
	}
}
