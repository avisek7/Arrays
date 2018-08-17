public class Test2 {
	public static void main(String[] args) {
		String str="I have two books";
		String st[]=str.split(" "); 
		int max=st[0].length();
		int min=st[0].length();
		String maxstr="";
		String minstr="";
		for(int i=0;i<st.length;i++) {
			if(max<st[i].length()) {
				max=st[i].length();
				maxstr=st[i];
			}
			if(min>=st[i].length()) {
				min=st[i].length();
				minstr=st[i];
				/*if you want all the smallest occourance then uncomment the below line*/
				//System.out.println("Smallest Word\t"+minstr+"\tLength\t"+min);
			}
		}
		System.out.println("Bigest Word\t:"+maxstr+"\tLength\t:"+max);
		/*if you want last smallest occourance then uncomment the below line*/
		System.out.println("Smallest Word\t:"+minstr+"\tLength\t:"+min);
	}
}
