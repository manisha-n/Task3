
package epam1;

public class Months {
	
	public void month(int month) {
		if ((month < 1) || (month > 12)) 
			System.out.println("Enter months in range");
		else {
		String[] months = {
		"jan",
		"feb",
		"march",
		"april",
		"may",
		"june",
		"july",
		"aug",
		"sep",
		"oct",
		"nov",
		"dec"
		};
		System.out.println(months[month-1]);
		}
		
		
	}
}
class kissmain{
	public static void main(String[] args) {
		Months obj=new Months();
		obj.month(4);
		
	}
}