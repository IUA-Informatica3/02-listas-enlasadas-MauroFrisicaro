package Task2_1;

import Task2.LinkList;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class MergeList {

    public static void main(String[] args) {
        int size1, size2, temp;
        AtomicInteger counter = new AtomicInteger();
        Scanner input = new Scanner(System.in);
        LinkList<Integer> list1 = new LinkList<>();
        LinkList<Integer> list2 = new LinkList<>();
        LinkList list3;

        System.out.print("Number of elements in the First List: ");
        size1 = input.nextInt();
        System.out.print("Number of elements in the Second List: : ");
        size2 = input.nextInt();

        System.out.print("\nList 1\n");
        counter.set(1);
        for (int i = 0; i < size1; ++i) {
            System.out.printf("Element [%d]: ", counter.get());
            temp = input.nextInt();
            list1.insert(temp);
            counter.getAndIncrement();
        }

        System.out.print("\nList 2\n");
        counter.set(1);
        for (int i = 0; i < size2; ++i) {
            System.out.printf("Element [%d]: ", counter.get());
            temp = input.nextInt();
            list2.insert(temp);
            counter.getAndIncrement();
        }

        System.out.print("\nNew Merged List: ");
        list3 = concatenate(list1, list2);
        System.out.println(list3.toString());
    }

    private static LinkList concatenate(LinkList l1, LinkList l2) {
        LinkList l3 = new LinkList();
        String text = l1.toString() + " " + l2.toString();
        StringBuilder x = new StringBuilder();

        for (int i = 0; i < text.length(); ++i) {
            if ((text.charAt(i) == ('0')) || (text.charAt(i) == ('1')) ||
                    (text.charAt(i) == ('2')) || (text.charAt(i) == ('3')) ||
                    (text.charAt(i) == ('4')) || (text.charAt(i) == ('5')) ||
                    (text.charAt(i) == ('6')) || (text.charAt(i) == ('7')) ||
                    (text.charAt(i) == ('8')) || (text.charAt(i) == ('9'))) {
                x.append(text.charAt(i));
            } else if (text.charAt(i) == (' ')) {
                l3.insert(Integer.parseInt(x.toString()));
                x.setLength(0);
            } else {
                System.out.println("ERROR - Invalid String Input");
            }
        }
        l3.insert(Integer.parseInt(x.toString()));

        return l3;
    }
}
