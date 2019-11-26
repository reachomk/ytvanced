package org.chromium.base;

public interface Callback {

    public abstract class Helper {
        static void onObjectResultFromNative(Callback callback, Object obj) {
            callback.a();
        }

        static void onBooleanResultFromNative(Callback callback, boolean z) {
            callback.a();
        }

        static void onIntResultFromNative(Callback callback, int i) {
            callback.a();
        }

        static void runRunnable(Runnable runnable) {
            runnable.run();
        }
    }

    void a();
}
