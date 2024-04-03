CREATE TABLE users
(
    id       INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
    email    VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    username VARCHAR(255) NOT NULL
);

CREATE TABLE user_roles
(
    user_id INT NOT NULL,
    account_role VARCHAR(255) NOT NULL
);

CREATE TABLE user_lists
(
    id          INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(255),
    type        VARCHAR(255),
    description VARCHAR(255),
    public TINYINT DEFAULT 0
);

CREATE TABLE list_users
(
    list_id INT NOT NULL,
    user_id INT NOT NULL,
    list_role VARCHAR(255) NOT NULL,
    PRIMARY KEY(list_id,user_id),
    FOREIGN KEY (list_id) REFERENCES user_lists(id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE friends
(
  userA_id INT NOT NULL,
  userB_id INT NOT NULL,
  status VARCHAR(255) DEFAULT 'pending',
  PRIMARY KEY(userA_id,userB_id),
  FOREIGN KEY (userA_id) REFERENCES users(id),
  FOREIGN KEY (userB_id) REFERENCES users(id)
);

CREATE TABLE list_items
(
    id          INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    list_id     INT NOT NULL,
    text        VARCHAR(255),
    type        VARCHAR(255),
    status      VARCHAR(255),
    FOREIGN KEY (list_id) REFERENCES user_lists(id)
);