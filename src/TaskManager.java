import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

class TaskManager{
  ArrayList<Task> tasks = new ArrayList<>();

  void addTask(Task task){
    tasks.add(task);
  }

  void showTasks(){
    if(tasks.size()==0){
      System.out.println("現在登録されているTaskはありません。");
    }else{
      AtomicInteger i = new AtomicInteger(1);
      tasks.forEach(t ->
        System.out.println(i.getAndIncrement() + ":" + t.title + "/" + t.statusLabel() + "/" + t.deadline)
      );
    }
  }

  boolean removeTask(int number){
    int index = number - 1;
    if(number < 1 || number > tasks.size()){
      return false;
    }
    tasks.remove(index);
    return true;
  }

  boolean completeTask(int number){
    int index = number - 1;
    if(number < 1 || number > tasks.size()){
      return false;
    }
    tasks.get(index).completed = true;
    return true;
  }

  int size(){
    return tasks.size();
  }
}
