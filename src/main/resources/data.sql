INSERT INTO roles (name) VALUES ('ROLE_ISSUER'), ('ROLE_PERFORMER'), ('ROLE_ACCOUNTANT'), ('ROLE_ADMIN'), ('ROLE_EMPLOYER')

INSERT INTO statuses (name) VALUES ('IN_PROGRESS'), ('ON_PENDING'), ('COMPLETED')

INSERT INTO employees (username, password, first_name, last_name, account_number, salary)
VALUES ('admin', '$2a$11$uSXS6rLJ91WjgOHhEGDx..VGs7MkKZV68Lv5r1uwFu7HgtRn3dcXG', 'Admin', 'Admin', '123456789', 100000)

INSERT INTO employee_role (employee_id, role_id) VALUES (1, 1), (1, 2), (1, 3), (1, 4), (1, 5)