package ru.netology.model;

import com.google.gson.annotations.Expose;

public class Post {
  @Expose
  private long id;
  @Expose
  private String content;
  private boolean beenRemoved;

  public Post() {
  }

  public Post(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public Post setId(long id) {
    this.id = id;
    return this;
  }

  public String getContent() {
    return content;
  }

  public Post setContent(String content) {
    this.content = content;
    return this;
  }

  public boolean isBeenRemoved() {
    return beenRemoved;
  }

  public void setBeenRemoved(boolean beenRemoved) {
    this.beenRemoved = beenRemoved;
  }
}
