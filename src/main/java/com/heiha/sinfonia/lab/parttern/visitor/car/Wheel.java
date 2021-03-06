package com.heiha.sinfonia.lab.parttern.visitor.car;

import com.heiha.sinfonia.lab.parttern.visitor.mechanic.Mechanic;

/**
 * @author singoasher
 * @date 2017/12/13
 */
public class Wheel extends CarComponent {
    @Override
    public void accept(Mechanic mechanic) {
        mechanic.visit(this);
    }
}
