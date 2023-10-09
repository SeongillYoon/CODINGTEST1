package CoTeLv_0;

public class 옹알이_1 {
	 public int solution(String[] babbling) {
	        int answer = 0;
	        for(int i=0; i<babbling.length; i++){
	            babbling[i] = babbling[i].replace("aya"," ");
	            babbling[i] = babbling[i].replace("ye"," ");
	            babbling[i] = babbling[i].replace("woo"," ");
	            babbling[i] = babbling[i].replace("ma"," ");
	            babbling[i] = babbling[i].trim();
	            if(babbling[i].equals("")){
	                answer++;
	            }
	            System.out.println(babbling[i]);
	        }
	        
	        return answer;
	    }
}
