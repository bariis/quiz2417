package Q2.SourceCode;

import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {
        SourceDataProvider sdpXML = new SourceDataProvider("XML"); // adaptee
        AnalyticsLibrary libJSON = new AnalyticsLibrary(); // target

        // Provider provies XML file.
        System.out.println(sdpXML.provideXMLFile());

        // Library only executes JSON file.
        libJSON.executeJsonFile();


        LibraryInterface adapter = new XMLToJsonAdapter(sdpXML);
        adapter.executeJsonFile();
    }
}
