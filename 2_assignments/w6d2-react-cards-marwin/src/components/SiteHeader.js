import React from "react";
import "./SiteHeader.css";

function SiteHeader(props) {
  return (
  <header className="site-header">
    <h1>A website about {props.title}</h1>
  </header>
  );
}

export default SiteHeader;