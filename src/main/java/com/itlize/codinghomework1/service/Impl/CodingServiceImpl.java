package com.itlize.codinghomework1.service.Impl;

import com.itlize.codinghomework1.entity.*;
import com.itlize.codinghomework1.service.CodingService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service("CodingService")
public class CodingServiceImpl implements CodingService {

    @Override
    public ResponseEntity<?> codingTestOne(Menu menu) {
        List<Item> itemList = menu.getMenuDetail().getItems();
        Integer sum = 0;
        for (int i=0; i<itemList.size(); i++) {
            if (itemList.get(i) == null) {
                continue;
            }
            if (itemList.get(i).getLabel() == null) {
                continue;
            } else {
                String[] strings = itemList.get(i).getLabel().split(" ");
                sum += Integer.parseInt(strings[1]);
            }
        }
        return ResponseEntity.ok(sum);
    }

    @Override
    public ResponseEntity<?> codingTestTwo(CreditCard creditCard) {
        String[] cardNumber = creditCard.getCardNumber().split("");
        Integer sum = 0;
        Boolean digit = true;
        for (int i=0; i<cardNumber.length; i++) {
            if (digit){
                Integer twice = Integer.parseInt(cardNumber[i])*2;
                if (twice>=10){
                    String[] twoDigit = twice.toString().split("");
                    sum += Integer.parseInt(twoDigit[0])+Integer.parseInt(twoDigit[1]);
                } else {
                    sum += twice;
                }
            }
            digit = !digit;
        }

        if (sum%10==0) {
            return ResponseEntity.ok("This is a valid Credit Card");
        } else {
            return ResponseEntity.ok("This is not a valid Credit Card");
        }
    }

    private Integer pathCount = 0;
    public void DFS(Integer size, List<List<Integer>> cell,Integer x, Integer y) {
        if (x == size-1 && y == size-1) {
            this.pathCount += 1;
            return;
        }

        if (y < size-1 && cell.get(x).get(y+1) == 0) {
            List<List<Integer>> newcell = cell;
            newcell.get(x).set(y+1,1);
            DFS(size, newcell, x,y+1);
            cell.get(x).set(y+1,0);
        }
        if (x < size-1 && cell.get(x+1).get(y) == 0) {
            List<List<Integer>> newcell = cell;
            newcell.get(x+1).set(y,1);
            DFS(size, newcell, x+1,y);
            cell.get(x+1).set(y,0);
        }
        if (y > 0 && cell.get(x).get(y-1) == 0) {
            List<List<Integer>> newcell = cell;
            newcell.get(x).set(y-1,1);
            DFS(size, newcell, x,y-1);
            cell.get(x).set(y-1,0);
        }
        if (x > 0 && cell.get(x-1).get(y) == 0) {
            List<List<Integer>> newcell = cell;
            newcell.get(x-1).set(y,1);
            DFS(size, newcell, x-1,y);
            cell.get(x-1).set(y,0);
        }
    }

    @Override
    public ResponseEntity<?> codingTestThree(PrisonBreak prisonBreak) {
        List<Prison> prisons = prisonBreak.getCases();
        List<Integer> paths = new ArrayList<Integer>();
        for (Prison p:prisons) {
            List<List<Integer>> cell = p.getCells();
            Integer size = p.getSize();
            if (cell.get(0).get(0) == 1 || cell.get(size-1).get(size-1) == 1) {
                paths.add(0);
            } else {
                cell.get(0).set(0,1);
                this.pathCount = 0;
                DFS(size,cell,0,0);
                paths.add(this.pathCount);
            }
        }
        return ResponseEntity.ok(paths);
    }

    @Override
    public ResponseEntity<?> codingTestFour(String filepath) throws IOException {
        String pathname = filepath;
        File filename = new File(pathname);
        InputStreamReader reader = new InputStreamReader(
                new FileInputStream(filename));
        BufferedReader br = new BufferedReader(reader);
        String line = "";
        line = br.readLine();
        Integer age;
        List<String> report = new ArrayList<String>();
        while (line != null) {
            age = Integer.parseInt(line);
            if (0 <age && age <=2){
                report.add("Still in Mama's arms");
            } else if(3< age && age <= 4) {
                report.add("Prescholl Maniac");
            } else if(5< age && age <= 11) {
                report.add("Elementary school");
            } else if(12< age && age <= 14) {
                report.add("Middle school");
            } else if(15< age && age <= 18) {
                report.add("High school");
            } else if(19< age && age <= 22) {
                report.add("College");
            } else if(23< age && age <= 65) {
                report.add("Working for the man");
            } else if(66< age && age <= 100) {
                report.add("The Golden Years");
            } else {
                report.add("This program is for humans");
            }
            line = br.readLine();
        }
        return ResponseEntity.ok(report);
    }


}
