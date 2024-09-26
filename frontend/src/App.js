import {useEffect, useState} from "react";
import './App.css';

function App() {
  const [message, setMessage] = useState("");

  useEffect(() => {
    fetch("/test")
        .then((response) => response.json())
        .then((json) => setMessage(json.SUCCESS_TEXT));
  }, []);

  return (
      <div className="App">
        <header className="App-header">
          {message}
        </header>
      </div>
  );
}

export default App;
