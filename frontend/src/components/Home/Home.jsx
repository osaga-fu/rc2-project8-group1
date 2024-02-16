import { Header } from "../Header/Header";
import { List } from "../List/List";
import "./Home.css";
import { Aside } from "../Aside/Aside";

export const Home = () => {
  return (
    <>
      <div className="mainContainer">
      <Aside></Aside>
        <div className="section">
          <div className="sectionButtons">
            <button className="bgCream">Catálogo</button>
            <button className="bgGreen">Socios</button>
          </div>
          <List />
        </div>
      </div>
    </>
  );
};
