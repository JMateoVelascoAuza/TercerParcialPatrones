package ej1;

import java.util.Random;

public class AutoElectrico implements IAutoElectro {

    private int tanque = 0;

    @Override
    public void cargar() {
        int n = new Random().nextInt(10);
        if(n%1==0){
            tanque = n;
        }else {
            tanque = n + 1;
        }

    }

    @Override
    public int getEstadoElectricidad() {
        return tanque;
    }
}