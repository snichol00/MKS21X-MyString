public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  //initialize data
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int x = 0; x < s.length(); x++){
      data[x] = s.charAt(x);
    }
  }

  //returns char unless out of bounds
  public char charAt(int){

  }

  //finds length of string
  public int length(){

  }

  // implements like substring
  public String subSequence(int start, int end){

  }

  // converts back to a string in order to return
  public String toString(){

  }

  //returns 1 if the same, -1 otherwise? I don't really understand
  public int compareTo(charSequence s){
    
  }
}
