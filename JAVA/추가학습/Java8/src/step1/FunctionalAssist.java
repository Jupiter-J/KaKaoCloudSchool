import java.util.List;

public class FunctionalAssist {

    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        initData(service);

        //지역으로 검색
//        List<Customer> result = service.searchCustomerByLocation("Seoul");
//        for (Customer customer: result){
//            System.out.println(customer);
//        }

        //성별로 검색                                                    //검색 조건,    검색 값
        List<Customer> result1 = service.searchCustomersBy(SearchOption.Location,"Seoul");
        for (Customer customer: result1){
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
