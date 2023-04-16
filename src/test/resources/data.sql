-- Insert two users
INSERT INTO users (username, password, phone_number, email)
VALUES ('johndoe', 'password123', '123-456-7890', 'johndoe@example.com'),
       ('janedoe', 'password456', '555-123-4567', 'janedoe@example.com');

-- Insert two food items for user John Doe
INSERT INTO foods (user_id, name, type, quantity, unit, expiry_date, nutrition)
VALUES (1, 'Chicken Breast', 'Meat', 1, 'lb', '2023-12-31',
        '{ "protein": "26g", "fat": "3g", "carbohydrates": "0g", "category": "Protein" }'),
       (1, 'Broccoli', 'Vegetable', 2, 'pcs', '2023-04-30',
        '{ "protein": "2.6g", "fat": "0.3g", "carbohydrates": "5g", "category": "Vegetable" }');

-- Insert two food items for user Jane Doe
INSERT INTO foods (user_id, name, type, quantity, unit, expiry_date, nutrition)
VALUES (2, 'Salmon Fillet', 'Fish', 0.5, 'lb', '2023-05-31',
        '{ "protein": "12g", "fat": "10g", "carbohydrates": "0g", "category": "Protein" }'),
       (2, 'Sweet Potato', 'Vegetable', 1, 'pcs', '2023-05-31',
        '{ "protein": "2g", "fat": "0g", "carbohydrates": "26g", "category": "Vegetable" }');