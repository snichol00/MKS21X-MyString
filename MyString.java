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
  public char charAt( int idx){
    if (idx < 0 || idx >= data.length){
      throw new IndexOutOfBoundsException();
    }
    return data[idx];
  }

  //finds length of string
  public int length(){
    return data.length;
  }

  // implements like substring
  public String subSequence(int start, int end){
    String output = "";
    if (start < 0 || end > data.length || end < start){
      throw new IndexOutOfBoundsException();
    }
    for (; start < end; start++){
      output += data[start];
    }
    return output;
  }

  // converts back to a string in order to return
  public String toString(){
    String output = "";
    for (int x = 0; x < data.length; x++){
      output += data[x];
    }
    return output;
  }

  //returns 0 if the same, 1 if greater than s, -1 if less than
  public int compareTo(CharSequence s){
    for (int x = 0; x < data.length; x++){
      if(this.charAt(x) > s.charAt(x)){
        return 1;
      }
      if(this.charAt(x) < s.charAt(x)){
        return -1;
      }
    }
    return 0;
    //returns zero if s equals this
  }
}
