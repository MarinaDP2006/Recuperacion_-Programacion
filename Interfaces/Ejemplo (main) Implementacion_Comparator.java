public static void main(String[] args) {
  
ArrayList<Alumno> alumnos = new ArrayList<>();
alumnos.add(new Alumno("Pep", "222A", 25));
alumnos.add(new Alumno("Tom", "111A", 20));
alumnos.add(new Alumno("Jon", "444A", 21));
alumnos.add(new Alumno("Tim", "333A", 19));
  
Collections.sort(alumnos, new AlumnoPorEdadComparator());
System.out.println("Alumnos ordenados por edad");
System.out.println(alumnos);
  
Collections.sort(alumnos, new AlumnoPorNiaComparator());
System.out.println("Alumnos ordenados por NIA");
System.out.println(alumnos);
