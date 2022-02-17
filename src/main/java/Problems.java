public class Problems {

    public long repeatedString(String s, long n) {


        // Write your code here

        int counter = 0;

        int strCount = 0;


        char[] charArr = s.toCharArray();
        int strLength = charArr.length;

        StringBuilder sb = new StringBuilder("");

        while(counter < n) {

            sb.append(charArr[strCount]);
            strCount++;

            if(strCount >= strLength) {
                strCount = 0;
            }

            counter++;


        }

        String finalString = sb.toString();

        long aCount = 0;

        for(int i = 0; i < finalString.length(); i++) {


            if(finalString.charAt(i) == 'a') {
                aCount++;
            }






        }


        return aCount;
}
}
