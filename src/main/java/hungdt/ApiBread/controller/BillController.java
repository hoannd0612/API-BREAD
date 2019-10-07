package hungdt.ApiBread.controller;

import hungdt.ApiBread.entity.BillEntity;
import hungdt.ApiBread.entity.DetailBillEntity;
import hungdt.ApiBread.service.BillService;
import hungdt.ApiBread.service.DetailBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class BillController {
    private final BillService billService;
    private final DetailBillService detailBillService;

    @Autowired
    public BillController(BillService billService, DetailBillService detailBillService) {
        this.billService = billService;
        this.detailBillService = detailBillService;
    }
    @PostMapping(value = "/Bill/create")
    public ResponseEntity createBill(@Valid @RequestBody BillEntity billEntity)
    {
        try {
            BillEntity bill = billService.createBill(billEntity);
            System.out.println(bill.getId()+"bill id");
            for(DetailBillEntity db:billEntity.getDetailBillEntityList()){
                db.setBillId(bill.getId());
                detailBillService.createDetailBill(db);
            }
            return new ResponseEntity(bill,HttpStatus.OK);

        }catch (Exception e)
        {
            return new ResponseEntity("Create faild", HttpStatus.CONFLICT);
        }
    }
}
