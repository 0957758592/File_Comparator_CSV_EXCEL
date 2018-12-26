package file.comparator.entity;

public class FileExcel {
    private String fileName;
    private String fileType;
    private String filePath;
    private long fileSize;
    private int rowNumber;
    private int columnNumber;
    private int sheetIndex;

    public FileExcel(String fileName, String fileType, String filePath, long fileSize, int rowNumber, int columnNumber, int sheetIndex) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.filePath = filePath;
        this.fileSize = fileSize;
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.sheetIndex = sheetIndex;
    }

    public FileExcel(){

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

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public void setColumnNumber(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    public int getSheetIndex() {
        return sheetIndex;
    }

    public void setSheetIndex(int sheetIndex) {
        this.sheetIndex = sheetIndex;
    }

    @Override
    public String toString() {
        return "FileExcel{" +
                "fileName='" + fileName + '\'' +
                ", fileType='" + fileType + '\'' +
                ", filePath='" + filePath + '\'' +
                ", fileSize=" + fileSize +
                ", rowNumber=" + rowNumber +
                ", columnNumber=" + columnNumber +
                ", sheetIndex=" + sheetIndex +
                '}';
    }
}
