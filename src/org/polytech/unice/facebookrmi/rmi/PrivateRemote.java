package org.polytech.unice.facebookrmi.rmi;

import java.rmi.Remote;
import java.util.List;

/**
 * Created by Mortadha on 31/05/14.
 */
public interface PrivateRemote extends Remote {

    public List<String> getAllPosts();

    public String getLastPost();

    public void notifySomethingPosted(PrivateRemote remote);

    public List<PublicRemote> getFriendCircle();


}
