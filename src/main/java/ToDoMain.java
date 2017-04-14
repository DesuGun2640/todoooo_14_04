import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoMain {
    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        Scanner s=new Scanner(System.in);
        while (true){
            System.out.println("\n1.Добавить\n2.Просмотр\n3.Удалить\n");
            String cmd = s.nextLine();
            switch(cmd){
                case "1":
                    System.out.println("Вводи, епту");
                    String text = s.nextLine();
                    list.add(text); break;
                case "2":
                    System.out.println("Вот что в твоём списке:");
                    List<Item> tasks = list.view();
                    for(Item task :tasks){
                        System.out.println(task.text + task.id);
                    }
                    break;
                case "3":
                    System.out.println("Что удалить?(id)");
                    int id=Integer.parseInt(s.nextLine());
                    list.delete(id);
                    break;
            }
        }
    }


}
