const addNewTodoButton = document.getElementById("addNewTodoButton");
addNewTodoButton.addEventListener("click", addPost);

const deleteTodoButton = document.getElementById("deleteTodoButton");
deleteTodoButton.addEventListener("click", deleteTodo);

// Add new to-do
function addNewTodo() {
    const todoDescriptionInput = document.getElementById("todoDescriptionInput");
    let newTodo = {};
    newTodo.description = todoDescriptionInput.value;
    console.log(newTodo);
    return newTodo;
}

// Delete to-do
function getIdOfItemToBeDeleted() {
    const idOfItemToBeDeleted = document.getElementById("deleteTodo").value;
    return idOfItemToBeDeleted;
}

// Add Post for Backend
async function addPost() {
    const post = addNewTodo();
    console.log(JSON.stringify(post));
    fetch("http://localhost:8080/api/todo", {
        method: 'POST',
        headers: {
            "content-type": "application/json"
        },
        body: JSON.stringify(post),
    }).then((response) => console.log(response));
}

// Get To-Do List from Backend
async function getTodoList() {
    fetch("http://localhost:8080/api/todo")
        .then((response) => response.json())
        .then(data => console.log(data));

}// Delete a To-Do-Tast from To-Do-List
async function deleteTodo() {
    const id = getIdOfItemToBeDeleted();
    console.log(JSON.stringify(id))
    await fetch(`http://localhost:8080/api/todo/${id}`, {
        method: 'DELETE',
        headers: {
            "content-type": "application/json"
        },
    });
    await getTodoList();
}

getTodoList();

