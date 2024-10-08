<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.min.css">
        <title>Inicio de Sesión</title>
    </head>
    <body>
        <main class="container">
            <form action="validar" method="POST">
                <h2>Iniciar Sesión</h2>
                <div>
                    <label for="email">Correo Electrónico:</label>
                    <input type="email" id="email" name="txtCorreo" required>
                </div>
                <div>
                    <label for="password">Contraseña:</label>
                    <input type="password" id="password" name="txtContrasena" required>
                </div>
                <div>
                    <label for="remember">
                        <input type="checkbox" id="remember" name="remember">
                        Permanecer conectado
                    </label>
                </div>
                <div>
                    <button type="submit" name="accion" value="Ingresar">Ingresar</button>
                </div>
            </form>
        </main>
    </body>
</html>