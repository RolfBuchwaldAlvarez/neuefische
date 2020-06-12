/*async function fetchPosts() {
    const posts = await fetch( //await weil asynchrone function (Zeitverzug)
        "https://my-json-server.typicode.com/typicode/demo/posts"
    );
    console.log(posts);
}

async function fetchPosts() {
     fetch(
        "https://my-json-server.typicode.com/typicode/demo/posts", {

         }).then((response) => response.json().then((data) => console.log(data[0])));
    console.log(posts);
}*/

async function fetchPosts() {
    const post = {
        id: 4,
        title: 'Post 4'
    };
    console.log(JSON.stringify(post));
    fetch("https://my-json-server.typicode.com/typicode/demo/posts", {
        method: 'Post',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(post),
        }).then((response) => console.log(response));
}

fetchPosts();