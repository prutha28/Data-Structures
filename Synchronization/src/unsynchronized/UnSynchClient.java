//package unsynchronized;
//
////class Caller implements Runnable {
////
////	String msg ;
////	Thread t ; 
////
////	public Caller( String msg){
////		this.msg = msg ;
////		t = new Thread(this) ;
////		t.start() ;
////	}
//
//	@Override
////	public void run() {
////		System.out.println("[" +msg);
////		try {
////			Thread.sleep(1000) ;
////		} catch (InterruptedException e) {
////			System.out.println("Interrupted");
////		}
////		System.out.println("]" +msg);
////	}
////}
//
//
//public class UnSynchClient{
//	public static void main(String[] args){
//		Caller c1 = new Caller("hello") ;
//		Caller c2 = new Caller("Synchronized") ;
//		Caller c3 = new Caller("world") ;
//		
//		try {
//			c1.t.join() ;
//			c2.t.join() ;
//			c3.t.join() ;
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
//}
