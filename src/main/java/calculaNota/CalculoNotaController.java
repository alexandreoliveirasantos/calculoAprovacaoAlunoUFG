package calculaNota;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import calculaNota.CalculodeNotaModel;

@WebServlet(value = "/resultado")
public class CalculoNotaController extends HttpServlet{
	 @Override
	  protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    //Preparação dos parâmetros.
		    String nome = request.getParameter("nome");
		    String frequenciaStr = request.getParameter("frequencia");
		    float frequencia = frequenciaStr == null || frequenciaStr.isEmpty()? 0 : Float.parseFloat(frequenciaStr);
		    String notaFinalStr = request.getParameter("notaFinal");
		    float notaFinal = notaFinalStr == null || notaFinalStr.isEmpty()? 0 : Float.parseFloat(notaFinalStr);

		    //Chamada ao Model.
		    String resultado = CalculodeNotaModel.calculaResultado(nome, frequencia, notaFinal);

		    //Passagem de atributos para o JSP.
		    request.setAttribute("resultadoFinal", resultado);

		    //Chamando o JSP.
		    String nextJsp = "/resultadoFinalView.jsp";
		    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJsp);
		    dispatcher.forward(request, response);
	 }
	
}
