import React from 'react'

const About = () => {
  return (
    <>
      <div className='container emp-profile'>
        <form method="">
          <div className='row'>

            <div className='col-md-4'>
              <div className='profile-img'>
                <img sec="" alt="moliya" />
              </div>
            </div>

            <div className='col-md-4'>
              <div className='profile-head'>
                <h5>kishan moliya</h5>
                <h6>Web Developar</h6>
                <p className='profile-rating mt-3 mb-5'>RANKINGS: <span> 1/10 </span></p>

                <ul className="nav" role="tablist">
                  <li className="nav-item">
                    <a className="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home">About</a>
                  </li>
                  <li className="nav-item">
                    <a className="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile">Timeline</a>
                  </li>
                </ul>

              </div>
            </div>

            <div className='col-md-2'>
              <input type="submit" className='profile-edit-btn' name="btnAddMore" value="Edit Profile" />
            </div>

          </div>

          <div className='row'>

            {/* Left Side URL */}
            <div className='col-md-4'>
              <div className='profile-work'>
                <p> Work Link </p>
                <a href="https://github.com/kishanmoliya" target="_Kishan">Collage</a><br />
                <a href="https://github.com/kishanmoliya" target="_Kishan">Collage</a><br />
                <a href="https://github.com/kishanmoliya" target="_Kishan">Collage</a><br />
                <a href="https://github.com/kishanmoliya" target="_Kishan">Collage</a><br />
                <a href="https://github.com/kishanmoliya" target="_Kishan">Collage</a><br />
                <a href="https://github.com/kishanmoliya" target="_Kishan">Collage</a><br />
              </div>
            </div>

            {/* Right Side URL */}
            <div className='col-md-8 pl-5 about-info'>
              <div className='tab-content profile-tab' id="myTabContant">
                <div className='tab-pane fade show active' id="home" role="moliyapanel" aria-labelledby="home-tab">

                  <div className='row'>
                    <div className='col-md-6'>
                      <label>User Id</label>
                    </div>
                    <div className='col-md-6'>
                      <p>78978978978978</p>
                    </div>
                  </div>

                  <div className='row mt-3'>
                    <div className='col-md-6'>
                      <label>Name</label>
                    </div>
                    <div className='col-md-6'>
                      <p>kishan moliya</p>
                    </div>
                  </div>

                  <div className='row mt-3'>
                    <div className='col-md-6'>
                      <label>Email</label>
                    </div>
                    <div className='col-md-6'>
                      <p>kishanmoliya232@gmail.com</p>
                    </div>
                  </div>

                  <div className='row mt-3'>
                    <div className='col-md-6'>
                      <label>Phone</label>
                    </div>
                    <div className='col-md-6'>
                      <p>7894561232</p>
                    </div>
                  </div>

                  <div className='row mt-3'>
                    <div className='col-md-6'>
                      <label>Profation</label>
                    </div>
                    <div className='col-md-6'>
                      <p>App Developar</p>
                    </div>
                  </div>

                </div>



                <div className='tab-pane fade' id="profile" role="moliyapanel" aria-labelledby="profile-tab">

<div className='row'>
  <div className='col-md-6'>
    <label>Experience</label>
  </div>
  <div className='col-md-6'>
    <p>Expert</p>
  </div>
</div>

<div className='row mt-3'>
  <div className='col-md-6'>
    <label>Name</label>
  </div>
  <div className='col-md-6'>
    <p>kishan moliya</p>
  </div>
</div>

<div className='row mt-3'>
  <div className='col-md-6'>
    <label>Email</label>
  </div>
  <div className='col-md-6'>
    <p>kishanmoliya232@gmail.com</p>
  </div>
</div>

<div className='row mt-3'>
  <div className='col-md-6'>
    <label>Phone</label>
  </div>
  <div className='col-md-6'>
    <p>7894561232</p>
  </div>
</div>

<div className='row mt-3'>
  <div className='col-md-6'>
    <label>Profation</label>
  </div>
  <div className='col-md-6'>
    <p>App Developar</p>
  </div>
</div>

</div>




              </div>
            </div>

          </div>
        </form>
      </div>
    </>
  )
}

export default About;
