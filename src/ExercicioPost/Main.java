package ExercicioPost;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Post post1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando para a Nova Zelândia", "Eu vou visitar esse país maravilhoso", 12);
		
		Comentario comentario1 = new Comentario("Tenha uma boa viagem");
		post1.addComentario(comentario1);
		Comentario comentario2 = new Comentario("Wow, isso é incrível!");
		post1.addComentario(comentario2);
		
		Post post2 = new Post(sdf.parse("28/07/2018 23:14:19"), "Boa noite galera", "Vejo vocês amanhã", 5);
		
		Comentario comentario3 = new Comentario("Boa noite");
		post2.addComentario(comentario3);
		Comentario comentario4 = new Comentario("Que a força esteja com você");
		post2.addComentario(comentario4);
		
		System.out.println(post1.getTitulo());
		System.out.println(post1.getLikes() + " Likes - " + sdf.format(post1.getMoment()));
		System.out.println(post1.getConteudo());
		System.out.println("Comentários: ");
		
		for(int i = 0; i < post1.getComentarios().size(); i++) {
			System.out.println(post1.getComentarios().get(i).getTexto());
		}
		
		System.out.println("");
		
		System.out.println(post2.getTitulo());
		System.out.println(post2.getLikes() + " Likes - " + sdf.format(post2.getMoment()));
		System.out.println(post2.getConteudo());
		System.out.println("Comentários: ");
		
		for(int i = 0; i < post2.getComentarios().size(); i++) {
			System.out.println(post2.getComentarios().get(i).getTexto());
		}
		
	}
}
