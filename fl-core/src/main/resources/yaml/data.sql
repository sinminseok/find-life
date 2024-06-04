-- User 데이터 삽입 쿼리
INSERT INTO user (email, role, nick_name, password, profile_url, brith, phone_number, job, gender, nationality) VALUES
('user1@example.com', 'PROVIDER', 'user1', 'password1', NULL, 1990, '01012345678', 'Engineer', 'MALE', 'Korean'),
('user2@example.com', 'GETTER', 'user2', 'password2', NULL, 1985, '01023456789', 'Teacher', 'FEMALE', 'Korean');

INSERT INTO home_address (home_address_id, state, city, post_code, detail_address, street_name, street_code, latitude, longitude) VALUES
(1, 'NSW', 'Sydney', 2000, '401', 'George St', '1', -33.8688, 151.2093),
(2, 'VIC', 'Melbourne', 3000, '402', 'Bourke St', '2', -37.8136, 144.9631),
(3, 'QLD', 'Brisbane', 4000, '403', 'Queen St', '3', -27.4698, 153.0251),
(4, 'WA', 'Perth', 6000, '404', 'Murray St', '4', -31.9505, 115.8605),
(5, 'SA', 'Adelaide', 5000, '405', 'Rundle Mall', '5', -34.9285, 138.6007),
(6, 'TAS', 'Hobart', 7000, '406', 'Elizabeth St', '6', -42.8821, 147.3272),
(7, 'NT', 'Darwin', 0800, '407', 'Mitchell St', '7', -12.4634, 130.8456),
(8, 'ACT', 'Canberra', 2600, '408', 'London Cct', '8', -35.2809, 149.1300),
(9, 'NSW', 'Newcastle', 2300, '409', 'Hunter St', '9', -32.9267, 151.7789),
(10, 'WA', 'Fremantle', 6160, '410', 'South Tce', '10', -32.0569, 115.7439);


-- Home 1
INSERT INTO home (user_id, home_address_id, bath_room_count, bedroom_count, deal_savable, options, bond, status, gender, type, introduce, bill, rent, view_count)
VALUES (1, 1, 2, 3, TRUE, 'A_S,DESK,CHAIR', 20000, 'FOR_SALE', 'MALE', 'RENT', '소개글1', 300000, 1000000, 0);

-- Home 2
INSERT INTO home (user_id, home_address_id, bath_room_count, bedroom_count, deal_savable, options, bond, status, gender, type, introduce, bill, rent, view_count)
VALUES (1, 2, 2, 3, TRUE, 'A_S,DESK,CHAIR', 20000, 'FOR_SALE', 'MALE', 'RENT', '소개글2', 300000, 1000000, 0);

-- Home 3
INSERT INTO home (user_id, home_address_id, bath_room_count, bedroom_count, deal_savable, options, bond, status, gender, type, introduce, bill, rent, view_count)
VALUES (1, 3, 2, 3, TRUE, 'A_S,DESK,CHAIR', 20000, 'FOR_SALE', 'MALE', 'RENT', '소개글3', 300000, 1000000, 0);

-- Home 4
INSERT INTO home (user_id, home_address_id, bath_room_count, bedroom_count, deal_savable, options, bond, status, gender, type, introduce, bill, rent, view_count)
VALUES (1, 4, 2, 3, TRUE, 'A_S,DESK,CHAIR', 20000, 'FOR_SALE', 'MALE', 'RENT', '소개글4', 300000, 1000000, 0);

-- Home 5
INSERT INTO home (user_id, home_address_id, bath_room_count, bedroom_count, deal_savable, options, bond, status, gender, type, introduce, bill, rent, view_count)
VALUES (1, 5, 2, 3, TRUE, 'A_S,DESK,CHAIR', 20000, 'FOR_SALE', 'MALE', 'RENT', '소개글5', 300000, 1000000, 0);

-- Home 6
INSERT INTO home (user_id, home_address_id, bath_room_count, bedroom_count, deal_savable, options, bond, status, gender, type, introduce, bill, rent, view_count)
VALUES (1, 6, 2, 3, TRUE, 'A_S,DESK,CHAIR', 20000, 'FOR_SALE', 'MALE', 'RENT', '소개글6', 300000, 1000000, 0);

-- Home 7
INSERT INTO home (user_id, home_address_id, bath_room_count, bedroom_count, deal_savable, options, bond, status, gender, type, introduce, bill, rent, view_count)
VALUES (1, 7, 2, 3, TRUE, 'A_S,DESK,CHAIR', 20000, 'FOR_SALE', 'MALE', 'RENT', '소개글7', 300000, 1000000, 0);

-- Home 8
INSERT INTO home (user_id, home_address_id, bath_room_count, bedroom_count, deal_savable, options, bond, status, gender, type, introduce, bill, rent, view_count)
VALUES (1, 8, 2, 3, TRUE, 'A_S,DESK,CHAIR', 20000, 'FOR_SALE', 'MALE', 'RENT', '소개글8', 300000, 1000000, 0);

-- Home 9
INSERT INTO home (user_id, home_address_id, bath_room_count, bedroom_count, deal_savable, options, bond, status, gender, type, introduce, bill, rent, view_count)
VALUES (1, 9, 2, 3, TRUE, 'A_S,DESK,CHAIR', 20000, 'FOR_SALE', 'MALE', 'RENT', '소개글9', 300000, 1000000, 0);

-- Home 10
INSERT INTO home (user_id, home_address_id, bath_room_count, bedroom_count, deal_savable, options, bond, status, gender, type, introduce, bill, rent, view_count)
VALUES (1, 10, 2, 3, TRUE, 'A_S,DESK,CHAIR', 20000, 'FOR_SALE', 'MALE', 'RENT', '소개글10', 300000, 1000000, 0);


-- HomeImage
INSERT INTO home_image (home_id, image_url)
VALUES
(1, 'url1'),
(1, 'url2'),
(2, 'url3'),
(2, 'url4'),
(3, 'url5'),
(3, 'url6'),
(4, 'url7'),
(4, 'url8'),
(5, 'url9'),
(5, 'url10'),
(6, 'url11'),
(6, 'url12'),
(7, 'url13'),
(7, 'url14'),
(8, 'url15'),
(8, 'url16'),
(9, 'url17'),
(9, 'url18'),
(10, 'url19'),
(10, 'url20');