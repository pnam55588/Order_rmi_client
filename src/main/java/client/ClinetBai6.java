package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import rmi.service.DaoService;

public class ClinetBai6 {
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		DaoService dao = (DaoService) Naming.lookup("rmi://localhost:7878/daoService");
		System.out.println(dao.findByID(1, 1));
	}
}
