# Weather-Forecast-App
 Advanced android forecast weather app with search engine through date selection developed in kotlin, demonstrating the use of RxJava, Retrofit and implementing MVP.
 
![Image](https://user-images.githubusercontent.com/101495450/192287388-9412c9cf-bbca-456f-bae7-8a9f9875fb3e.png)

###  **Preview**

![Gif](https://github.com/Silentou/Weather-Forecast_App/blob/master/ezgif.com-gif-maker.gif)

### **Overview**

Weather app created using the [Open weather map Api](https://openweathermap.org/). This is not supposed to be a production scale application, it is meant to demonstrate the implementation of MVP architecture in Kotlin using following libraries:

    RxJava
    Retrofit

Still if you have any issues or suggestions, please feel free to open an [issue](https://github.com/Silentou/Weather-Forecast-App/issues)

### General flow of data

   - Check if there is cached data present in the internal file, if yes then load the cached data.
   - Retrieve the latitude and longitude of the user.
   - Request data from Weather Api
   - If data received, cache it in internal file and show the updated data to user.
   - If you want particular location weather deatils then use the search engine
   - Forecasting weather through date selection 
   - If error then notify user about it.
   
### Build the Project

To build the project on your own follow these steps:

  - Clone the Project
  - Get an Api key from [open weather map](https://openweathermap.org/)
  - Open the Weather activity file and then enter your API key that you got from the open weather map
  ```kotlin
  companion object{
        private const val PERMISSION_REQUEST_ACCESS_LOCATION = 100
        const val API_KEY ="Your Api key"
    }
  ```
  
