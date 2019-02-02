CREATE TABLE "User" (
         id      VARCHAR(255) NOT NULL,
         username      VARCHAR2(35) NOT NULL,
         password       VARCHAR2(35) NOT NULL,
         is_admin       CHARACTER(1)
		 );

ALTER TABLE "User" ADD (
  CONSTRAINT user_pk PRIMARY KEY (ID));
  
CREATE TABLE "Profile" (
         id      VARCHAR(255) NOT NULL,
         description      VARCHAR2(255),
		 picture      BLOB
		 );
  
ALTER TABLE "Profile" ADD 
  CONSTRAINT profile_pk PRIMARY KEY (ID);
  
CREATE TABLE Person (
         id      VARCHAR(255) NOT NULL,
		 profile_id VARCHAR(255) NOT NULL,
		 creation_date  DATE DEFAULT (sysdate)
		 );
  
ALTER TABLE Person ADD (
  CONSTRAINT person_pk PRIMARY KEY (ID));
  
ALTER TABLE Person ADD (
  CONSTRAINT person_user_fk FOREIGN KEY (ID) REFERENCES "User" (ID));
  
ALTER TABLE Person ADD (
  CONSTRAINT person_profile_fk FOREIGN KEY (profile_id) REFERENCES "Profile" (ID));
  