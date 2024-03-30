CREATE TABLE users
(
    id       INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
    email    VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    username VARCHAR(255) NOT NULL
);

CREATE TABLE user_lists
(
    id          INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_id     INT NOT NULL,
    name        VARCHAR(255),
    type        VARCHAR(255),
    description VARCHAR(255),
    FOREIGN KEY (user_id) REFERENCES users (id)
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