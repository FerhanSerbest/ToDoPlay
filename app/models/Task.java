package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

/**
 * 
 * @author Ferhan Serbest
 * class to implement the properties of a task
 */
@Entity
public class Task extends Model {
    
  @Id
  public Long id;
  
  @Required
  public String label;
  
  public static Finder<Long,Task> find = new Finder(
		    Long.class, Task.class
		  );
  
  /**
   * Method to list tasks
   * @return uses the Finder to list the tasks
   */
  public static List<Task> all() {
	  return find.all();
  }
  
  /**
   * Method to create a task
   * @param task - the task to be created
   */
  public static void create(Task task) {
	  task.save();
  }
  
  /**
   * Method to delete a task
   * @param id - id of the task to be deleted
   */
  public static void delete(Long id) {
	  find.ref(id).delete();
  }
    
}