package com.debilEnterprise;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        class Solution {
            public HashMap<String, Date> createMap() {
                HashMap<String, Date> map = new HashMap<String, Date>();
                map.put("существо", new Date("NOV 1 1980"));
                map.put("существо1", new Date("JUNE 1 1982"));
                map.put("существо2", new Date("JAN 1 1983"));
                map.put("существо3", new Date("JULY 1 1984"));
                map.put("существо4", new Date("JUNE 1 1985"));
                map.put("существо5", new Date("AUG 1 1986"));
                map.put("существо6", new Date("JUNE 1 1987"));
                map.put("существо7", new Date("JUNE 1 1988"));
                map.put("существо8", new Date("SEP 1 1980"));
                map.put("существо9", new Date("JUNE 1 1994"));


                return map;
            }

            public void removeAllSummerPeople(HashMap<String, Date> map) {

                for (Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator(); iter.hasNext(); ) {
                    Map.Entry<String, Date> pair = iter.next();
                    Date date = pair.getValue();
                    int month = date.getMonth();
                    if (4 < month && month < 8) {
                        iter.remove();
                    }
                }
            }
        }
    }
}