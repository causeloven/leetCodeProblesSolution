package Leetcode.june;

public class ExcelSheetColumnTitle168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while(columnNumber > 0){
            int remainder = (columnNumber - 1) % 26;
            sb.append((char) ('A' + remainder));
            columnNumber = (columnNumber-1)/26;
        }

        return sb.reverse().toString();
    }
}
