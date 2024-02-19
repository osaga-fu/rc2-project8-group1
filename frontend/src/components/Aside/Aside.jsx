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
        console.log("error enviar solicitud");
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
          <input type="text" placeholder="Libro" />
          <input type="text" placeholder="Autor" />
          <input type="text" placeholder="ISBN" />
          <input type="text" placeholder="Sección" />
          <button type="submit">
            <img src="../../../src/imgs/Book Stack.svg" alt="Icono añadir" />
            ACEPTAR
          </button>
        </form>
      </Dialog>

      <button className="buttonAddBook" onClick={() => setVisible(true)}>
        <img src="../../../src/imgs/User Account.svg" alt="Icono socios" />
        AÑADIR SOCIO
      </button>
      <Dialog

        visible={visible}
        style={{ width: "50vw" }}
        onHide={() => setVisible(false)}
        className="addDialog"
      >
        <form className="addForm" onSubmit={handleSubmit}>
          <input name="firstName"type="text" placeholder="Nombre" />
          <input name="lastName" type="text" placeholder="Apellidos" />
          <input name="dni" type="text" placeholder="DNI" />
          <input name="email" type="text" placeholder="Email" />
          
          <button type="submit">
            <img src="../../../src/imgs/User Account.svg" alt="Icono socios" />
            ACEPTAR
          </button>
        </form>
      </Dialog>
    </div>
  );
};

