package eu.jpereira.trainings.designpatterns.creational.factorymethod;

public class PDFReportFactory implements ReportFactory{

	ReportData data;
	PDFReport pdfReport;
	
	public PDFReportFactory(ReportData data) {
		this.data=data;
		createReport();
	}
	
	@Override
	public Report createReport() {
		// TODO Auto-generated method stub
		pdfReport=new PDFReport();
		pdfReport.generateReport(data);
		return pdfReport;
	}

}
