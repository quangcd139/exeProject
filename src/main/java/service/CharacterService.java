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
        return null;
    }

    @Override
    public boolean add(Character character) {
        String sql = "INSERT INTO characters " +
                "(name, image, element, path, hp, atk, def, spd, cd, nrg, type, ele_dam) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement  preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, character.getName());
            preparedStatement.setString(2, character.getImage());
            preparedStatement.setString(3, character.getElement());
            preparedStatement.setString(4, character.getPath());
            preparedStatement.setInt(5, character.getHp());
            preparedStatement.setInt(6, character.getAtk());
            preparedStatement.setInt(7, character.getDef());
            preparedStatement.setInt(8, character.getSpd());
            preparedStatement.setInt(9, character.getCd());
            preparedStatement.setInt(10, character.getNrg());
            preparedStatement.setString(11, character.getType());
            preparedStatement.setFloat(12, character.getEle_dam());


            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Character added successfully!");
                return true;
            } else {
                System.out.println("Failed to add character");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

}
