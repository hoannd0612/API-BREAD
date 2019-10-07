package hungdt.ApiBread.service;

import hungdt.ApiBread.entity.DetailBillEntity;
import hungdt.ApiBread.repository.DetailBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailBillServiceImpl implements DetailBillService {
    private final DetailBillRepository detailBillRepository;

    @Autowired
    public DetailBillServiceImpl(DetailBillRepository detailBillRepository) {
        this.detailBillRepository = detailBillRepository;
    }

    @Override
    public DetailBillEntity createDetailBill(DetailBillEntity detailBillEntity) {
        return detailBillRepository.save(detailBillEntity);
    }
}
