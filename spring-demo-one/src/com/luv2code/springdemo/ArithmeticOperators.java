package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ArithmeticOperators 
{

	public static void main(String[] args) 
	{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int noOfEntries = Integer.parseInt(sc.nextLine());
        Map<String, Long> map = new HashMap<>();
        for(int i=0;i<noOfEntries;i++)
        {
        	String name = sc.nextLine();
        	Long phoneNo = Long.parseLong(sc.nextLine());
        	map.put(name, phoneNo);
        }
        while(sc.hasNextLine())
        {
        	String query = sc.nextLine();
        	System.out.println(map.get(query) != null ? query +"="+map.get(query) : "Not found");
        }
	}
        

}
