package designParettn.filter;

import java.util.List;
import java.util.stream.Collectors;

public class BoyFilter implements  Filter {
    @Override
    public List<Student> doFileter(List<Student> list) {
        return list.stream().filter(x->x.getGender()==1).collect(Collectors.toList());
    }
}
