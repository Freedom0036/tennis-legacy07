package com.summithai.tennis_legacy07;

public class Tennis {
	private static final int fifteen_code = 1;
	private static final int thirty_code  = 2;
	private static final int forty_code   = 3;

	private static final String fifteen_desc = "fifteen";
	private static final String thirty_desc  = "thirty";
	private static final String forty_desc 	 = "forty";
	private static final String deuce 		 = "deuce";

	private static final String player_one_desc  = "player one";
	private static final String player_two_desc  = "player two";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doProcess(3,4);
	}

	private static void doProcess(int pointPlyerOne,
						          int pointPlyerTwo) {
		int 	result;
		String 	message = null;
		try {
			result = pointPlyerOne - pointPlyerTwo;
			if (result < 0) {
			    result *= -1;
			}
			
			if (result == 0) {
				if ((pointPlyerOne >= 3) ||
					(pointPlyerTwo >= 3)) { 
					message = deuce;
				} else {
					message  = player_one_desc + " " + valueOf(pointPlyerOne) + " : ";
					message += player_two_desc + " " + valueOf(pointPlyerTwo);
				}
			} else if (result == 2) {   // ถ้าห่างกันเกิน 2 คะแนน แปลว่าจบแล้ว
				// คนใดคนหนึ่งเกินถึง 4 แต้มแล้ว 
				if ((pointPlyerOne >= 4) ||
					(pointPlyerTwo >= 4)) { 
					if (pointPlyerOne > pointPlyerTwo) {
						message = player_one_desc + " Win";
					} else {
						message = player_two_desc + " Win";
					}
				} else {
					message  = player_one_desc + " " + valueOf(pointPlyerOne) + " : ";
					message += player_two_desc + " " + valueOf(pointPlyerTwo);
				}
			} else {
				message  = player_one_desc + " " + valueOf(pointPlyerOne) + " : ";
				message += player_two_desc + " " + valueOf(pointPlyerTwo);
			}
			
			System.out.println(message);
		} finally {
			message = null;
		}
	}

	private static String valueOf(int code) {
		if (code == fifteen_code){
			return fifteen_desc;
		}
		else if (code == thirty_code){
			return thirty_desc;
		}
		else if (code == forty_code) {
			return forty_desc;
		} else{
			return "";
		}
	}
}
