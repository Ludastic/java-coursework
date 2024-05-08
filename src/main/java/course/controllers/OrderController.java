package course.controllers;

import course.entities.Comment;
import course.entities.Order;
import course.reqmodels.ReqComment;
import course.reqmodels.ReqForm;
import course.services.CommentService;
import course.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    private final CommentService commentService;

    @PostMapping("/make_order")
    public String makeOrder(@ModelAttribute("request") ReqForm reqForm) {
        System.out.println(reqForm);
        orderService.save(new Order(reqForm));
        return "redirect:/contact_us?privet";
    }
    @GetMapping("/contact_us")
    public String viewOrder(Model model){
        model.addAttribute("order", new ReqForm());
        return "contact_us";
    }
    @GetMapping("/about_us")
    public String viewAboutUsInfo() {
        return "about_us";
    }

    @GetMapping("/reviews")
    public String reviews(Model model) {
        List<Comment> comments = commentService.getAllComments();
        model.addAttribute("comments", comments);
        model.addAttribute("comment", new ReqComment());
        return "reviews";
    }

    @GetMapping("/portfolio")
    public String viewPortfolio() {
        return "portfolio";
    }

    @GetMapping("/main")
    public String viewMain() {
        return "main";
    }



}
