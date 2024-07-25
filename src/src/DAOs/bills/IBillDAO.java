package src.DAOs.bills;

import src.DAOs.IGeneralDAO;
import src.models.Bill;

public interface IBillDAO extends IGeneralDAO<Bill> {

    long statisticalDay(String date);

    long statisticalMonth(int year, int month);

    long statisticalYear(int year);
}
