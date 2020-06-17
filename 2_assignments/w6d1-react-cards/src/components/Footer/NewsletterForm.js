import React from "react";

function NewsletterForm() {
  const [formData, setFormData] = React.useState({
    email: "",
    firstName: "",
  });

  function handleChange(event) {
    const targetValue = event.target.value;
    const targetName = event.target.name;
    let newFormData = { ...formData };
    newFormData[targetName] = targetValue;
    setFormData(newFormData);
  }

  function handleSubmit(event) {
    event.preventDefault();
    console.log("Thanks! The newsletter will be sent to: " + formData.email);
  }

  return (
    <form onSubmit={handleSubmit}>
      <input
        name="email"
        value={formData.email}
        placeholder="email"
        onChange={handleChange}
        type="text"
      />
      <input
        name="firstName"
        value={formData.firstName}
        placeholder="Name"
        onChange={handleChange}
        type="text"
      />
      <button type="submit">submit</button>
    </form>
  );
}

export default NewsletterForm;