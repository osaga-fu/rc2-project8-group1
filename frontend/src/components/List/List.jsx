import { useState } from "react";
import "./List.css";
export const List = () => {
  const [busqueda, setBusqueda] = useState("");
  const [resultados, setResultados] = useState([]);
  const handleBusqueda = async () => {
    try {
      const response = await fetch(
        `http://localhost:8080/busqueda?query=${busqueda}`
      );
      const data = await response.json();
      setResultados(data);
    } catch (error) {
      console.error("Error al buscar", error);
    }
  };
  return (
    <div className="listContainer">
      <section className="searchContainer">
        <button className="searchButton" onClick={handleBusqueda}>
          <img
            className="searchIcon"
            src="../../../src/imgs/Search.svg"
            alt="icono buscador"
          />
        </button>
        <input
          className="searchInput"
          type="text"
          value={busqueda}
          onChange={(e) => setBusqueda(e.target.value)}
          placeholder="Buscar libro..."
        />
      </section>
      <ul>
        {resultados.map((resultado) => (
          <li key={resultado.id}>{resultado.titulo}</li>
        ))}
      </ul>
    </div>
  );
};
