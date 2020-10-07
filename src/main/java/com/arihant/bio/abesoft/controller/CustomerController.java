package com.arihant.bio.abesoft.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arihant.bio.abesoft.model.Customer;
import com.arihant.bio.abesoft.model.MaterialCategory;

@RestController
public class CustomerController {
	private static Map<String, Customer> custMap = new HashMap<>();
	static {
		Customer cust1 = new Customer();
		MaterialCategory mc1 = new MaterialCategory();
		mc1.setBriquettes("NA");
		mc1.setHuskCategory("Soyabean");
		cust1.setId("1");
		cust1.setAddress("AthaiKheda");
		cust1.setName("Prashant Jain");
		cust1.setPhoneNo("8989765147");
		cust1.setRSTNo("1234");
		cust1.setReceiptNo("4321");
		cust1.setVehicleNo("KA03 JZ 4143");
		cust1.setMaterialCategory(mc1);
		custMap.put(cust1.getId(), cust1);

		Customer cust2 = new Customer();
		MaterialCategory mc2 = new MaterialCategory();
		mc2.setBriquettes("NA");
		mc2.setHuskCategory("Urad");
		cust2.setId("2");
		cust2.setName("Ayush Arihant");
		cust2.setAddress("Bhadon");
		cust2.setPhoneNo("8109250009");
		cust2.setRSTNo("1234");
		cust2.setReceiptNo("4321");
		cust2.setVehicleNo("MP67 KB 0909");
		cust2.setMaterialCategory(mc2);
		custMap.put(cust2.getId(), cust2);
	}
	 @RequestMapping(value = "/customers/{id}", method = RequestMethod.DELETE)
	   public ResponseEntity<Object> delete(@PathVariable("id") String id) { 
		 custMap.remove(id);
	      return new ResponseEntity<>("customer is deleted successsfully", HttpStatus.OK);
	   }
	   
	   @RequestMapping(value = "/customer/{id}", method = RequestMethod.PUT)
	   public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Customer customer) { 
		   custMap.remove(id);
		   customer.setId(id);
	      custMap.put(id, customer);
	      return new ResponseEntity<>("customer is updated successsfully", HttpStatus.OK);
	   }
	   
	   @RequestMapping(value = "/customers", method = RequestMethod.POST)
	   public ResponseEntity<Object> createProduct(@RequestBody List<Customer> customers) {
		   
		   customers.forEach(product->custMap.put(product.getId(), product));
	      
	      return new ResponseEntity<>("customer is created successfully", HttpStatus.CREATED);
	   }
	   
	   @RequestMapping(value = "/customers",method = RequestMethod.GET)
	   public ResponseEntity<Object> getProduct() {
	      return new ResponseEntity<>(custMap.values(), HttpStatus.OK);
	   }


}
