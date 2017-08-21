package dz.dzDevs.GestionFastFood.Service;
public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}