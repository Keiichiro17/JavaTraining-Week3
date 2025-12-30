import java.util.Scanner;//キーボード入力を受け取る
import java.time.LocalDate;//締切日

class TaskApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);//キーボード入力を受け付ける
    TaskManager taskmanager = new TaskManager();//タスクの追加/一覧/削除/完了などを管理

    //メニューを何度も表示して、0が選ばれるまで繰り返す
    while (true) {
      System.out.println("タスク管理システム");
      System.out.println("1:タスクを登録する");
      System.out.println("2:タスクを一覧表示する");
      System.out.println("3:タスクを削除する");
      System.out.println("4:タスクを完了する");
      System.out.println("0:終了");
      System.out.print("選択: ");

      int choice;
      try {
        choice = Integer.parseInt(sc.nextLine().trim());
      } catch (NumberFormatException e) {
        System.out.println("もう一度入力してください");
        continue;//メニューを出しなおす
      }
      
      //タイトルを登録
      if (choice == 1) {
        String title;
        while (true) {
          System.out.print("タイトル: ");
          title = sc.nextLine().trim();
          if (!title.isEmpty()) break;
          System.out.println("もう一度入力してください");
        }
        
        //締切日を登録
        LocalDate deadline;
        while (true) {
          System.out.print("締切日(例: 2026-12-30): ");
          String s = sc.nextLine().trim();
          try {
            deadline = LocalDate.parse(s); // 
            break;
          } catch (Exception e) {
            System.out.println("もう一度入力してください");
          }
        }

        Task task = new Task(title, false, deadline);
        taskmanager.addTask(task);
        System.out.println("登録しました。");
        
        //2:一覧表示
      } else if (choice == 2) {
        taskmanager.showTasks();
        
        //3:削除
      } else if (choice == 3) {
        System.out.print("削除する番号: ");
        try {
          int num = Integer.parseInt(sc.nextLine().trim());
          if (!taskmanager.removeTask(num)) {
            System.out.println("削除できませんでした");
          }
        } catch (NumberFormatException e) {
          System.out.println("もう一度入力してください");
        }
        
        //4:完了
      } else if (choice == 4) {
        System.out.print("完了にする番号: ");
        try {
          int num = Integer.parseInt(sc.nextLine().trim());
          if (!taskmanager.completeTask(num)) {
            System.out.println("完了にできませんでした");
          } else {
            System.out.println("完了にしました。");
          }
        } catch (NumberFormatException e) {
          System.out.println("もう一度入力してください");
        }

        //0:終了
      } else if (choice == 0) {
        System.out.println("登録件数:" + taskmanager.size());//現在の登録件数を表示して終了
        break;

      } else {
        System.out.println("0~4を入力してください");
      }
    }

    sc.close();//閉じる
  }
}
