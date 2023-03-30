package bai_tap.copy_file;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class FileCopy {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ReadAndWriteFile raw = new ReadAndWriteFile();
        String sourceFile ="C:\\Users\\Thu Nguyen\\IdeaProjects\\untitled7\\src\\bai_tap\\copy_file\\source.txt";
        String targetFile="C:\\Users\\Thu Nguyen\\IdeaProjects\\untitled7\\src\\bai_tap\\copy_file\\target.html";
        List<String> vanBan = raw.readFile(sourceFile);
        raw.writeFile(targetFile, vanBan.toString());
    }
}
