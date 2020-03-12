/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school.hr;

/**
 *
 * @author aso
 */
public class SchoolHr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //تم عمل اثنين اوبجكت   
        studint s1 = new studint();
        list l1 = new list();
        //--------------------------
        //تم تعريف هذه المتغيرات
        int x = 0;
        int y = 0;
        int retur = 0;
        int end = 0;
        int logout = 0;
//-----------------------------
        do {
            java.util.Scanner input = new java.util.Scanner(System.in);
           //             الجزء الخاص بتسجيل الدخول
            System.out.println("inter name");
            String name = input.nextLine();
            System.out.println("inter password");
            String pass = input.nextLine();

            for (x = 0; x < 3; x++) {
                if (name.contentEquals(s1.name2()[x]) && pass.contentEquals(s1.code2()[x])) {

                    System.out.println("halow studint " + s1.name2()[x] + " code " + s1.code2()[x]);
                }
            }
//------------------------------------------------------------------------------------------
           
           //الجزء الخاص بالقائمه الرئيسيه 

        do {
                
                System.out.println("shouic from list");
                System.out.println("1- " + "listcours");
                System.out.println("2- " + "yourcours");
                System.out.println("3- " + "ditailofcours");

                int num = input.nextInt();
                
                // الجزء الخاص بعرض جميع الكورسات
                for (x = 0; x < 9; x++) {

                    if (num == 1) {
                        System.out.println(l1.listcours()[x]);

                    }
                }
                //--------------------------------

                //الجزء الخاص بعرض الكورسات التي اشترك فيها الطالب
                for (x = 0; x < 3; x++) {

                    for (y = 0; y < 3; y++) {

                        if (num == 2 && name.contentEquals(s1.name2()[x])) {

                            System.out.println(l1.yourcours2()[x][y]);

                        }

                    }
                }

                // الجزء الخاص بحذف الكورس الغير مرغوب فيه
                if (num == 2) {

                    System.out.println("if you want to dilit cours inter its number");
                    end = input.nextInt();
                    for (x = 0; x < 3; x++) {
                        for (y = 0; y < 3; y++) {
                            if (end == 1 && name.contentEquals(s1.name2()[x])) {

                                System.out.println(l1.yourcours4()[x][y]);
                            }

                          else  if (end == 2 && name.contentEquals(s1.name2()[x])) {
                                System.out.println(l1.yourcours6()[x][y]);
                          }
                               else if (end == 3 && name.contentEquals(s1.name2()[x])) {
                                System.out.println(l1.yourcours8()[x][y]);
                                }
                                
                           
                        }
                    }
                }

                //----------------------------------------
                // الجزء الخاص بعرض تفاصيل كل كورس 
                for (x = 0; x < 3; x++) {
                    for (y = 0; y < 3; y++) {

                        if (num == 3 && name.contentEquals(s1.name2()[x])) {

                            System.out.println(l1.ditailofcours2()[x][y]);

                        }

                    }
                }
              //------------------------------
              //الجزء الخاص بحل الشيت للطالب الاول
                if (num == 3) {

                    System.out.println("if you want to answer sheet inter its number");

                    int sheet = input.nextInt();
                    if (sheet == 1 && name.contentEquals(s1.name2()[0])) {
                        System.out.println(l1.ditailofcours2()[0][0]);
                        String answer;
                        answer = input.next();

                    }
                    if (sheet == 2 && name.contentEquals(s1.name2()[0])) {

                        System.out.println(l1.ditailofcours2()[0][1]);
                        String answer2;
                        answer2 = input.next();

                    }

                    if (sheet == 3 && name.contentEquals(s1.name2()[0])) {

                        System.out.println(l1.ditailofcours2()[0][2]);
                        String answer3;
                        answer3 = input.next();

                    }

                }
             //-----------------------------------
                System.out.println("inter 2 to resturt menu and 3 to logout");
                retur = input.nextInt();

            } while (retur == 2);
        } while (retur == 3);

    }

}
