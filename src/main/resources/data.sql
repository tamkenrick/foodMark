-- Insert two users
INSERT INTO users (username, password, phone_number, email)
VALUES ('johndoe', 'password123', '123-456-7890', 'johndoe@example.com');

INSERT INTO users (username, password, phone_number, email)
VALUES ('janedoe', 'password456', '555-123-4567', 'janedoe@example.com');

-- Insert two food items for user John Doe and their nutrition label information
INSERT INTO foods (user_id, name, type, quantity, unit, expiry_date, created_at, updated_at)
VALUES (1, 'Chicken Breast', 'Meat', 1, 'lb', '2023-12-31', NOW(), NOW());
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (1, 'protein', '26g', NOW(), NOW());
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (1, 'fat', '3g', NOW(), NOW());
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (1, 'carbohydrates', '0g', NOW(), NOW());
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (1, 'category', 'Protein', NOW(), NOW());

INSERT INTO foods (user_id, name, type, quantity, unit, expiry_date, created_at, updated_at)
VALUES (1, 'Broccoli', 'Vegetable', 2, 'pcs', '2023-04-30', NOW(), NOW());
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (2, 'protein', '2.6g', NOW(), NOW());
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (2, 'fat', '0.3g', NOW(), NOW());
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (2, 'carbohydrates', '5g', NOW(), NOW());
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (2, 'category', 'Vegetable', NOW(), NOW());

-- Insert two food items for user Jane Doe and their nutrition label information
INSERT INTO foods (user_id, name, type, quantity, unit, expiry_date, created_at, updated_at)
VALUES (2, 'Salmon Fillet', 'Fish', 0.5, 'lb', '2023-05-31', NOW(), NOW());
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (3, 'protein', '12g', NOW(), NOW());
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (3, 'fat', '10g', NOW(), NOW());
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (3, 'carbohydrates', '0g', NOW(), NOW());
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (3, 'category', 'Protein', NOW(), NOW());

INSERT INTO foods (user_id, name, type, quantity, unit, expiry_date, created_at, updated_at)
VALUES (2, 'Sweet Potato', 'Vegetable', 1, 'pcs', '2023-05-31', NOW(), NOW());
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (4, 'protein', '2g', NOW(), NOW());
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (4, 'fat', '0g', NOW(), NOW());
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (4, 'carbohydrates', '26g', NOW(), NOW());
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (4, 'category', 'Vegetable', NOW(), NOW());