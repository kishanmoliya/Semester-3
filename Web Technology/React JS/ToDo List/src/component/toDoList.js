import React, { useState, useEffect } from 'react';
import "./style.css";

  //Get data from Local Storage
  const getLocalData = () => {
    const lists = localStorage.getItem("myList")

    if(lists){
      return JSON.parse(lists);
    }
    else{
      return [];
    }
};

const ToDoList = () => {
  const [inputData, setInputdata] = useState("");
  const [items, setItems] = useState(getLocalData());
  const [isEditItem, setIsEditItem] = useState("");
  const [toggleButton, setToggleButton] = useState(false);

  //Add Local Storage
  useEffect(() => {
    localStorage.setItem("myList", JSON.stringify(items));
  }, [items]);

  //Add Data
  const addItem = () => {
    if (!inputData) {
      alert("Please Enter Something!");
    }else if(inputData && toggleButton){
      setItems(
        items.map((currEle) => {
          if(currEle.id === isEditItem){
            return {...currEle, name: inputData};
          }
          return currEle;
        })
      );

      setInputdata([])
      setIsEditItem(null);
      setToggleButton(false);
    } else {
      const newData = {
        id: new Date().getTime().toString(),
        name: inputData,
      };
      setItems([...items, newData]);
      setInputdata("");
    }
  };

  //Delete By ID
  const deleteItem = (id) => {
    const updatedItems = items.filter((currEle) => {
      return currEle.id !== id;
    });
    setItems(updatedItems);
  }

  //Delete All
  const removeAll = () => {
    setItems([]);
  }

  //Edit Data
  const editItem = (id) => {
    const dataEdit = items.find((currEle) => {
      return currEle.id === id;
    });
    setInputdata(dataEdit.name)
    setIsEditItem(id);
    setToggleButton(true);
  };

  return (
    <>
      <div className="main-div">
        <div className="child-div">

          <figure>
            <img src="./images/todo.svg" alt="todologo" />
            <figcaption>Add Your List Heare ✌</figcaption>
          </figure>

          <div className="addItems">
            <input
              type="text"
              placeholder="✍ Add Item"
              className="form-contro"
              value={inputData}
              onChange={(e) => setInputdata(e.target.value)} />
           
              {toggleButton ? <i class="far fa-edit add-btn" onClick={addItem}></i> : <i class="fa fa-plus add-btn" onClick={addItem}></i>}           
          </div>

          <div className="showItems">
            {items.map((currEle, index) => {
              return (
                <div className="eachItem" key={currEle.id}>
                  <h3>{currEle.name}</h3>

                  <div className="todo-btn">
                    <i className="far fa-edit add-btn" onClick={() => editItem(currEle.id)}></i>
                    <i className="far fa-trash-alt add-btn" onClick={() => deleteItem(currEle.id)}></i>
                  </div>

                </div>
              );
            })}
          </div>

          <div className="showItems">
            <button className="btn effect04" data-sm-link-text="Remove All" onClick={() => removeAll()}>
              <span>CHECK LIST</span>
            </button>
          </div>

        </div>
      </div>
    </>
  );
};

export default ToDoList;
