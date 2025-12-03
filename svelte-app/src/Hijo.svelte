<script>
    // 1. PROPS CON VALORES POR DEFECTO (Fallbacks):
    // Usamos 'export' para recibir datos del padre.
    // Lo especial aquí es que le estamos dando un valor inicial (= ...).
    
    // Si el padre dice <Hijo />, sin pasar nada:
    // 'texto' valdrá "Botón" y 'color' valdrá 'blue'.
    export let texto = "Botón"; 
    
    // Si el padre dice <Hijo color="red" />, 'color' será rojo.
    export let color = 'blue';
</script>

<button style="background-color: {color};">
    
    {texto}
</button>

<style>
    /* 4. ESTILOS ENCAPSULADOS: */
    /* Este CSS solo aplica a este botón específico.
       Define que el texto SIEMPRE será blanco, sin importar el color de fondo. */
    button{
        color: white;
        /* Tip: Aquí podrías agregar padding, border-radius, etc.
           para que todos tus botones se vean consistentes. */
    }
</style>