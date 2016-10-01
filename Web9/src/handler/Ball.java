package handler;

/**
 * Created by NotePad.by on 30.09.2016.
 */
public class Ball {
    private String color; //Свойство(цвет мяча)
    private double weight; //Свойство(вес мяча)

    public Ball(String color, double weight)
    {
        this.color = color;
        this.weight = weight;
    }

    public String GetBallColor()
    {
        return color;
    }

    public double GetBallWeight()
    {
        return weight;
    }
}
