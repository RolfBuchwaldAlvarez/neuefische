import React from "react";
import {Switch, Route} from "react-router-dom";
import Home from "./components/Home";
import About from "./components/About";
import User from "./components/User";

function App() {
  return (
    <>
      <header>header</header>
      <Switch>

        <Route exact path="/users/:id">
          <User />
        </Route>

        <Route path="/about" >
          <About />
        </Route>

        <Route exact path="/">
          <Home />
        </Route>

      </Switch>
    </>
  );
}

export default App;
