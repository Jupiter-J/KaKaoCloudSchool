package step3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAssist {

    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Song",45));
        customers.add(new Customer("Kim",22));
        customers.add(new Customer("Jaaa",14));
        customers.add(new Customer("Seea",33));
        customers.add(new Customer("Diara",37));

        // 30이상 조 추출
        List<Customer> list = new ArrayList<>();
        for(Customer customer : customers){
            if (customer.getAge() > 30){
                list.add(customer);
            }
        }
        //오름차순 정렬
        Collections.sort(list);

        //담아서 이름을 꺼내와서 다시 담기
        List<String> results = new ArrayList<>();
        for (Customer customer : list){
            results.add(customer.getName());
        }


        // 출력
        for (String name : results){
            System.out.println(name);
        }

        List<String> customersName = customers.stream()
                .filter(customer -> customer.getAge() > 30)  //필터링
                .sorted()   //정렬
                .map(Customer::getName) //매핑을 할거다 getName 으로
                .collect(Collectors.toList()); //최종연산 -> Collectors.toList 형태로 반환해달라

        for (String name : customersName){
            System.out.println(name);
        }

    }



}
