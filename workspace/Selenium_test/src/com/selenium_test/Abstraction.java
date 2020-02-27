package com.selenium_test;

public class Abstraction {

	public static void main(String[] args) {

		
		abstract class xyz{
			
			void display(){
				System.out.println("this is normal method with body");
			}
			void display1(){
				System.out.println("this is normal method with body");
			}
			void display2(){
				System.out.println("this is normal method with body");
			}
			abstract void disp();
			
		}

		class abc extends xyz{

			@Override
			void disp() {
				// TODO Auto-generated method stub
				
			}
		abc obj=new abc();
			
			
			
		}
		

	}

}
