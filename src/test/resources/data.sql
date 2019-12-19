INSERT INTO user (id, oauth_id, nickname, role, degree_id) VALUES (1, '1234','woowacrew','ROLE_ADMIN',1);

INSERT INTO article (id, title, content, author) VALUES (1, 'article A', 'content', 1);
INSERT INTO article (id, title, content, author) VALUES (2, 'delete article', 'content', 1);
INSERT INTO article (id, title, content, author) VALUES (3, 'test article spec', 'testdelete content', 1);
INSERT INTO article (id, title, content, author) VALUES (4, 'article spec', 'testdelete content', 1);
INSERT INTO article (id, title, content, author) VALUES (5, 'specarticle', 'testdelete content', 1);
INSERT INTO article (id, title, content, author) VALUES (6, 'article', 'test spec content', 1);
INSERT INTO article (id, title, content, author) VALUES (7, 'article', 'testspec content', 1);
INSERT INTO article (id, title, content, author) VALUES (8, 'article', 'spec', 1);
INSERT INTO article (id, title, content, author) VALUES (9, 'spec', 'test spec', 1);

INSERT INTO comment (id, content, author, article) VALUES (1, 'comment content1', 1, 1);
INSERT INTO comment (id, content, author, article) VALUES (2, 'comment content2', 1, 1);

INSERT INTO keyword(content, views) VALUES ('test A', 1L);
INSERT INTO keyword(content, views) VALUES ('test B', 1L);
INSERT INTO keyword(content, views) VALUES ('test C', 1L);
INSERT INTO keyword(content, views) VALUES ('test D', 1L);
INSERT INTO keyword(content, views) VALUES ('test E', 1L);

INSERT INTO keyword(content, views) VALUES ('중복된 검색어', 1L);

INSERT INTO keyword(content, views) VALUES ('최다 조회수 A', 300L);
INSERT INTO keyword(content, views) VALUES ('최다 조회수 B', 200L);
INSERT INTO keyword(content, views) VALUES ('최다 조회수 C', 100L);

INSERT INTO user (id, oauth_id, nickname, role, degree_id) VALUES (2, '10','woowacrew','ROLE_PRECOURSE', 1);
INSERT INTO user (id, oauth_id, nickname, role, degree_id) VALUES (3, '11','woowacrew','ROLE_PRECOURSE', 1);
INSERT INTO user (id, oauth_id, nickname, role, degree_id) VALUES (4, '12','woowacrew','ROLE_PRECOURSE', 1);
INSERT INTO user (id, oauth_id, nickname, role, degree_id) VALUES (5, '13','woowacrew','ROLE_ADMIN', 1);
INSERT INTO user (id, oauth_id, nickname, role, degree_id) VALUES (6, '14','woowacrew','ROLE_COACH', 1);
INSERT INTO user (id, oauth_id, nickname, role, degree_id) VALUES (7, '15','woowacrew','ROLE_CREW', 2);
INSERT INTO user (id, oauth_id, nickname, role, degree_id) VALUES (8, '15','woowacrew','ROLE_PRECOURSE', 1);

INSERT INTO feed_source(source_url,description) values ('https://vsh123.github.io/feed.xml', 'SHAKEVAN');

INSERT INTO feed_article(title,link,published_date,feed_source_id) values('title1','link1','2019-10-01T00:00:00',1);
INSERT INTO feed_article(title,link,published_date,feed_source_id) values('title2','link2','2019-10-02T00:00:00',1);
INSERT INTO feed_article(title,link,published_date,feed_source_id) values('title3','link3','2019-10-03T00:00:00',1);
INSERT INTO feed_article(title,link,published_date,feed_source_id) values('title4','link4','2019-10-04T00:00:00',1);
INSERT INTO feed_article(title,link,published_date,feed_source_id) values('title5','link5','2019-10-05T00:00:00',1);
INSERT INTO feed_article(title,link,published_date,feed_source_id) values('title6','link6','2019-10-06T00:00:00',1);


INSERT INTO crew_article(title,content,author) values('1기 게시글','1기 게시글',1);
INSERT INTO crew_article(title,content,author) values('2기 게시글','2기 게시글',7);
