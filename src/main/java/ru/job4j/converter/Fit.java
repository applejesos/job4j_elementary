package ru.job4j.converter;

public class Fit {
    public static double manWeight(short m_height) {
        double rsl = (m_height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short w_height) {
        double rsl = (w_height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short m_height = 187;
        short w_height = 167;
        double man = Fit.manWeight(m_height);
        double woman = Fit.womanWeight(w_height);
        System.out.println("Man " + m_height + " is " + man);
        System.out.println("Woman " + w_height + " is " + woman);
    }
}
