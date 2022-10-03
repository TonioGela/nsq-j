package com.sproutsocial.nsq;

public interface BalanceStrategy {

    /**
     * @throws NSQException When there are no more available connections.  Should be escalated to the user of the library
     */
    ConnectionDetails getConnectionDetails() throws NSQException;

    void connectionClosed(PubConnection closedCon);

    int getFailoverDurationSecs();

    void setFailoverDurationSecs(int failoverDurationSecs);
}