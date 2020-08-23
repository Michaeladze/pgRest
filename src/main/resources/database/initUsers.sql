CREATE TABLE IF NOT EXISTS users
(
    id            VARCHAR(16) PRIMARY KEY,
    first_name    VARCHAR(200) NOT NULL,
    middle_name   VARCHAR(200) NOT NULL,
    last_name     VARCHAR(200) NOT NULL,
    position      VARCHAR(254) NOT NULL,
    department    VARCHAR(254) NOT NULL,
    department_id VARCHAR(254) NOT NULL,
    photo         TEXT         NOT NULL
);