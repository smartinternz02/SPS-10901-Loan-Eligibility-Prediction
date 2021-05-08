package org.ml;
import java.io.IOException;

import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.HistogramTrace;

public class DataAnalysis {

	public static void main(String[] args) {
		try {
			Table bank_data = Table.read().csv("M:\\Oracle\\org.ml\\src\\main\\java\\org\\ml\\train_u6lujuX_CVtuZ9i.csv");
			System.out.println(bank_data.shape());
			System.out.println(bank_data.first(7));
			System.out.println(bank_data.structure());
			System.out.println(bank_data.summary());
			
			
			
			Layout layout1 = Layout.builder().title("Distribution of age").build();
			HistogramTrace trace1 = HistogramTrace.builder(bank_data.nCol("ApplicantIncome")).build();
			Plot.show(new Figure(layout1,trace1));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
