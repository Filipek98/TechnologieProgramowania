
 package eu.jpereira.trainings.designpatterns.structural.facade.model;

/**
 * @author jpereira
 *
 */
public class DispatchReceipt {
	Order order;

	public DispatchReceipt() {
	}

	public DispatchReceipt(Order order) {
		this.order = order;
	}

}