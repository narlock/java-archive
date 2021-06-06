import java.util.Date;

public class BlogEntry {
	private String username;
	private String text;
	private Date date;
	
	public BlogEntry(String username, String text, Date date) {
		this.username = username;
		this.text = text;
		this.date = date;
	}
	
	public void DisplayEntry() {
		System.out.println("Output of instance variables:\n----------------");
		System.out.println("\tUsername= " + this.username
							+ "\n\tText= " + this.text
							+ "\n\tDate= " + this.date);
	}
	
	public String getSummary() {
			String str = text;
			String[] words = str.split(" ");
			if(words.length <= 10)
				return text;
			else {
				String temp = "";
			for(int i = 0; i < 10; i++) {
				temp = temp + words[i] + " ";
			}
			return temp;
		}
	}
	
	public String getSummaryMyWay() {
		String temp = text;
		String result = "";
		
		//Insert algorithm 
			
			for(int i = 0; i < 10 && i <= temp.length(); i++) {
				int space_index = temp.indexOf(" ");
				if(i == 0) 
					result = result + temp.substring(0, space_index);
				else
				result = result + " " + temp.substring(0, space_index);
				temp = temp.substring(space_index + 1);
			}
		
		return result;
	}
}
