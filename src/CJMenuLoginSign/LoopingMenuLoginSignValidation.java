/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CJMenuLoginSign;

/**
 *
 * @author Charles Franklin Jahn
 */
public class LoopingMenuLoginSignValidation {

    public int loopMenuLoginSignValidation(int n) {
        MenuLoginSing loginSignOption = new MenuLoginSing();
        ValidateOption valiOpt = new ValidateOption();
        while (!valiOpt.optionValid(n)) {
            loginSignOption.MenuLoginSingDecorador();
            while (!loginSignOption.MenuLoginSing()) {
            }
            n = loginSignOption.getOption();
        }
        return loginSignOption.getOption();
    }

}
