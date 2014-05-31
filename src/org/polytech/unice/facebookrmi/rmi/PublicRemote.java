package org.polytech.unice.facebookrmi.rmi;

import java.rmi.Remote;

/**
 * Created by Mortadha on 31/05/14.
 */
public interface PublicRemote extends Remote {
    public void friendRequest(PublicRemote remote);

    public void acceptFrientRequest(PrivateRemote remote);

    public Profile getPublicProfile();
}
