# CleanUserManager - Android App Using Clean Architecture

**CleanUserManager** is a modern Android application designed to demonstrate **Clean Architecture principles** in practice. This project showcases scalable, maintainable, and testable code structure while using **Jetpack Compose** for building a clean, modern UI.

---

## Key Features

* **User Management**: Add, view, and manage a list of users.
* **Clean Architecture**: Separates concerns across presentation, domain, and data layers.
* **Jetpack Compose UI**: Modern declarative UI toolkit for smooth and maintainable UI.
* **Testable & Maintainable**: Designed to be easily testable with independent, modular layers.
* **Error Handling**: Handles empty input and validation for better UX.

---

## Architecture Overview

This project is structured based on **Clean Architecture**, providing clear separation between layers:

### 1. Presentation Layer

* Handles UI and user interactions.
* Implements **ViewModel** to manage state and connect UI with business logic.

### 2. Domain Layer

* Contains **UseCases** encapsulating business logic.
* Independent of UI and data sources, making it reusable and testable.

### 3. Data Layer

* Responsible for data management, storage, and retrieval.
* Implements **Repository interfaces** defined in the Domain layer.
* Can easily swap data sources (local database, remote API, or mock data).

---

## Getting Started

### Prerequisites

* **Android Studio** (latest stable version)
* **JDK 11+**

### Steps

1. Clone the repository:

```bash
git clone https://github.com/your-username/CleanUserManager.git
```

2. Open the project in **Android Studio**.
3. Run the app on an emulator or a physical device.

---

## How to Use

1. Type a user name in the text field.
2. Press the **Add** button.
3. The user will appear in the list below.
4. Input validation ensures no empty entries are added.

---

## Technologies Used

* **Kotlin**: Programming language for the app.
* **Jetpack Compose**: Modern UI toolkit for building declarative interfaces.
* **Clean Architecture**: Ensures modular, testable, and maintainable code.
* **ViewModel & StateFlow**: Manages UI state and supports reactive updates.

---

## Future Improvements

* Add **persistent storage** using Room database.
* Implement **update and delete** functionality for users.
* Add **unit and UI tests** for better reliability.
* Extend to handle more complex user data (profile, avatar, etc.).

---

## Contribution

Contributions are welcome! You can open issues or submit pull requests to improve the project.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

## Contact

For questions or feedback, reach out via:

* **LinkedIn**: [https://www.linkedin.com/in/your-profile](https://www.linkedin.com/in/alirezahalvaei/)
* **Email**: [your-email@example.com](halvaei@Gmail.com)

---

**CleanUserManager** demonstrates best practices in Android development and Clean Architecture principles. Ideal for showcasing in your portfolio or learning structured, scalable Android app design.
