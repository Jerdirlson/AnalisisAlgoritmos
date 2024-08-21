Laboratorio 1 de Algoritmos 
Objetivo
Este laboratorio tiene como objetivo que los estudiantes apliquen y comprendan el algoritmo de ordenamiento por inserción y el algoritmo de búsqueda binaria. Se realizará un análisis tanto analítico como empírico de la complejidad temporal del algoritmo.
    1. Descripción del Algoritmo - Ordenamiento por inserción 
        El ordenamiento por inserción es un algoritmo simple que construye la salida ordenada uno a la vez. Se parece mucho a cómo las personas ordenan una mano de cartas.

    2. Descripción del Algoritmo - Búsqueda Binaria 
        La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en una lista ordenada dividiendo repetidamente a la mitad el segmento de búsqueda.
        

Ejercicios Analitcos 
    3. Calcula la complejidad de la siguiente función: 
        public int suma(int[] v, int tamaño) { 
            int i, result = 0; 
            for (i = 0; i < tamaño; i++) { 
                result += v[i]; 
            } 
            return result; 
        }
    4. Calcula la complejidad de la siguiente función: 
        public int minimo(int[] v) { 
            int min = v[0]; 
            for (int i = 1; i < v.length; i++) { 
                if (v[i] < min) { 
                    min = v[i]; 
                    } 
                } 
            return min; 
        }
    
    5. Ejercicio: Encontrar Todos los Pares de Números en un Arreglo cuya Suma es un Número Dado 
        Descripción: 
            Desarrolla una función que tome un arreglo de números enteros y un número objetivo. La función deberá encontrar todos los pares únicos de números dentro del arreglo que, al sumarse, sean igual al número objetivo.
        Ejemplo: 
            Entrada: arreglo = [1, 2, 3, 4, 5], objetivo = 6
            Salida esperada: [(1, 5), (2, 4)]



Guía para la Presentación del Informe de Laboratorio 
1. Portada 
    ● Título del informe: Claro y descriptivo.                                                                                      LISTO
    ● Nombre del estudiante.                                                                                                        LISTO
    ● Número de ID.                                                                                                                 LISTO
    ● Nombre de la materia: Análisis y Diseño de Algoritmos.                                                                        LISTO
    ● Nombre del profesor.                                                                                                          LISTO
    ● Fecha de entrega.                                                                                                             LISTO
2. Índice 
    ● Listado de las secciones del informe con número de página correspondiente. 
3. Introducción 
    ● Objetivo del laboratorio: Describir claramente qué se pretende lograr.                                                        LISTO              
    ● Contexto: Breve descripción del tema y su relevancia.                                                                         LISTO
4. Enfoque Analítico y Empírico, cada proceso del laboratorio debe tener ambos enfoques siguiendo los siguientes pasos: 
    ● Planteamiento del problema: Descripción detallada del problema a resolver.
    ● Hipótesis: Presentar las hipótesis que se pretenden probar. 
    ● Detalles de la implementación: Lenguaje de programación, entorno de desarrollo, etc. 
    ● Enfoque analítico: 
        ○ Descripción del algoritmo: Explicación detallada del algoritmo o algoritmos utilizados.
        ○ Justificación teórica: Razones teóricas para la selección del algoritmo. 
        ○ Análisis de complejidad: Análisis teórico de la complejidad temporal. 
    ● Enfoque empírico, resultados experimentales:
        ○ Presentar resultados de manera clara, utilizando tablas y gráficos cuando sea necesario. 
        ○ Comparar los resultados obtenidos con las hipótesis planteadas. 

5. Análisis de Resultados 
    ● Interpretación de los resultados: Discusión sobre lo que indican los resultados. 
    ● Comparación con la teoría: Evaluar cómo se alinean los resultados experimentales con la teoría. 
    ● Identificación de limitaciones: Posibles limitaciones del estudio y errores encontrados. 6. Conclusiones 
    ● Resumen de hallazgos: Resumen de los resultados más importantes. 
    ● Evaluación de las hipótesis: Indicar si las hipótesis fueron confirmadas o refutadas. 
    ● Sugerencias para trabajos futuros: Posibles mejoras y estudios adicionales que podrían realizarse. 

7. Referencias (Si aplica) 
    ● Lista de todas las fuentes y bibliografía consultadas y utilizadas en el informe, siguiendo un formato de citación adecuado.

9. Apéndices (si es necesario) 
    ● Incluir cualquier material adicional relevante, como código fuente, detalles extensivos de la implementación, o datos brutos de los experimentos. 










    DOCUMENTACION

https://es.khanacademy.org/computing/computer-science/algorithms/insertion-sort/a/insertion-sort
    es una manera muy natural de ordenar para un ser humano, y puede usarse fácilmente para ordenar un mazo de cartas numeradas en forma arbitraria. Requiere O(n²) operaciones para ordenar una lista de n elementos.

https://runestone.academy/ns/books/published/pythoned/SortSearch/ElOrdenamientoPorInsercion.html



