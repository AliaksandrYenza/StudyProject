package No2;

import No2.ListObjects.RealizationMethodsList;
import No2.Methods.Methods;

public class MainClass {
    public static void main (String[] args){
        Methods methods = new RealizationMethodsList();
        new RealizationMethodsList().run();

        // совсем забыл про Map, но основная идея для полной реализации и list, и map- RealizationMethod можно сделать не только для list, а в качетве параметра принимать саму Collection
        //хотел так сделать, но не хватило времени и , особенно, знаний итераторов. тогда можно было бы не переписывать один и тот же код для list и map отдельно.
        //P.S. слак недоступен. не знаю причину.
    }
}
