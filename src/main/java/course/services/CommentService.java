package course.services;

import course.entities.Comment;
import course.repositories.CommentRepository;
import course.reqmodels.ReqComment;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    @Transactional
    public String saveComment(ReqComment reqComment) {
        return commentRepository.save(new Comment(reqComment)).toString();
    }

    @Transactional
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

}
