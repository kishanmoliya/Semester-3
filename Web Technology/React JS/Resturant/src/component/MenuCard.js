import React from 'react'

const MenuCard = ({ menuData }) => {
    return (
        <>
            {menuData.map((currEle) => {
                const {id, name, category, image, description} = currEle;

                return (
                    <>
                        <div class="card" style={{ width: "18rem" }} key={currEle.id}>
                            <span className="">{id}</span>
                            <span> {category}</span>
                            <h5 class="card-title">{name}</h5>
                            <div class="card-body">
                            <span>{description}</span>
                                <img src={image} class="card-img-top" alt="images" />
                                <span className="">Order Now</span>
                            </div>
                        </div>
                    </>
                )
            })}
        </>
    )
}

export default MenuCard
