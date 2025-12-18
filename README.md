# 💱 Conversor de Monedas y Temperatura - Oracle Next Education

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)

Este proyecto es un **Conversor de Monedas y Temperatura** desarrollado como parte del Challenge de **Oracle Next Education** para la formación Backend. La aplicación permite realizar conversiones rápidas y precisas entre diferentes tipos de monedas y escalas de temperatura a través de una interfaz gráfica sencilla e intuitiva.

## 🚀 Características

### 💵 Conversor de Monedas
Soporta conversiones entre el **Peso Argentino** y las siguientes divisas:
- Dólar estadounidense 🇺🇸
- Euro 🇪🇺
- Libra esterlina 🇬🇧
- Yen japonés 🇯🇵
- Won surcoreano 🇰🇷
*(Incluye conversión inversa: Divisa -> Peso)*

### 🌡️ Conversor de Temperatura
Soporta las siguientes escalas:
- Celcius a Kelvin
- Celcius a Fahrenheit
- Fahrenheit a Celcius
- Kelvin a Celcius

## 🛠️ Tecnologías Utilizadas

- **Java JDK 17+**: Lenguaje de programación principal.
- **Swing (JOptionPane)**: Para la creación de la interfaz gráfica de usuario (GUI).
- **Herramientas de Programación**: Programación Orientada a Objetos (POO), manejo de excepciones y colecciones (HashMap).

## 💻 Instalación y Ejecución

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/Fernandofarfan/currency-converter-java.git
   ```
2. **Importar el proyecto:**
   Abre tu IDE favorito (IntelliJ IDEA, Eclipse, VS Code) e importa la carpeta como un proyecto Java.
3. **Ejecutar:**
   Localiza la clase `Main.java` en `src/main/` y ejecútala.

## 📁 Estructura del Proyecto

```text
src/
├── main/
│   ├── Main.java       # Punto de entrada de la aplicación
│   └── Function.java   # Lógica de validación y utilidades
├── monedas/
│   └── ConversorMonedas.java # Lógica de conversión de divisas
└── temperaturas/
    └── ConversorTemperatura.java # Lógica de conversión de temperatura
```

## 👤 Autor

Desarrollado por **Fernando Farfán** como parte del programa Oracle Next Education.

---
© 2025 Fernando Farfán. Bajo licencia MIT.
