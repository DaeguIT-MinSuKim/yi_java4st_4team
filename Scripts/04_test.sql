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

SELECT NO, CODE, ORDERDAY, CNT, ISPAYMENT FROM MENU_ORDER WHERE NO = 1;

SELECT CODE, NAME, PRICE FROM MENU WHERE SUBSTR(CODE,1,1) = 'M';

DELETE FROM MENU_ORDER;
SELECT * FROM MENU_ORDER;

INSERT INTO MENU_ORDER VALUES(1, 'M02', SYSDATE, 4, 0);
INSERT INTO MENU_ORDER VALUES(1, 'B02', SYSDATE, 4, 0);
INSERT INTO MENU_ORDER VALUES(1, 'S02', SYSDATE, 4, 0);

INSERT INTO MENU_ORDER VALUES(2, 'B03', SYSDATE, 4, 0);
INSERT INTO MENU_ORDER VALUES(2, 'B03', SYSDATE, 4, 0);
INSERT INTO MENU_ORDER VALUES(2, 'S02', SYSDATE, 4, 0);
INSERT INTO MENU_ORDER VALUES(2, 'S02', SYSDATE, 4, 0);

INSERT INTO MENU_ORDER VALUES(3, 'M01', SYSDATE, 3, 0);
INSERT INTO MENU_ORDER VALUES(3, 'M04', SYSDATE, 3, 0);
INSERT INTO MENU_ORDER VALUES(3, 'B03', SYSDATE, 3, 0);

INSERT INTO MENU_ORDER VALUES(4, 'M02', SYSDATE, 2, 0);
INSERT INTO MENU_ORDER VALUES(4, 'M04', SYSDATE, 2, 0);
INSERT INTO MENU_ORDER VALUES(4, 'B01', SYSDATE, 2, 0);
INSERT INTO MENU_ORDER VALUES(4, 'B02', SYSDATE, 2, 0);

INSERT INTO MENU_ORDER VALUES(5, 'M02', SYSDATE, 2, 0);
INSERT INTO MENU_ORDER VALUES(5, 'M04', SYSDATE, 2, 0);
INSERT INTO MENU_ORDER VALUES(5, 'B01', SYSDATE, 2, 0);
INSERT INTO MENU_ORDER VALUES(5, 'B02', SYSDATE, 2, 0);

INSERT INTO MENU_ORDER VALUES(6, 'M02', SYSDATE, 2, 0);
INSERT INTO MENU_ORDER VALUES(6, 'M04', SYSDATE, 2, 0);
INSERT INTO MENU_ORDER VALUES(6, 'B01', SYSDATE, 2, 0);
INSERT INTO MENU_ORDER VALUES(6, 'B02', SYSDATE, 2, 0);

INSERT INTO MENU_ORDER VALUES(7, 'M02', SYSDATE, 2, 0);
INSERT INTO MENU_ORDER VALUES(7, 'M04', SYSDATE, 2, 0);
INSERT INTO MENU_ORDER VALUES(7, 'B01', SYSDATE, 2, 0);
INSERT INTO MENU_ORDER VALUES(7, 'B02', SYSDATE, 2, 0);

INSERT INTO MENU_ORDER VALUES(8, 'M02', SYSDATE, 2, 0);
INSERT INTO MENU_ORDER VALUES(8, 'M04', SYSDATE, 2, 0);
INSERT INTO MENU_ORDER VALUES(8, 'B01', SYSDATE, 2, 0);
INSERT INTO MENU_ORDER VALUES(8, 'B02', SYSDATE, 2, 0);
INSERT INTO MENU_ORDER VALUES(8, 'M03', SYSDATE, 2, 1);
INSERT INTO MENU_ORDER VALUES(8, 'S02', SYSDATE, 2, 1);

SELECT T.NO, M.NAME, M.PRICE * O.CNT AS PRICE, O.CNT, O.ISPAYMENT FROM MENU M JOIN MENU_ORDER O ON (M.CODE = O.CODE) JOIN TABLEINFO T ON (T.NO = O.NO);

SELECT o.NO NO, o.CODE CODE, ORDERDAY, CNT, ISPAYMENT, m.NAME MNANE, PRICE, t.NAME TNAME FROM MENU_ORDER o JOIN MENU m ON o.CODE = m.CODE JOIN TABLEINFO t ON o.NO = t.NO;

SELECT o.NO AS NO, o.CODE CODE, ORDERDAY, CNT, ISPAYMENT, m.NAME MNANE, PRICE, t.NAME TNAME 
FROM MENU_ORDER o JOIN MENU m ON o.CODE = m.CODE JOIN TABLEINFO t ON o.NO = t.NO WHERE o.NO = 8 AND ISPAYMENT = 0; 

DELETE FROM MENU_ORDER WHERE CODE = 'M02';

SELECT * FROM MENU_ORDER ORDER BY NO;
DELETE FROM MENU_ORDER ;

INSERT INTO MENU_ORDER VALUES();


SELECT ROW_NUMBER() OVER (ORDER BY SUM(CNT) * PRICE DESC) AS RANK, SUM(CNT) AS HISAL, NAME, SUM(CNT) * PRICE AS SUMPRICE, ROUND(100 * (SUM(CNT) * PRICE)/(SELECT SUM(PRICE * CNT) AS SUMALL FROM MENU M LEFT OUTER JOIN MENU_ORDER O ON M.CODE = O.CODE), 2) AS PERCENTAGE FROM MENU_ORDER O LEFT OUTER JOIN MENU M ON O.CODE = M.CODE GROUP BY NAME, PRICE