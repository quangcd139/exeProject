package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Character {
    private int id;
    private String name;
    private String image;
    private String element;
    private String path;
    private int hp;
    private int atk;
    private int def;
    private int spd;
    private int cd;
    private int nrg;
    private String type; //dps, sup, ect...
    private float ele_dam;





}
