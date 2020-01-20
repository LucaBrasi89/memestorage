package com.sotnikov.memestorage.web;

import java.nio.charset.Charset;
import java.sql.Timestamp;
import java.util.List;
import java.util.Random;

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
    
    
    @RequestMapping("/random")
    public String createRandMeme(Model model) {
        model.addAttribute("appName", appName);
        
        byte[] array = new byte[12]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        Random rnd = new Random();
        int ctime = 100000 + rnd.nextInt(900000);
        int mtime = 100000 + rnd.nextInt(900000);
        Timestamp ctimeT = new Timestamp(ctime);
        Timestamp mtimeT = new Timestamp(mtime);
        
        Meme m = new Meme(generatedString, "Something", ctimeT, mtimeT);
        memeService.save(m);

        
        return "index";
    }
    
    
}