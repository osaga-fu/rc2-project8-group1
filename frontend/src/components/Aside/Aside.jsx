import { Dialog } from "primereact/dialog";
import "./Aside.css";
import { useState } from "react";

export const Aside = () => {
  const [visible, setVisible] = useState(false);
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
        <form className="addForm">
          <input type="text" placeholder="Libro" />
          <input type="text" placeholder="Autor" />
          <input type="text" placeholder="ISBN" />
          <input type="text" placeholder="Sección" />
          <button
            label="Aceptar"
            type="submit"
            value="Create"
          >
            <img src="../../../src/imgs/Book Stack.svg" alt="Icono añadir" />
            ACEPTAR
          </button>
        </form>
      </Dialog>
    </div>
  );
};
