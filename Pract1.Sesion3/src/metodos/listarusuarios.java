package metodos;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listarusuarios")
public class listarusuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			ArrayList<Usuario> profesores = new ArrayList<Usuario> ();
	Usuario user1 = new Usuario ("José Manuel","Pérez Lorenzo", "jmperez@ujaen.es");
	Usuario user2 = new Usuario ("Alonso","Ruano Ruano","alonso@ujaen.es");
	Usuario user3 = new Usuario ("José Enrique","Muñoz Expósito","jemunoz@ujaen.es");
	profesores.add(user1);
	profesores.add(user2);
	profesores.add(user3);
	request.setAttribute("profesores", profesores);
	String url = "/tablausuarios.jsp";
	getServletContext().getRequestDispatcher(url).forward(request, response); 
				}
		}