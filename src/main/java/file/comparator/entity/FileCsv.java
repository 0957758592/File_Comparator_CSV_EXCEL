package file.comparator.entity;

public class FileCsv {

    private String fileName;
    private String fileType;
    private String filePath;
    private String typeSeparator;
    private long fileSize;
    private int firstIndexPosition;
    private int secondIndexPosition;

    public FileCsv(String fileName, String fileType, String filePath, String typeSeparator, long fileSize, int firstIndexPosition, int secondIndexPosition) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.filePath = filePath;
        this.typeSeparator = typeSeparator;
        this.fileSize = fileSize;
        this.firstIndexPosition = firstIndexPosition;
        this.secondIndexPosition = secondIndexPosition;
    }
    public FileCsv(){

    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getTypeSeparator() {
        return typeSeparator;
    }

    public void setTypeSeparator(String typeSeparator) {
        this.typeSeparator = typeSeparator;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public int getFirstIndexPosition() {
        return firstIndexPosition;
    }

    public void setFirstIndexPosition(int firstIndexPosition) {
        this.firstIndexPosition = firstIndexPosition;
    }

    public int getSecondIndexPosition() {
        return secondIndexPosition;
    }

    public void setSecondIndexPosition(int secondIndexPosition) {
        this.secondIndexPosition = secondIndexPosition;
    }

    @Override
    public String toString() {
        return "FileCsv{" +
                "fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                ", filePath='" + filePath + '\'' +
                ", typeSeparator='" + typeSeparator + '\'' +
                ", fileSize=" + fileSize +
                ", firstIndexPosition=" + firstIndexPosition +
                ", secondIndexPosition=" + secondIndexPosition +
                '}';
    }
}
