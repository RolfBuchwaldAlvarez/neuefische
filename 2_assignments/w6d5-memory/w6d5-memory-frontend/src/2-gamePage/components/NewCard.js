import React, {useState} from "react";
import CardBack from "./CardBack";
import Card from "@material-ui/core/Card";
import {makeStyles} from "@material-ui/core/styles";
import CardMedia from "@material-ui/core/CardMedia";
import CardActionArea from "@material-ui/core/CardActionArea";
import Picture from "../../images/bear1.jpg";
import Image from "./Image";

const useStyles = makeStyles((theme) => ({
  media: {
    /*transform: "rotateY(180deg)",*/
  }
}));

const useStyles2 = {
  card: {
    transition: "transform 0.5s",
    transformStyle: "preserve-3d",
    transform: "rotateY(0deg)",
    cursor: "pointer",
    borderRadius: "10px",
    border: "1px solid white",
    display: "grid",
    gridTemplateAreas: "overlap",
  },
  style1: {
    display: "flex",
    justifyContent: "center",
    alignItems: "center",
    width: "100%",
    height: "100%",
    objectFit: "cover",
    border: "1px solid white",
    gridArea: "overlap",
    color: "white",
    fontSize: "1.5rem",
    webkitBackfaceVisibility: "hidden",
    backfaceVisibility: "hidden",
  },
}

export default function NewCard() {
  const classes = useStyles();
  const [flipped, setFlipped] = useState(false);

  let cardStyle = {...useStyles2.card};
  if (flipped) {
    cardStyle.transform = "rotateY(180deg)"
  }

  return (
   /* <>*/
      <Card onClick={() => setFlipped(!flipped)} style={cardStyle}>
          {/*<CardBack style={useStyles2.style1} />*/}
          <CardMedia className={classes.media} image={Picture}/>
      </Card>
   /* </>*/
  );
}