package hungdt.ApiBread.service;

import hungdt.ApiBread.entity.BillEntity;
import hungdt.ApiBread.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl implements BillService {
    private final BillRepository billRepository;

    @Autowired
    public BillServiceImpl(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    @Override
    public BillEntity createBill(BillEntity billEntity) {
        return billRepository.save(billEntity);
    }
}
