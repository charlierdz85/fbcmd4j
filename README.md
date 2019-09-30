# fbcmd4j
Curso Computación con Java - Evidencia de aprendizaje.<br>
Este programa puede consultar tu cuenta de Facebook y obtener noticias, publicaciones y publicar mensajes y links.

# Instalación
Copie el archivo bin/fbcmd.jar a alguna carpeta destino de su PC y ejecútelo. Se crearán las carpetas log y config.
Abra el archivo config/fbcmd4j.properties y capture los siguientes datos:<br><br>

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;oauth.appSecret<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;oauth.accessToken<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;oauth.permissions<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;oauth.appId<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;oauth.clientToken<br><br>
  
  Estos datos los puede obtener desde su cuenta de Facebook en http://developers.facebook.com

# Funcionamiento
Al ejecutar la aplicación, podrá realizar las siguientes acciones:<br>
(0) Configuración del sistema<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Permite generar una clave para registrar el http://www.facebook.com/devices, para activar la configuracion del programa.<br>
(1) NewsFeed<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Permite obtener las últimas N noticias y las guarda en un archivo de texto.<br>
(2) Wall<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Permite obtener las últimas N publicaciones de tu muro y las guarda en un archivo de texto.<br>
(3) Publicar estado<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Publica un mensaje en tu muro.<br>
(4) Publicar link<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Publica un link en tu muro.<br>
(5) Salir<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Cierra el programa.<br>
