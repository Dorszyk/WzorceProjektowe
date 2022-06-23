package strukturalne.facade.ex2;

public class NoOpEncryptor implements Encryptor {
    @Override
    public String encrypt(final String toEncrypt) {
        return toEncrypt;
    }
}
