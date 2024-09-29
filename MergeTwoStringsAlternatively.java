class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        
		
		StringBuilder sb=new StringBuilder();
		
		int s1l=word1.length();
		int s2l=word2.length();
        int min=Math.min(s1l,s2l);
		
		
		for(int i=0;i<min;i++){
		   sb.append(word1.charAt(i));
		   sb.append(word2.charAt(i));
		    
		}
		if(s1l!=s2l){
		if(s1l>s2l){
		    sb.append(word1.substring(min,s1l));
		}
		else{
		    sb.append(word2.substring(min,s2l));
		}
		}
		return sb.toString();
	}
}
    
