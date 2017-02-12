package com.insaf.spring.compress.controller;

/**
 * Created by DemaFayz on 05.01.2017.
 */

import com.insaf.spring.compress.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.*;

@RestController
public class BaseController {

    @Autowired
    ServletContext context;

    @Autowired
    private BaseService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String showBaseMassage(ModelMap modelMap) {
        return "Heeey, Server is running!!!";
    }

    @RequestMapping(value = "/uploadMyFile", method = RequestMethod.POST)
    @ResponseBody
    public String handleFileUpload(HttpServletRequest request) throws Exception {
        InputStream in = request.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        StringBuffer out = new StringBuffer();
        String line;
        while ((line = reader.readLine()) != null) {
            out.append(line);
        }
        System.out.println(out.toString());
        return String.valueOf(out.toString());
    }
}