ArrayList<String> ciudades = new ArrayList<String>();
ciudades.add("New York");
ciudades.add("Tokyo");
ciudades.add("París");
System.out.print("Ciudades: ");
  Iterator<String> it = ciudades.iterator();
    it.remove(); // IllegalStateException
while(it.hasNext()) {
  System.out.println(it.next());
}

ArrayList<String> ciudades = new ArrayList<String>();
ciudades.add("New York");
ciudades.add("Tokyo");
ciudades.add("París");
System.out.print("Ciudades: ");
  Iterator<String> it = ciudades.iterator();
it.next();
it.remove();
  while(it.hasNext()) {
    System.out.print(it.next() + " ");
} // Ciudades: Tokyo París
