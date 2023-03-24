package ej1;

public class AutoAdapter implements IAutoGas {

    private AutoElectrico autoElectrico;

    public AutoAdapter(AutoElectrico autoElectrico) {
        this.autoElectrico = autoElectrico;
    }

    @Override
    public void llenarGas() {
        autoElectrico.cargar();
    }

    @Override
    public int getEstadoCombustible() {
        return autoElectrico.getEstadoElectricidad();
    }
}
