import React from "react";
import {makeStyles} from "@material-ui/core/styles";

const useStyles = makeStyles((theme) => ({
  landingContent: {
    flexGrow: 1,
    backgroundColor: "black",
    opacity: ".50"
  }
}));

function LandingContent() {
  const classes = useStyles();

  return (
    <main className={classes.landingContent}>
      {/*<h1>This is the LandingContent</h1>*/}
    </main>
  )
}

export default LandingContent;