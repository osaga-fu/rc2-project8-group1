import { Header } from "../Header/Header";
import "../Home/Home.css";
import { Aside } from "../Aside/Aside";
import { ListMembers } from "../ListMembers/ListMembers";
export const Members = () => {
  return (
    <>
      <Header></Header>
      <div className="mainContainer">
        <Aside></Aside>
        <div className="section">
          <div className="sectionButtons">
            <button className="bgGreen">Catálogo</button>
            <button className="bgCream">Socios</button>
          </div>
          <ListMembers />
        </div>
      </div>
    </>
  );
};
