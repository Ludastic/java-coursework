package course.controllers;

import course.entities.Comment;
import course.reqmodels.ReqComment;
import course.services.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @GetMapping("/get_comments")
    public List<Comment> getComments() {
        return commentService.getAllComments();
    }

//    @GetMapping("/reviews")
//    public String reviews() {
//        return "reviews";
//    }

    @PostMapping("/add_comment")
    public String addComment(@ModelAttribute("comment") ReqComment comment) {
        commentService.saveComment(comment);
        return "redirect:/reviews";
    }
}
