INSERT INTO accounts (name,contact_details,balance,account_no,password) VALUES
  ('Sam Smith', 'sam@sam.com',110453,3704004405320130,'123'),
  ('Antony Hopkins', 'antony@hopkins.com',7453,3704004405320131,'123'),
  ('Danielle Radcliife', 'daniel@radcliffe.com',895432,3704004405320132,'123'),
  ('Employer', 'employer@google.com',905421,3704004405320133,'123'),
  ('Landlord', 'landlord@landlord.com',324354,3704004405320134,'123'),
  ('Credit ACC', 'credit@hdfc.com',984523,3704004405320135,'123'),
  ('EMI ACC', 'emi@sbi.com',132643,3704004405320136,'123'),
  ('PPF ACC', 'ppf@okppf.com',197432,3704004405320437,'123'),
  ('developer', 'developer@developer.com',0,0000000000000000,'123'),
  ('admin', 'admin@admin.com',0,0000000000000000,'123');

--
INSERT INTO payees (account_no,name,contact_details) VALUES
(3704004405320131,'Antony Hopkins','antony@hopkins.com'),
(3704004405320132,'Danielle Radcliife','daniel@radcliffe.com'),
(3704004405320133,'Employer', 'employer@google.com'),
(3704004405320134,'Landlord', 'landlord@landlord.com'),
(3704004405320135,'Credit ACC', 'credit@hdfc.com'),
(3704004405320136,'EMI ACC', 'emi@sbi.com'),
(3704004405320437,'PPF ACC', 'ppf@okppf.com');
--
INSERT INTO account_payee_join_table (id,payees_id) VALUES
(1,1),
(1,2),
(1,3),
(1,4),
(1,5),
(1,6),
(1,7);

