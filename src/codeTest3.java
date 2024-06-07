public class codeTest3 {
  public static void main(String[] args) {
    String str =
        "When organizing items, always label each group with the appropriate category. category: books, category: electronics, category: clothing, category: kitchenware, and so on. ";
    printCategory(str);


  }

  public static void printCategory(String str) {
    int category = 0;
    int wordEnd = 0;

    while (true) {
      category = str.indexOf("category: ", wordEnd);
      if (category == -1) {
        break;
      }
      wordEnd =  str.indexOf(", ", category);
      String words = str.substring(category + "category: ".length(), wordEnd);
      System.out.println(words);
    }
  }
}
