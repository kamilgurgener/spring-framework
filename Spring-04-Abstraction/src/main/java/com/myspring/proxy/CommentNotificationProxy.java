package com.myspring.proxy;

import com.myspring.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
