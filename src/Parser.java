

public class Parser {



    //   static String pop = calc.userInput;
    static String userOtput(String hh) {
String oper = null;
        String rez = null;

        if (!hh.matches(("\"[^\"]{1,10}\"\\s*[+\\-*/]\\s*(\"[^\"]{1,10}\"|\\d+)"))){
            throw new MyExcepcion("Не коректный ввод: "+hh);
        }

        int kov2 = hh.indexOf("\"", 1);
        oper = hh.substring(kov2 + 1);


        if ( oper.contains("-")){
            rez = Rezultat.min(hh);
        }else if (oper.contains("+")){
            rez = Rezultat.plus(hh);
        }else if ( oper.contains("*")){
            rez = Rezultat.umn(hh);
        }else if (oper.contains("/")){
            rez = Rezultat.del(hh);
        } else {
            throw new MyExcepcion("операция не известна :" + hh);
        }

        if (rez.length()>40){
            rez = rez.substring(0,40) +"...";
        }

        return rez;

    }

}