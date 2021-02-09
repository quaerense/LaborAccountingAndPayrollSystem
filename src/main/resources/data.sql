INSERT INTO roles (name) VALUES ('ROLE_ISSUER'), ('ROLE_PERFORMER'), ('ROLE_ACCOUNTANT'), ('ROLE_ADMIN')

INSERT INTO statuses (name) VALUES ('IN_PROGRESS'), ('ON_PENDING'), ('COMPLETED')

INSERT INTO employees (login, password, first_name, last_name, account_number, salary)
VALUES ('admin', 'password1', 'Admin', 'Admin', '123456789', 100000)

INSERT INTO employee_role (employee_id, role_id) VALUES (1, 1), (1, 2), (1, 3), (1, 4)