import React from "react";
import User from "./User";
import {Link, Route, Switch, useRouteMatch} from "react-router-dom";

function About() {
  let thingFromHook = useRouteMatch();
  console.log(thingFromHook);

  return (
    <>
      <h1>About</h1>
      <Switch>
        <Route exact path={`${match.url}/frank`}>
          <User name="Frank" />
        </Route>
        <Route exact path={`${match.url}/ute`}>
          <User name="Ute" />
        </Route>
      </Switch>
    </>

  )
}

export default About;