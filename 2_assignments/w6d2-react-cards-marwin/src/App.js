import React from 'react';
import SiteFooter from "./components/SiteFooter";
import SiteHeader from "./components/SiteHeader";
import SiteContent from "./components/SiteContent";
import "./App.css";

const animalArray = [{
  title: "Bisons",
  text: "Lorem ipsum dolor sit amet, consectetur " +
    "adipisicing elit. Eum ipsam " +
    "iusto magnam nihil numquam!",
  imageSource: "https://images.unsplash.com/photo-1490260400179-d656f04de422?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80"
},
{
  title: "Wolves",
    text: "Lorem ipsum dolor sit amet, consectetur " +
"adipisicing elit. Eum ipsam " +
"iusto magnam nihil numquam!",
  imageSource: "https://images.unsplash.com/photo-1590420485404-f86d22b8abf8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80"
}]

async function fetchAnimals() {
  fetch("https://api.jsonbin.io/b/5ee9ce4f19b60f7aa95bde99")
    .then((response) => response.json())
    .then((data) => console.log(data.animals));
}

function App() {
  const [content, setContent] = React.useState(animalArray[0]);

  function setBisonsAsContent() {
    fetchAnimals().then((response) => setContent(animalArray[0]));
  }

  function setWolvesAsContent() {
    fetchAnimals().then((response) => setContent(animalArray[1]));
  }

  return (
    <div className="app">
      <button onClick={setBisonsAsContent}>Bisons</button>
      <button onClick={setWolvesAsContent}>Wolves</button>
      <SiteHeader title={content.title} />
      <SiteContent cardContent={content} />
      <SiteFooter />
    </div>
  );
}

export default App;
