import java.util.ArrayList;

class TaskManager{
  ArrayList <Task> Tasks = new ArrayList<>();
  
  void addTask(Task task){
    Tasks.add(task);
  }
  void showTasks(){
    if(books.size()==0){
      System.out.println("現在登録されているTaskはありません。");
        }else{
      for(int i=0;i<books.size();i++){
        Task t=tasks.get(i);
        System.out.println((i+1)+":"+t.title+"/"+t.completed state+"/"+t.deadline);
      }
    }
  }
  boolean removetasks(int number){
    int index=number-1;
    
    if(number<1||number>tasks.size()){
    return false;
  }
  tasks.remove(index);
  return true;
  }
  int size(){
    return tasks.size();
  }
  }
