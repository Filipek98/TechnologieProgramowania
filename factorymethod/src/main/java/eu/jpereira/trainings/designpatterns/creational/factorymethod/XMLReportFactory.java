package eu.jpereira.trainings.designpatterns.creational.factorymethod;

public class XMLReportFactory implements ReportFactory{

	ReportData data;
	XMLReport xmlReport;
	
	public XMLReportFactory(ReportData data) {
		this.data=data;
		createReport();
	}
	
	@Override
	public Report createReport() {
		// TODO Auto-generated method stub
		xmlReport=new XMLReport();
		xmlReport.generateReport(data);
		return xmlReport;
	}

}
