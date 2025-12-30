//日付を扱うためのクラス
import java.time.LocalDate;

class Task{
  //タスクのタイトル
  String title;
  //タスクが完了しているか
  boolean completed;
  //タスクの締切日
  LocalDate deadline;

  Task(String title, boolean completed, LocalDate deadline){
this.title=title;
//完了状態をセット
this.completed=completed;
//締切日をセット
this.deadline=deadline;
  }
  //完了状態かどうかを文字列で返す
  //完了していれば「[✓完了]」
  //未完了なら「表示なし]
String statusLabel(){
  return completed ? "[✓完了]":"";
    }
}
