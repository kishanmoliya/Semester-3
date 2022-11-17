import React from 'react'
import logo from '../images/logo.png'
import { Link } from 'react-router-dom'

const Navbar = () => {
    return (
        <>
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="container-fluid">
                    <nav className="navbar navbar-light">
                        <div className="container-fluid">
                            <img
                                src={logo}
                                alt=""
                                width="125%"
                                height="75vh"
                                className="d-inline-block align-text-top"
                            />
                        </div>
                    </nav>

                    <button
                        className="navbar-toggler ms-auto"
                        style={{ border: "2px solid grey" }}
                        type="button"
                        data-bs-toggle="collapse"
                        data-bs-target="#navbarNavAltMarkup"
                        aria-controls="navbarNavAltMarkup"
                        aria-expanded="false"
                        aria-label="Toggle navigation"
                    >
                        <span className="navbar-toggler-icon"></span>
                    </button>

                    <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
                        <div className="navbar-nav ms-auto fs-5 p-2">
                            <Link to="./" className="nav-link active me-4">
                                Home
                                <hr />
                            </Link>
                            <Link to="./about" className="nav-link text-dark me-4">
                                About
                                <hr />
                            </Link>
                            <Link to="./contact" className="nav-link text-dark -4">
                                Contact
                                <hr />
                            </Link>
                            <Link to="./login" className="nav-link text-dark -4">
                                Login
                                <hr />
                            </Link>
                            <Link to="./signup" className="nav-link text-dark -4">
                                Signup
                                <hr />
                            </Link>
                        </div>
                    </div>
                </div>
            </nav>
        </>
    );
}

export default Navbar;
