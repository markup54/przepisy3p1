package pl.zabrze.zs10.myapplicationlisty3p1;

import java.util.ArrayList;

public class Repozytorium {
    public static ArrayList<Przepis> przepisy;

    public static void wygenerujPrzepisy(){
        przepisy = new ArrayList<>();
        przepisy.add(
                new Przepis(
                        "kakao",
                        "napoje",
                        "mleko, kakao",
                        R.drawable.kakao,
                        5,
                        0,
                        1,
                        0.5
                )
        );
        przepisy.add(
                new Przepis(
                        "sernik",
                        "ciasta",
                        "ziemniaki, ser, masło,cukier",
                        R.drawable.sernik,
                        90,
                        0,
                        8,
                        2.3
                )
        );
        przepisy.add(
                new Przepis(
                        "mufinki",
                        "ciastka",
                        "mleko, kakao, mąka, cukier",
                        R.drawable.kakao,
                        40,
                        0,
                        12,
                        1.6
                )
        );
        przepisy.add(
                new Przepis(
                        "makowiec",
                        "ciasta",
                        "mleko, mak, mąka, drożdże, cukier",
                        R.drawable.makowiec,
                        70,
                        0,
                        10,
                        3.14
                )
        );

    }

}
