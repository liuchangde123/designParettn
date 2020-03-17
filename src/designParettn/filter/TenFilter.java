package designParettn.filter;

import java.util.List;
import java.util.stream.Collectors;

public class TenFilter implements  Filter {
    @Override
    public List<Student> doFileter(List<Student> list) {
        return list.stream().filter(x->x.getAge()>=10).collect(Collectors.toList());
    }
}
