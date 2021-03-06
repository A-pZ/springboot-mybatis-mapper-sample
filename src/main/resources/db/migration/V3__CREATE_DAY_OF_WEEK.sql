CREATE TABLE DAY_OF_WEEK (
	STORE_ID VARCHAR(256) NOT NULL,
	SUNDAY CHAR(1) DEFAULT 0,
	MONDAY CHAR(1) DEFAULT 0,
	TUESDAY CHAR(1) DEFAULT 0,
	WEDNESDAY CHAR(1) DEFAULT 0,
	THURSDAY CHAR(1) DEFAULT 0,
	FRIDAY CHAR(1) DEFAULT 0,
	SATURDAY CHAR(1) DEFAULT 0,
	HOLIDAY CHAR(1) DEFAULT 0
);

CREATE TABLE STORE_INFO (
	STORE_ID VARCHAR(256) NOT NULL,
	STORE_NAME VARCHAR(256) NOT NULL
);

CREATE TABLE DAY_OF_WEEK_CODE_DEF (
	DAY_OF_WEEK_CODE CHAR(1) NOT NULL
);
