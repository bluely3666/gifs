package com.chengzhang.gif.controller;

import com.chengzhang.gif.model.Gif;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;

/**
 * Created by chen on 02/07/2017.
 */
@Controller
public class GifController {
    @RequestMapping("/")

    public String listGif(){
       return "home";
    }

    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap){
        Gif gif = new Gif("compile-bot", LocalDate.of(2017,07,02),"chengzhang",true);
       modelMap.put("gif",gif);
        return "gif-details";
    }
}
