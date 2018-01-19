package com.yang.controller;

import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputProductController implements Controller {

    private static org.apache.commons.logging.Log logger = LogFactory.getLog(InputProductController.class);

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception{
        logger.info("InputProductController Called");
        return new ModelAndView("ProductForm");
//        return new ModelAndView("/WEB-INF/jsp/ProductForm.jsp");
    }


}
