package org.chromium.base;

import android.os.Handler;
import android.os.HandlerThread;
import defpackage.bchr;
import defpackage.bchs;
import defpackage.bcht;
import java.lang.Thread.State;

public class JavaHandlerThread {
    public final HandlerThread a;
    public Throwable b;

    private JavaHandlerThread(String str, int i) {
        this.a = new HandlerThread(str, i);
    }

    public native void nativeInitializeThread(long j, long j2);

    public native void nativeOnLooperStopped(long j);

    private static JavaHandlerThread create(String str, int i) {
        return new JavaHandlerThread(str, i);
    }

    private void startAndInitialize(long j, long j2) {
        if (this.a.getState() == State.NEW) {
            this.a.start();
        }
        new Handler(this.a.getLooper()).post(new bchs(this, j, j2));
    }

    private void quitThreadSafely(long j) {
        new Handler(this.a.getLooper()).post(new bchr(this, j));
        this.a.getLooper().quitSafely();
    }

    private void joinThread() {
        Object obj = null;
        while (obj == null) {
            try {
                this.a.join();
                obj = 1;
            } catch (InterruptedException unused) {
            }
        }
    }

    private boolean isAlive() {
        return this.a.isAlive();
    }

    private void listenForUncaughtExceptionsForTesting() {
        this.a.setUncaughtExceptionHandler(new bcht(this));
    }

    private Throwable getUncaughtExceptionIfAny() {
        return this.b;
    }
}
