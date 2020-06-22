package net.javaguides.todoapp.model;
import java.io.Serializable;
public class NewBean implements Serializable {
	 //   private static final long serialVersionUID = 1 L;
	    private String title;
	    private String date;
	    private String status;

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }
	    
	    public String getDate() {
	        return date;
	    }

	    public void setDate(String date) {
	        this.date = date;
	    }
	    public String getStatus() {
	        return status;
	    }

	    public void setStatus(String status) {
	        this.status = status;
	    }
	}



