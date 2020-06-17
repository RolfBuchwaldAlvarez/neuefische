import React from "react";
import "./CardText.css";

function CardText(props) {
  return <div className="card-text">
    <h2>{props.title}</h2>
    <p>{props.text}</p>
  </div>;
}

export default CardText;