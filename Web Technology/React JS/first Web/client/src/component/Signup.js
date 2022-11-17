import React from 'react'
import {NavLink} from 'react-router-dom';

const Signup = () => {
  return (
    <>
      <section className='signup'>
        <div className='container mt-5'>
          <div className='signup-content'>
            <div className='signup-form'>
              <h2 className='form-title'>Sign up</h2>
              <form className='register-form' id="register-form">

                <div className='form-group'>
                  <label htmlFor="name">
                    <i class="zmdi zmdi-account material-icons-name"></i>
                  </label>
                  <input type="text" name="name" id="name" autoComplete='off' placeholder='Your Name' /> <hr />
                </div>

                <div className='form-group'>
                  <label htmlFor="email">
                    <i class="zmdi zmdi-email material-icons-name"></i>
                  </label>
                  <input type="email" name="email" id="email" autoComplete='off' placeholder='Your email'/> <hr />
                </div>
                
                <div className='form-group'>
                  <label htmlFor="phone">
                    <i class="zmdi zmdi-phone-in-talk material-icons-name"></i>
                  </label>
                  <input type="number" name="phone" id="phone" autoComplete='off' placeholder='Your Phone Number' /> <hr />
                </div>

                <div className='form-group'>
                  <label htmlFor="work">
                    <i class="zmdi zmdi-slideshow material-icons-name"></i>
                  </label>
                  <input type="text" name="work" id="work" autoComplete='off' placeholder='Your Profession' /> <hr />
                </div>

                <div className='form-group'>
                  <label htmlFor="password">
                    <i class="zmdi zmdi-lock material-icons-name"></i>
                  </label>
                  <input type="password" name="password" id="password" autoComplete='off' placeholder='Your password' /> <hr />
                </div>

                <div className='form-group'>
                  <label htmlFor="cPassword">
                    <i class="zmdi zmdi-lock material-icons-name"></i>
                  </label>
                  <input type="password" name="cPassword" id="cPassword" autoComplete='off' placeholder='Your Conform Password' /> <hr />
                </div>

                <div className='form-group form-buttom'>
                  <input type="submit" name="signup" id="signup" class="form-submit btn btn-outline-primary" value="register"/>
                </div>

              </form>
              </div>
              <div className='signup-image'>
                <figure>
                  <img src alt="registration pic" />
                </figure>
                <NavLink to="../login" className="signup-image-link">I am already register</NavLink>
              </div>

            
          </div>
        </div>
      </section>
    </>
  )
}

export default Signup;
