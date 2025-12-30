import java.time.LocalDate;

class Task{
  String title;
  boolean completed;
  Localdate deadline;

  Task(String title, boolean completed, LocalDate deadline){
this.title=title;
this.completed=completed;
this.deadline=deadline;
  }
String statusLabel(){
  return completed ? "[✓完了]":"";
    }
}
