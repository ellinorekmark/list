ALTER TABLE user_lists
    ADD COLUMN has_check BOOLEAN,
    ADD COLUMN has_link BOOLEAN,
    ADD COLUMN has_rank BOOLEAN,
    ADD COLUMN has_comment BOOLEAN;

ALTER TABLE list_items
    ADD COLUMN checked BOOLEAN,
    ADD COLUMN link VARCHAR(300),
    ADD COLUMN comment VARCHAR(300);


