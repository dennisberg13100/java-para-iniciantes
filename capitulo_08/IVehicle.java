interface IVehicle {
    // Retorna a autonomia
    int range();

    // Calcula o combustível necessário para percorrer uma determinada distância
    double fuelneeded(int miles);

    // Acessa métodos de variáveis de instância
    int getPassengers();
    void setPassengers(int passengers);
    int getFuelCap();
    void setFuelCap(int fuelCap);
    int getMpg();
    void setMpg(int mpg);
}