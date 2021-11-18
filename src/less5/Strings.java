package less5;




public class Strings {

  public static void main(String[] mss) {
    //1//System.out.println(palindrom("А роза упала на лапу Азора"));
    //2//System.out.println(delet_povtor("asdffghjj11222334566"));
    //3//System.out.println(Anagram("Гора","Рога"));
    //4//System.out.println(CompareTo("abcd","abc"));
    //5//System.out.println(CompareToIgnoreCase("abc","ABC"));
    //6//System.out.println(Concat("123","456"));
    //7//System.out.println(sravn_s_posled_simv("qwerty","qwerty"));
    //8//System.out.println(EndsWith("Help me", "me"));
    //9//System.out.println(Equals("gun", "gan"));
    //10//System.out.println("Stroka".length());
    //11//System.out.println("STROKA".toLowerCase());
    //12//System.out.println("stroka".toUpperCase());
    //13//System.out.println(SecondPoChastote("333221"));
    //14//System.out.println(delet_dublikatov("abccdeffgg"));
    //15//System.out.println(first_nepovtor("ABCAB"));
    //16//System.out.println(Start2End("qwertyqw"));
    //17//System.out.println(KolThree("aabbbctttyyppp"));
    //18//System.out.println(SummaZif("01as5d9f"));

  }

  public static boolean palindrom(String strok) {
    String str = strok.toUpperCase().replace(" ", "");
    char[] bk = str.toCharArray();
    int i = 0;
    int j = bk.length - 1;
    while (j > i) {
      if (bk[i] != bk[j]) {
        return false;
      }
      ++i;
      --j;
    }
    return true;
  }

  public static String delet_povtor(String str) {
    char[] bk = str.toCharArray();
    StringBuilder newStr = new StringBuilder();
    boolean povtor;
    for (int i = 0; i < bk.length; i++) {
      povtor = false;
      for (int j = i + 1; j < bk.length; j++) {
        if (bk[i] == bk[j]) {
          povtor = true;
          break;
        }
      }
      if (povtor == false) {
        newStr.append(bk[i]);
      }
    }
    return newStr.toString();
  }

  public static boolean Anagram(String str1, String str2) {
    if (str1.length() != str2.length())
      return false;
    StringBuilder s1 = new StringBuilder(str1.toUpperCase());
    StringBuilder s2 = new StringBuilder(str2.toUpperCase());
    int x, y;
    x = -1;
    while (++x < s1.length()) {
      y = -1;
      while (++y < s2.length()) {
        if (s1.charAt(x) == s2.charAt(y)) {
          s2.deleteCharAt(y);
          break;
        }
      }
    }
    return s2.length() == 0;
  }

  public static int CompareTo(String str1, String str2) {
    return str1.compareTo(str2);
  }

  public static int CompareToIgnoreCase(String str1, String str2) {
    return str1.compareToIgnoreCase(str2);
  }

  public static String Concat(String str1, String str2) {
    str1 += str2;
    return str1;
  }

  public static boolean sravn_s_posled_simv(String str, CharSequence cs) {
    return str.contentEquals(cs);
  }

  public static boolean EndsWith(String str, String end) {
    return str.endsWith(end);
  }

  public static boolean Equals(String str1, String str2) {
    return str1.equals(str2);
  }

  static final int NOOFCHARS = 256;

  static char SecondPoChastote(String str1) {
    int[] ctr = new int[NOOFCHARS];
    int i;
    for (i = 0; i < str1.length(); i++)
      (ctr[str1.charAt(i)])++;
    int ctr_first = 0, ctr_second = 0;
    for (i = 0; i < NOOFCHARS; i++) {
      if (ctr[i] > ctr[ctr_first]) {
        ctr_second = ctr_first;
        ctr_first = i;
      } else if (ctr[i] > ctr[ctr_second] && ctr[i] != ctr[ctr_first])
        ctr_second = i;
    }
    return (char) ctr_second;
  }

  public static String delet_dublikatov(String str) {
    char[] arr = str.toCharArray();
    String targetStr = "";
    String targetStr2 = "";
    for (char i : arr) {
      if (targetStr.indexOf(i) == -1) {
        targetStr += i;
      }
      else targetStr2 +=i;

    }
    for (char j : targetStr2.toCharArray()){
      targetStr=targetStr.replace(j, ' ');
    }
    targetStr=targetStr.replaceAll("\\s+", "");
    return targetStr;
  }
  public static String first_nepovtor(String str) {
    char[] bk = str.toCharArray();
    StringBuilder newStr = new StringBuilder();
    int k=0;
    for (int i = 0; i < bk.length; i++) {
      for (int j = i + 1; j < bk.length; j++) {
        if (bk[i] == bk[j]) {
          k+=1;
        }
      }
      if (k == 0) {
        newStr.append(bk[i]);
        break;
      }
      else k=0;

    }
    return newStr.toString();
  }
  public static boolean Start2End(String str){
    int EndStr = str.length();
    int TwoEndStr = str.length()-2;
    if (str.substring(0,2).equals(str.substring(TwoEndStr, EndStr)))
      return true;
    else if(str.length()<2) {
      return false;
    }
    else
      return false;
  }
  public static int KolThree(String str) {
    int k = 0;
    for (int i = 0; i < str.length()-2; i++)
    {
      char bk = str.charAt(i);
      if (bk == str.charAt(i+1) && bk == str.charAt(i+2))
        k++;
    }
    return k;
  }
  public static int SummaZif(String str){
    int sum = 0;
    for (int i=0; i < str.length(); i++){
      if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
        sum += str.charAt(i)-'0';
    }
    return sum;
  }
}

