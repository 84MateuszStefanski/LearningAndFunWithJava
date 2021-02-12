package wzorceprojektowe.strukturalne.facade.secondexample;

public class NoOpEncryptor implements Encryptor {
    @Override
    public String encrypt(final String toEncrypt) {
        return toEncrypt;
    }
}
