package cs665.common;

public class CertificateProgram extends Program {

    public CertificateProgram(String name) {
        super(name, 0, 0, 4, false);
    }

    @Override
    public String getProgramType() {
        return "Certificate";
    }
}