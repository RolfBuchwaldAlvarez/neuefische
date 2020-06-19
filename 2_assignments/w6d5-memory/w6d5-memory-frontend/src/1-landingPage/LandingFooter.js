import React from "react";
import {makeStyles} from "@material-ui/core/styles";

const useStyles = makeStyles((theme) => ({
  landingFooter: {
    display: "flex",
    justifyContent: "center",
    backgroundColor: "red",
    opacity: ".50",
  }
}));

function LandingFooter() {
  const classes = useStyles();

  return (
    <footer className={classes.landingFooter}>
      <h3>This is a Footer</h3>
    </footer>
  )
}

export default LandingFooter;