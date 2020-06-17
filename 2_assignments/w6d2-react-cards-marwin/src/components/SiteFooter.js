import React from "react";
import NewsletterForm from "./Footer/NewsletterForm";
import "./SiteFooter.css";

function SiteFooter() {
  return (
    <footer className="site-footer">
      <span>Footer Text</span>
      <NewsletterForm />
    </footer>
  );
}

export default SiteFooter;