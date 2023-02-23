package bean_practice.proxy;

import bean_practice.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
