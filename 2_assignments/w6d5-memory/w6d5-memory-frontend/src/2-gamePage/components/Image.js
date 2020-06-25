import React from "react";
import Picture from "../../images/berge1.jpg";
import {makeStyles} from "@material-ui/core/styles";

const useStyles = makeStyles((theme) => ({
  image: {
    margin: 10,
    border: "1px solid black",
    borderRadius: "10px",
    boxShadow: "10px 10px 5px rgba(0, 0, 0, 0.4)",
    /*maxWidth: "40%"*/
  }
}));

export default function Image() {
  const classes = useStyles();

  return <img className={classes.image} src={Picture} alt="Berge" />
}