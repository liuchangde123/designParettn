package designParettn.filter;

import com.sun.org.apache.xpath.internal.operations.And;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("zs", 17, 1), new Student("ls", 6, 0), new Student("ww", 11, 0));
        BoyFilter boyFilter = new BoyFilter();
        TenFilter tenFilter = new TenFilter();
        AndFilter andFilter = new AndFilter(boyFilter, tenFilter);
        System.out.println(boyFilter.doFileter(students));
        System.out.println(tenFilter.doFileter(students));
        System.out.println(andFilter.doFileter(students));
    }
}
