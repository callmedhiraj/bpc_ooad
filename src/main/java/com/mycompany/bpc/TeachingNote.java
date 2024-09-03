/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bpc;

/**
 *
 * @author LENOVO
 */
public class TeachingNote extends Book {
    private int teachingNoteID;
    private String notes;

    public TeachingNote(int teachingNoteID, String notes) {
        this.teachingNoteID = teachingNoteID;
        this.notes = notes;
    }

    public TeachingNote(int teachingNoteID, String notes, int bookID, String bookTitle) {
        super(bookID, bookTitle);
        this.teachingNoteID = teachingNoteID;
        this.notes = notes;
       
    }
    
    
}
