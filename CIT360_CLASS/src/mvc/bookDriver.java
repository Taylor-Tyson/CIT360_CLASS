package mvc;

public class bookDriver {
	public static void main(String[] args) {
		book model  = getBookInfo();
	    bookView view = new bookView();
	    bookController controller = new bookController(model, view);
	    controller.updateInfo();
	    controller.updateInfo();
	}
	
	private static book getBookInfo(){
		book newBook = new book();
	    newBook.setTitle("This is the title of a book");
	    newBook.setAuthor("This is the author of a book");
	    return newBook;
	}
}
