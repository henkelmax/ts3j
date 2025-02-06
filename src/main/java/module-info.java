open module com.github.manevolent.ts3j {
    requires java.base;
    requires org.bouncycastle.provider;
    requires org.apache.commons.lang3;
    requires org.dnsjava;
    requires ini4j;

    exports Punisher.NaCl;
    exports Punisher.NaCl.Internal;
    exports Punisher.NaCl.Internal.Ed25519Ref10;
    exports com.github.manevolent.ts3j.api;
    exports com.github.manevolent.ts3j.audio;
    exports com.github.manevolent.ts3j.command;
    exports com.github.manevolent.ts3j.command.parameter;
    exports com.github.manevolent.ts3j.command.response;
    exports com.github.manevolent.ts3j.enums;
    exports com.github.manevolent.ts3j.event;
    exports com.github.manevolent.ts3j.identity;
    exports com.github.manevolent.ts3j.license;
    exports com.github.manevolent.ts3j.protocol;
    exports com.github.manevolent.ts3j.protocol.client;
    exports com.github.manevolent.ts3j.protocol.header;
    exports com.github.manevolent.ts3j.protocol.packet;
    exports com.github.manevolent.ts3j.protocol.packet.fragment;
    exports com.github.manevolent.ts3j.protocol.packet.handler;
    exports com.github.manevolent.ts3j.protocol.packet.handler.client;
    exports com.github.manevolent.ts3j.protocol.packet.statistics;
    exports com.github.manevolent.ts3j.protocol.packet.transformation;
    exports com.github.manevolent.ts3j.protocol.socket;
    exports com.github.manevolent.ts3j.protocol.socket.client;
    exports com.github.manevolent.ts3j.protocol.socket.server;
    exports com.github.manevolent.ts3j.util;
}
