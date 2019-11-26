package com.google.mediapipe.framework;

public interface TextureReleaseCallback {
    void release(GlSyncToken glSyncToken);
}
