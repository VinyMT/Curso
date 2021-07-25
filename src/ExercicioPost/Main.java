package ExercicioPost;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando para a Nova Zel�ndia", "Eu vou visitar esse pa�s maravilhoso", 12);
		
		Comentario comentario1 = new Comentario("Tenha uma boa viagem");
		post1.addComentario(comentario1);
		Comentario comentario2 = new Comentario("Wow, isso � incr�vel!");
		post1.addComentario(comentario2);
		
		Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Boa noite galera", "Vejo voc�s amanh�", 5);
		
		Comentario comentario3 = new Comentario("Boa noite");
		post2.addComentario(comentario3);
		Comentario comentario4 = new Comentario("Que a for�a esteja com voc�");
		post2.addComentario(comentario4);
		
		System.out.println(post1.getTitulo());
		System.out.println(post1.getLikes() + " Likes - " + sdf.format(post1.getMoment()));
		System.out.println(post1.getConteudo());
		System.out.println("Coment�rios: ");
		
		for(int i = 0; i < post1.getComentarios().size(); i++) {
			System.out.println(post1.getComentarios().get(i).getTexto());
		}
		
		System.out.println("");
		
		System.out.println(post2.getTitulo());
		System.out.println(post2.getLikes() + " Likes - " + sdf.format(post2.getMoment()));
		System.out.println(post2.getConteudo());
		System.out.println("Coment�rios: ");
		
		for(int i = 0; i < post2.getComentarios().size(); i++) {
			System.out.println(post2.getComentarios().get(i).getTexto());
		}
		
	}
}
