package Leetcode.june;

public class ProcessStringwithSpecialOperationsI3612 {
    public String processStr(String s) {
//        Если символ — строчная буква, добавить её в конец result.
//        Если символ — *, удалить последний символ из result (если result не пуст).
//        Если символ — #, дублировать текущую строку result и добавить копию в конец самой себе (т.е. result = result + result).
//        Если символ — %, развернуть текущую строку result (reverse).

      StringBuilder sb = new StringBuilder();

      for(char c : s.toCharArray()){
          if(c == '#'){
              String a = sb.toString();
              sb.append(a);
          }
          else if(c == '%'){
              sb.reverse();
          }
          else if(c  == '*'){
              if(sb.length() > 0){
                  sb.deleteCharAt(sb.length()-1);
              }
          }else{
              sb.append(c);
          }

      }

      return sb.toString();




    }
}
