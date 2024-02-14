import { Dialog } from "primereact/dialog";
import "./Aside.css";
import {useState} from "react";

export const Aside = () => {
  const [visible, setVisible] = useState(false);
  return (
    <div>
      <button className="buttonAddBook" onClick={() => setVisible(true)}>
        <img src="../../../src/imgs/Book Stack.svg" alt="Icono añadir" />
        AÑADIR LIBRO
      </button>
      <Dialog
        header="Header"
        visible={visible}
        style={{ width: "50vw" }}
        onHide={() => setVisible(false)}
      >
      </Dialog>
    </div>
  );
};
