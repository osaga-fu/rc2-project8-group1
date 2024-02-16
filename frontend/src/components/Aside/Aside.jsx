import { Dialog } from "primereact/dialog";
import "./Aside.css";
import { useState } from "react";

export const Aside = () => {
  const [visible, setVisible] = useState(false);
  const handleSubmit = async (event) => {
    event.preventDefault();
    const formData = new FormData(event.target);
    const data = Object.fromEntries(formData.entries());
    try {
      const response = await fetch(`http://localhost:8080/books`, {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(data),
      });
      if (response.ok) {
        console.log("solicitud exitosa");
      } else {
        console.log("error enviar solicitud", await response.text());
      }
    } catch (error) {
      console.error("Error al buscar", error);
    }
    setVisible(false);
  };

  return (
    <div>
      <button className="buttonAddBook" onClick={() => setVisible(true)}>
        <img src="../../../src/imgs/Book Stack.svg" alt="Icono añadir" />
        AÑADIR LIBRO
      </button>
      <Dialog
        visible={visible}
        style={{ width: "50vw" }}
        onHide={() => setVisible(false)}
        className="addDialog"
      >
        <form className="addForm" onSubmit={handleSubmit}>
          <input type="text" name="title" placeholder="Libro" />
          <input type="text" name="author" placeholder="Autor" />
          <input type="text" name="isbn" placeholder="ISBN" />
          <input type="text" name="sectionCode" placeholder="Sección" />
          <button type="submit">
            <img src="../../../src/imgs/Book Stack.svg" alt="Icono añadir" />
            ACEPTAR
          </button>
        </form>
      </Dialog>
    </div>
  );
};
