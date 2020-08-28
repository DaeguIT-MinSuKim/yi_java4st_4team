-- 계정 추가 및 권한 부여

--접속자 확인
SELECT USER FROM dual;

--계정 생성 
CREATE USER project_pos IDENTIFIED BY rootroot;


--권한 추가
GRANT CONNECT, RESOURCE, CREATE SYNONYM, CREATE VIEW
	TO project_pos;
	
--계정 확인
SELECT *
	FROM DBA_USERS
	WHERE USERNAME = 'project_pos';