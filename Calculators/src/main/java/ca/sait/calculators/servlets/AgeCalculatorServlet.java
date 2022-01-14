
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
public class AgeCalculatorServlet extends HttpServlet {
   
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
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
         
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
        int age;
        try
        {
        if (request.getParameter("age") != null)
        {             
            String ageInput = request.getParameter("age");
            age = Integer.parseInt(ageInput);
            int ageNextBirthday = age + 1;
            // to send a response back and include in the servlet
            request.setAttribute("message", "Your age next birthday will be  " + ageNextBirthday);
        }
                
        else 
        {
            request.setAttribute("message", "You must give your current age.");
        } 
                   
        } catch (Exception ex){
            
            request.setAttribute("message", "You must enter a number");
                    
                }
        
                 
        
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
}
