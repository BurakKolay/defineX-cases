package org.burakkolay.interfaces;

import org.burakkolay.entity.Bill;
import org.burakkolay.entity.Category;

import java.util.List;
import java.util.Set;

public interface BillInterface {

    List<Bill> getBillList();

    List<Bill> getListByBillAmount(int var1);

    double getAverageOfBillAmount(int var1);

    Set<Category> getCategoryNamesLowerThanAverageBillAmount(int var1);
}
