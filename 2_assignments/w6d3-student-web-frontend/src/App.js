import React, {useEffect, useState} from 'react';

function loadStudents() {
  return fetch("http://localhost:8080/students")
    .then(response => response.json())
    /*.then(data => console.log(data))*/
}

function App() {

  const [students, setStudents] = useState([]);

  useEffect(() => {
    loadStudents()
      .then(data => setStudents(data));
}, []);

  return (
    <div>
      {students.map((student) => <div key={student.id}>{student.name} {student.age} {student.universityId}</div>)}
    </div>
  );
}

export default App;
