import React from "react";
import Grid from "@material-ui/core/Grid";
import {makeStyles} from "@material-ui/core/styles";
import NewCard from "./NewCard";

const useStyles = makeStyles((theme) => ({
  paper: {

  },
}));

export default function GridItem() {
  const classes = useStyles();

  return (
      <Grid item sm={3}>

      </Grid>
  );
}