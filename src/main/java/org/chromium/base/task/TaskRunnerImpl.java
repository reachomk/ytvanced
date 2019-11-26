package org.chromium.base.task;

import defpackage.bcin;

public class TaskRunnerImpl implements bcin {
    private native void nativeDestroy(long j);

    private native long nativeInit(int i, boolean z, int i2, boolean z2, byte b, byte[] bArr);

    private native void nativePostDelayedTask(long j, Runnable runnable, long j2);

    public final void a() {
        throw null;
    }

    public native boolean nativeBelongsToCurrentThread(long j);
}
