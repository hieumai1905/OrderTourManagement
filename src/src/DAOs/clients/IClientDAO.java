package src.DAOs.clients;

import java.util.List;
import src.DAOs.IGeneralDAO;
import src.models.Client;

public interface IClientDAO extends IGeneralDAO<Client> {

    List<Client> search(Object content);
}
