import java.util.Scanner;
import java.time.LocalDate;

class TaskApp{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    TaskManager taskmanager=new Taskmanager();

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
        while(true)
        System.out.print("タイトル: ");
        title=sc.nextLine().trim();
        if(!title.isEmpty()) break;
ｍ        System.out.お      

        System.out.print("完了状態: ");
        String deadline=sc.nextLine();

        System.out.print(締切日: ");
        int deadline=sc.nextInt();
        sc.nextLine();

        Task task=new task(title,author,year);
        TaskManager.addTask(task);
        System.out.println("登録しました。");
        
      }else if (choice==2){
      library.showTasks();
        
      }else if(choice==3){
        System.out.print("削除する番号: ");
        int num =sc.nextInt();
        sc.nextLine();

        if(!library.removeTask(num)){
          System.out.println("削除できませんでした");
        }

      }else if (choice==0){
        System.out.println("登録件数:");
        break;
        
      }else{
      System.out.println("0~4を入力してください");
      }
    }
    sc.close();
  }
}

