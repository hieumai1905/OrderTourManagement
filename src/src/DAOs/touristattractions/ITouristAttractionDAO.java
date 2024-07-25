package src.DAOs.touristattractions;

import java.util.List;
import src.DAOs.IGeneralDAO;
import src.models.TouristAttraction;

public interface ITouristAttractionDAO extends IGeneralDAO<TouristAttraction> {

    List<TouristAttraction> search(Object content);
}
