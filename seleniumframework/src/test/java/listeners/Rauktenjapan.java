package listeners;

public class Rauktenjapan {

	public static void main(String[] args) {
		System.out.println(a());



	}
	public static int a() {
		int []A = {1,0,2,0,0,2};

		double b=0,l=0;
		int y=0;
		


		for(int i=0;i<A.length;i++) {
			l=l+Math.pow(2,A[i]);
		}
		//System.out.println(l);
		//		for(int i=0;i<A.length;i++) {
		//			b+=Math.pow(2,i);
		//			c=i;
		//			if(b>l) {
		//				break;
		//				
		//			}
		//			
		//			
		//		}return c;

		while(true) {
			b+=Math.pow(2,y);
			
			if(b>l) {
				break;

			}y++;
		}return y;
	}

}
