package com.hackerrank.errors;

public class MyDeadlock {

	String java = "java";
	String php ="PHP";
	
	Thread myTone = new Thread("Thrad One"){
		public void run() {
			while(true){
				synchronized (java) {
					synchronized (php) {
						System.out.println(java + php);
					}
				}
			}
		};
	};
	
	Thread myTtwo = new Thread("Thrad Two"){
		public void run() {
			while(true){
				synchronized (php) {
					synchronized (java) {
						System.out.println(php + java);
					}
				}
			}
		};
	};
	
	public static void main(String a[]){
        MyDeadlock mdl = new MyDeadlock();
        mdl.myTone.start();
        mdl.myTtwo.start();
    }
	
}
