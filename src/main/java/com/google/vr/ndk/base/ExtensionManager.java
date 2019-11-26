package com.google.vr.ndk.base;

import defpackage.bakj;

public interface ExtensionManager {
    void onPause();

    void onResume();

    void reportTelemetry(bakj bakj);

    void setEnabled(boolean z);

    void shutdown();
}
