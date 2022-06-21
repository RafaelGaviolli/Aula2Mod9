package br.com.rgaviolli;

public class Examples {

    public static void main(String args[]){

        //Boxing
        Boolean status = true;
        Boolean status1 = Boolean.TRUE;

        Character c = 'A';

        Integer age = 10;

        Long cpf = Long.valueOf(2002002002l);


        //Unboxing
        boolean status2 = Boolean.TRUE;
        char word = Character.valueOf('A');

        int age2 = Integer.valueOf(12);

        long cpf3 = Long.valueOf(1234567890);

    }
}
