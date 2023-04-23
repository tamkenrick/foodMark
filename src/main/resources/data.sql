-- Insert two users
INSERT INTO users (username, password, phone_number, email)
VALUES ('johndoe', 'password123', '123-456-7890', 'johndoe@example.com');

INSERT INTO users (username, password, phone_number, email)
VALUES ('janedoe', 'password456', '555-123-4567', 'janedoe@example.com');

-- Insert two food items for user John Doe and their nutrition label information
INSERT INTO foods (user_id, name, type, quantity, unit, expiry_date, created_at, updated_at, image)
VALUES (1, 'Chicken Breast', 'Meat', 1, 'lb', '2023-12-31', NOW(), NOW(), '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');
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (1, 'protein', '26g', NOW(), NOW());
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (1, 'fat', '3g', NOW(), NOW());
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (1, 'carbohydrates', '0g', NOW(), NOW());
INSERT INTO nutrition_label (food_id, nutrition_key, nutrition_value, created_at, updated_at)
VALUES (1, 'category', 'Protein', NOW(), NOW());

INSERT INTO foods (user_id, name, type, quantity, unit, expiry_date, created_at, updated_at, image)
VALUES (1, 'Broccoli', 'Vegetable', 2, 'pcs', '2023-04-30', NOW(), NOW(), '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');
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