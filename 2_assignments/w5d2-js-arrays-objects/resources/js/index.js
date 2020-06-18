const addUserButton = document.getElementById("addUser");
addUserButton.addEventListener("click", addUserName);

const undoUserButton = document.getElementById("undoUser");
undoUserButton.addEventListener("click", undoUser);

const findUserIdByNameButton = document.getElementById("findUserIdByName");
findUserIdByNameButton.addEventListener("click", findUserIdByName);

const searchDBButton = document.getElementById("searchDB");
searchDBButton.addEventListener("click", searchDB);

const userNameInput = document.getElementById("userNameInput");
const userIdInput = document.getElementById("userIdInput");

const userDB = [
    {
    id: 87694,
    name: "Marwin"
    },
    {
        id: 98373,
        name: "Fabian"
    }
    ];

function addUserName() {
    let newUser = {};
    newUser.id = Number(userIdInput.value);
    newUser.name = userNameInput.value;
    userDB.push(newUser);
    console.log(userDB);
    /*console.log(userNameInput);
    console.log(userNameInput.value);
    console.log(userIdInput);
    console.log(userIdInput.value);*/
    /*newUser.id = Number(prompt("Please enter ID (num):"));
    newUser.name = prompt("Please enter username: ")
    userDB.push(newUser);
    console.log(userDB);*/
}

function undoUser() {
    const deletedUser = userDB.pop();
    console.log("User has been deleted")
    console.log(deletedUser);
    console.log(userDB);
}

function getSearchValue() {
    return prompt("Enter a name", "");
}

function findUserIdByName() {
    const name = getSearchValue();
    let array = userDB.filter(userDBEntry => userDBEntry.name.toLowerCase() === name.toLowerCase());
    let id = array.map(function(name) {
        return name.id;
    });

    console.log(id);
    alert(id);
}

function searchDB(searchValue) {
    const results = userDB.filter(userDbEntry => {
        const objectValues = Object.values(userDbEntry);
        return objectValues.find(value => (value + "").includes(searchValue.toLowerCase()));
    })
    console.log("Results: ", results);
    alert(results);
}
/*

function searchDB(searchValue) {
    if(Number(searchValue) == ) {}
}

function findUserByString(){

}*/
