package com.sotnikov.memestorage.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sotnikov.memestorage.dao.MemeService;
import com.sotnikov.memestorage.persistence.model.Meme;

@Controller
public class HomeController {

	@Autowired
	private MemeService memeService;
	
	
    @Value("${spring.application.name}")
    String appName;

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "index";
    }
    
    @RequestMapping("/all")
    public String getAllMemes(Model model) {
        model.addAttribute("appName", appName);
        var memes = (List<Meme>) memeService.findAll();

        for (Meme meme : memes) {
			System.out.println(meme);
		}
        
        return "index";
    }
    
    
}