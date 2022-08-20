package step2;

import java.util.ArrayList;
import java.util.List;

public class FunctionalAssist {

    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        initData(service);
        List<Customer> result = new ArrayList<>();

        //익명 클래스 적용
        result = service.searchCustomers(new SearchFilter() {
            @Override
            public boolean isMatched(Customer customer) {
                if (customer.getLocation().equals("Seoul")){
                    return true;
                }else{
                    return false;
                }
            }
        });

        //람다 적용
        result = service.searchCustomers(customer -> customer.getLocation().equals("Seoul"));
    //  result = service.searchCustomers(customer -> customer.getLocation().equals("Seoul") && customer.getAge() > 25);
        for (Customer customer : result){
            System.out.println(customer);
        }

    }

    private static void initData(CustomerService service){
        service.addCustomer(new Customer("CUS01", "Seoul", Gender.Male, 30));
        service.addCustomer(new Customer("CUS02", "Busan", Gender.Male, 30));
        service.addCustomer(new Customer("CUS03", "Busan", Gender.Male, 30));
        service.addCustomer(new Customer("CUS04", "Seoul", Gender.Male, 30));
        service.addCustomer(new Customer("CUS05", "Seoul", Gender.Male, 30));
        service.addCustomer(new Customer("CUS06", "Gwangju", Gender.Male, 30));
    }
}
