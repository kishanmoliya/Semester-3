import React from 'react'

const Contact = () => {
  return (
    <>
      <div className='contect_info'>
        <div className='container-gluid'>
          <div className='row'>
            <div className='col-lg-10 offset-lg-1 d-flex justify-content-between'>

              {/* Phone Number */}
              <div className='contact_info_item d-flex justify-content-start align-item-center'>
                <img src="" alt="phone" />
                  <div className='contact_info_contact'>
                    <div className='contact-info_title'>
                        Phone
                    </div>
                    <div className='contact-info_text'>
                        +91 89895 89895
                    </div>
                  </div>
              </div>

              {/* Phone Number */}
              <div className='contact_info_item d-flex justify-content-start align-item-center'>
                <img src="" alt="phone" />
                  <div className='contact_info_contact'>
                    <div className='contact-info_title'>
                        Email
                    </div>
                    <div className='contact-info_text'>
                        kishanmiliuya
                    </div>
                  </div>
              </div>

              {/* Phone Number */}
              <div className='contact_info_item d-flex justify-content-start align-item-center'>
                <img src="" alt="phone" />
                  <div className='contact_info_contact'>
                    <div className='contact-info_title'>
                        Address
                    </div>
                    <div className='contact-info_text'>
                        jkbdvf
                    </div>
                  </div>
              </div>

            </div>
          </div>
        </div>
      </div>

      {/* Contect Us Form */}
      <div className='contact_form'>
        <div className='container'>
          <div className='row'>
            <div className='col-lg-10 offset-lg-1'>
              <div className='contact_form_container py-5'>

                <div className='contact_form_title'>
                  Get in Touch
                </div>

                  <form id="contact_form">
                    <div className='contact_form_name d-flex justify-content-between align-item-between'>
                      <input type="text" id="contact_form_name" className='contact_form_name input_fild' placeholder='Your name' require="true" />
                      <input type="email" id="contact_form_email" className='contact_form_email input_fild' placeholder='Your email' require="true" />
                      <input type="number" id="contact_form_phone" className='contact_form_phone input_fild' placeholder='Your number' require="true" />
                    </div>

                    <div className='contact_form_text mt-5'>
                      <textarea className='text_fild contact_form_message' placeholder='Message' cols="30" rows="10"></textarea>
                    </div>

                    <div className='contact_form_button'>
                      <button type="submit" className='button contact_submit_button'>Send Message</button>
                    </div>
                  </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    </>
  )
}

export default Contact;
