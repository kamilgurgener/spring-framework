package bean_practice;


import bean_practice.model.Comment;
import bean_practice.service.CommentService;
import bean_practice.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 public class CydeoApp {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Johnson");
        comment.setText("Spring Framework");

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }

}
