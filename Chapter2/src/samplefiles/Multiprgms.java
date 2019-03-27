package samplefiles;
/* program related to Inheritance topic */

 class Multiprgms
{
 protected String event = "Personal";//multiprgms attribute
 public void planned() {//multiprgms method
	 System.out.println("Marriage or birthday parties");
 }
} 
 class Regular extends Multiprgms{
	 private String themes  = "New year";//regular attribute
	 public static void main(String[] args) {//Main method
	 Regular obj1 = new Regular();//created object for superclass inherited to subclass
	 obj1.planned();
	 //Display the value of the event attribute(from the multiprgms class) and the value of the themes from the regular class
	 System.out.println("General holidays" +obj1.event +" " + obj1.themes);
	 
 }
 
 
}
 