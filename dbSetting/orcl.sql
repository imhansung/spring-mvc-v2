ALTER SESSION SET "_ORACLE_SCRIPT"=true;

CREATE USER "SPRNG_BLG_USR"
IDENTIFIED BY "1234";

GRANT CONNECT TO "SPRNG_BLG_USR";

GRANT RESOURCE TO "SPRNG_BLG_USR";

alter user SPRNG_BLG_USR default tablespace users quota unlimited on users;


ALTER USER SPRNG_BLG_USR IDENTIFIED BY 1515;