/** Oauth - populate the oauth_client_details table */
INSERT INTO `oauth_client_details` (`client_id`, `client_secret`, `scope`, `authorized_grant_types`, `access_token_validity`, `additional_information`)
VALUES
('web', 'secret', 'read', 'authorization_code,password,refresh_token,implicit', '900', '{}')
ON DUPLICATE key UPDATE
client_secret = VALUES(`client_secret`),
scope = VALUES(`scope`),
authorized_grant_types = VALUES(`authorized_grant_types`),
access_token_validity = VALUES(`access_token_validity`),
additional_information = VALUES(`additional_information`);

INSERT INTO `oauth_example`.`account` (`id`, `password`, `username`) VALUES ('	1	', 'dazito.com', 'dazito')
ON DUPLICATE key UPDATE
password = VALUES(`password`),
username = VALUES(`username`);
