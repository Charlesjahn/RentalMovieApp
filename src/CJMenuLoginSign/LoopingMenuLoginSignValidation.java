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

    private final MenuLoginSing loginSignOption = new MenuLoginSing();
    private final ValidateOption valiOpt = new ValidateOption();

    /**
     * Loop to make sure that the user's input will be valid#
     *
     * @param n
     * @return option
     */
    public int loopMenuLoginSignValidation(int n) {
        while (!valiOpt.optionValid(n)) {
            loginSignOption.MenuLoginSingDecorador();
            while (!loginSignOption.MenuLoginSing()) {
            }
            n = loginSignOption.getOption();
        }
        return loginSignOption.getOption();
    }

}
