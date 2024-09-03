/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bpc;

/**
 *
 * @author LENOVO
 */
public class Book {
    private int bookID;
    private String bookTitle;

    public Book() {
    }

    public Book(int bookID, String bookTitle) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    
    
}
