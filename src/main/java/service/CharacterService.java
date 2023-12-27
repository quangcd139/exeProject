package service;

import entity.Character;
import service.impl.CharacterImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CharacterService extends DBContext implements CharacterImpl {

    public List<Character> findAll() {
        List<Character> list = new ArrayList<Character>();

        String sql = "SELECT content, image_url FROM posts";

        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Character character = new Character(
                        rs.getString(1),
                        rs.getString(2));
                list.add(character);
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return list;
    }

}
