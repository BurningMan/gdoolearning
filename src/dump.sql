INSERT INTO `university`.`student` (`name`) VALUES ('Sinkov Volodymyr');
INSERT INTO `university`.`student` (`name`) VALUES ('Chupyr Andrii');

INSERT INTO `university`.`subject` (`name`) VALUES ('OOP');
INSERT INTO `university`.`subject` (`name`) VALUES ('Math');
INSERT INTO `university`.`subject` (`name`) VALUES ('History');

INSERT INTO `university`.`course` (`subject_id`, `start_date`, `finish_date`) VALUES ('1', '2013-01-01', '2013-05-30');
INSERT INTO `university`.`course` (`subject_id`, `start_date`, `finish_date`) VALUES ('2', '2013-01-01', '2013-03-30');
INSERT INTO `university`.`course` (`subject_id`, `start_date`, `finish_date`) VALUES ('2', '2014-01-01', '2014-05-01');


INSERT INTO `university`.`submission` (`student_id`, `course_id`) VALUES ('1', '1');
INSERT INTO `university`.`submission` (`student_id`, `course_id`) VALUES ('2', '2');
INSERT INTO `university`.`submission` (`student_id`, `course_id`) VALUES ('2', '1');

INSERT INTO `university`.`lesson` (`course_id`, `start_time`, `topic`) VALUES ('1', '2013-11-22', 'Topic1');
INSERT INTO `university`.`lesson` (`course_id`, `start_time`, `topic`) VALUES ('2', '2013-11-22', 'Topic2');
INSERT INTO `university`.`lesson` (`course_id`, `start_time`, `topic`) VALUES ('1', '2013-11-22', 'Topic3');
INSERT INTO `university`.`lesson` (`course_id`, `start_time`, `topic`) VALUES ('1', '2013-11-22', 'Topic4');

INSERT INTO `university`.`attendance` (`student_id`, `lesson_id`) VALUES ('1', '1');
INSERT INTO `university`.`attendance` (`student_id`, `lesson_id`) VALUES ('1', '3');
