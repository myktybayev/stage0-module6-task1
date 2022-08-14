package com.epam.mjc.stage0;

/*
Work with class Animal.
Provide it with 3 private fields - color(String), numberOfPaws(int), hasFur(boolean).
Add constructor with full parameters. Save the parameter order and names as it is listed in a second paragraph.
Add a methods getDescription(), witch would use class fields and return a string with such pattern "This animal is mostly (color). It has (numberOfPaws) paws and ('a'/'no' -> depends on value of hasFur) fur."
(Optional) In the method getDescription() change the word 'paw' depending on the numberOfPaws: number of paws is 1 -> 'paw', number of paws is different from 1 -> 'paws'.

 */
public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color,int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String pawStr = "paw";
        if(numberOfPaws > 1){
            pawStr = "paws";
        }

        String res = "This animal is mostly "+color+". It has "+numberOfPaws+" "+pawStr+" and "+
                ((hasFur)?"a":"no")+ " fur.";
        return res;
    }
}
