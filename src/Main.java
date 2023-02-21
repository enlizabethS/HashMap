import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Client,Integer> roomNumber = new HashMap<>();
        roomNumber.put(new Client("Акакий","Залупкин","Мужчина"),255);
        roomNumber.put(new Client("Снежанна","Трассовна","Трансгендер"),135);
        roomNumber.put(new Client("Аманда","Подгуборова","Женщина"),98);
        roomNumber.put(new Client("Ононий","Клизмовна","Асексуал"),23);
        roomNumber.put(new Client("Иосиф","Истребляев","Гетеросексуал"),666);

        for (Integer key : roomNumber.values()){
            System.out.println(key);
        }
    }
}