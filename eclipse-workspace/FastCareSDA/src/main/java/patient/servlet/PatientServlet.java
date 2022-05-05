package patient.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import patient.dao.PatientDao;
import patient.bean.PatientBean;

@WebServlet("/PatientServlet")
public class PatientServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PatientDao PDao;

    public void init() {
        PDao = new PatientDao();
    }
    
    protected void service(HttpServletRequest request, HttpServletResponse   response) throws ServletException, IOException {
        doPost(request, response);
}
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String ID = request.getParameter("ID");
        String username = request.getParameter("username");
        String passcode = request.getParameter("passcode");
        String location = request.getParameter("location");
        String emailAddress = request.getParameter("emailAddress");
        
        PatientBean User = new PatientBean();
        User.setID(ID);
        User.setUsername(username);
        User.setPasscode(passcode);
        User.setLocation(location);
        User.setEmailAddress(emailAddress);
        
       
        try {
            PDao.registerPatient(User);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        response.sendRedirect("patientdetails.jsp");
    }
}