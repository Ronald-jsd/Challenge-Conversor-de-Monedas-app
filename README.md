
# 💱 **Conversor de Monedas incluido una API de de Consulta**  

Bienvenido al **Conversor de Monedas**, una aplicación que te permite convertir entre diferentes monedas de manera fácil y
rápida mediante el consumo de una API de monedas y gurda los datos en un archivo .JSON. 🌍💵


---

## 🛠️ **Características**

- **Conversiones soportadas**:
  1. Dólar (USD) a Peso Argentino (ARS)
  2. Peso Argentino (ARS) a Dólar (USD)
  3. Dólar (USD) a Real Brasileño (BRL)
  4. Real Brasileño (BRL) a Dólar (USD)
  5. Dólar (USD) a Peso Colombiano (COP)
  6. Peso Colombiano (COP) a Dólar (USD)

- **Dos interfaces disponibles**:
  - **Consola**: Una interfaz simple para realizar conversiones directamente desde la terminal.  
  - **Gráfica (Swing)**: Una interfaz gráfica amigable con botones e interacciones.

 **Conversor de Monedas en Consola**
 
![console](https://github.com/user-attachments/assets/f02ad554-889f-4693-98dd-c592ee79868b)

 **Conversor de Monedas con Interfaz Grafica**

![Captura de pantalla 2024-12-10 095611](https://github.com/user-attachments/assets/2c3a5c4e-6950-46ae-810c-3ee1746defc6)

- Consulta las tasas de cambio en tiempo real mediante una API externa. 🌐📡
- Los datos son guardados en un archivo .JSON .

---

## 📂 **Estructura del Proyecto**
Se uso el **Principio SOLID** de responsabilidad unica.

```
📁 src
├── 📦 consultaApi
│   ├── ConsultaMoneda.java   ( Manejo de las consultas a la API de monedas)
├── 📦 modelRecord
│   ├── Moneda.java          ( Modelo para gestionar las tasas de conversión)
├── 📦 principalConsola
│   ├── ConversorApp.java     (Aplicación principal basada en consola)
├── 📦 principalGui
│   ├── PrincipalSwing.java   (Aplicación principal con interfaz gráfica)
└── 📦 generadorDeArchivo
    ├── GeneradorDeArchivo.java (Generador de resúmenes y reportes)
```


## 🚀 Lenguajes y Librerías Usados

### Lenguajes Principales
- ![Java](https://img.shields.io/badge/Java-FF0000?style=for-the-badge&logo=java&logoColor=white)  

### Librerías
- ![Swing](https://img.shields.io/badge/Swing-4A90E2?style=for-the-badge&logo=java&logoColor=white)  
- ![Gson](https://img.shields.io/badge/Gson-FF5722?style=for-the-badge&logo=json&logoColor=white)  
- ![Java AWT](https://img.shields.io/badge/AWT-E91E63?style=for-the-badge&logo=java&logoColor=white)  

### APIs
- ![API](https://img.shields.io/badge/API-ExchangeRate-4CAF50?style=for-the-badge)  


---

## 🖥️ **Cómo Ejecutar**

### **Requisitos previos**:
1. Tener instalado **Java 17** o superior. ☕
2. Conexión a internet para consultar las tasas de cambio. 🌐
3. (Opcional) Un IDE como IntelliJ IDEA o Eclipse para una experiencia más fluida. 🚀
---

## 📎 **Notas Técnicas**
- Se utiliza la librería `javax.swing` para la interfaz gráfica.
- Se utilizo el IDE de Intellij y el IDE de eclipse para la realización de la interfaz grafica.
- Las tasas de conversión son obtenidas en tiempo real utilizando una API externa.
- El manejo de errores está implementado para garantizar la estabilidad de la aplicación. 🛡️

---

**✨ Gracias. ¡Espero que te sea útil! ✨**
```
