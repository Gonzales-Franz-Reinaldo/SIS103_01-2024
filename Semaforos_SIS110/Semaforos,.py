import threading
import time

# Definimos el semáforo
printer_semaphore = threading.Semaphore(1)

def use_printer(thread_id):
    print(f"Proceso {thread_id} está esperando para usar la impresora.")
    
    # Operación wait - Esperar si el semáforo está en 0
    with printer_semaphore:
        print(f"Proceso {thread_id} está usando la impresora.")
        # Simula el tiempo que se tarda en usar la impresora
        time.sleep(1)
        print(f"Proceso {thread_id} ha terminado de usar la impresora.")

# Creamos múltiples hilos que intentarán usar la impresora
threads = []
for i in range(5):
    thread = threading.Thread(target=use_printer, args=(i,))
    threads.append(thread)
    thread.start()

# Esperamos a que todos los hilos terminen
for thread in threads:
    thread.join()

print("Todos los procesos han terminado.")
