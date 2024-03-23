CREATE TABLE users (
                       id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                       email VARCHAR(255) NOT NULL,
                       password VARCHAR(255) NOT NULL,
                       username VARCHAR(255) NOT NULL
);

CREATE TABLE userlists (
                           id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                           userId INT NOT NULL,
                           name VARCHAR(255) DEFAULT 'untitled',
                           type VARCHAR(255) DEFAULT 'basic',
                           FOREIGN KEY (userId) REFERENCES users(id)
);

CREATE TABLE listItem (
                          id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                          listId INT NOT NULL,
                          text VARCHAR(255),
                          tag VARCHAR(255),
                          tagStatus INT,
                          FOREIGN KEY (listId) REFERENCES userlists(id)
);
