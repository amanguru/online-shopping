CREATE table category(
  id IDENTITY,
  name  VARCHAR(50),
  description VARCHAR(255),
  image_url VARCHAR(50),
  is_active BOOLEAN,
  
  CONSTRAINT pk_category_id PRIMARY KEY(id)
);

INSERT INTO category(name,description,image_url,is_active) VALUES('Laptop','This is description Laptop','cpf-1', True);
INSERT INTO category(name,description,image_url,is_active) VALUES('Television','This is description Television','cpf-2',True);
INSERT INTO category(name,description,image_url,is_active) VALUES('Mobile','This is description mobile','cpf-3',True);

CREATE table user_detail(
  id IDENTITY,
  first_name VARCHAR(50),
  last_name VARCHAR(50),
  role VARCHAR(50),
  is_active BOOLEAN,
  email VARCHAR(50),
  password VARCHAR(50),
  contact_number VARCHAR(255),
 
  CONSTRAINT pk_user_id PRIMARY KEY(id)
);

INSERT INTO user_detail(first_name,last_name,role,is_active,email,password,contact_number) VALUES('Virat','Kohli','Admin',true,'vk@gmail.com','6543456','8888888888');
INSERT INTO user_detail(first_name,last_name,role,is_active,email,password,contact_number) VALUES('ravindra','jadega','Supplier',true,'rj@gmail.com','234556''9999999999');
INSERT INTO user_detail(first_name,last_name,role,is_active,email,password,contact_number) VALUES('Ravichandra','Ashwin','Supplier',true,'ra@gmail.com','12345','77777777');

CREATE table product(
  id IDENTITY,
  code VARCHAR(50),
  name VARCHAR(50),
  brand VARCHAR(50),
  description VARCHAR(255),
  unit_price DECIMAL(10,2),
  quantity INT,
  is_active BOOLEAN,
  category_id INT,
  supplier_id INT,
  purchases INT DEFAULT 0,
  views INT DEFAULT 0,
  CONSTRAINT pk_product_id PRIMARY KEY(id),
  CONSTRAINT fk_product_category_id FOREIGN KEY(category_id) REFERENCES category(id),
  CONSTRAINT fk_product_supplier_id FOREIGN KEY(supplier_id) REFERENCES user_detail(id),  
);

INSERT INTO PRODUCT(code,name,brand,description,unit_price,quantity,is_active,category_id,supplier_id) VALUES('PRDABC123DEFX','iphone 5s','apple','ok','6543456',2,true,2,1);
INSERT INTO PRODUCT(code,name,brand,description,unit_price,quantity,is_active,category_id,supplier_id) VALUES('PRDWDC123DEFX','Sumsung s7','samsung','this','3200',2',true,3,1);
INSERT INTO PRODUCT(code,name,brand,description,unit_price,quantity,is_active,category_id,supplier_id) VALUES('PRDAER123DEFX','Google pixel','google','that','6543456',3,true,3,2);

INSERT INTO PRODUCT(code,name,brand,description,unit_price,quantity,is_active,category_id,supplier_id) VALUES('PRDAYT123DEFX','Macbook pro','apple','those','6543456',4,true',1,2);
INSERT INTO PRODUCT( code,name,brand,description,unit_price,quantity,is_active,category_id,supplier_id) VALUES('PRDAIY123DEFX','dell latitude','dell','what','6543456',5,true,1,3);