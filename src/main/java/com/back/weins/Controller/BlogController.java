package com.back.weins.Controller;

import com.back.weins.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogService labelService;

}
