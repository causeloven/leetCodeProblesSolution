package Interview150;

public class StringCompression443 {
    public int compress(char[] chars) {
        int read = 0; // указатель для подсчета
        int write = 0; //указатель для записи

        while(read < chars.length){
            char currentChar = chars[read];
            int count = 0;

            while(read < chars.length && chars[read] == currentChar){
                read++;
                count++;
            }

            chars[write] = currentChar;
            write++; //сдвиг на индекс под запись

            if(count > 1){
                for (char c : String.valueOf(count).toCharArray()){
                    chars[write] = c;
                    write++;
                }
            }
        }

        return write;
    }
}
