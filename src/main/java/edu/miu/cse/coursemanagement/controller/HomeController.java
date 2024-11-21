package edu.miu.cse.coursemanagement.controller;

import edu.miu.cse.coursemanagement.dto.request.CourseRequestDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/home")
public class HomeController {
    @GetMapping
    public String home(Model model) {
        model.addAttribute("courseName", "cs489");
        model.addAttribute("courseRequestDTO",
                new CourseRequestDTO(
                        null,
                        null,
                        null)
        );
        return "home_page";
    }
}
