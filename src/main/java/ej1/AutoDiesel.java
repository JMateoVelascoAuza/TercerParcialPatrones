package ej1;

import java.util.Random;

public class AutoDiesel implements IAutoGas {

    private int tanque = 0;

    @Override
    public void llenarGas() {
        tanque = new Random().nextInt(100);
    }

    @Override
    public int getEstadoCombustible() {
        return tanque;
    }
}

