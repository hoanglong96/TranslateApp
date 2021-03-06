package com.cardiomood.hoanglong.db.entity;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

public class LanguageDao extends BaseDaoImpl<LanguageEntity, Long> {

    public LanguageDao(ConnectionSource connectionSource, Class<LanguageEntity> dataClass) throws SQLException {
        super(connectionSource, dataClass);
    }

    public LanguageEntity findByShortCode(String shortCode) throws SQLException {
        return queryForFirst(
                queryBuilder().where()
                        .eq(LanguageEntity.SHORT_CODE_COLUMN, shortCode)
                        .prepare()
        );
    }

}
