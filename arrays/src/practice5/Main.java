package practice5;

public class Main {

    public static void main(String[] args) {

        String[][] countries = new String[3][3];

        countries[0][0] = "Brazil";
        countries[0][1] = "Chile";
        countries[0][2] = "Uruguay";

        countries[1][0] = "Canada";
        countries[1][1] = "France";
        countries[1][2] = "Germany";

        countries[2][0] = "Italy";
        countries[2][1] = "Swiss";
        countries[2][2] = "Japan";

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                //System.out.println(countries[i][j]);
                System.out.printf("[%d][%d] = %s\n", i, j, countries[i][j]);
            }
        }

        System.out.println("-----------------------");

        //Irregular arrays
        String[][] cities = new String[3][];

        cities[0] = new String[3];
        cities[0][0] = "São Paulo";
        cities[0][1] = "Ribeirão Preto";
        cities[0][2] = "Uberlândia";

        cities[1] = new String[2];
        cities[1][0] = "Fortaleza";
        cities[1][1] = "Uberada";

        cities[2] = new String[1];
        cities[2][0] = "Belo Horizonte";

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                //System.out.println(countries[i][j]);
                System.out.printf("[%d][%d] = %s\n", i, j, cities[i][j]);
            }
        }

    }
}
