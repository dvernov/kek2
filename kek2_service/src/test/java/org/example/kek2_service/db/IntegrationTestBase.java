package org.example.kek2_service.db;

import org.springframework.test.context.jdbc.Sql;

@Sql({
        "classpath:sql/data.sql"
})
public class IntegrationTestBase {
}
