import { useState } from "react";
import "./List.css";
export const List = () => {
  const [search, setSearch] = useState("");
  const [results, setResults] = useState([]);
  const handleSearch = async () => {
    try {
      const response = await fetch(
        `http://localhost:8080/books?query=${search}`
      );
      const data = await response.json();
      setResults(data);
    } catch (error) {
      console.error("Error al buscar", error);
    }
  };
  return (
    <div className="bodyContainer">
      <div className="sidebar">
        <button className="buttonAddBook">
          <img src="../../../src/imgs/Book Stack.svg" alt="Icono añadir" />
          AÑADIR LIBRO
        </button>
      </div>
      <div className="listContainer">
        <section className="searchContainer">
          <button className="searchButton" onClick={handleSearch}>
            <img
              className="searchIcon"
              src="../../../src/imgs/Search.svg"
              alt="icono buscador"
            />
          </button>
          <input
            className="searchInput"
            type="text"
            value={search}
            onChange={(e) => setSearch(e.target.value)}
            placeholder="Buscar libro..."
          />
        </section>
        <ul>
          {results.map((result) => (
            <li key={result.book_id}>{result.title}</li>
          ))}
        </ul>
      </div>
    </div>
  );
};
