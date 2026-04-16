CREATE TABLE students (
    student_id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL
);
CREATE TABLE courses (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(100) NOT NULL
);

-- Create Enrollments Table
CREATE TABLE enrollments (
    student_id INT,
    course_id INT,
    
    -- Composite Primary Key (prevents duplicate enrollments)
    PRIMARY KEY (student_id, course_id),

    -- Foreign Keys to ensure valid references
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (course_id) REFERENCES courses(course_id)
);