package com.back.weins.Controller;

import com.alibaba.fastjson.JSON;
import com.back.weins.Utils.RequestUtils.BlogUtil;
import com.back.weins.entity.Label;

import com.back.weins.entity.User;
import com.back.weins.entity.UserMongo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogControllerTest {

    @Autowired
    private BlogController blogController;

    @Autowired
    private UserController userController;

    private MockMvc mockMvc;

    @Test
    public void testSetBlog() throws Exception {
        List<String> image = new ArrayList<String>();
        image.add("default");
        image.add("default");
        image.add("default");
        image.add("default");
        String ima = JSON.toJSONString(image);
        List<Label> labe = new ArrayList<Label>();
        Label la = new Label();
        la.setId(5);
        la.setContent("美食");
        la.setFlag(0);
        labe.add(la);
        Label la1 = new Label();
        la1.setId(7);
        la1.setContent("运动");
        la1.setFlag(0);
        labe.add(la1);
        String lab = JSON.toJSONString(labe);
        BlogUtil blogUtil = new BlogUtil(1, 1, "自己可见：今天天气很晴朗，鸟儿生生唱", "2020-7-15", "null", ima,
                lab, "徐珺涵");
        Integer t = blogController.setBlog(blogUtil);

    }

    @Test
    public void testGetBlog(){
        System.out.print(blogController.getPublicBlogs());
    }


    @Test
    public void testGetBlogsByLabel(){
        //userController.follow(2, 1, -1);
        System.out.print(blogController.getBlogsByLabel(5, 1).size());
    }
    @Test
    public void testGetBlogsLogined(){
//        userController.follow(1, 2, 1);
//        userController.follow(3, 1, 1);
//        userController.follow(3, 2, 1);
//        User user = new User();
//        user.setName("老八");
//        user.setPhone("15044341612");
//        user.setBirthday("1911-03-14");
//        user.setPassword("111111");
//        user.setReg_time("2020-07-15 14:00:00");
//        user.setSex(0);
//        user.setType(0);
//
//        UserMongo userMongo = new UserMongo();
//        userMongo.setAvatar("http://bpic.588ku.com/element_pic/01/55/09/6357474dbf2409c.jpg");
//        user.setUserMongo(userMongo);
//        userController.register(user);
        System.out.print((blogController.getBlogsLogined(3)).size());
    }

    @Test
    public void setLikeTest(){
        blogController.setLike(2, 4);
        blogController.setLike(3, 4);
    }

    @Test
    public void removeLikeTest(){
        blogController.removeLike(2, 4);
    }

    @Test
    public void removeBlogTest(){
        blogController.removeBlog(1, 4, 0);
    }

    @Test
    public void setReblog(){

    }

    @Test
    public void setCommentTest(){

    }

    @Test
    public void setCollect(){
//        blogController.setCollect(3, 3, true);
        blogController.setCollect(3, 3, false);
    }

}
