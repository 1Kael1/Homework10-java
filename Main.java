package Homework10;

public class Main {

    public static void main(String[] args) {
        // Есть классы: GoldenApple -> Apple -> Fruit
        //                             Orange -> Fruit
        // Есть класс Box. Нужно:
        // 1. Организовать его так, чтобы он мог хранить только фрукты какого-то типа
        // 2. Реализовать методы добавления фрукта, пересыпания в другую коробку, получение сумарного веса
        // Ограничения:
        // В коробку с апельсинами нельзя добавить яблоки
        // В коробку с золотыми яблоками нельзя добавить апельсины и яблоки
        // Пересыпать из коробки с золотыми яблоками в коробку с яблоками можно!
        // 3.* Реализовать итерируемость по коробке

  
       Box<Apple> appleBox = new Box<>();
       Box<Orange> orangeBox = new Box<>();
       Box<GoldenApple> goldenAppleBox = new Box<>(); 

       appleBox.add(new Apple(1));
       appleBox.add(new GoldenApple(4));
      
       orangeBox.add(new Orange(7));
       System.out.println(appleBox.getWeight() + " kg in appleBox"); 
       System.out.println(orangeBox.getWeight() + " kg in orangeBox"); 
       System.out.println(goldenAppleBox.getWeight() + " kg in goldenAppleBox"); 
       System.out.println();

   
       goldenAppleBox.add(new GoldenApple(2)); 
       System.out.println(appleBox.getWeight() + " kg in appleBox"); 
       System.out.println(orangeBox.getWeight() + " kg in orangeBox"); 
       System.out.println(goldenAppleBox.getWeight() + " kg in goldenAppleBox");
       System.out.println();

       goldenAppleBox.moveTo(appleBox); 
  
        System.out.println(appleBox.getWeight() + " kg in appleBox"); 
        System.out.println(orangeBox.getWeight() + " kg in orangeBox"); 
        System.out.println(goldenAppleBox.getWeight() + " kg in goldenAppleBox"); 
        System.out.println();

        
    }

}
