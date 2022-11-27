import React, { useState } from 'react'
// import loginpic from '../images/loginpic';
import {NavLink, useNavigate} from 'react-router-dom';

const Login = () => {

  const navigate = useNavigate();
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const loginUser = async (e) => {
    e.preventDefault();

    const res = await fetch('/signin', {
      method: "POST",
      headers: {
        "Content-Type" : "application/json"
      },
      body:JSON.stringify({
        email,
        password
      })
    });
    const data = res.json();

    if(res.status === 400 || !data){
      window.alert("Invalid Credentials");
    }else{
      window.alert("Login SuccessFull");
      navigate('/');
    }
  }

  return (
    <>
      <section className='sign-in'>
        <div className='container mt-5'>
          <div className='signin-content'>

            <div className='signin-image'>
              <figure>
                <img src alt="login pic" />
              </figure>
              <NavLink to="../signup" className="signup-image-link">Create an Account</NavLink>
            </div>

            <div className='signin-form'>
              <h2 className='form-title'>Sign in</h2>
              <form method="POST" className='register-form' id="register-form">

                <div className='form-group'>
                  <label htmlFor="email">
                    <i class="zmdi zmdi-email material-icons-name"></i>
                  </label>
                  <input type="email" name="email" id="email" autoComplete='off' placeholder='Your email' value={email} onChange={(e) => setEmail(e.target.value)} /> <hr />
                </div>

                <div className='form-group'>
                  <label htmlFor="password">
                    <i class="zmdi zmdi-lock material-icons-name"></i>
                  </label>
                  <input type="password" name="password" id="password" autoComplete='off' placeholder='Your password' value={password} onChange={(e) => setPassword(e.target.value)} /> <hr />
                </div>

                <div className='form-group form-buttom'>
                  <input type="submit" name="signin" id="signin" class="form-submit btn btn-outline-primary" value="Log in" onClick={loginUser}/>
                </div>

              </form>
            </div>
          </div>
        </div>
      </section>
    </>
  )
}

export default Login;
