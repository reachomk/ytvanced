package com.google.mediapipe.framework;

public interface GlSyncToken {
    void release();

    void waitOnCpu();

    void waitOnGpu();
}
