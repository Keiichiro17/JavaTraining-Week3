import java.util.Scanner;
class LibraryApp{
  public static void main(String[]args)
  {
    Scanner sc=new
      Scanner(System.in);
    TaskManager taskmanager=new taskmanager();

    while(true){
      System.out.println("タスク管理システム");
      System.out.println("1:タスクを登録する");
      System.out.println("2:タスクを一覧表示する");
      System.out.println("3:タスクを削除する");
      System.out.println("4:タスクを完了する");
      System.out.print("0:終了");

      int choice=sc.nextInt();
      sc.nextLine();

      if(choice==1){
        System.out.print("タイトル: ");
        String title=sc.nextLine();

        System.out.print("著者: ");
        String author=sc.nextLine();

        System.out.print("出版年: ");
        int year=sc.nextInt();
        sc.nextLine();

        Book book=new Book(title,author,year);
        library.addBook(book);
        System.out.println("登録しました。");
        
      }else if (choice==2){
      library.showBooks();
        
      }else if(choice==3){
        System.out.print("削除する番号: ");
        int num =sc.nextInt();
        sc.nextLine();

        if(!library.removeBook(num)){
          System.out.println("削除できませんでした");
        }

      }else if (choice==0){
        System.out.println("終了");
        break;
        
      }else{
      System.out.println("0~3を入力してください");
      }
    }
    sc.close();
  }
}

