import { Header } from "../Header/Header";
import { List } from "../List/List";
import "./Home.css";
import { Aside } from "../Aside/Aside";

export const Home = () => {
  return (
    <>
      <Header></Header>
      <div className="mainContainer">
        <Aside></Aside>
        <List></List>
      </div>
    </>
  );
};
