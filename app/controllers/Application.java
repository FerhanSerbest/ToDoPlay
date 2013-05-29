package controllers;

import play.*;
import models.*;
import play.data.*;
import play.mvc.*;

import views.html.*;

/**
 * 
 * @author Ferhan Serbest
 * Application class implementing the methods used to manipulate the tasks
 *
 */
public class Application extends Controller {
  
	
	/**
	 * Index method redirecting to the tasks() method
	 * @return redirection to tasks() method
	 */
	public static Result index() {
		return redirect(routes.Application.tasks());
	  }
	  
	
	/**
	 * Method rendering the task()
	 * @return the render for the tasks
	 */
	 public static Result tasks() {
	    return ok(
			    views.html.index.render(Task.all(), taskForm)
			  );
	}
	 /**
	  * Method for creating a new task 
	  * @return redirection to tasks() method
	  */
	 public static Result newTask() {
		  Form<Task> filledForm = taskForm.bindFromRequest();
		  if(filledForm.hasErrors()) {
		    return badRequest(
		      views.html.index.render(Task.all(), filledForm)
		    );
		  } else {
		    Task.create(filledForm.get());
		    return redirect(routes.Application.tasks());  
		  }
	 }
	  /**
	   * Method for deleting a task
	   * @param id - id of the task to be deleted
	   * @return redirection to tasks() method
	   */
	  public static Result deleteTask(Long id) {
		  Task.delete(id);
		  return redirect(routes.Application.tasks());
	  }
	  
	  static Form<Task> taskForm = Form.form(Task.class);
  
}
