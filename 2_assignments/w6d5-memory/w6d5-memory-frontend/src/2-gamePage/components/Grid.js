import React from "react";

const useStyles = {
  grid: {
    display: "grid",
    gridTemplateColumns: "repeat(4, 190px)",
    gridTemplateRows: "repeat(4, 190px)",
    gridGap: "1rem",
    height: "100%",
    justifyContent: "center",
    paddingTop: "15px",
    paddingBottom: "20px",
  }
};

export default function Grid(props) {

  return <div style={useStyles.grid}>{props.children}</div>
}