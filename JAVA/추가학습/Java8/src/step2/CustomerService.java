package step2;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    private List<Customer> customers;

    public CustomerService() {
        this.customers = new ArrayList<>();
    }
    // 손님 추가
    public void addCustomer(Customer newCustomer){
        this.customers.add(newCustomer);
    }

    //하나의 메소드로 처리하는 방법                                  검색조건 ,       검색값
    public List<Customer> searchCustomersBy(SearchOption searchOption, String searchValue){
        List<Customer> foundCustomers = new ArrayList<>();

        for (Customer customer : customers){
            //지역검색
           if (searchOption.equals(SearchOption.Location)) {
               if (customer.getLocation().equals(searchValue)) {
                   foundCustomers.add(customer);
               }
               //성별 검색
           }else if (searchOption.equals(SearchOption.Gender)) {
               if (customer.getGender().name().equals(searchValue)) {
                   foundCustomers.add(customer);
               }
           }
        }
        return foundCustomers;
    }

    //인터페이스를 통한 검색 메소드
    public List<Customer> searchCustomers(SearchFilter filter){
        List<Customer> foundCustomers = new ArrayList<>();
        for (Customer customer: customers){
            if (filter.isMatched(customer)){
                foundCustomers.add(customer);
            }
        }
        return foundCustomers;
    }
}
