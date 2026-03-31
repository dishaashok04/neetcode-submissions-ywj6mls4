class Solution {
    // List<String>  →  String  →  List<String>
    //we store the length of each string i.e metadata while encoding bcz join /concatenate wont work
    // lengthprefix pattern length#string for encoding
    // use String builder
    public String encode(List<String> strs) {
        StringBuilder result=new StringBuilder();// for encoding a SB
        for(String str:strs){
            result.append(str.length()).append("#").append(str);
        }
        return result.toString();//  convert String builder to string

    }

    public List<String> decode(String str) {
        List<String> result=new ArrayList<>(); // list for decoded strings
        int i=0;
        while(i<str.length()){
            int j=i;//j looks for #
            while(str.charAt(j)!='#'){
                j++; // loop goes on until it finds #
            }
            int length=Integer.parseInt(str.substring(i,j)); // looks for num before # at i and convert it to int
            j++;
            String word=str.substring(j,j+length); // extracts word of length of num
            result.add(word);
            i=j+length; // updates i value after that str
        }
    return result;

    }
}
