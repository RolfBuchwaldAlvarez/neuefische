import React from "react";
import "./CardImage.css";

function CardImage(props) {
  return (
    <img
      className="card-image"
      src={props.src}  alt="A picture"
    />
  );
}

export default CardImage;