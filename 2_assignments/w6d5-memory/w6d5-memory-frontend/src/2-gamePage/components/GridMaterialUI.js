import React from "react";
import { makeStyles } from '@material-ui/core/styles';
import Grid from "@material-ui/core/Grid";
import NewCard from "./NewCard";
import MemoryPlayCard from "./MemoryPlayCard";

const useStyles = makeStyles((theme) => ({
  grid: {
    height: "100vh",
    width: "100vw",
    /*paddingLeft: "20%",
    paddingRight: "20%",
    paddingTop: "5%",
    PaddingBottom: "5%",*/
  },
  cardContainer: {
    display: "grid",
    gridTemplateColumns: "1fr 1fr 1fr 1fr",
    gridTemplateRows: "1fr 1fr 1fr 1fr",
    columnGap: "5px",
    rowGap: "5px",
    padding: "10px",
    height: "95%",
    width: "50%",
    borderRadius: "5px",
    textAlign: "center",
    color: "red",
    /*backgroundColor: "white",*/
    whiteSpace: "nowrap",
    /*background: "black",*/
  },
}));

export default function GridMaterialUI() {
  const classes = useStyles();

  return (
    <div className={classes.div}>
      <Grid container /*direction="row"*/ justify="center" alignItems="center" className={classes.grid}>
          <div className={classes.cardContainer}>
            <NewCard />
            <NewCard />
            <NewCard />
            <NewCard />
            <NewCard />
            <NewCard />
            <NewCard />
            <NewCard />
            <NewCard />
            <NewCard />
            <NewCard />
            <NewCard />
            <NewCard />
            <NewCard />
            <NewCard />
            <NewCard />
          </div>
      </Grid>
    </div>
  );
}