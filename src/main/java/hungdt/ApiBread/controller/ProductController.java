package hungdt.ApiBread.controller;

import hungdt.ApiBread.entity.ProductEntity;
import hungdt.ApiBread.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping(value = "/Product")
    public ResponseEntity getAllProduct()
    {
        try {
            List<ProductEntity> result = productService.loadAll();
            if(result==null)
            {
                return new ResponseEntity("Product not found",HttpStatus.OK);
            }else
            {
                return new ResponseEntity(result,HttpStatus.OK);
            }

        }catch (Exception e)
        {
            return new ResponseEntity("Product not found",HttpStatus.CONFLICT);
        }
    }
}
