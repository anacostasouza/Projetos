import logo from './logo.svg';
import './App.css';
import HelloWorld from './components/HelloWorld';
import SayMyName from './components/SayMyName';
import Pessoa from './components/Pessoa';


function App() {
  return (
    <div className="App">
      <SayMyName nome="João" />
      <Pessoa nome="João" idade="25" profissao="Desenvolvedor" sexo="Masculino" />
      <Pessoa nome="Maria" idade="30" profissao="Designer" sexo="Feminino" />
      <Pessoa nome="José" idade="20" profissao="Estudante" />
    </div>
  );
}

export default App;
