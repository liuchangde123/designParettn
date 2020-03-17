package designParettn.filter;

import java.util.List;
import java.util.stream.Collectors;

public class AndFilter implements  Filter {
    private Filter one;
    private Filter two;

    public AndFilter(Filter one, Filter two) {
        this.one = one;
        this.two = two;
    }

    @Override
    public List<Student> doFileter(List<Student> list) {
        return two.doFileter(one.doFileter(list));
    }
}
