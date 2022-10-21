public interface MyIF {
    // Essa é uma declaração comum de métodd de uma interface
    int getUserID();

    // Este é um método padrão. Observe que ele fornce uma implementação padrão
    default int getAdminID() {
        return 1;
    }
}