import React from 'react';
import LandingHeader from "./1-landingPage/LandingHeader";
import LandingContent from "./1-landingPage/LandingContent";
import LandingFooter from "./1-landingPage/LandingFooter";
import {makeStyles} from "@material-ui/core/styles";
import GameHeader from "./2-gamePage/GameHeader";
import GameFooter from "./2-gamePage/GameFooter";
import offGridGameContent from "./2-gamePage/offGridGameContent";

const useStyles = makeStyles((theme) => ({
  app: {
    display: "flex",
    flexFlow: "column nowrap",
    height: "100vh"
  }
}));

function App() {
  const classes = useStyles();

  return (
    <div className={classes.app}>
      {/*<LandingHeader />
      <LandingContent />
      <LandingFooter />*/}
      <GameHeader />
      <offGridGameContent />
      <GameFooter />
    </div>
  );
}

export default App;
