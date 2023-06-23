/*
 * Copyright 2023 Marcos Berzosa Ortiz - marcos.berzosa.ortiz@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import java.util.Random;

/**
 *
 * @author Marcos Berzosa Ortiz - marcos.berzosa.ortiz@gmail.com
 */
public class UtilesGenerador {

    public static final Random RND = new Random();

    //Genera una contraseña con la longitud que pida el usuario y contiene mínimo una mayúscula, una minúscula, un carácter especial y un número.
    public static final String generarPassword(int longitud) {

        //Constantes
        String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String min = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String car = "!@#$%^&*()_+-=[]{}|;':,.<>/?";

        //Variables
        String password = "";
        boolean tieneMay = false;
        boolean tieneMin = false;
        boolean tieneNum = false;
        boolean tieneCar = false;

        for (int i = 0; i < longitud; i++) {
            int n = RND.nextInt(4);
            char c;
            switch (n) {
                case 0:
                    c = may.charAt(RND.nextInt(may.length()));
                    tieneMay = true;
                    break;
                case 1:
                    c = min.charAt(RND.nextInt(min.length()));
                    tieneMin = true;
                    break;
                case 2:
                    c = num.charAt(RND.nextInt(num.length()));
                    tieneNum = true;
                    break;
                default:
                    c = car.charAt(RND.nextInt(car.length()));
                    tieneCar = true;
            }
            password = c + password;
        }
        if (!tieneMay || !tieneMin || !tieneNum || !tieneCar) {
            return generarPassword(longitud);
        }
        return password;
    }

    public static final String generarAcronimoDirecto(String s) {
        String resto = s;
        String a = s.charAt(0) + "";
        int posicion;
        do {
            posicion = resto.indexOf(" ");
            if (posicion >= 0) {
                resto = resto.substring(posicion + 1);
                a = a + resto.charAt(0);
            }
        } while (posicion >= 0);
        return a;
    }

    public static final String generarAcronimoInverso(String s) {
        String resto = s;
        String a = resto.charAt(resto.length() - 1) + "";
        int posicion;
        do {
            posicion = resto.lastIndexOf(" ");
            if (posicion >= 0) {
                resto = resto.substring(0, posicion);
                a = resto.charAt(resto.length() - 1) + a;
            }
        } while (posicion >= 0);
        return a.toUpperCase();
    }
}
