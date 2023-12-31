# MiniProjectUni

Introduction:
this project seves as a design of a university system.

1/person class
represents a building block for the creation of the student,teacher and staff.

2/Student class
this class represents the students that can register to courses and participate in clubs and activities.

3/ teacher class
the teacher is the entitiy that teaches courses so each course has to be associated with a teacher.

4/Staff
represents  the administrative staff of the university.

5/Subject
this class represents the subjects that are taught in the university by the teachers. A subject has to be associated with a course.

6/course
this class reprensents the link between the teacher and the subject being taught.

7/courseManager
the courseManager class associates to each course the students that are partaking in the course.

8/courseArraylist
this class serves the purpose of saving the the courses data so as to access the data of courses.

9/courseSchedule
asssociates with the course a specific time.

10/courseScheduleManager
maanages the course schedules by saving them in an arraylist.

11/classroom
represents the physical space in which the course is to be taught.

12/classroomManager
keeps record of the available classes in the university.

13/Club
the students can partake in activities within clubs

14/ClubManager
this keeps track of the available clubs in the university.

15/clubMembers
Associates to the club an arraylist of students that are members of that club.

16/clubMembersManager
keeps track of available clubs and their members.

17/clubSchedule
gives to the club a specific time for enacting its activities

18/ClubscheduleManager
manages the time schedule of the clubs

19/StaffManager
manages the staff of the university

20/studentManager
manages the students of the university

21/University
this is the class that links all the before mentionned classes and initializes the managers.
