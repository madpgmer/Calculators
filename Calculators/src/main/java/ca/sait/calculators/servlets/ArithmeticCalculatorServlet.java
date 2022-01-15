
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
        //If no calculation has been performed, then the result should show as "---".
        request.setAttribute("output", "---");
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
        
            String fInput = request.getParameter("fArithmetic");
            String sInput = request.getParameter("sArithmetic");
        try{    
            int fNumber  = Integer.parseInt(fInput);
            int sNumber  = Integer.parseInt(sInput);
                       
            int result= 0;
            int calc;
            
            switch(request.getParameter("calculation")){
                case "add": 
                    result = fNumber + sNumber;
                    break;
                case "sub": 
                    result = fNumber - sNumber;
                    break;
                case "mul": 
                    result = fNumber * sNumber;
                    break;
                case "mod": 
                    result = fNumber / sNumber;
                    break;
            }            
            String finalResult = Integer.toString(result);            
            request.setAttribute("output", "Result: " + finalResult);
            }
            catch (Exception ex){
                request.setAttribute("output", "Result: " + "Invalid" );
            }
             //Ensures the textboxes stay populated with the values they had previously entered
            request.setAttribute("fArithmetic", fInput);
            request.setAttribute("sArithmetic", sInput);      
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}

    