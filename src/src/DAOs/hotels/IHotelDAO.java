package src.DAOs.hotels;

import java.util.List;
import src.DAOs.IGeneralDAO;
import src.models.Hotel;

public interface IHotelDAO extends IGeneralDAO<Hotel> {

    List<Hotel> search(Object content);
}
