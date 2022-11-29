package com.java.chinook.services;

import com.java.chinook.models.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(path="/api/v1/customer")
public class CustomerService extends ServiceBase {

    @GetMapping("/customers")
    public ResponseEntity getAllCustomers() {
        try {
            List<Customer> customers = customerRepository.findAllByOrderByCustomerIdAsc();
            List<HashMap<String, Object>> items = new ArrayList<>();
            if (null != customers && customers.size() > 0) {
                for (Customer customer : customers) {
                    HashMap<String, Object> item = new HashMap<>();
                    item.put("customerId", customer.getCustomerId());
                    item.put("firstName", customer.getFirstName());
                    item.put("lastName", customer.getLastName());
                    item.put("company", customer.getCompany());
                    item.put("address", customer.getAddress());
                    item.put("city", customer.getCity());
                    item.put("state", customer.getState());
                    item.put("country", customer.getCountry());
                    item.put("postalCode", customer.getPostalCode());
                    item.put("phone", customer.getPhone());
                    item.put("fax", customer.getFax());
                    item.put("email", customer.getEmail());
                    item.put("supportRepId", customer.getSupportRepId());
                    items.add(item);
                }
                return getSuccessResponse("", items);
            } else return getNotFoundResponse();
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
