create table if not exists config_properties (
  id int not null primary key auto_increment,
  `key` varchar(50) not null,
  `value` varchar(500) default null,
  application varchar(50) not null,
  profile varchar(50) not null,
  label varchar(50) default null
);

create table if not exists user (
  use_id int not null primary key auto_increment,
  use_name varchar(100),
  use_sex varchar(1),
  use_age number(3),
  use_id_no varchar(18),
  use_phone_num varchar(11),
  use_email varchar(100),
  create_time date,
  modify_time date,
  use_state varchar(1)
);
