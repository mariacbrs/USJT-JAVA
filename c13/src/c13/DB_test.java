
package c13;


public class DB_test {

    public static void main(String[] args) {
       DB db = new DB("aula02db");
       db.query("SELECT * FROM Filme");
       while(db.next()) {
         int f_Cod = db.getInt("f_Cod");
         String titulo = db.getString("titulo");
         int ano = db.getInt("ano");
         int g_Cod = db.getInt("g_Cod");
         System.out.println("CODIGO: "+f_Cod+" TITULO: "+titulo + " ANO: "+ano+ " CODIGO DE GENERO: "+ g_Cod);
        }
        db.query("SELECT * FROM Ator");
       while(db.next()) {
         int a_Cod = db.getInt("a_Cod");
         String nome = db.getString("nome");
         int p_Codigo = db.getInt("p_Codigo");
         System.out.println("CODIGO: "+a_Cod+" NOME: "+nome + " CODIGO DO PAIS: "+ p_Codigo);
        }
       
        db.closeConnection();
    }
    
}
