package String1.demo;

public class TotalNoOfWords {

	public static void main(String[] args) {
		String s1="java string split method by javatpoint"; 
		String[] words=s1.split(" ");//split converts the string into an array
		/*for(String w:words){
			System.out.println(w);
			
		}*/
		for(int i=0;i<words.length;i++){
			System.out.println(words[i]);
		}

	}

}
