import java.util.ArrayList;

class TaskManager{
  ArrayList <Task> tasks = new ArrayList<>();
  
  void addTask(Task task){
    tasks.add(task);
  }
  void showTasks(){
    if(tasks.size()==0){
      System.out.println("現在登録されているTaskはありません。");
        }else{
      for(int i=0;i<tasks.size();i++){
        Task t=tasks.get(i);
        System.out.println((i+1)+":"+t.title+"/"+t.completed state+"/"+t.deadline);
      }
    }
  }
  boolean removeTask(int number){
    int index=number-1;
    if(number<1||number>tasks.size()){
    return false;
  }
 tasks.get(index)completed=true;
    return true;
  }
  int size(){
    return tasks.size();
  }
}
