/*
 * Copyright 2022 Marcos Berzosa Ortiz - marcos.berzosa.ortiz@gmail.com.
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
package org.japo.java.app;

import java.util.Locale;
import java.util.Scanner;
import org.japo.java.libraries.UtilesAhorcado;

/**
 *
 * @author Marcos Berzosa Ortiz - marcos.berzosa.ortiz@gmail.com
 */
public class App {

    public static final Scanner SCN = new Scanner(System.in, "Windows-1252").useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public final void launchApp() {

        String palabra;
        String palabra2 = "";
        String palabraIni;
        String palabraFin;
        int huecos;
        int fase = 1;
        char letra;
        boolean salida;
        boolean letraOK;

        System.out.print("Elige la palabra(solo minúscula):");

        palabra = SCN.nextLine();

        huecos = palabra.length();
        for (int i = 0; i < huecos; i++) {
            palabra2 = palabra2 + '_';
        }

        do {
            letraOK = false;
            UtilesAhorcado.muñeco(fase);

            System.out.println(palabra2);

            System.out.print("Que letra eliges:");
            letra = SCN.nextLine().charAt(0);

            for (int i = 0; i < palabra.length(); i++) {
                if (letra == palabra.charAt(i)) {
                    palabraIni = palabra2.substring(0, i);
                    palabraFin = palabra2.substring(i + 1);
                    palabra2 = palabraIni + letra + palabraFin;
                    letraOK = true;
                }

            }
            if (!letraOK) {
                fase += 1;
            }
            salida = fase == 6 || palabra.equals(palabra2);
        } while (!salida);

        if (fase == 6) {
            UtilesAhorcado.muñeco(fase);
            System.out.println("-----------");
            System.out.println("HAS PERDIDO");
        } else {
            System.out.println(palabra2);
            System.out.println("----------");
            System.out.println("HAS GANADO");
        }
    }

}
