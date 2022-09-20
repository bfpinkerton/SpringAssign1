package annotations;

import org.springframework.context.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "genspark")
public class Configs {
    @Bean("student1")
    public student Student1() {
        List<Phone> list = new ArrayList<>(List.of(new Phone("12341237656")));
        Address add = new Address("Harvey", "Houston","United States","77840");
        return new student(21,"Bob",list,add);
    }
    @Bean("student2")
    public student Student2() {
        List<Phone> list = new ArrayList<>(List.of(new Phone("1323142312")));
        Address add = new Address("College Station", "Houston","United States","78740");
        return new student(22,"Barry",list,add);
    }
}
