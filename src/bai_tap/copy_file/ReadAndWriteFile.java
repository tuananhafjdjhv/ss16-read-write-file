package bai_tap.copy_file;

import java.io.*;
import java.util.LinkedList;

public class ReadAndWriteFile {
        public void writeFile(String filePath,String vanBan){
            try {
                FileWriter writer = new FileWriter(filePath,true);
                BufferedWriter br = new BufferedWriter(writer);
                br.write("<button>Hùng</button> "+vanBan);
                br.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        public LinkedList<String> readFile(String filePath){
           LinkedList<String> vanBan = new LinkedList<>();
            try {
                File file = new File(filePath);
                if (!file.exists()){
                    throw new FileNotFoundException();
                }
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line ="";
                while ((line= br.readLine()) != null){
                    vanBan.add(line);
                    br.close();
                }
            } catch (Exception e){
                System.out.println("Fie không tồn tại or nội dung có lỗi!");
            }
            return vanBan;
        }
}
