
function Pessoa({ nome, idade, profissao, sexo }) {
    return (
      <div className="pessoa-container">
        <h1>Nome: {nome}</h1>
        <h2>Idade: {idade} anos</h2>
        <h2>Profissão: {profissao}</h2>
        {sexo && <h3>Sexo: {sexo}</h3>}
      </div>
    );
  }
  
  export default Pessoa;