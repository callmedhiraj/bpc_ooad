/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bpc;

/**
 *
 * @author LENOVO
 */
public class LabManual extends TeachingNote {
    private int labmanualID;
    private String LabManualdescription;

    public LabManual(int labmanualID, String LabManualdescription, int teachingNoteID, String notes) {
        super(teachingNoteID, notes);
        this.labmanualID = labmanualID;
        this.LabManualdescription = LabManualdescription;
    }

    public LabManual(int labmanualID, String LabManualdescription, int teachingNoteID, String notes, int bookID, String bookTitle) {
        super(teachingNoteID, notes, bookID, bookTitle);
        this.labmanualID = labmanualID;
        this.LabManualdescription = LabManualdescription;
    }

    public int getLabmanualID() {
        return labmanualID;
    }

    public void setLabmanualID(int labmanualID) {
        this.labmanualID = labmanualID;
    }

    public String getLabManualdescription() {
        return LabManualdescription;
    }

    public void setLabManualdescription(String LabManualdescription) {
        this.LabManualdescription = LabManualdescription;
    }
    
    
}
