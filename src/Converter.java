public class Converter {

  public static void main(String[] args) {

  // string strFloat into a float conversion
  String strFloat = "374.25";
  float from_strFloat = Float.parseFloat(strFloat);

  // string strInt into an integer conversion
  String strInt = "1250";
  int from_strInt = Integer.parseInt(strInt);

  // float floatNum into an integer conversion
  float floatNum = 56.715f;
  int from_floatNum = (int) floatNum;  // Type casting

  // nteger intNum into a float conversion
  int intNum = 1500;
  float from_intNum = (float) intNum;  // Type casting to float

  // double doubleNum into a string conversion
  double doubleNum = 3.14159265;
  String from_doubleNum = Double.toString(doubleNum); 
  }
}

