CREATE TABLE T_USER (
  ID BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  NAME VARCHAR(64) NOT NULL,
  AGE INT,
  SEX CHAR(1),
  MOBILE_PHONE VARCHAR(32),
  CREATE_TIME TIMESTAMP,
  LAST_UPDATE_TIME TIMESTAMP
);