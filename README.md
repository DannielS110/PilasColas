🌟 ESTRUCTURAS DE DATOS LINEALES 🌟

-------------------------------------------------------------------------------------------------------------
📌 INFORMACIÓN

🎓 Campo📝 Universidad Politécnica Salesiana


Detalle📚 

Asignatura Estructura de Datos 


- Segundo Interciclo

  
-🏫 CarreraComputación


👨‍💻 Estudiante  Daniel Sánchez


📅 Fecha08 / 06 / 2025


👨‍🏫 ProfesorIng. Pablo Torres

-------------------------------------------------------------------------------------------------------------

🧠 DESCRIPCIÓN DE LOS PROBLEMAS

🔍 EJERCICIO 01: VALIDACIÓN DE SIGNOS

🎯 Objetivo: Determinar si una cadena con caracteres ( ) { } [ ] está perfectamente balanceada

⚡ Restricciones:

Los corchetes abiertos deben cerrarse en el orden correcto

Utilizar únicamente operaciones básicas de Stack

🧪 Casos de Prueba:

![image](https://github.com/user-attachments/assets/1dc83371-e361-4daa-a441-c4d0b6f5d9a5)


📊 EJERCICIO 02: ORDENAMIENTO DE STACK

🎯 Objetivo: Ordenar Stack con elementos pequeños en el tope usando solo un stack auxiliar

⚡ Restricciones:

Solo operaciones básicas: push, pop, peek, isEmpty

Máximo 1 Stack adicional como estructura auxiliar

Sin usar arrays, listas u otras estructuras

🎭 ESTADO INICIAL:

Input: [5, 1, 4, 2] (tope → 5)

    ⬇️ ✨ ALGORITMO DE ORDENAMIENTO ✨ ⬇️
    
    🔄 Usando stack auxiliar temporal
    
    🎯 Reordenando elementos eficientemente

🎉 RESULTADO FINAL:

Output: [1, 2, 4, 5] (tope → 1)

-------------------------------------------------------------------------------------------------------------

🏗️ ARQUITECTURA DEL PROYECTO

📂 src/

├── 📁 Ejercicio_01_sign/           ← 🔍 VALIDADOR DE SIGNOS

│   └── 🧠 SignValidator.java         ← Algoritmo de balanceo perfecto


├── 📁 Ejercicio_02_sorting/          ← 📊 ORDENADOR DE STACK


│   └── 🚀 StackSorter.java           ← Algoritmo de ordenamiento eficiente

├── 📁 Materia/                       ← 🎪 ESTRUCTURAS BASE

│   ├── 📁 Controllers/               ← Controladores de estructuras

│   │   ├── Stack.java               ← Pila básica

│   │   ├── StackG.java              ← Pila genérica

│   │   ├── Queue.java               ← Cola básica

│   │   └── QueueG.java              ← Cola genérica

│   └── 📁 models/                    ← Modelos de datos

│       ├── Node.java                ← Nodo básico

│       ├── NodeGeneric.java         ← Nodo genérico

│       └── Persona.java             ← Modelo Persona

├── 🎯 App.java                       ← Aplicación principal

└── 📜 README.md                      ← Este documento épico

-------------------------------------------------------------------------------------------------------------

📌 RESULTADOS OBTENIDOS

![code](https://github.com/user-attachments/assets/6dcf2f65-3708-413c-a05f-e022ecf6ffc2)

-------------------------------------------------------------------------------------------------------------
📈 CONCLUSIONES

En esta práctica se reutilizó código previamente visto en clase, para solucionar problemas comunes como lo serían la validación de signos, que estos podrían servir para loguear en alguna página etc. Reforzando 

la comprensión del uso de estructuras lineales.

Los ejercicios implementados demuestran la aplicabilidad práctica de las pilas en problemas reales como validación de sintaxis y ordenamiento con restricciones. La validación de signos balanceados tiene uso 

directo en desarrollo web y compiladores, mientras que el ordenamiento de stacks enseña optimización bajo limitaciones específicas.

-------------------------------------------------------------------------------------------------------------

Desarrollado con 💝, mucho ☕ para la Universidad Politécnica Salesiana
© 2025 Daniel Sánchez - Estructura de Datos, Segundo Interciclo
