package com.myspring.repository;


import com.myspring.model.Comment;

public interface CommentRepository {

    void storeComment(Comment comment);
}
