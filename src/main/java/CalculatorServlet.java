import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/CalculatorServlet")  // This annotation replaces the need for web.xml
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve input numbers and operation
        try {
            double num1 = Double.parseDouble(request.getParameter("num1"));
            double num2 = Double.parseDouble(request.getParameter("num2"));
            String operation = request.getParameter("operation");

            double result = 0;

            switch (operation) {
                case "add":
                    result = num1 + num2;
                    break;
                case "subtract":
                    result = num1 - num2;
                    break;
                case "multiply":
                    result = num1 * num2;
                    break;
                case "divide":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        out.println("<h3>Error: Division by zero is not allowed.</h3>");
                        return;
                    }
                    break;
                default:
                    out.println("<h3>Error: Invalid operation selected.</h3>");
                    return;
            }

            // Display the result
            out.println("<html><body>");
            out.println("<h1>Calculation Result</h1>");
            out.println("<p>Result: " + result + "</p>");
            out.println("<a href='index.jsp'>Go Back</a>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            out.println("<h3>Error: Please enter valid numbers.</h3>");
            out.println("<a href='index.jsp'>Go Back</a>");
        }
    }
}
