package Model;

import java.util.ArrayList;

import Entity.AdminEntity;

public class Admin
{
    private static ArrayList<AdminEntity> admin = new ArrayList<>();


    public static void Data()
    {
        admin.add(new AdminEntity("1","1"));
    }

    public static AdminEntity findusername(String username)
    {
        for (AdminEntity adminEntity : admin)
        {
            if (adminEntity.getUsername().equals(username))
            {
                return adminEntity;
            }
        }

        return null;
    }

}
