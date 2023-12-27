package service;

import entity.Character;
import entity.LightCore;
import service.impl.LightCoreImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LightCoreService extends DBContext implements LightCoreImpl {


    @Override
    public List<LightCore> findAll() {
        List<LightCore> lightCores = new ArrayList<>();
        String sql = "SELECT content, image_url FROM posts";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                LightCore character = new LightCore(

                );
                lightCores.add(character);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }

        return lightCores;
    }

    @Override
    public List<LightCore> findByPath(String path) {
        List<LightCore> lightCores = new ArrayList<>();
        String sql = "SELECT content, image_url FROM posts";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                LightCore character = new LightCore(

                );
                lightCores.add(character);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }

        return lightCores;
    }
}
