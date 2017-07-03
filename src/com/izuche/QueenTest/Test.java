package com.izuche.QueenTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/** 
 * 类描述
 * @author Gmy
 * @version 1.0
 * 创建时间 2017年6月8日
 */
public class Test {
	
	public void date() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 30);
		Date time = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(time);
		System.out.println(format);
		System.out.println("--------------------");
//		calendar.add(Calendar.DATE, 30);
	}
	
	public void testxxs(String name) {
		String aString = "12314"+((name==null?"1":"0")+"");
		System.out.println(aString);
	}
	
	public static void main(String[] args) {
//		new Test().date();
		new Test().testxxs("111");
	}

}
