package com.accenture.tagtrainingspring.screening;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ScreeningDaoImpl implements ScreeningDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public String getPatientScreening() {
        String sql = "SELECT id FROM SCREENING_RESULTS;";
        String patientId ="";
//        jdbcTemplate.queryForObject(sql, new Object[]{patientId}, new ScreeningRowMapper());
        return sql;
    }

    @Override
    public String getAllScreenings() {
        String sql = "SELECT * FROM SCREENING_RESULTS;";
        jdbcTemplate.query(sql, new ScreeningRowMapper());
        return sql;
    }
}
