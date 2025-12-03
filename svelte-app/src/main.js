// 1. IMPORTACIÓN DEL COMPONENTE RAÍZ:
// Traemos el componente principal (App.svelte).
// Piensa en 'App' como la caja contenedora de todo tu sitio web.
import App from './App.svelte';

// 2. INICIALIZACIÓN DE LA APP:
// Aquí es donde Svelte "despierta" y cobra vida en el navegador.
// Creamos una nueva instancia de tu componente principal.
const app = new App({
    // A. TARGET (Objetivo):
    // Le dice a Svelte DÓNDE debe "dibujar" o inyectar la aplicación en el HTML.
    // 'document.body' significa que la app ocupará todo el cuerpo de la página.
    // (A veces verás que se usa un div específico como document.getElementById('app')).
    target: document.body,

    // B. PROPS (Propiedades Iniciales):
    // Aquí es donde pasamos datos desde "afuera" hacia adentro del componente.
    // ¿Recuerdas el "export let name;" que pusiste en App.svelte?
    // Aquí le estamos dando su valor inicial: 'Omlaaaaaam'.
    props: {
        name: 'Papulin'
    }
});

// 3. EXPORTACIÓN:
// Exportamos la instancia para que el empaquetador (como Rollup o Vite) 
// pueda manejarla y ejecutarla.
export default app;