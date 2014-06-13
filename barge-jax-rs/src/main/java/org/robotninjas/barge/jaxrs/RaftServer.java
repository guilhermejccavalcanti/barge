package org.robotninjas.barge.jaxrs;

/**
 */
public interface RaftServer<S extends RaftServer<S>> {

  S start(int port);

  void stop(int timeoutInMs);

}
