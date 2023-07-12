
package guia5extra2;

public class RegistroLluvias {
    private double[][] registro;
    private String[] localidades;
    private String[] meses;

    public RegistroLluvias() {
        localidades = new String[]{"San Luis", "Merlo", "Villa Mercedes"};
        meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio",
                             "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        registro = new double[localidades.length][meses.length];
    }

    public void agregarDato(String localidad, String mes, double milimetros) {
        int localidadIndex = obtenerIndiceLocalidad(localidad);
        int mesIndex = obtenerIndiceMes(mes);
        if (localidadIndex != -1 && mesIndex != -1) {
            registro[localidadIndex][mesIndex] = milimetros;
        }
    }

    public double obtenerPromedioMasAlto() {
        double promedioMasAlto = 0.0;
        for (int i = 0; i < localidades.length; i++) {
            for (int j = 0; j < meses.length; j++) {
                if (registro[i][j] > promedioMasAlto) {
                    promedioMasAlto = registro[i][j];
                }
            }
        }
        return promedioMasAlto;
    }

    public double obtenerPromedioMasAltoPorLocalidad(String localidad) {
        int localidadIndex = obtenerIndiceLocalidad(localidad);
        if (localidadIndex != -1) {
            double promedioMasAlto = 0.0;
            for (int j = 0; j < meses.length; j++) {
                if (registro[localidadIndex][j] > promedioMasAlto) {
                    promedioMasAlto = registro[localidadIndex][j];
                }
            }
            return promedioMasAlto;
        }
        return 0.0;
    }

    public double obtenerDato(String localidad, String mes) {
        int localidadIndex = obtenerIndiceLocalidad(localidad);
        int mesIndex = obtenerIndiceMes(mes);
        if (localidadIndex != -1 && mesIndex != -1) {
            return registro[localidadIndex][mesIndex];
        }
        return 0.0;
    }

    public String[] getLocalidades() {
        return localidades;
    }

    public String[] getMeses() {
        return meses;
    }

    private int obtenerIndiceLocalidad(String localidad) {
        for (int i = 0; i < localidades.length; i++) {
            if (localidades[i].equals(localidad)) {
                return i;
            }
        }
        return -1;
    }

    private int obtenerIndiceMes(String mes) {
        for (int i = 0; i < meses.length; i++) {
            if (meses[i].equals(mes)) {
                return i;
            }
        }
        return -1;
    }
}

