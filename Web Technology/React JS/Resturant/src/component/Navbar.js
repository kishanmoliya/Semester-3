import React from 'react'

const Navbar = ({ filterItem, menuList }) => {
  return (
    <>
      {menuList.map((currEle) => {
        return(
            <button onClick={() => filterItem(currEle)}>{currEle}</button>
        )
      })}
    </>
  )
}

export default Navbar;
