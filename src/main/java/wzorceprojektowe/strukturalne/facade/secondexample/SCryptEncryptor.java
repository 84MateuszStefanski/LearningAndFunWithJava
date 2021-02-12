package wzorceprojektowe.strukturalne.facade.secondexample;

public class SCryptEncryptor implements Encryptor{
    @Override
    public String encrypt(final String toEncrypt) {
        return "encrypting " + toEncrypt + "with SCrypt";
    }
}
