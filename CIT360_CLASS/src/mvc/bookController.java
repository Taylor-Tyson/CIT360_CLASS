package mvc;

public class bookController {
	   private book model;
	   private bookView view;

	   public bookController(book model, bookView view){
	      this.model = model;
	      this.view = view;
	   }

	   public void setAuthor(String authName){
	      model.setAuthor(authName); 
	   }

	   public String getAuthor(){
	      return model.getAuthor(); 
	   }

	   public void setTile(String newTitle){
	      model.setTitle(newTitle); 
	   }

	   public String getTtile(){
	      return model.getTitle(); 
	   }

	   public void updateInfo(){ 
	      view.displayBookInfo(model.getTitle(), model.getAuthor());
	   } 
	}