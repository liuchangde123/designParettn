package designParettn.filter;

import java.util.List;

import static java.util.Collections.addAll;

public class OrFilter implements  Filter {
    private Filter one;
    private Filter two;

    public OrFilter(Filter one, Filter two) {
        this.one = one;
        this.two = two;
    }

    @Override
    public List<Student> doFileter(List<Student> list) {
        List<Student> n = two.doFileter(list);
        n.addAll(one.doFileter(list));
        return n;
    }
}
