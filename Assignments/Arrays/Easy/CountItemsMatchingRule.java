package com.rajul;
import java.util.*;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(new ArrayList<String>(Arrays.asList("phone","blue","pixel")));
        items.add(new ArrayList<String>(Arrays.asList("computer","silver","lenovo")));
        items.add(new ArrayList<String>(Arrays.asList("phone","gold","iphone")));

        String ruleKey = "color";
        String ruleValue = "silver";

        int ans = countMatches(items, ruleKey, ruleValue);
        System.out.println(ans);

    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            for (int j = 0; j < items.get(i).size(); j++) {
                if (ruleKey.equals("color")){
                    if (items.get(i).get(1).equals(ruleValue) && j == 1) count++;
                }
                else if (ruleKey.equals("type")){
                    if (items.get(i).get(0).equals(ruleValue) && j == 0) count++;
                }
                else if (ruleKey.equals("name")){
                    if (items.get(i).get(2).equals(ruleValue) && j == 2) count++;
                }
            }
        }
        return count;
    }

}
