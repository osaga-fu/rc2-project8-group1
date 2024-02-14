import { Header } from "../Header/Header";
import { List } from "../List/List";
import  "./Home.css"
export const Home = () => {
  return (
    <>
    
      <Header></Header>
      <div className="mainContainer">
      <List></List>
      </div>
    </>
  );
};
