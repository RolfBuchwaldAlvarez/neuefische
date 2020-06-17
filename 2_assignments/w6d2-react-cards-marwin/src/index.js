import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';

ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();


/*
const addNewTodoButton = document.getElementById("addNewTodoButton");
addNewTodoButton.addEventListener("click", addPost);

const deleteTodoButton = document.getElementById("deleteTodoButton");
deleteTodoButton.addEventListener("click", deleteTodo);

// Add Post for Backend
async function addPost() {
  const post = addNewTodo();
  console.log(JSON.stringify(post));
  fetch("http://localhost:8080/api/to-do", {
    method: 'POST',
    headers: {
      "content-type": "application/json"
    },
    body: JSON.stringify(post),
  }).then((response) => console.log(response));
}

// Get To-Do List from Backend
async function getTodoList() {
  fetch("http://localhost:8080/api/to-do")
    .then((response) => response.json())
    .then(data => console.log(data));

}// Delete a To-Do-Tast from To-Do-List
async function deleteTodo() {
  const id = getIdOfItemToBeDeleted();
  console.log(JSON.stringify(id))
  await fetch(`http://localhost:8080/api/to-do/${id}`, {
    method: 'DELETE',
    headers: {
      "content-type": "application/json"
    },
  });
  await getTodoList();
}

getTodoList();
*/