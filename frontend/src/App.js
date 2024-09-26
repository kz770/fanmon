import './App.css';
import {BrowserRouter as Router, Routes, Route} from "react-router-dom";
import ChatPage from "./pages/ChatPage";

function App() {

  return (
      <Router>
        <Routes>
          <Route path="/chat" element={<ChatPage />} />
        </Routes>
      </Router>
  );
}

export default App;
