import React from 'react'
import {Routes, Route } from 'react-router-dom';
import Navbar from './component/Navbar';
import Home from './component/Home';
import About from './component/About';
import Contect from './component/Contect';
import Login from './component/Login';
import Signup from './component/Signup';

const App = () => {
  return (
    <>
      <Navbar />
    <Routes>
      <Route exact path='/'>
        <Home />
      </Route>

      <Route path='/about'><About /></Route>
      <Route path='/contect'> <Contect /></Route>
      <Route path='/login'><Login /></Route>
      <Route path='/signup'><Signup /></Route>
      </Routes>
    </>
  )
}

export default App;
