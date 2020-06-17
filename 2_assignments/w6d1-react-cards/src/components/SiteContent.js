import React from "react";
import Card from "./Cards/Card";
import "./SiteContent.css";

function SiteContent(props) {
  console.log(props.cardContent);

  return (
    <main className="flex-grow">
      <Card content={props.cardContent} />
    </main>
  );
}

export default SiteContent;