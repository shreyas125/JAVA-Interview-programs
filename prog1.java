// JAVA PROGRAM TO FIND SECOND LARGEST IN AN ARRAY//

public class prog1 {
	public static void main(String[] args) {
		int largest,sec_largest,i;
		int num[]={5,23,31,44};
		largest=sec_largest=num[0];
		for(i=0;i < num.length;i++) {
			if(num[i] > largest) {
				sec_largest=largest;
				largest=num[i];
			}
			else if(num[i] > sec_largest && num[i] < largest) {
				sec_largest=num[i];
			}
		}
		System.out.println(sec_largest);

	}

}
