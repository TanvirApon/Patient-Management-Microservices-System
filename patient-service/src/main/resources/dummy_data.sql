-- Dummy Patient Data Inserted Into H2 Console
INSERT INTO patient (id, name, email, address, date_of_birth, registered_date)
SELECT '323e4567-e89b-12d3-a456-426614174015',
       'Rahim Uddin',
       'rahim.uddin@gmail.com',
       'Dhanmondi, Dhaka',
       '1987-05-14',
       '2024-02-10'
    WHERE NOT EXISTS (SELECT 1 FROM patient WHERE id = '323e4567-e89b-12d3-a456-426614174015');

INSERT INTO patient (id, name, email, address, date_of_birth, registered_date)
SELECT '323e4567-e89b-12d3-a456-426614174016',
       'Karim Hossain',
       'karim.hossain@yahoo.com',
       'Mirpur, Dhaka',
       '1992-08-21',
       '2023-11-05'
    WHERE NOT EXISTS (SELECT 1 FROM patient WHERE id = '323e4567-e89b-12d3-a456-426614174016');

INSERT INTO patient (id, name, email, address, date_of_birth, registered_date)
SELECT '323e4567-e89b-12d3-a456-426614174017',
       'Nusrat Jahan',
       'nusrat.jahan@gmail.com',
       'Uttara, Dhaka',
       '1998-03-10',
       '2024-01-18'
    WHERE NOT EXISTS (SELECT 1 FROM patient WHERE id = '323e4567-e89b-12d3-a456-426614174017');

INSERT INTO patient (id, name, email, address, date_of_birth, registered_date)
SELECT '323e4567-e89b-12d3-a456-426614174018',
       'Tanvir Ahmed',
       'tanvir.ahmed@gmail.com',
       'Chawkbazar, Chattogram',
       '1995-12-02',
       '2023-09-12'
    WHERE NOT EXISTS (SELECT 1 FROM patient WHERE id = '323e4567-e89b-12d3-a456-426614174018');

INSERT INTO patient (id, name, email, address, date_of_birth, registered_date)
SELECT '323e4567-e89b-12d3-a456-426614174019',
       'Farzana Akter',
       'farzana.akter@gmail.com',
       'Zindabazar, Sylhet',
       '1990-06-25',
       '2022-12-30'
    WHERE NOT EXISTS (SELECT 1 FROM patient WHERE id = '323e4567-e89b-12d3-a456-426614174019');

INSERT INTO patient (id, name, email, address, date_of_birth, registered_date)
SELECT '323e4567-e89b-12d3-a456-426614174020',
       'Mahmudul Hasan',
       'mahmudul.hasan@gmail.com',
       'Rajshahi Sadar, Rajshahi',
       '1984-09-15',
       '2023-06-22'
    WHERE NOT EXISTS (SELECT 1 FROM patient WHERE id = '323e4567-e89b-12d3-a456-426614174020');

INSERT INTO patient (id, name, email, address, date_of_birth, registered_date)
SELECT '323e4567-e89b-12d3-a456-426614174021',
       'Sadia Islam',
       'sadia.islam@gmail.com',
       'Khulna Sadar, Khulna',
       '1997-01-08',
       '2024-03-05'
    WHERE NOT EXISTS (SELECT 1 FROM patient WHERE id = '323e4567-e89b-12d3-a456-426614174021');

INSERT INTO patient (id, name, email, address, date_of_birth, registered_date)
SELECT '323e4567-e89b-12d3-a456-426614174022',
       'Rafiq Ahmed',
       'rafiq.ahmed@gmail.com',
       'Barisal Sadar, Barisal',
       '1981-11-19',
       '2023-04-14'
    WHERE NOT EXISTS (SELECT 1 FROM patient WHERE id = '323e4567-e89b-12d3-a456-426614174022');

INSERT INTO patient (id, name, email, address, date_of_birth, registered_date)
SELECT '323e4567-e89b-12d3-a456-426614174023',
       'Jannatul Ferdous',
       'jannat.ferdous@gmail.com',
       'Mymensingh Sadar, Mymensingh',
       '1999-07-27',
       '2024-02-28'
    WHERE NOT EXISTS (SELECT 1 FROM patient WHERE id = '323e4567-e89b-12d3-a456-426614174023');

INSERT INTO patient (id, name, email, address, date_of_birth, registered_date)
SELECT '323e4567-e89b-12d3-a456-426614174024',
       'Imran Khan',
       'imran.khan.bd@gmail.com',
       'Gazipur Sadar, Gazipur',
       '1986-04-03',
       '2023-10-10'
    WHERE NOT EXISTS (SELECT 1 FROM patient WHERE id = '323e4567-e89b-12d3-a456-426614174024');