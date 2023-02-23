package com.myspring;


import com.myspring.config.ProjectConfig;
import com.myspring.model.Comment;
import com.myspring.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 public class CydeoApp {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//
//         CommentService cs1 = context.getBean(CommentService.class);
//         CommentService cs2 = context.getBean(CommentService.class);
//
//        System.out.println("From cs1 " + cs1 );
//        System.out.println("From cs2 " + cs2 );
//
//        System.out.println(cs1.equals(cs2));

    }

}
