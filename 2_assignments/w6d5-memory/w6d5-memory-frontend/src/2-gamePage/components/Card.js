import React, {useState} from "react";
import Image from "./Image";
import CardBack from "./CardBack";
import Paper from "@material-ui/core/Paper";

const useStyles = {
  card: {
    transition: "transform 0.5s",
    transformStyle: "preserve-3d",
    transform: "rotateY(0deg)",
    cursor: "pointer",
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
    borderRadius: "10px",
    gridArea: "overlap",
    color: "white",
    fontSize: "1.5rem",
    webkitBackfaceVisibility: "hidden",
    backfaceVisibility: "hidden",
  }
}

export default function Card() {
  const [flipped, setFlipped] = useState(false);

  let cardStyle = {...useStyles.card}
  if (flipped) {
    cardStyle.transform = "rotateY(180deg)"
  }

  return (
      <Paper onClick={() => setFlipped(!flipped)} style={cardStyle}>
        {/*<CardBack style={useStyles.style1}/>*/}
        {/*<Image style={useStyles.style1}/>*/}
      </Paper>
  );
}