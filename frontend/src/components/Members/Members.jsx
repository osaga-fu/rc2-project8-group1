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
        <ListMembers/>
      </div>
    </>
  )
}