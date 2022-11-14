import React from 'react'

const UseState = () => {
    // const initialData = 7;
    const [num, setNum] = React.useState(0);

    return (
        <>
            <h1>{num}</h1>
            <div onClick={() => setNum(num + 1)}>
                <button>Increment</button>
            </div>
            <div onClick={() => (num > 0) ? setNum(num - 1) : { num }}>
                <button>Decrement</button>
            </div>
        </>
    );
};

export default UseState;
