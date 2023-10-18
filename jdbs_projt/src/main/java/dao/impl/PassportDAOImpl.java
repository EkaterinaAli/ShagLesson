package dao.impl;

import dao.PassportDAO;
import model.Office;
import model.Passport;
import util.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

public class PassportDAOImpl implements PassportDAO {

    @Override
    public boolean createPassport(Passport passport) {
        return false;
    }

    @Override
    public Passport findById(int id) {
        Connection connection = DBUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM passport");
            while (rs.next()) {
                Passport passport = new Passport();
                passport.setId(rs.getInt("id"));
                passport.setPersonalId (rs.getString("personal_id"));
                passport.setIndId (rs.getString("ind_id"));
                passport.setExpTs (rs.getTimestamp("exp_ts"));
                passport.setCreatedTs(rs.getTimestamp("created_ts"));
                return passport;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    @Override
    public boolean updateOffice(Passport passport) {
        return false;
    }

    @Override
    public Set<Passport> all() {
        return null;
    }
}
