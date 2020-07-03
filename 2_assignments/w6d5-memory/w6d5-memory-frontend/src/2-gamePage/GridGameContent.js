import React from "react";
import Card from "./components/MemoryPlayCard";
import GridContainer from "./components/GridContainer";
import Grid from "./components/Grid";
import Picture from "../images/woodSmall.jpg";

const useStyles = {
  gridGameContent: {
    backgroundImage: "url(" + Picture + ")",
  }
}

export default function GridGameContent() {

  return (
    <div style={useStyles.gridGameContent}>
      <GridContainer>
        <Grid>
          <Card />
          <Card />
          <Card />
          <Card />
          <Card />
          <Card />
          <Card />
          <Card />
          <Card />
          <Card />
          <Card />
          <Card />
          <Card />
          <Card />
          <Card />
          <Card />
        </Grid>
      </GridContainer>
    </div>
  );
}
