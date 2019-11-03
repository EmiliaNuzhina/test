package com.test.controller

import java.net.URI
import javax.websocket.*
import com.test.handlers.MessageHandler

@ClientEndpoint
class WebsocketClient(endpointURI: URI) {

    private var userSession: Session? = null
    private var container: WebSocketContainer = ContainerProvider.getWebSocketContainer()

    init {
        container.connectToServer(this, endpointURI)
    }

    @OnOpen
    fun onOpen(userSession: Session) {
        this.userSession = userSession
    }

    @OnClose
    fun onClose(userSession: Session, reason: CloseReason) {
        println("${reason.reasonPhrase} ${reason.closeCode}")
        this.userSession = null
    }

    @OnMessage
    fun onMessage(message: String) {
        MessageHandler(message)
    }
}