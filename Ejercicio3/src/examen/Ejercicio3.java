package examen;

public class Ejercicio3 {

    public String tituloTrabajo(String autor) {
        String result = "Error. Autor no encontrado";
        switch (autor) {
        case "SOKAINA":
        case "MARIA":
        case "DEYAN":
            result = "LambdaTest";
            break;
        case "CRISTIAN DAVID":
        case "ANGEL":
            result = "Circle CI";
            break;
        case "MARTA":
        case "JORGE":
            result = "Appium";
            break;
        case "DAVID":
        case "GUILLERMO":
            result = "Azure Pipelines";
            break;
        case "HUNOR":
        case "JESUS":
            result = "Gitlab CI";
            break;
        case "JUAN DIEGO":
        case "RUBEN":
            result = "GitHub Actions";
            break;
        case "ALEJANDRO":
            result = "Travis CI";
            break;
        default:
            break;
        }
        return result;
    }
}
