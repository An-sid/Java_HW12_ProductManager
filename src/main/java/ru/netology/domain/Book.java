package ru.netology.domain;

public class Book extends Product {
  private String author;

  public String getAuthor() {
    return author;
  }

  public Book() {
    super();
  }

  public Book(int id, String name, int price, String author) {
    super(id, name, price);
    this.author = author;

  }

}