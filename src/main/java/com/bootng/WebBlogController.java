package com.bootng;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.bootng.model.BlogStoryModel;

@Controller
public class WebBlogController {

  @GetMapping("/blog")
  public String blogHome(Model model) {
    List<BlogStoryModel> posts = new ArrayList<BlogStoryModel>();
    posts.add(new BlogStoryModel("post101", "Blog about Earth", "Earth blog ", "Admin"));
    posts.add(new BlogStoryModel("post102", "Blog about Moon", "Moon blog ", "Admin"));
    posts.add(new BlogStoryModel("post102", "Blog about Sun", "Sun blog ", "Admin"));
    posts.add(new BlogStoryModel("post102", "Blog about Java", "Java blog ", "Admin"));
    model.addAttribute("RootPosts", posts);
    return "blog-post-list";
  }

}
