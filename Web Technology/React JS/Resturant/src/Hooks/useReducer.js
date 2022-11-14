import React, { useReducer } from 'react'

const reducer = (state, action) => {
    if (action.type === "INCR") {
        state = state + 1;
    }
    else if (state > 0 && action.type === "DECR") {
        state = state - 1
    }
    return state;
};

const UseReducer = () => {
    //const initialData = 10;
    const [state, dispatch] = useReducer(reducer, 10);
    return (
        <>
            <h1>{state}</h1>
            <div onClick={() => dispatch({ type: "INCR" })}>
                <button>Increment</button>
            </div>
            <div onClick={() => dispatch({ type: "DECR" })}>
                <button>Decrement</button>
            </div>
        </>
    )
}

export default UseReducer
