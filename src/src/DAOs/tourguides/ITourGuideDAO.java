package src.DAOs.tourguides;

import java.util.List;
import src.DAOs.IGeneralDAO;
import src.models.TourGuide;

public interface ITourGuideDAO extends IGeneralDAO<TourGuide> {

    List<TourGuide> search(Object content);
}
