SELECT CODE, NAME, PRICE FROM MENU;
SELECT NO, NAME FROM TABLEINFO;
SELECT NO, CODE, ORDERDAY, CNT, ISPAYMENT FROM MENU_ORDER;

--테이블 확인
SELECT * FROM MENU;
SELECT * FROM TABLEINFO;
SELECT * FROM MENU_ORDER;

--MENU에서 메뉴추가버튼
INSERT INTO MENU VALUES(?, ?, ?);
DELETE FROM MENU WHERE CODE = ?;
SELECT CODE, NAME, PRICE FROM MENU WHERE CODE = 'B04';


--메뉴 전체나오기
SELECT *
FROM MENU_ORDER o JOIN MENU m ON o.CODE = m.CODE JOIN TABLEINFO t ON o.NO = t.NO;

--선택된 메뉴 나오기
SELECT O.NO no, T.NAME tname, M.NAME mname, M.CODE mcode, PRICE, CNT, ISPAYMENT, ORDERDAY
FROM MENU_ORDER O JOIN MENU M ON O.CODE = M.CODE JOIN TABLEINFO T ON O.NO = T.NO;

SELECT *
FROM MENU_ORDER WHERE NO = 1;

SELECT *
FROM USER_USERS;

SELECT * FROM MENU;
SELECT * FROM TABLEINFO;
SELECT * FROM MENU_ORDER;

SELECT CODE, NAME, PRICE FROM MENU WHERE SUBSTR(CODE,1,1) = 'M';

SELECT * FROM MENU_ORDER ORDER BY NO;

INSERT INTO MENU_ORDER VALUES(1, 'M02', SYSDATE, 4, 0);
INSERT INTO MENU_ORDER VALUES(1, 'B02', SYSDATE, 4, 0);
INSERT INTO MENU_ORDER VALUES(1, 'S02', SYSDATE, 4, 0);

INSERT INTO MENU_ORDER VALUES(2, 'B03', SYSDATE, 4, 0);
INSERT INTO MENU_ORDER VALUES(2, 'B03', SYSDATE, 4, 0);
INSERT INTO MENU_ORDER VALUES(2, 'S02', SYSDATE, 4, 0);
INSERT INTO MENU_ORDER VALUES(2, 'S02', SYSDATE, 4, 0);
