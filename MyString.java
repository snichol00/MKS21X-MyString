public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  //initialize data
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int x = 0; x < s.length(); x++){
      data[x] = s.charAt(x);
    }
  }
}
