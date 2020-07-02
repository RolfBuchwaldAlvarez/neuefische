import React from "react";
import {makeStyles} from "@material-ui/core/styles";

const useStyles = makeStyles((theme) => ({
  container: {
    perspective: "600px",
    width: "100vw",
    height: "100%",
  }
}))

export default function GridContainer(props) {
  const classes = useStyles();

  return <div className={classes.container}>{props.children}</div>
}