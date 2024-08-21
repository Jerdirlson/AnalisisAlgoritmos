import matplotlib
matplotlib.use('Agg')  # Usa el backend Agg para entornos no gráficos
import matplotlib.pyplot as plt

def plot_execution_time(data_sizes, execution_times):
    plt.figure(figsize=(10, 5))
    plt.plot(data_sizes, execution_times, marker='o', linestyle='-', color='b')
    plt.title('Execution Time vs Data Size')
    plt.xlabel('Data Size')
    plt.ylabel('Execution Time')
    plt.grid(True)
    plt.savefig('execution_time_plot.png')  # Guarda el gráfico en un archivo
    print("Gráfico guardado como 'execution_time_plot.png'.")

# Ejemplo de uso
data_sizes = [500, 1000, 1500, 2000, 2500, 3000]
execution_times = [32384313, 53863858, 83863858, 101213515, 126133115, 147803731]

plot_execution_time(data_sizes, execution_times)

