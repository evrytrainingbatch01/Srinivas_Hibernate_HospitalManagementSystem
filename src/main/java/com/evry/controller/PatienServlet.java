package com.evry.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.evry.dao.PatientDao;
import com.evry.daoimpl.PatientDaoImpl;
import com.evry.model.Patient;

/**
 * Servlet implementation class PatienServlet
 */
public class PatienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Patient patiObj = new Patient();
	PatientDaoImpl patDaoImp = new PatientDaoImpl();
	PatientDao dao;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		if (request.getParameter("addPatient") != null) {
			String pname = request.getParameter("pname");
			int age = Integer.parseInt(request.getParameter("age"));
			String bgroup = request.getParameter("Bgroup");
			String checkup = request.getParameter("checkup");
			String doctors = request.getParameter("doctors");
			String testcase = request.getParameter("testcase");

			patiObj.setPname(pname);
			patiObj.setAge(age);
			patiObj.setBgroup(bgroup);
			patiObj.setCheckup(checkup);
			patiObj.setDoctors(doctors);
			patiObj.setTestcase(testcase);

			patDaoImp.addPatient(patiObj);
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);

			out.print("successfully row inserted");
		}
	}
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("showPatients")!=null) {
		List<Patient> patientList = new ArrayList();
        patientList=patDaoImp.getAllPatients();
        request.setAttribute("patientList", patientList);
        RequestDispatcher rd = request.getRequestDispatcher("ShowAll.jsp");
        rd.forward(request, response);
		}
}
}
