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
public class list {

    String listcours;

    String yourcours;
    String ditailofcours;

    String[] listcours() {

        String listcours2[] = new String[9];
        listcours2[0] = "programing1";
        listcours2[1] = "programing2";
        listcours2[2] = "programing3";
        listcours2[3] = "math1";
        listcours2[4] = "math2";
        listcours2[5] = "math3";
        listcours2[6] = "data1";
        listcours2[7] = "data2";
        listcours2[8] = "data3";

        return listcours2;
    }

    String[][] yourcours2() {
        String yourcours3[][] = new String[3][3];
        yourcours3[0][0] = "programing1";
        yourcours3[0][1] = "math1";
        yourcours3[0][2] = "data1";

        yourcours3[1][0] = "programing2";
        yourcours3[1][1] = "math2";
        yourcours3[1][2] = "data2";

        yourcours3[2][0] = "programing3";
        yourcours3[2][1] = "math3";
        yourcours3[2][2] = "data3";

        return yourcours3;
    }

    String[][] yourcours4() {
        String yourcours5[][] = new String[3][3];
        
        yourcours5[0][0] = "empty";
        yourcours5[0][1] = "math1";
        yourcours5[0][2] = "data1";


        yourcours5[1][0] = "empty";
        yourcours5[1][1] = "math2";
        yourcours5[1][2] = "data2";

        yourcours5[2][0] = "empty";
        yourcours5[2][1] = "math3";
        yourcours5[2][2] = "data3";

        return yourcours5;
    }

    String[][] yourcours6() {
        String yourcours7[][] = new String[3][3];
        yourcours7[0][0] = "programing1";
        yourcours7[0][1] = "empty";
        yourcours7[0][2] = "data1";

        yourcours7[1][0] = "programing2";
        yourcours7[1][1] = "empty";
        yourcours7[1][2] = "data2";

        yourcours7[2][0] = "programing3";
        yourcours7[2][1] = "empty";
        yourcours7[2][2] = "data3";

        return yourcours7;
    }
    
    String[][] yourcours8() {
        String yourcours9[][] = new String[3][3];
        yourcours9[0][0] = "programing1";
        yourcours9[0][1] = "math1";
        yourcours9[0][2] = "empty";

        yourcours9[1][0] = "programing2";
        yourcours9[1][1] = "math2";
        yourcours9[1][2] = "empty";

        yourcours9[2][0] = "programing3";
        yourcours9[2][1] = "math3";
        yourcours9[2][2] = "empty";

        return yourcours9;
    }


    String[][] ditailofcours2() {
        String ditailofcours3[][] = new String[3][3];
        ditailofcours3[0][0] = "1-programing1 code aa ...doctor ahmed";
        ditailofcours3[0][1] = "2-math1  code bb ....doctor mohamed";
        ditailofcours3[0][2] = "3-data1  code cc ....doctor ali";

        ditailofcours3[1][0] = "programing2 code dd...doctor khaled";
        ditailofcours3[1][1] = "math2 code ff ....doctor saad";
        ditailofcours3[1][2] = "data2  code ee ....doctor moataz";

        ditailofcours3[2][0] = "programing3 code gg ...doctor yousef";
        ditailofcours3[2][1] = "math2 code kk...doctor mohareb";
        ditailofcours3[2][2] = "data3 code mm...doctor jack";

        return ditailofcours3;
    }

}
