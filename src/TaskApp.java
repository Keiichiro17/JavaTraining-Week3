import java.util.Scanner;
import java.time.LocalDate;

class TaskApp{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    TaskManager taskmanager=new TaskManager();

    while(true){
      System.out.println("タスク管理システム");
      System.out.println("1:タスクを登録する");
      System.out.println("2:タスクを一覧表示する");
      System.out.println("3:タスクを削除する");
      System.out.println("4:タスクを完了する");
      System.out.print("0:終了");

      int choice;
      try{
        choice=Integer.parseInt(sc.nextLine());
      }catch (NumberFormatException e){
       System.out.println("もう一度入力してください");
        continue;
      }
      

      if(choice==1){
        String title;
        while(true){
        System.out.print("タイトル: ");
        title=sc.nextLine().trim();
        if(!title.isEmpty()) break;
         System.out.println("もう一度入力してください");
        }

      LocalDate deadline;
      while(true){   
        System.out.print("締切日: ");
        String s=sc.nextLine().trim();
        try{
          deadline=LocalDate.parse(s);
          break;
        }catch(Exception e){
          System.out.println("もう一度入力してください");
        }
      }
      

        Task task=new Task(title,false,deadline);
        taskmanager.addTask(task);
        System.out.println("登録しました。");
        
      }else if (choice==2){
      taskmanager.showTasks();
        
      }else if(choice==3){
        System.out.print("削除する番号: ");
        try{
          int num=Integer.parseInt(sc.nextLine());
          if(!taskmanager.removeTask(num)){
            System.out.println("削除できませんでした");
          }
        }catch(NumberFormatException e){
          System.out.println("もう一度入力してください");
        }
      
    }else if(choice==4){
      System.out.print("完了にする番号:");
      try{
        int num=Integer.parseInt(sc.nextLine());
        if(!taskmanager.completeTask(num)){
          System.out.println("もう一度入力してください");
            }else{
         System.out.println("完了にしました。");
          }
      }catch(NumberFormatException e){
        System.out.println("もう一度入力してください");
          }
      
      }else if (choice==0){
      
      System.out.println("登録件数:"+taskmanager.size());
      break;

    }else{
      System.out.println("0~4を入力してください");
      }
    }
    sc.close();
  }
}

