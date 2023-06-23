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

/**
 *
 * @author Marcos Berzosa Ortiz - marcos.berzosa.ortiz@gmail.com
 */
public class UtilesAhorcado {

    private UtilesAhorcado() {
    }

    public static final int muñeco(int fase) {

        switch (fase) {
            case 1:
                System.out.println("______         🌞");
                System.out.println("|     |");
                System.out.println("|     o");
                System.out.println("|    /|\\");
                System.out.println("|    / \\");
                System.out.println("|");
                System.out.println("----");
                break;
            case 2:
                System.out.println("______         🌞");
                System.out.println("|     |");
                System.out.println("|     o");
                System.out.println("|    /|\\");
                System.out.println("|    /");
                System.out.println("|");
                System.out.println("----");
                break;
            case 3:
                System.out.println("______         🌞");
                System.out.println("|     |");
                System.out.println("|     o");
                System.out.println("|    /|\\");
                System.out.println("|");
                System.out.println("|");
                System.out.println("----");
                break;
            case 4:
                System.out.println("______         🌞");
                System.out.println("|     |");
                System.out.println("|     o");
                System.out.println("|    /|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("----");
                break;
            case 5:
                System.out.println("______         🌞");
                System.out.println("|     |");
                System.out.println("|     o");
                System.out.println("|     |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("----");
                break;
            case 6:
                System.out.println("______         🌑");
                System.out.println("|     |");
                System.out.println("|     ☠");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("----");
                break;
        }
        return fase;
    }
}
