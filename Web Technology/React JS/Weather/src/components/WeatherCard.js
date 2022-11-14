import React, { useEffect, useState } from 'react'

const WeatherCard = ({
    temp,
    humidity,
    pressure,
    weathermood,
    name,
    speed,
    country,
    sunset,
}) => {
    const [weatherState, setWeatherState] = useState("");

    useEffect(() => {
        if (weathermood) {
            switch (weathermood) {
                case "Clouds": setWeatherState("wi-day-cloudy");
                    break;
                case "Haze": setWeatherState("wi-fog");
                    break;
                case "Cleare": setWeatherState("wi-day-sunny");
                    break;
                case "Mist": setWeatherState("wi-day-dust");
                    break;

                default: setWeatherState("wi-day-sunny");
                    break;
            }
        }
    }, [weathermood]);

    //Convert Second into Time
    const sec = sunset;
    const date = new Date(sec * 1000);
    const timeStr = `${date.getHours()}:${date.getMinutes()}`
    return (
        <>
            <article className="widget">
                <div className="weatherIcon">
                    <i className={`wi ${weatherState}`}></i>
                </div>

                <div className='weatherInfo'>
                    <div className='temperature'>
                        <span>{temp}&deg;</span>
                    </div>

                    <div className='description'>
                        <div className='weatherCondtion'>{weathermood}</div>
                        <div className='place'>{name}, {country}</div>
                    </div>
                </div>

                <div className='date'>{new Date().toLocaleString()}</div>

                {/* 4 column Section */}
                <div className="extra-temp">
                    <div className="temp-info-minmax">

                        <div className="two-sided-section">
                            <p>
                                <i className={"wi wi-sunset"}></i>
                            </p>
                            <p className='extra-info-leftside'>
                                {timeStr} PM<br />
                                sunset
                            </p>
                        </div>

                        <div className="two-sided-section">
                            <p>
                                <i className={"wi wi-humidity"}></i>
                            </p>
                            <p className='extra-info-leftside'>
                                {humidity} <br />
                                humidity
                            </p>
                        </div>
                    </div>

                    <div className='weather-extra-info'>
                        <div className="two-sided-section">
                            <p>
                                <i className={"wi wi-rain"}></i>
                            </p>
                            <p className='extra-info-leftside'>
                                {pressure} <br />
                                Pressure
                            </p>
                        </div>

                        <div className="two-sided-section">
                            <p>
                                <i className={"wi wi-strong-wind"}></i>
                            </p>
                            <p className='extra-info-leftside'>
                                {speed} <br />
                                Speed
                            </p>
                        </div>
                    </div>
                </div>
            </article>
        </>
    );
};


export default WeatherCard;
