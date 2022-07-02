import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> vegitables = new LinkedList<>();

        /*основные методы LinkedList
           addFirst() / offerFirst(): добавляет элемент в начало списка
           addLast() / offerLast(): добавляет элемент в конец списка
           removeFirst() / pollFirst(): удаляет первый элемент из начала списка
           removeLast() / pollLast(): удаляет последний элемент из конца списка
           getFirst() / peekFirst(): получает первый элемент
           getLast() / peekLast(): получает последний элемент
         */
        // добавим в список ряд элементов
        vegitables.add("Potato");
        vegitables.add("Tomato");
        vegitables.addLast("Carrot"); //добавляем на последнее место
        vegitables.addFirst("Cacumber"); //добавляем на первое место
        vegitables.add(1, "Onion");//добавляем элемент по индексу 1



        System.out.printf("Vagitables list has %d elements \n ", vegitables.size());
        System.out.println("First element is: " + vegitables.get(1));
        vegitables.set(1,"Avokado");
        for (String list : vegitables) {
            System.out.println(list);
        }
        // проверка на наличие элемента в списке
        if (vegitables.contains("Potato")) {
            System.out.println("List contains Potato");
        }

        vegitables.remove("Potato");
        vegitables.removeFirst();//удаление 1 эл
        vegitables.removeLast();//удаление последнего эл
        System.out.printf("After removing list has %d elements \n -------------------\n",
                vegitables.size() );


        LinkedList<MyList>  friuts = new LinkedList<>();
        friuts.add(new MyList("Orange"));
        friuts.addFirst(new MyList("Banana"));
        friuts.addLast(new MyList("Strawberry"));
        System.out.printf("Fruits list has %d elements \n ", friuts.size());

        friuts.remove(1); //удаление 1 эл



        for (MyList fruit : friuts){
            System.out.println(fruit.getName());
        }
        MyList first =friuts.getFirst();
        System.out.println("Show first element: " + first.getName());

    }
}