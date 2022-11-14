import React, { useState } from 'react';
import Menu from "./menuAPI";
import MenuCard from "./MenuCard";
import Navbar from "./Navbar";

const uniqueList = [
    ...new Set(
        Menu.map((currEle) => {
            return currEle.category;
        })
    ),
    "All",
];


const Main = () => {
    const [menuData, setMenuData] = useState(Menu);
    const [menuList, setMenuList] = useState(uniqueList);

    const filterItem = (category) => {

        if(category === "All"){
            setMenuData(Menu);
            return;
        }

        const updatadList = Menu.filter((currEle) => {
            return currEle.category === category;
        })
        setMenuData(updatadList);
    };

    return (
    <>
        <Navbar filterItem={filterItem} menuList={menuList}/>
        <MenuCard menuData={menuData} />
    </>
    );
};

export default Main;
