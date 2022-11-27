import React, { useState } from 'react'
import { NavLink, useNavigate } from 'react-router-dom';

const Signup = () => {
  
  const navigate = useNavigate();
  const [user, setUser] = useState({
    name: "", email: "", phone: "", work: "", password: "", cpassword: ""
  });

  let name, value;
  const handleInputs = (e) => {
    name = e.target.name;
    value = e.target.value;

    setUser({...user, [name]:value});
  }

  const PostData = async (e) => {
    e.preventDefault();

    const {name, email, phone, work, password, cpassword} = user;

    const res = await fetch("/register", {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify({
        name, email, phone, work, password, cpassword
      })
    });

    const data = await res.json();
    
    if(res.status === 422 || !data){
      window.alert("Some Thing went to wrong!")
    }else{
      window.alert("Registration Successfull")

      navigate("/login");
    }
  }

  return (
    <>
      <section className='signup'>
        <div className='container mt-5'>
          <div className='signup-content'>
            <div className='signup-form'>
              <h2 className='form-title'>Sign up</h2>
              <form method="POST" className='register-form' id="register-form">

                <div className='form-group'>
                  <label htmlFor="name">
                    <i class="zmdi zmdi-account material-icons-name"></i>
                  </label>
                  <input type="text" name="name" id="name" autoComplete='off' value={user.name} onChange={handleInputs} placeholder='Your Name' /> <hr />
                </div>

                <div className='form-group'>
                  <label htmlFor="email">
                    <i class="zmdi zmdi-email material-icons-name"></i>
                  </label>
                  <input type="email" name="email" id="email" autoComplete='off' value={user.email} onChange={handleInputs} placeholder='Your email' /> <hr />
                </div>

                <div className='form-group'>
                  <label htmlFor="phone">
                    <i class="zmdi zmdi-phone-in-talk material-icons-name"></i>
                  </label>
                  <input type="number" name="phone" id="phone" autoComplete='off' value={user.phone} onChange={handleInputs} placeholder='Your Phone Number' /> <hr />
                </div>

                <div className='form-group'>
                  <label htmlFor="work">
                    <i class="zmdi zmdi-slideshow material-icons-name"></i>
                  </label>
                  <input type="text" name="work" id="work" autoComplete='off' value={user.work} onChange={handleInputs} placeholder='Your Profession' /> <hr />
                </div>

                <div className='form-group'>
                  <label htmlFor="password">
                    <i class="zmdi zmdi-lock material-icons-name"></i>
                  </label>
                  <input type="password" name="password" id="password" autoComplete='off' value={user.password} onChange={handleInputs} placeholder='Your password' /> <hr />
                </div>

                <div className='form-group'>
                  <label htmlFor="password">
                    <i class="zmdi zmdi-lock material-icons-name"></i>
                  </label>
                  <input type="password" name="cpassword" id="cpassword" autoComplete='off' value={user.cpassword} onChange={handleInputs} placeholder='Your password' /> <hr />
                </div>
                
                <div className='form-group form-buttom'>
                  <input type="submit" name="signup" id="signup" class="form-submit btn btn-outline-primary"  value="register" onClick={PostData} />
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
