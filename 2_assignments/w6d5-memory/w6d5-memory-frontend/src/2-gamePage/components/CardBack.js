import React from "react";
import {makeStyles} from "@material-ui/core/styles";

const useStyles = makeStyles((theme) => ({
  back: {
    backgroundColor: "#384a13",
  }
}));

export default function CardBack({style}) {
  const classes = useStyles();

  return(
    <>
      <div style={style} className={classes.back}/>
    </>
  );
}