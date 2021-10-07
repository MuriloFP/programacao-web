package atividade_avaliativa;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.function.ToIntFunction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calculadora
 */
@WebServlet("/calculadora")
public class calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter saida = response.getWriter();
    	saida.write("<HTML><BODY>");
    	saida.write("Olá, a soma dos parâmetros recebidos é igual a: <BR>");
    	int soma = 0;
    	
    	Enumeration<String> nomesParametros = request.getParameterNames();
    	
    	while (nomesParametros.hasMoreElements()) {
    		soma = soma + Integer.parseInt(request.getParameter(nomesParametros.nextElement().toString()));
		}
    	saida.println(soma);
    	saida.write("</BODY></HTML>");
    	saida.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
