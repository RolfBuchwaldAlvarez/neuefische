import React from "react";
import Picture from "../../images/bear1.jpg"


const useStyles = {
  image: {
    transform: "rotateY(180deg)",
    objectFit: "cover",
  }
};

export default function Image({style}) {

  return (
    <>
      <img style={{style}} src={Picture} alt="Bear" />
    </>
  );
}