package GenericUtility;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
	/*
	 *it is used to generate random number 
	 * @return int
	 */
	public int getRandomNumber() {
		Random r=new Random();
		int ranNum = r.nextInt(10000);
		return ranNum;
	}
		//use to get systemdate including time
		//manish 
		//@return
		public String getSystemDateAndTime() {
			Date date=new Date();
			return date.toString();
			}
		/**
		 * it is used to get system date in yyyy_mm_dd
		 * @return
		 */
		public String getDateWith_YYYYMMDD_format() {
			Date date=new Date();
			String d=date.toString();
			String[] modified=d.split(" ");
			String YYYY=modified[5];
			String DD=modified[2];
			int MM=date.getMonth()+1;
			return YYYY+"_"+MM+"_"+DD;
			}
		
		/**
		 * it is used to get system date in dd_mm_yyyy
		 * @return
		 */
		public String getDateWith_dd_mm_yyyy_format() {
			Date date=new Date();
			String d=date.toString();
			String[] modified=d.split(" ");
			String YYYY=modified[5];
			String DD=modified[2];
			int MM=date.getMonth()+1;
			return DD+"_"+MM+"_"+YYYY;
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
