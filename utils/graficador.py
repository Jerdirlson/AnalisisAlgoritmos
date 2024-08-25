import matplotlib.pyplot as plt
import matplotlib

matplotlib.use('Agg')  # Usa el backend Agg para entornos no gráficos

def plot_execution_time(data_sizes, execution_times):
    plt.figure(figsize=(10, 5))
    plt.plot(data_sizes, execution_times, marker='o', linestyle='-', color='b')
    
    # Añadir etiquetas a cada punto
    for i, (data_size, execution_time) in enumerate(zip(data_sizes, execution_times)):
        plt.annotate(f'{execution_time}', 
                     (data_size, execution_time),
                     textcoords="offset points",
                     xytext=(0,5),
                     ha='center')
    
    plt.title('Execution Time vs Data Size')
    plt.xlabel('Data Size')
    plt.ylabel('Execution Time')
    plt.grid(True)
    plt.savefig('execution_time_plot.png')  # Guarda el gráfico en un archivo
    print("Gráfico guardado como 'execution_time_plot.png'.")

# Ejemplo de uso
data_sizes = [500, 1000, 1500, 2000, 2500, 3000]
execution_times = [1306667, 1862554, 2519492, 2337665, 2790660, 3194197]

plot_execution_time(data_sizes, execution_times)

