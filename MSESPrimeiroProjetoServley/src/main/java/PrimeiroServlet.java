

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeiroServlet
 */
@WebServlet("/PrimeiroServlet")
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimeiroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("").append(" ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		double n1 = Double.parseDouble(request.getParameter("n"));
		double n2 = Double.parseDouble(request.getParameter("n2"));
		String operacao= request.getParameter("operacoes");
		double resultado=0.0;
		
		
		Calcular calcular = new Calcular();
		switch (operacao) {
		case ("+"):
			resultado=calcular.soma(n1, n2);
			break;	
		case ("-"):
			resultado=calcular.subtracao(n1, n2);
			break;
		case ("*"):
			resultado=calcular.multiplicacao(n1, n2);
			break;
		case ("/"):
			resultado=calcular.divisao(n1, n2);
			break;
		}
	
		request.setAttribute("res", resultado); //requestScope – forward

		request.getRequestDispatcher("/").forward(request, response);
		
		
		
		request.getRequestDispatcher("/").forward(request, response);  
		
	}

}
