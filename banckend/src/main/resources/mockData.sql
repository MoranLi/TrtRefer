INSERT INTO companys (companyName) VALUES("Google");
INSERT INTO companys (companyName) VALUES("Amazon");
INSERT INTO companys (companyName) VALUES("IBM");
INSERT INTO companys (companyName) VALUES("Microsoft");
INSERT INTO jobs (jobTitle, jobLink, jobCodeId, companyId) VALUES ("Cloud Data Developer, Google Professional Services",
	"https://careers.google.com/jobs/results/72458650058138310/", NULL, 1);
INSERT INTO jobs (jobTitle, jobLink, jobCodeId, companyId) VALUES ("Cloud Technical Solutions Developer, Platform",
	"https://careers.google.com/jobs/results/103080487615898310/", NULL, 1);
INSERT INTO jobs (jobTitle, jobLink, jobCodeId, companyId) VALUES ("Technical Specialist, Application Modernization, Google Cloud",
	"https://careers.google.com/jobs/results/143826287698289350/", NULL, 1);
INSERT INTO jobs (jobTitle, jobLink, jobCodeId, companyId) VALUES ("Cloud Infrastructure Developer, Professional Services",
	"https://careers.google.com/jobs/results/140337354096157382/", NULL, 1);
INSERT INTO jobs (jobTitle, jobLink, jobCodeId, companyId) VALUES ("Software Development Engineer",
	"https://www.amazon.jobs/en/jobs/994613/software-development-engineer", "994613", 2);
INSERT INTO jobs (jobTitle, jobLink, jobCodeId, companyId) VALUES ("Software Development Engineer",
	"https://www.amazon.jobs/en/jobs/974146/software-development-engineer", "974146", 2);
INSERT INTO jobs (jobTitle, jobLink, jobCodeId, companyId) VALUES ("Front End Engineer II",
	"https://www.amazon.jobs/en/jobs/969638/front-end-engineer-ii", "969638", 2);
INSERT INTO jobs (jobTitle, jobLink, jobCodeId, companyId) VALUES ("Computer Operator - Junior",
	"https://careers.ibm.com/ShowJob/Id/1068138/Computer-Operator-Junior", "355490BR", 3);
INSERT INTO jobs (jobTitle, jobLink, jobCodeId, companyId) VALUES ("Full Time Opportunities for Students and Recent Graduates - Software Engineer",
	"https://careers.microsoft.com/students/us/en/job/870956/Full-Time-Opportunities-for-Students-and-Recent-Graduates-Software-Engineer", "870956", 4);
INSERT INTO users (username, password, email, companyId, willingness) VALUES ("googleuser","googleuser","googleuser@gmail.com",1, TRUE);
INSERT INTO users (username, password, email, companyId, willingness) VALUES ("amazonuser","amazonuser","amazonuser@gmail.com",2, TRUE);
INSERT INTO users (username, password, email, companyId, willingness) VALUES ("ibmuser","ibmuser","ibmuser@gmail.com",3, TRUE);
INSERT INTO users (username, password, email, companyId, willingness) VALUES ("microsoftuser","microsoftuser","microsoft@gmail.com",4, TRUE);
INSERT INTO refers (refererId, refereeId, jobId, accepted)VALUES (2,1,6,FALSE);
INSERT INTO refers (refererId, refereeId, jobId, accepted)VALUES (1,2,2,FALSE);
INSERT INTO refers (refererId, refereeId, jobId, accepted)VALUES (2,3,7,FALSE);
INSERT INTO refers (refererId, refereeId, jobId, accepted)VALUES (3,1,8,FALSE);
INSERT INTO refers (refererId, refereeId, jobId, accepted)VALUES (1,4,1,FALSE);
INSERT INTO refers (refererId, refereeId, jobId, accepted)VALUES (2,4,5,FALSE);
INSERT INTO helps (userId, date, jobId, accepted) VALUES (1,DATE("2020-01-01"),8,FALSE);
INSERT INTO helps (userId, date, jobId, accepted) VALUES (2,DATE("2020-01-01"),9,FALSE);
INSERT INTO helps (userId, date, jobId, accepted) VALUES (3,DATE("2020-01-01"),1,FALSE);
INSERT INTO helps (userId, date, jobId, accepted) VALUES (4,DATE("2020-01-01"),2,FALSE);
INSERT INTO helps (userId, date, jobId, accepted) VALUES (3,DATE("2020-01-01"),2,FALSE);