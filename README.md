Mongo Data Base creation

create a Data base in mongo with the name "mydatabase"

create a collection with the name "issues"

insert some same documents in the issues collection with the following script

db.issues.insertOne(
    {
        description: "This is my first issue",
        severity: 1,
        assignee: "Carlos" 
    }
)

db.issues.insertOne(
    {
        description: "This is my second issue",
        severity: 2,
        assignee: "Jorge" 
    }
)


db.issues.insertOne(
    {
        description: "This is my third issue",
        severity: 3,
        assignee: "Armando" 
    }
)

db.issues.insertOne(
    {
        description: "This is my fourth issue",
        severity: 4,
        assignee: "Dominguez" 
    }
)
