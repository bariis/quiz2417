package Q2.SourceCode;

public class XMLToJsonAdapter implements LibraryInterface {
    SourceDataProvider sdpXML;

    public XMLToJsonAdapter(SourceDataProvider sdpXML) {
        this.sdpXML = sdpXML;
    }

    public void executeJsonFile() {
        String xml = sdpXML.provideXMLFile();
        // convert XML to JSON.
        // the name of the string will be changed for the purpose of simplicity.
        xml = "JSON";
        System.out.println(sdpXML.provideXMLFile() + " file is converted to " + xml);
    }
}
