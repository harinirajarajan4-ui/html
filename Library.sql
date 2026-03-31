INSERT INTO `books`( `Tittle`, `Author`, `Price`, `Genre`) VALUES '[value-1]','[value-2]','[value-3]','[value-4]','[value-5]');

SELECT * FROM books
WHERE Price<400;

SELECT * FROM books  WHERE  Genre IN ('History', 'Science',  'Fiction');
SELECT * FROM books WHERE Tittle='The Great Gatsby';
SELECT * FROM books
WHERE Author <> 'Dan Brown';