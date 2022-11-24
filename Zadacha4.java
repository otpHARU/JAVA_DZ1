package DZ1;

public class Zadacha4 {
    public String reverseWords(String s) {

        String[] arr = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        int start = 0;
        int end = arr.length - 1;

        System.out.println(arr.length);

        while(start < end) {

            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) sb.append(" ");
        }

        return sb.toString();
    }
}
