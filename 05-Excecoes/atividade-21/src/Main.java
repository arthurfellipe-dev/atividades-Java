import dominio.Buscador;

void main() {
   Buscador buscador = new Buscador();
   String a = "67 aura", b = "hell nah";
   String[] arrays = {a, b};

   try{
      System.out.println(buscador.buscarElemento(arrays, 2));
   } catch(ArrayIndexOutOfBoundsException | NullPointerException e){
      System.out.println("Erro ao buscar elemento");
   }
}