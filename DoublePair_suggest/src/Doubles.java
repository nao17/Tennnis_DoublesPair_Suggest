import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Doubles {
	static public void main (String test[]){
		//参加人数の入力
		int NumAttendance = 5;
		System.out.println("参加者が" + NumAttendance + "人の場合" );
		
		//参加者名を配列に格納
		List<String> members = new ArrayList<String>();
		members.add("A");
		members.add("B");
		members.add("C");
		members.add("D");
		members.add("E");
		
		//シャッフルする
		Collections.shuffle(members);
		
		for (int count = 0; count < NumAttendance -1 ; count++){
			int NumPair = count + 1; 
			System.out.println("ペア" + NumPair + "は," + members.get(count) + "さんと" + members.get(count+1) + "さんです。");  
			
		}
		
		for (int count = 0; count < NumAttendance -3 ; count++){
			int NumPair = count + 1; 
			int NumOpp = NumPair + 2;
			System.out.println("ペア" + NumPair + "は," + "ペア" + NumOpp +  "と試合してください。");  
			
		}
		
		
	    
}
}
