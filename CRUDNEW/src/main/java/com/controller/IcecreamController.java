package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Icecream;
import com.service.IceService;

@Controller
@RequestMapping(value="/Ice")
public class IcecreamController 
{
	@Autowired
	IceService iceService;

@RequestMapping(value="/addmenue",method=RequestMethod.GET)
public String getAddmenuePage(Map <String, Object> map)
{
map.put("icecream", new Icecream());

return "addmenue";

}
@RequestMapping(value="/saveIce",method=RequestMethod.POST)
public String saveice(Icecream icecream,Map <String, Object> map)
{
	iceService.saveice(icecream);
	return "redirect:addmenue";
}
@RequestMapping(value="/IceDisplay")
public String IceDisplay(Map<String, Object>map)

	
{
	map.put("iceList", iceService.getAllIcecreams());
	return "display";

}
@RequestMapping(value="/editIcecream/{id}", method=RequestMethod.GET)
public String editIcecream(@PathVariable("id") int id, Map<String, Object> map)
{
	Icecream icecream = iceService.findFlaver(id);
	map.put("icecream", icecream);
	
	return "update";

	
}
@RequestMapping(value="/updatice",method=RequestMethod.POST)
public String updatice(Icecream icecream,Map <String, Object> map)
{
	iceService.updatice(icecream);
	
	return "redirect:/Ice/IceDisplay";
}
@RequestMapping(value="/deleteice/{id}",method=RequestMethod.GET)
public String deleteice(@PathVariable("id")int id)
{
	Icecream icecream=new Icecream();
	icecream.setId(id);
	System.out.println("id==" +id);
	iceService.deleteice(icecream);
	
	return "redirect:/Ice/IceDisplay";

}
}