/* 
Para conectar con una BD en MySQL debemos realizar la conexión a través del método
getConnection de la clase DriverManager. El método recibe 3 parámetros:
  ● Usuario
  ● Contraseña
  ● URL de nuestra BD a través del conector
*/
  try {
  String user = "root";
  String pwd = "";
  String url = "jdbc:MySQL://localhost/agenda";
  Connection conex = DriverManager.getConnection(url,user,pwd);
} catch (SQLException e) { 
    System.out.println(e); 
}

// Ejemplo de consulta sobre MySQL
try {

String user = "root";
String pwd = "";
String url = "jdbc:MySQL://localhost/agenda";

Connection conex = DriverManager.getConnection(url,user,pwd);

String query = "SELECT nombre, correo FROM contacto"; // Consulta
Statement instruccion = (Statement)conex.createStatement();
ResultSet resultado = instruccion.executeQuery(query); // Resultado de la consulta

    while(resultado.next()) 
    {
  String nombre = resultado.getString("nombre");
  String correo = resultado.getString("correo");
  System.out.println("NOMBRE: " + nombre);
  System.out.println("CORREO: " + correo);
}
  } catch (SQLException e) { 
    System.out.println(e); 
}

// Ejemplo INSERT
try {
  String user = "root";
  String pwd = "";
  String url = "jdbc:MySQL://localhost/agenda";

  Connection conex = DriverManager.getConnection(url,user,pwd);
  String query = "INSERT INTO contacto VALUES ('pepe', 'pepe@pepe.com')"; // Consulta

  Statement instruccion = (Statement)conex.createStatement();
  instruccion.executeUpdate(query); // Ejecución INSERT

} catch (SQLException e) { 
  System.out.println(e); 
}







