package cs665.creational.factory;

public class ProgramFactory {

    public Program createProgram(String type) {
        switch (type.toUpperCase()) {
            case "BSCS":
                return new BSCSProgram();
            case "BSCIS":
                return new BSCISProgram();
            case "MSCS":
                return new MSCSProgram();
            case "MSCIS":
                return new MSCISProgram();
            case "MSDA":
                return new MSDAProgram();
            case "SECURITY":
                return new SecurityCertificateProgram();
            case "WEB":
                return new WebTechnologyCertificateProgram();
            case "ANALYTICS":
                return new AnalyticsCertificateProgram();
            default:
                throw new IllegalArgumentException("Unknown program type: " + type);
        }
    }
}