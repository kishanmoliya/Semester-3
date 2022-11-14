import React, { useEffect, useState } from 'react'
import WeatherCard from './WeatherCard';
import "./style.css"

const Temprature = () => {
  const [searchValue, setSearchValue] = useState("rajkot");
  const [tempInfo, setTempInfo] = useState({});

  const getWeatherInfo = async () => {
    try {
      let url = `https://api.openweathermap.org/data/2.5/weather?q=${searchValue}&units=metric&appid=7e3aa704c3814d4cadb6728b8cac5ead`;

      const res = await fetch(url);
      const data = await res.json();

      const { temp, humidity, pressure } = data.main;
      const { main: weathermood } = data.weather[0];
      const { name } = data;
      const { speed } = data.wind;
      const { country, sunset } = data.sys;

      const weatherInfo = {
        temp,
        humidity,
        pressure,
        weathermood,
        name,
        speed,
        country,
        sunset,
      };
      setTempInfo(weatherInfo);

    } catch (error) {
      console.log(error);
    }
  };

  useEffect(() => {
    getWeatherInfo();
  }, []);

  return (
    <>
      <div className="wrap">
        <div className='search'>
          <input type="search"
            placeholder='Search...'
            autoFocus
            id="search"
            className='searchTerm'
            value={searchValue}
            onChange={(e) => setSearchValue(e.target.value) }
          />

          <button className='searchButton'
            type="button"
            onClick={getWeatherInfo}>
            Search
          </button>
        </div>
      </div>

      <WeatherCard {...tempInfo} />
    </>
  );
};

export default Temprature;
