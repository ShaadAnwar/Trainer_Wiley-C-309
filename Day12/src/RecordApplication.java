
public class RecordApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Anonymous class approach 
//		Records r=new Records() {
//			
//			@Override
//			public in displayAllRecords(int x, int y) {
//				// TODO Auto-generated method stub
//				for(int i=x;i<=y;i++) {
//					System.out.println(i);
//				}
//				
//			}
//		};
//		
		//r.displayAllRecords(10, 20);
		//public void displayAllRecords(int x, int y);
//		Records r1=(int x,int y)->System.out.println("displayAll method is invoked");
//		r1.displayAllRecords(10, 20);
		
		Records r2=(a, b)->a+b;
		int ans=r2.displayAllRecords(10, 20);
		System.out.println(ans);

	}

}
