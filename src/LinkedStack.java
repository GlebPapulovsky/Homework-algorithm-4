

public class LinkedStack {

    private Node tail; // ссылка на последний добавленный узел (обёртку)
    private int size; // размер стека, т.е. количество элементов в нём

    public void push(int value) {
        Node node = new Node(value); // создаём новый узел
        if (tail != null) { // если в стеке уже есть элементы
            node.setPrev(tail); // связываем новый узел с последним
        }
        tail = node; // назначаем новый узел последним узлом
        size++; // увеличиваем счётчик элементов
    }

    public int pop() {
        // ваш код
        // возьмите value из последнего узла
        // назначьте предыдущий к последнему узлу последним узлом
        int value=tail.getValue();
        tail=tail.getPrev();
        size--;
        return  value;
        
    }

    public int getSize() {
        return this.size;
        // ваш код
        // верните размер стека
    }

    public boolean isEmpty() {
        return tail==null;
        // ваш код
        // верните ответ на вопрос, не пустой ли стек
    }
     
    public String toString() {
        if (size==0){
            return "ЕMPTY  ";
        }
     
        String str="";
        Node node=tail;
        while (node.getPrev()!=null){
            str+=node.getValue()+" -> ";
            node=node.getPrev();
        }
        str+=node.getValue();
        return str;
        // если есть элементы, пройдитесь по связному списку,
        // выводя элементы.
        // вывод должен быть в точности как в комментариях к main
        // при этом этот метод не должен менять стек!
    }
}
