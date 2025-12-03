<script>
    // 1. IMPORTACIÓN: Traemos otro componente ('Hijo') para usarlo dentro de este.
    // Esto es composición de componentes.
    import Hijo from './Hijo.svelte';

    // 2. PROPS (Propiedades):
    // La palabra clave 'export' aquí le dice a Svelte que 'name'
    // es un dato que esperamos recibir desde FUERA (del componente padre).
    export let name;

    // 3. ESTADO LOCAL:
    // Esta variable es interna, solo existe para guardar lo que se escriba en el input.
    let nombre;

    // Variable reactiva para el contador. Empieza en 0.
    let contador = 0;

    // 4. LÓGICA (Funciones):
    // Función para sumar. En Svelte no hacen falta hooks complejos;
    // con solo usar el signo igual (=), Svelte detecta el cambio y actualiza la pantalla.
    function incrementar(){
        contador = contador + 1;
    }

    // Función que lanza la alerta.
    // Usa un operador ternario: (condición ? verdadero : falso).
    // Si 'nombre' tiene texto lo muestra, si no, muestra "nulo".
    function saludar(){
        alert(nombre ? nombre : "nulo");
    }
</script>

<main>
    <p>Hola {name}!</p>
    
    <h1>Contador: {contador}</h1>

    <button on:click={incrementar}>Incrementar Contador</button>

    <Hijo texto="Guardar" color="red"></Hijo>
    
    <Hijo texto="Ola w"></Hijo>

    <input bind:value={nombre} type="text" placeholder="Ingresa tu nombre">

    <button on:click={saludar}>Un saludo</button>
</main>

<style>
    /* ESTILOS ENCAPSULADOS (Scoped): */
    /* Lo genial de Svelte es que este CSS solo afecta a ESTE archivo.
       No va a romper estilos de otros componentes aunque se llamen igual. */
    main {
        text-align: center;
        padding: 1em;
        max-width: 240px;
        margin: 0 auto;
    }

    h1 {
        color: #ff3e00;
        text-transform: uppercase;
        font-size: 4em;
        font-weight: 100;
    }

    /* Media query para hacerlo responsivo:
       Si la pantalla es mayor a 640px, quita el límite de ancho. */
    @media (min-width: 640px) {
        main {
            max-width: none;
        }
    }
</style>