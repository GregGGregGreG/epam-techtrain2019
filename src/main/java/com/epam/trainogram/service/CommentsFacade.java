package com.epam.trainogram.service;

import com.epam.trainogram.domain.Comment;
import com.epam.trainogram.domain.Post;

public interface CommentsFacade {
  void addComment(Post post, Comment comment);
}