package ua.com.yevhenpiven;

public class Main {

	public static void main(String[] args) {		
		// max value of massive
		int arrMax []= {-23,-21,-85,-45,-54};
		int aMax=arrMax[0];
		for(int i:arrMax) {
			if(i>aMax)
				aMax=i;}
		System.out.println(aMax);
		//min of massive
		int arrMin []= {23,2,-85,0,-28};
		int aMin=arrMin[0];
		for(int i:arrMin) {
			if(i<aMin)
				aMin=i;}
		System.out.println(aMin);		
		//average value of massive
		Integer aAverage=0;
		int arrAverage[]= {1,0,2,45,3,3};
		for(int i:arrAverage) {
			aAverage=aAverage+i;}
		System.out.println(aAverage.floatValue()/arrAverage.length);			
	}
	
	
	
	

}
