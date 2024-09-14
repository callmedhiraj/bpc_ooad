/*
package statement
*/


import java.util.Date;

/**
 * The class for creation of Assignment
 * 
 */
public class Assignment{
    //properties 
    private String title;
    private Date releaseDate;
    private Date dueDate;
    private Double marks;
    
    //methods
    //getters and setters are here
    public void setTitle(String title){
        this.title = title;
    }
    public void setReleaseDate(Date releaseDate){
        this.releaseDate = releaseDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }
    //getters
    public String  getTitle(){
        return title; //this.title
    }
    public Date getReleaseDate(){
        return releaseDate;
    }
    //cotr
    public Assignment(){
        //default cotr
        //do nothing
        System.out.println("Test");
    }

    public Assignment(String title, Date releaseDate, Date dueDate, Double marks) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.dueDate = dueDate;
        this.marks = marks;
    }
    
    
    
}