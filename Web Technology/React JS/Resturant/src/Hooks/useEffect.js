import React from 'react'
import { useState, useEffect } from 'react'

const UseEffect = () => {
    const [num, setNum] = useState(0);

    useEffect(() => {
        document.title = `Message(${num})`;
    });

    return (
        <>
            <h1>{num}</h1>
            <div onClick={() => setNum(num + 1)}>
                <button>Increment</button>
            </div>
            {/* <div onClick={() => setNum(num - 1)}>
                <button>Increment</button>
            </div> */}
        </>
    )
}

export default UseEffect
