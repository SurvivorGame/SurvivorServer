package com.survivor.server;

import com.survivor.servermodel.LoginData;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by sxf on 15-2-17.
 */
public interface IGameService extends Remote {
    public LoginData Login() throws RemoteException;
}
