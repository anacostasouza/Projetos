import logo from './logo.svg';
import './App.css';
import HelloWorld from './components/HelloWorld';


function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1>Olá React</h1>
        <p>Alterando jsx</p>
        <img src={logo} className="App-logo" alt="logo" />
        <HelloWorld />
      </header>
    </div>
  );
}

export default App;
