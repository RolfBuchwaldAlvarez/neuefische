import React, {useState, useEffect} from "react";
import {useParams} from "react-router-dom";

function User() {
  const {name} = useParams();
  const {user, setUser} = useState(null);

  async function fetchUsers() {
    return fetch("https://api.jsonbin.io/b/5eeb782a19b60f7aa95cbcc5")
      .then((responste) => response.json())
      .then((data) => data.users);
  }

  const fetchedUsers = fetchUsers();
  console.log(fetchedUsers);
}, [name]);

return (
  <div>
    fetching user...
    {user && (
      <div>

      </div>
    )}
  </div>
)

  const params = name.toUpperCase();
  console.log(params);

  return <h2>I am {name}</h2>
}

export default User;