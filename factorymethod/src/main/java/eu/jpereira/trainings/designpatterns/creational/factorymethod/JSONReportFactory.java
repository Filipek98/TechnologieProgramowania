package eu.jpereira.trainings.designpatterns.creational.factorymethod;

public class JSONReportFactory implements ReportFactory {

	ReportData data;
	JSONReport jsonReport;
	
	public JSONReportFactory(ReportData data) {
		this.data=data;
		createReport();
	}
	
	@Override
	public Report createReport() {
		// TODO Auto-generated method stub
		jsonReport=new JSONReport();
		jsonReport.generateReport(data);
		return jsonReport;
	}

}
