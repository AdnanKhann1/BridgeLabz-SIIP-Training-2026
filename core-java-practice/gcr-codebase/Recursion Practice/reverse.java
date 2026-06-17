public static String reverse(String str) {

    if(str.length() == 0)
        return "";

    return reverse(str.substring(1))
           + str.charAt(0);
}