package com.service.table;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

    ////////// TradeInq SeqNum
    TradeStructure t = new TradeStructure();

    public String seqNumWrite(String seqNo) {
        try {
            FileWriter writer = new FileWriter("F:\\anil\\notisFOSeqNo.txt");
            writer.write(seqNo);
            System.out.println("File write  :" + seqNo);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String seqNumRead() {
        try {
            BufferedReader bufferreader = new BufferedReader(new FileReader("F:\\anil\\notisSeqNoBuf1.txt"));
            String line;
            while ((line = bufferreader.readLine()) != null) {
                System.out.println("read line : " + line);
                line = bufferreader.readLine();
                // You can append it to another String to get the whole text or anything you like
            }
            bufferreader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    ////////// Message Id SeqNum
//    public String InqSeqNumWrite(String seqNo){
//     try {
//            FileWriter writer = new FileWriter("F:\\anil\\notisSeqNoBuf.txt", true);
//            BufferedWriter bufferedWriter = new BufferedWriter(writer);
//            bufferedWriter.write(items.get(0));
//            bufferedWriter.newLine();
////            bufferedWriter.write("See You Again!");
//                    System.out.println("---bufff");
//            bufferedWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
    public static void main(String[] args) {
        FileReadWrite f = new FileReadWrite();
        f.seqNumRead();
    }
}
