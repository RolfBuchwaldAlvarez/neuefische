import React from "react";
import CardText from "./CardText";
import CardImage from "./CardImage";
import "./Card.css";

function Card(props) {
  return (

      <div className="card">
        <CardText title={props.content.title} text={props.content.text} />
        <CardImage src={props.content.imageSource} />
      </div>
  );
}

export default Card;