package ej1;

public class Client {
    public static void main(String[] args){
        AutoAdapter e1 = new AutoAdapter(new AutoElectrico());
        AutoGasolina g1 = new AutoGasolina();

        e1.llenarGas();
        System.out.println(e1.getEstadoCombustible());
        g1.llenarGas();
        System.out.println(g1.getEstadoCombustible());
    }
}
