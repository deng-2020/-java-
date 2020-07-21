package com.hit.demo1;

public class TestMemoryCell {
    public static void main(String [] arg){
        MemoryCell m = new MemoryCell();

        m.write("37");
        String val = (String)m.read();
        System.out.println("Content are: " + val);
    }
}
