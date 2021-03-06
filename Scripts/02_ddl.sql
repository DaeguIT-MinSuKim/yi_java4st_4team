/* 메뉴 */
DROP TABLE MENU 
	CASCADE CONSTRAINTS;

/* 테이블정보 */
DROP TABLE TABLEINFO 
	CASCADE CONSTRAINTS;

/* 주문메 */
DROP TABLE MENU_ORDER 
	CASCADE CONSTRAINTS;

/* 메뉴 */
CREATE TABLE MENU (
	CODE char(3) NOT NULL, /* 메뉴코드 */
	NAME VARCHAR(30) NOT NULL, /* 메뉴명 */
	PRICE NUMBER(6) /* 가격 */
);

COMMENT ON TABLE MENU IS '메뉴';

COMMENT ON COLUMN MENU.CODE IS '메뉴코드';

COMMENT ON COLUMN MENU.NAME IS '메뉴명';

COMMENT ON COLUMN MENU.PRICE IS '가격';

CREATE UNIQUE INDEX PK_MENU
	ON MENU (
		CODE ASC
	);

ALTER TABLE MENU
	ADD
		CONSTRAINT PK_MENU
		PRIMARY KEY (
			CODE
		);

/* 테이블정보 */
CREATE TABLE TABLEINFO (
	NO NUMBER NOT NULL, /* 테이블번호 */
	NAME VARCHAR(30) /* 테이블이름 */
);

COMMENT ON TABLE TABLEINFO IS '테이블정보';

COMMENT ON COLUMN TABLEINFO.NO IS '테이블번호';

COMMENT ON COLUMN TABLEINFO.NAME IS '테이블이름';

CREATE UNIQUE INDEX PK_TABLEINFO
	ON TABLEINFO (
		NO ASC
	);

ALTER TABLE TABLEINFO
	ADD
		CONSTRAINT PK_TABLEINFO
		PRIMARY KEY (
			NO
		);

/* 주문메 */
CREATE TABLE MENU_ORDER (
	NO NUMBER NOT NULL, /* 테이블번호 */
	CODE char(3) NOT NULL, /* 메뉴코드 */
	ORDERDAY DATE, /* 주문날짜 */
	CNT NUMBER, /* 수량 */
	ISPAYMENT NUMBER(1) /* 결제여부 */
);

COMMENT ON TABLE MENU_ORDER IS '주문메';

COMMENT ON COLUMN MENU_ORDER.NO IS '테이블번호';

COMMENT ON COLUMN MENU_ORDER.CODE IS '메뉴코드';

COMMENT ON COLUMN MENU_ORDER.ORDERDAY IS '주문날짜';

COMMENT ON COLUMN MENU_ORDER.CNT IS '수량';

COMMENT ON COLUMN MENU_ORDER.ISPAYMENT IS '결제여부';

CREATE UNIQUE INDEX PK_MENU_ORDER
	ON MENU_ORDER (
		NO ASC,
		CODE ASC
	);

ALTER TABLE MENU_ORDER
	ADD
		CONSTRAINT PK_MENU_ORDER
		PRIMARY KEY (
			NO,
			CODE
		);

ALTER TABLE MENU_ORDER
	ADD
		CONSTRAINT FK_TABLEINFO_TO_MENU_ORDER
		FOREIGN KEY (
			NO
		)
		REFERENCES TABLEINFO (
			NO
		);

ALTER TABLE MENU_ORDER
	ADD
		CONSTRAINT FK_MENU_TO_MENU_ORDER
		FOREIGN KEY (
			CODE
		)
		REFERENCES MENU (
			CODE
		);