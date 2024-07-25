package src.DAOs.billdetails;

import java.util.List;
import src.DAOs.IGeneralDAO;
import src.models.BillDetail;

public interface IBillDetailDAO extends IGeneralDAO<BillDetail> {

    List<BillDetail> findAllByBillId(int billId);
}
