
package ca.sait.calculators.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Madhu
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

       
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String fInput = request.getParameter("Farithmetic");
            int fNumber  = Integer.parseInt(fInput);
            String sInput = request.getParameter("Sarithmetic");
            int sNumber  = Integer.parseInt(sInput);
            
            String result = "";
            
            switch("calculation"){
                case "add": result = Integer.toString(fNumber + sNumber);
                    break;
                case "sub": result = Integer.toString(fNumber - sNumber);
                    break;
                case "mul": result = Integer.toString(fNumber * sNumber);
                    break;
                case "mod": result = Integer.toString(fNumber / sNumber);
                    break;
               default: result = "---";
                    break;
            }
            request.setAttribute("Farithmetic", fNumber);
            request.setAttribute("Sarithmetic", sNumber);
            request.setAttribute("output", result);
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}

    