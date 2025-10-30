package com.ads.ecommerce.order.client;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.ads.ecommerce.order.dto.ProductDTO;
@FeignClient(name = "product-service", url = "http://localhost:8082" )
public interface ProductClient {
    
    @GetMapping("/api/v1/products/{id}")
    ProductDTO getProduct(@PathVariable("id") Long id);
    
    @PatchMapping("/api/v1/products/{id}/stock")
    void updateStock(@PathVariable("id") Long id, @RequestBody Map<String, Object> request);
}