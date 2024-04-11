package factory;

public class Diller {
    String titleDiller;
    int ageDiller;

    public Diller(String titleDiller, int ageDiller) {
        this.titleDiller = titleDiller;
        this.ageDiller = ageDiller;
    }

    /**
     * В этом методе выполняем заказа авто у завода
     * @param factory - завод, у которого заказываем авто
     * @param count - количество авто, которое заказываем
     * @param models - массив названий моделей
     */
    void makeOrder(Factory factory,int count,String models[]){
        Order order = new Order(factory,count,models);
        order.showInfoOrder();
        order.showInfoCars(factory);
     }

    public int getAge(){
        return this.ageDiller;
    }
}
