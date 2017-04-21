package pjsf1.jsf.exos;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class MBInject implements Serializable {

	@Inject
	private MBInjected mBInjected;

	private static final long serialVersionUID = 1L;
	private String data = "data from inject";

	public void setData(String data) {
		this.data = data;
	}

	public String getData() {
		mBInjected.show();

		return data + " - " + mBInjected.getDataInjected();

	}

}
