import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

//タスク全体を管理するクラス
//追加・一覧表示・削除・完了処理をする
class TaskManager{
  ArrayList<Task> tasks = new ArrayList<>();//Taskを複数保存する

  //タスクを追加
  void addTask(Task task){
    tasks.add(task);
  }

  //登録されているタスクを一覧表示
  void showTasks(){
    if(tasks.size() == 0){
      System.out.println("現在登録されているTaskはありません。");
    }else{
      AtomicInteger i = new AtomicInteger(1);
      tasks.forEach(t ->
        System.out.println(i.getAndIncrement() + ":" + t.title + "/" + t.statusLabel() + "/" + t.deadline)
      );
    }
  }

  //指定された番号のタスクを削除
  boolean removeTask(int number){
    if(number < 1 || number > tasks.size()){
      return false;
    }
    int index = number - 1;
    tasks.remove(index);
    return true;
  }

  //指定された番号のタスクを完了にする
  boolean completeTask(int number){
    if(number < 1 || number > tasks.size()){
      return false;
    }
    int index = number - 1;
    tasks.get(index).completed = true;
    return true;
  }

  //現在登録されているタスクを返す
  int size(){
    return tasks.size();
  }
}
