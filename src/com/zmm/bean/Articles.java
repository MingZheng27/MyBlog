package com.zmm.bean;

import java.sql.Timestamp;


/**
 * Articles entity. @author MyEclipse Persistence Tools
 */

public class Articles  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String title;
     private Timestamp updatetime;
     private String author;
     private String content;


    // Constructors

    /** default constructor */
    public Articles() {
    }

    
    /** full constructor */
    public Articles(String title, Timestamp updatetime, String author, String content) {
        this.title = title;
        this.updatetime = updatetime;
        this.author = author;
        this.content = content;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getUpdatetime() {
        return this.updatetime;
    }
    
    public void setUpdatetime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }

    public String getAuthor() {
        return this.author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
   








}