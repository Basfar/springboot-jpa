/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javapoint.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Mukhtar
 */
@Controller
public class ControllerDemo {
    @RequestMapping
    public String home(){
    return "home.jsp";
}
}
