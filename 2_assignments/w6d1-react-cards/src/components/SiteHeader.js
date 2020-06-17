import React from "react";
import "./SiteHeader.css";

function SiteHeader(props) {
  return (
    <header className="Header">
      <h1>A Website About {props.title}</h1>
    </header>
  )
}

export default SiteHeader;