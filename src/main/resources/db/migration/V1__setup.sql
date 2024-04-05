CREATE TABLE users
(
    id       INT          NOT NULL AUTO_INCREMENT PRIMARY KEY,
    email    VARCHAR(255) NOT NULL,
    username VARCHAR(255) NOT NULL,
    birthday DATE NOT NULL,
    pw_hash VARCHAR(255) NOT NULL,
    member_since DATETIME,
    anonymous_data_allowed TINYINT NOT NULL DEFAULT 0,
    active_account TINYINT DEFAULT 1

);

CREATE TABLE user_roles
(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    account_role VARCHAR(255) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE user_lists
(
    id          INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    list_name   VARCHAR(255),
    type        VARCHAR(255),
    list_desc   VARCHAR(255),
    is_public   TINYINT DEFAULT 0,
    created_at  DATETIME DEFAULT NOW()
);

CREATE TABLE list_users
(
    list_id     INT NOT NULL,
    user_id     INT NOT NULL,
    list_role   VARCHAR(255) NOT NULL,
    PRIMARY KEY (list_id,user_id),
    FOREIGN KEY (list_id) REFERENCES user_lists(id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);

CREATE TABLE friends
(
  userA_id INT NOT NULL,
  userB_id INT NOT NULL,
  request_status VARCHAR(255) DEFAULT 'pending',
  PRIMARY KEY(userA_id, userB_id),
  FOREIGN KEY (userA_id) REFERENCES users(id),
  FOREIGN KEY (userB_id) REFERENCES users(id)
);

CREATE TABLE list_items
(
    id          INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    list_id     INT NOT NULL,
    item        VARCHAR(255),
    type        VARCHAR(255),
    item_status      VARCHAR(255),
    FOREIGN KEY (list_id) REFERENCES user_lists(id)
);

CREATE TABLE notifications (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    message VARCHAR(255) NOT NULL,
    created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    is_read TINYINT NOT NULL DEFAULT 0,
    FOREIGN KEY (user_id) REFERENCES users(id)
);