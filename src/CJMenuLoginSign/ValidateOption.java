/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CJMenuLoginSign;

/**
 *
 * @author charl
 */
public class ValidateOption {
    // As the login menu has only 3 option, this validation will make sure that the user insert only valid option
    public boolean optionValid(int num) {
        return num == 1 || num == 2 || num == 3;
    }
}
