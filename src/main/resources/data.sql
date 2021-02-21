INSERT INTO roles (name) VALUES ('ROLE_WORKER'), ('ROLE_TIMEKEEPER'), ('ROLE_CHIEF_ACCOUNTANT'), ('ROLE_EMPLOYER');

INSERT INTO structural_subdivisions (name, code) VALUE ('IT', '01');

INSERT INTO professions (name, salary, structural_subdivision_id) VALUES ('Администратор', 100000, 1);

INSERT INTO profession_role (profession_id, role_id) VALUES (1, 1), (1, 2), (1, 3), (1, 4), (1, 5);

INSERT INTO employee_statuses (name) VALUES ('Явка'), ('Выходной'),
('В неоплачиваемом отпуске'), ('В командировке'), ('На больничном'), ('Неизвестно');

INSERT INTO employees (username, password, first_name, last_name, account_number, date_of_employment, profession_id)
VALUES ('admin', '$2a$11$uSXS6rLJ91WjgOHhEGDx..VGs7MkKZV68Lv5r1uwFu7HgtRn3dcXG', 'Admin', 'Admin', '123456789', '2011-11-11', 1);