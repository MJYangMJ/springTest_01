package com.yang.controller;

import com.yang.bean.Product;
import com.yang.form.ProductForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveProductController implements Controller {

    private static final Log logger = LogFactory.getLog(SaveProductController.class);

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("SaveProductController Called");
        ProductForm productForm = new ProductForm();

        productForm.setName(request.getParameter("name"));
        productForm.setPrice(request.getParameter("price"));

        Product product = new Product();
        product.setName(productForm.getName());
        try{
            product.setPrice(Integer.parseInt(productForm.getPrice()));
        }catch (NumberFormatException e){
        }

        logger.info("productName:"+product.getName()+" price:"+product.getPrice());

        return new ModelAndView("ProductDetails","product",product);
//        return new ModelAndView("/WEB-INF/jsp/ProductDetails.jsp","product",product);
    }
}
