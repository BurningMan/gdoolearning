CREATE DATABASE  IF NOT EXISTS `university`;

DROP TABLE IF EXISTS `university`.`attendance`;
DROP TABLE IF EXISTS `university`.`lesson`;
DROP TABLE IF EXISTS `university`.`submission`;
DROP TABLE IF EXISTS `university`.`course`;
DROP TABLE IF EXISTS `university`.`subject`;
DROP TABLE IF EXISTS `university`.`student`;

CREATE TABLE `university`.`student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);


CREATE TABLE `university`.`subject` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);


CREATE TABLE `university`.`course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `subject_id` int(11),
  PRIMARY KEY (`id`),
	    CONSTRAINT `subject_constraint`
		FOREIGN KEY `subject_constraint` (`subject_id`)
		REFERENCES `university`.`subject` (`id`)
		ON DELETE RESTRICT
		ON UPDATE CASCADE
);


CREATE TABLE `university`.`submission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11),
  `course_id` int(11),
  PRIMARY KEY (`id`),
	    CONSTRAINT `student_constraint`
		FOREIGN KEY `student_constraint` (`student_id`)
		REFERENCES `university`.`student` (`id`)
		ON DELETE RESTRICT
		ON UPDATE CASCADE,
		
	    CONSTRAINT `course_constraint`
		FOREIGN KEY `course_constraint` (`course_id`)
		REFERENCES `university`.`course` (`id`)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION
);


CREATE TABLE `university`.`lesson` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_id` int(11),
  `date` timestamp,
  `topic` varchar(80) DEFAULT NULL,  
  PRIMARY KEY (`id`),
		CONSTRAINT `lesson_course_constraint`
		FOREIGN KEY `lesson_course_constraint` (`course_id`)
		REFERENCES `university`.`course` (`id`)
		ON DELETE CASCADE
		ON UPDATE CASCADE
);


CREATE TABLE `university`.`attendance` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11),
  `lesson_id` int(11),  
  PRIMARY KEY (`id`),
		CONSTRAINT `attendance_student_constraint`
		FOREIGN KEY `attendance_student_constraint` (`student_id`)
		REFERENCES `university`.`student` (`id`)
		ON DELETE NO ACTION
		ON UPDATE NO ACTION,
		
		CONSTRAINT `attendance_lesson_constraint`
		FOREIGN KEY `attendance_lesson_constraint` (`lesson_id`)
		REFERENCES `university`.`lesson` (`id`)
		ON DELETE CASCADE
		ON UPDATE CASCADE
);