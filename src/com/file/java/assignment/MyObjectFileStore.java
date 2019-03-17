package com.file.java.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class MyObjectFileStore {
	
	public void storeObject(List<ProductDetails> productDetails){
        
        OutputStream ops = null;
        ObjectOutputStream objOps = null;
        try {
            ops = new FileOutputStream("D:\\MyProduct1.txt");
            objOps = new ObjectOutputStream(ops);
            objOps.writeObject(productDetails);
            objOps.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(objOps != null) objOps.close();
            } catch (Exception ex){
                 
            }
        }
         
    }
     
    public void displayObjects(){
         
        InputStream fileIs = null;
        ObjectInputStream objIs = null;
        try {
            fileIs = new FileInputStream("D:\\MyProduct1.txt");
            objIs = new ObjectInputStream(fileIs);
            List<ProductDetails> product = (List<ProductDetails>)objIs.readObject();
            for(ProductDetails p:product){
            System.out.println("Product details is:"+ p.getPid()+" "+ p.getCost()+" "+p.getQuantity());
            }
            double sum =0;
            System.out.println("total value of all six product is:");
            for(ProductDetails p:product){
                
                sum = sum+p.getCost();
                }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if(objIs != null) objIs.close();
            } catch (Exception ex){
                 
            }
        }
         
    }
     
    public static void main(String a[]){
    	List<ProductDetails> li  = new ArrayList<ProductDetails>();
    	li.add(new ProductDetails(12,1560, 2));
    	li.add( new ProductDetails(12,1560, 2));
    	li.add(new ProductDetails(2,3420, 1));
    	li.add(new ProductDetails(1,120, 2));
        MyObjectFileStore mof = new MyObjectFileStore();
        mof.storeObject(li);
        mof.displayObjects();
       /* ProductDetails p1 = new ProductDetails(12,1560, 2);
        ProductDetails p2 = new ProductDetails(2,3420, 1);
        ProductDetails p3 = new ProductDetails(1,120, 2);
        ProductDetails p4 = new ProductDetails(3,500, 3);
        ProductDetails p5 = new ProductDetails(4,700, 2);
        ProductDetails p6 = new ProductDetails(5,400, 1);*/
        /*mof.storeObject(p1);
        mof.displayObjects();
        mof.storeObject(p2);
        mof.displayObjects();
        mof.storeObject(p3);
        mof.displayObjects();
        mof.storeObject(p4);
        mof.displayObjects();
        mof.storeObject(p5);
        mof.displayObjects();
        mof.storeObject(p6);
        mof.displayObjects();*/
    }
}


