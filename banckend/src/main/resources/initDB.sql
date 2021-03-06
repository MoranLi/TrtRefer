CREATE TABLE IF NOT EXISTS companys
    (id INT NOT NULL AUTO_INCREMENT, companyName VARCHAR(255) NOT NULL, PRIMARY KEY (id));
CREATE TABLE IF NOT EXISTS jobs
    (id INT NOT NULL AUTO_INCREMENT, jobTitle VARCHAR(255) NOT NULL, jobLink VARCHAR(2083) NOT NULL,
    jobCodeId VARCHAR(255), companyId INT NOT NULL, PRIMARY KEY (id),
    FOREIGN KEY (companyId) REFERENCES companys(id));
CREATE TABLE IF NOT EXISTS users
    (id INT NOT NULL AUTO_INCREMENT, username VARCHAR(255) NOT NULL, password VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL, companyId INT NOT NULL, willingness BOOLEAN NOT NULL,
    PRIMARY KEY (id), FOREIGN KEY (companyId) REFERENCES companys(id));
CREATE TABLE IF NOT EXISTS refers
    (id INT NOT NULL AUTO_INCREMENT, refererId INT NOT NULL, refereeId INT NOT NULL,
    jobId INT NOT NULL, accepted BOOLEAN NOT NULL, PRIMARY KEY (id),
    FOREIGN KEY (refererId) REFERENCES users(id),
    FOREIGN KEY (refereeId) REFERENCES users(id),
    FOREIGN KEY (jobId) REFERENCES jobs(id));
CREATE TABLE IF NOT EXISTS helps
    (id INT NOT NULL AUTO_INCREMENT, userId INT NOT NULL, date DATE NOT NULL,
    jobId INT NOT NULL, accepted BOOLEAN NOT NULL, PRIMARY KEY (id),
    FOREIGN KEY (userId) REFERENCES users(id),
    FOREIGN KEY (jobId) REFERENCES jobs(id));
ALTER TABLE companys AUTO_INCREMENT = 1;
ALTER TABLE jobs AUTO_INCREMENT = 1;
ALTER TABLE users AUTO_INCREMENT = 1;
ALTER TABLE refers AUTO_INCREMENT = 1;
ALTER TABLE helps AUTO_INCREMENT = 1;