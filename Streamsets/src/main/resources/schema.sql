DROP TABLE IF EXISTS streamsetdetails;
CREATE TABLE streamsetdetails (
  pipelineid VARCHAR(250) PRIMARY KEY,
  title VARCHAR(250),
  status VARCHAR(250),
  user VARCHAR(250),
  description VARCHAR(250),
  valid VARCHAR(250)
);