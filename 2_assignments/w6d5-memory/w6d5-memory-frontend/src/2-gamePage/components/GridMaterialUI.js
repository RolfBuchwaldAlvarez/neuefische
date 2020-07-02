import React from "react";
import { makeStyles } from '@material-ui/core/styles';
import Grid from "@material-ui/core/Grid";
import Paper from "@material-ui/core/Paper";

const useStyles = makeStyles((theme) => ({
  grid: {
    height: "100vh",
    width: "100vw",
    /*paddingLeft: "20%",
    paddingRight: "20%",
    paddingTop: "5%",
    PaddingBottom: "5%",*/
  },
  paper: {
    height: "90%",
    width: "50%",
    padding: "24vw",
    textAlign: "center",
    color: "red",
    backgroundColor: "white",
    whiteSpace: "nowrap",
    background: "black",
  },
  item: {

  }
}));

export default function GridMaterialUI() {
  const classes = useStyles();

  return (
    <div className={classes.div}>
      <Grid container /*direction="row"*/ justify="center" alignItems="center" className={classes.grid}>
          </div><Paper className={classes.paper} variant={"outlined"} elevation={3}>Paper Card</Paper>
      </Grid>
    </div>
  );
}