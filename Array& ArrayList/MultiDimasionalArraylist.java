import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

import java.util.ArrayList;
public class MultiDimasionalArraylist {
  Scanner in = new Scanner(System.in);

  ArrayList<ArrayList<Integer>> list  = new  ArrayList<>();

  for(int i = 0; i< 3; i++) {
    list.add(new ArrayList<>());
  }

  for(int i = 0; i< 3; i++) {
    for(int j= 0; j<3; j++){
      list.get(i).add(in.nextInt())
    } 
  }

}


