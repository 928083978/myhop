package com.aaa.controller;

import com.aaa.entity.ban;
import com.aaa.service.banService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("ban")
public class banController {

    @Autowired
    banService service;

    /*@RequestMapping("add")
    public  String add(ban b){
        int count=service.add(b);
            return "show";
    }
*/
    @RequestMapping("update")
    public String update(ban b){
        int count=service.update(b);
         return "redirect:query";
    }
    @RequestMapping("query")
    public String query(Model model){
        List<ban> query=service.query();
        System.out.println(query);
        model.addAttribute("list",query);
        return "show";
    }

    @RequestMapping("delete")
    public String delete(Integer bid){
        int i=service.delete(bid);
        System.out.println("删除");
        return "redirect:query";
    }

    @RequestMapping("add")
    public String add(ban b){
        int i=service.add(b);
        System.out.println(b);
        return "redirect:query";
    }
}
