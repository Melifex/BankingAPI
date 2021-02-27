package dev.lamp.services;

import dev.lamp.models.Client;

import java.util.List;

public interface ClientService
{
    Client createClient(Client client);
    List<Client> getAllClients();

    //Change the Account/Client fields into integers
    //Review doaImpl and serviceImpl

    Client getClientById(int client_id); //client_id
    Client updateClientById(int client_id); //client_id
    boolean deleteClientById(int client_id); //client_id
}
