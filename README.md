Proyecto: Interfaces en Java Swing

Este proyecto contiene tres interfaces gráficas diseñadas en **Java Swing**, cada una enfocada en un contexto distinto (wallet de criptomonedas, banca online y plataforma de empleo).  
El objetivo es practicar diseño de GUIs modernas, validación de entradas y feedback al usuario.

---

## 📌 Interfaz 1 — Crypto-Take (Wallet)
- **Descripción:** Formulario de acceso a una wallet con fondo degradado azul y diseño tipo “card”.
- **Componentes:** `JTextField`, `JPasswordField`, `JCheckBox`, `JButton` personalizado con gradientes.
- **Comportamiento:**
    - Requiere aceptar el checkbox para iniciar sesión.
    - Mensajes claros de error/éxito.
- **Captura esperada:** formulario elegante con botón azul degradado.

---

## 📌 Interfaz 2 — Banco Global
- **Descripción:** Acceso seguro de clientes con estilo corporativo.
- **Componentes:** `JComboBox` (tipo de cuenta), `JTextField`, `JPasswordField`, `JRadioButton`, `JCheckBox`, `JButton`.
- **Comportamiento:**
    - Solicita aceptación de términos antes de acceder.
    - Recordar usuario marcado por defecto.
    - Mensajes modales de advertencia o éxito.
- **Diseño:** fondo azul claro, tarjeta blanca, botón azul oscuro de alto contraste.

---

## 📌 Interfaz 3 — JobConnect
- **Descripción:** Plataforma de empleo con pestañas (`JTabbedPane`) para **Login** y **Registro**.
- **Componentes:** `JTextField`, `JPasswordField`, `JComboBox`, `JCheckBox`, botones diferenciados (azul para login, verde para registro).
- **Comportamiento:**
    - **Login:** valida credenciales contra un `HashMap` de usuarios demo.
    - **Registro:** bloquea si no se aceptan términos, muestra confirmación.
- **Diseño:** header azul con logo “💼 JobConnect”, estilo limpio y profesional.

---

## 🚀 Ejecución
Cada interfaz es independiente y cuenta con su `main`.  
Para ejecutar una interfaz:

```bash
javac InterfazX.java
java InterfazX
https://drive.google.com/file/d/1iO6w0pa0DaftJthQynuSxrLhp2OmEldt/view?usp=sharing

