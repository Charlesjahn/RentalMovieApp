/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CJMenuLoginSign;

/**
 *
 * @author charl
 */
public class LoopingMenuLoginSignValidation {

    public int loopMenuLoginSignValidation(int n) {
        MenuLoginSing loginSignOption = new MenuLoginSing();
        while (!loginSignOption.optionValid(n)) {
            while (!loginSignOption.MenuLoginSing()) {
            }
            n = loginSignOption.getOption();
        }
        return loginSignOption.getOption();
    }

}