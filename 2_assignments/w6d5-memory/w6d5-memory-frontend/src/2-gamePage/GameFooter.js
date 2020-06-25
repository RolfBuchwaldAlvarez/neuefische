import React from "react";
import {makeStyles} from "@material-ui/core/styles";

const useStyles = makeStyles((theme) => ({
  gameFooter: {
    display: "flex",
    justifyContent: "center",
    backgroundColor: "red",
    opacity: ".50"
  }
}));

function GameFooter() {
  const classes = useStyles();

  return (
    <footer className={classes.gameFooter}>
      <h3>This is a Game-Footer</h3>
    </footer>
  )
}

export default GameFooter;