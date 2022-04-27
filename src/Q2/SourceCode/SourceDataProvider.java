package Q2.SourceCode;

public class SourceDataProvider implements DataProviderInterface {
    private String fileType;
    public SourceDataProvider(String fileType) {
        this.fileType = fileType;
    }
    public String provideXMLFile() {
        return this.fileType;
    }
}
