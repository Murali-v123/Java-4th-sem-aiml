package com.loopingstmnt;

public class BreakContinue {
	public static void main(String[] args) {
		int num=10;
		for(int i=1;i<num;i++) {
			if(i==5) {
				continue;
			}
			else if(i==8) {
				break;
			}
			System.out.println(i);
		}
	}
}
