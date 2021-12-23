package services;

import model.Comment;
import model.CommentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private ApplicationContext context;

    public void sendComment(Comment c){

        CommentProcessor p = context.getBean(CommentProcessor.class);

        p.setComment(c);
        p.validateComment();
        p.processComment();

        c = p.getComment();
    }
}
