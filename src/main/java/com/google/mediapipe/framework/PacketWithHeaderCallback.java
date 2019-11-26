package com.google.mediapipe.framework;

public interface PacketWithHeaderCallback {
    void process(Packet packet, Packet packet2);
}
