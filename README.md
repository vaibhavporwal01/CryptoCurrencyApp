# 🚀 CryptoCurrencyApp 🚀

A clean architecture Android app built with Kotlin & Jetpack Compose. The app lists all cryptocurrencies with detailed information on click, featuring well-structured packages for a modular and scalable design. 📱💎

## ✨ Features ✨

* 🔍 Browse a comprehensive list of cryptocurrencies
* 📈 View detailed information for each cryptocurrency, including price, market cap, and 24h change
* 🏗️ Clean architecture with separate `ui`, `domain`, and `data` layers for maintainability
* ⚡ Asynchronous data fetching with Kotlin Coroutines
* 🔌 Dependency injection and network integration using Retrofit

## 🛠️ Tech Stack 🛠️

* **Language:** Kotlin 🅺
* **UI Framework:** Jetpack Compose 🎨
* **Architecture:** Clean Architecture (UI, Domain, Data layers) 🧩
* **Networking:** Retrofit + OkHttp + Gson 🌐
* **Concurrency:** Kotlin Coroutines ⏳
* **Dependency Injection:** Hilt (or Koin) 🧰

## 🚀 Getting Started 🚀

### 📋 Prerequisites

* Android Studio Flamingo or later 🛠️
* Android SDK (API level 21+) 📦
* Internet connection for API calls 🌐

### 📥 Installation

1. **Clone the repository**

   ```bash
   git clone https://github.com/vaibhavporwal01/CryptoCurrencyApp.git
   ```
2. **Open in Android Studio**

   * Launch Android Studio 🚀
   * Select *Open* and navigate to the cloned directory 🗂️
3. **Build the project**

   * Allow Gradle to sync 🔄
   * Build the app with *Build > Make Project* 🔨
4. **Run**

   * Connect a device or start an emulator 📱
   * Click the *Run* button or use `Shift + F10` 🎬

## 📁 Project Structure 📁

```
CryptoCurrencyApp/
├── app/                # Android application module 📦
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/   # Kotlin source code organized by package 🗂️
│   │   │   │   ├── ui/         # Composables and UI logic 🎨
│   │   │   │   ├── domain/     # Entities, use cases, and business logic 📚
│   │   │   │   └── data/       # Repositories, models, network 🌐
│   │   │   └── res/    # Resources (layouts, strings, themes) 🎨
│   └── build.gradle.kts
├── build.gradle.kts     # Project-level Gradle configuration 📝
├── settings.gradle.kts  # Project settings ⚙️
└── gradle/              # Gradle wrapper files 🔧
```

## 🌐 API 🌐

This app uses a public cryptocurrency API (e.g., CoinGecko, CoinPaprika) to fetch data. Please refer to the API documentation for rate limits and usage guidelines. 📄

## 🤝 Contributing 🤝

Contributions are welcome! Please open issues or pull requests for bug fixes, features, or improvements. 🛠️✨

## 📫 Contact 📫

Maintained by Vaibhav Porwal. Feel free to reach out for questions or feedback. 💬
