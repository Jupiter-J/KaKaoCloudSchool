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

    // 지역으로 검색
    public List<Customer> searchCustomerByLocation(String location){
        List<Customer> foundCustomers = new ArrayList<>();
        //손님들을 꺼내서 같은지 확인 후 같으면 추가
        for (Customer customer : customers){
            if (customer.getLocation().equals(location)){
                foundCustomers.add(customer);
            }
        }
        return foundCustomers;
    }

    //성별로 검색
    public List<Customer> searchCustomerByGender(Gender gender){
        List<Customer> foundCustomers = new ArrayList<>();
        for (Customer customer : customers){
            if (customer.getGender().equals(gender)){
                foundCustomers.add(customer);
            }
        }
        return foundCustomers;
    }
    //                                                      location        seoul
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

}
