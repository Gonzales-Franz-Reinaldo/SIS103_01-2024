const { Semaphore } = require('async-mutex');

//? Inicializamos el semáforo con un valor inicial de 1
const semaforo = new Semaphore(1);

async function usarSemaforo(id_proceso){

    console.log(`El proceso ${id_proceso} está esperando para usar la impresora.`);

    //! Operación Wait() - Esperar si el semáforo está en 0
    const [value, signal] = await semaforo.acquire();

    try{

        console.log('==================================================');
        console.log(`El proceso ${id_proceso} está usando la impresora.`);

        //? Simula el tiempo que se tarda en usar la impresora
        await new Promise(resolve => setTimeout(resolve, 3000));

        console.log(`El proceso ${id_proceso} ha terminado de usar la impresora.`);
        console.log('\n');
        await new Promise(resolve => setTimeout(resolve, 1000));

    } finally{
        //! Operación signal (V) - Liberar el semáforo (1)
        signal();
    }
}

//? Crear múltiples promesas que intentarán usar la impresora
const promesas = [];

for(let i = 1; i <= 5; i++) {
    promesas.push(usarSemaforo(i));
}

//? Esperar a que todas las promesas terminen
Promise.all(promesas).then(() => {
    console.log('Todos los procesos han terminado de usar la impresora.');
});





// //? Importamos las librerias para manerajar los semáforos
// const { Semaphore } = require('async-mutex');

// //? Inicializamos el semáforo con un valor inicial de 1
// const semaforo = new Semaphore(1);

// //? Función que simula el uso de la impresora
// async function usarSemaforo(id_proceso){

//     console.log(`El proceso ${id_proceso} está esperando para usar la impresora.`);

//     //! Operación Wait() - Esperar si el semáforo está en 0
//     const [value, signal] = await semaforo.acquire();

//     try{

//         console.log('==================================================');

//         console.log(`El proceso ${id_proceso} está usando la impresora.`);

//         //? Simula el tiempo que se tarda en usar la impresora
//         await new Promise(resolve => setTimeout(resolve, 3000));

//         console.log(`El proceso ${id_proceso} ha terminado de usar la impresora.`);
//         console.log('\n');

//         await new Promise(resolve => setTimeout(resolve, 1000));
        
//     } finally{

//         //! Operación signal (V) - Liberar el semáforo (1)
//         signal();
//     }
// }

// //? Crear múltiples promesas que intentarán usar la impresora
// const promesas = [];

// for(let i = 1; i <= 5; i++) {
    
//     promesas.push(usarSemaforo(i));
// }

// //? Esperar a que todas las promesas terminen
// Promise.all(promesas).then(() => {
//     console.log('Todos los procesos han terminado de usar la impresora.');
// });