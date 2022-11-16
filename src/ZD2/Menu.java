package ZD2;

public class Menu {
    public static void main(String... args){
        Figures[] figures = new Figures[4];
        figures[0] = new Figures(10);        // Площадь квадрата
        figures[1] = new Figures(10, 5);     // Площадь прямоугольника
        figures[2] = new Figures(11);        // Площадь круга

        int areacube = 0;
        int arearect = 0;
        int arearound = 0;
        for(int i = 0; i < figures.length; i++){
            if(i == 0){
                areacube = figures[i].getAreaCube();
                System.out.println("Площадь квадрата: " + areacube);
            }else if(i == 1){
                arearect = figures[i].getAreaRectangle();
                System.out.println("Площадь прямоугольника: " + arearect);
            }else if(i == 2){
                arearound = figures[i].getAreaRound();
                System.out.println("Площадь круга: " + arearound);
            }else if(i == 4){
                int result = areacube + arearect + arearound;
                System.out.println("Общая площадь: " + result);
            }
        }
}
}
