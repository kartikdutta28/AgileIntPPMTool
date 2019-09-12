import React from "react";
import "./App.css";
import Dashboard from "./components/Dashboard";
import Header from "./components/layout/Header";
import ProjectItem from "./components/project/ProjectItem";

function App() {
  return (
    <div className="App">
      <Header />
      <Dashboard />
    </div>
  );
}

export default App;
