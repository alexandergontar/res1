//import java.lang.reflect.Type;
import java.util.List;
//import com.google.gson.*;
public class App {
    // @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        //Type type;
        TaskList<LowPriority> lowPriority = new TaskList<>("low priority list");
        lowPriority.add(new LowPriority("2023-05-05", "Vasya Pupkin"));
        lowPriority.add(new LowPriority("2023-05-06", "Dima Ivanov"));
        lowPriority.add(new LowPriority("2023-05-07", "Petia Petrov"));
        JsonFormatter<LowPriority> low = new JsonFormatter<>();
        low.Write(lowPriority, "low_priority.json");
        low.Read("low_priority.json", new TaskList<>("low priority list"), 1);

        TaskList<MediumPriority> mediumPriority = new TaskList<>("medium priority list");
        mediumPriority.add(new MediumPriority("2023-03-20", "Vasya Pupkin"));
        mediumPriority.add(new MediumPriority("2023-03-21", "Dima Ivanov"));
        mediumPriority.add(new MediumPriority("2023-03-22", "Petia Petrov"));
        JsonFormatter<MediumPriority> medium = new JsonFormatter<>();
        medium.Write(mediumPriority, "medium_priority.json");
        List<MediumPriority> mList = medium.Read("medium_priority.json", new TaskList<>("medium priority list"), 2);
        System.out.println("\nDisplay list from file \"medium_priority.json \"");
        System.out.println(mList);

        TaskList<UrgentPriority> urgentPriority = new TaskList<>("urgent priority list");
        urgentPriority.add(new UrgentPriority("еще вчера", "Vasya Pupkin"));
        urgentPriority.add(new UrgentPriority("еще вчера", "Dima Ivanov"));
        urgentPriority.add(new UrgentPriority("еще вчера", "Petia Petrov"));
        JsonFormatter<UrgentPriority> urgent = new JsonFormatter<>();
        urgent.Write(urgentPriority, "urgent_priority.json");
        List<UrgentPriority> uList = urgent.Read("urgent_priority.json", new TaskList<>("urgent priority list"), 0);
        System.out.println("\nDisplay list from file \"urgent_priority.json \"");
        System.out.println(uList);

        TaskList<TaskToDo> taskToDo = new TaskList<>(null);
        taskToDo.add(new MediumPriority("2023-03-22", "Petia Petrov"));
        taskToDo.add(new UrgentPriority("еще вчера", "Vasya Pupkin"));
        JsonFormatter<TaskToDo> mixed = new JsonFormatter<>();
        mixed.Write(taskToDo, "mixed_priority.json");



    }
}
