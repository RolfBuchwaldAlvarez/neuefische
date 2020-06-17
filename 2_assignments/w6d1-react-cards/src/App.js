import React from 'react';
import SiteFooter from "./components/SiteFooter";
import SiteHeader from "./components/SiteHeader";
import SiteContent from "./components/SiteContent";
import IconLabelButtons from "./components/SiteContent/UploadButton";
import SaveButton from "./components/SiteContent/SaveButton";
import "./App.css";

const animalArray = [{
  title: "Funny Quokkas",
  text: "The world has spoken: the always-smiling Quokka is both, the happiest and the most photogenic animal on the planet. Known for its charismatic grin and friendly disposition, the Quokka is the perfect selfie co-star, as made apparent by the popularity of the hashtag: #quokkaselfie.",
  imageSource: "https://i.pinimg.com/originals/59/30/c8/5930c86254cf1dc8064a63cc4c11f714.jpg"
},
  {
    title: "Evil Wolves",
    text: "Lorem ipsum dolor sit amet, consectetur " +
      "adipisicing elit. Eum ipsam " +
      "iusto magnam nihil numquam!",
    imageSource: "https://images.unsplash.com/photo-1590420485404-f86d22b8abf8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80"
  }]

function App() {
  const [cardContent, setCardContent] = React.useState(animalArray[0]);

  function setBisonsAsContent() {
    setCardContent(animalArray[0]);
  }

  function setWolvesAsContent() {
    setCardContent(animalArray[1]);
  }

  return (
    <div className="app">
      <SiteHeader title={cardContent.title} />
      <div className="buttons">
        <IconLabelButtons className="button1" onClick={setBisonsAsContent}/>
        <SaveButton className="button2" onClick={setWolvesAsContent}/>
{/*        <button className="button1" onClick={setBisonsAsContent}>Quokkas</button>
        <button className="button2" onClick={setWolvesAsContent}>Wolves</button>*/}
      </div>
      <SiteContent cardContent={cardContent} />
      <SiteFooter />
    </div>
  );
}

export default App;

/*
import React from 'react';
import Header from "./components/Header";
import MainContent from "./components/MainContent";
import "./App.css";

function App() {
  return (
    <div className="App">
      <Header>Funny Animals</Header>
      <MainContent></MainContent>
    </div>
  );
}

export default App;*/
