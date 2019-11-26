package defpackage;

import org.chromium.net.AndroidCellularSignalStrength;

/* renamed from: bciq */
public final class bciq implements Runnable {
    private final /* synthetic */ AndroidCellularSignalStrength a;

    public bciq(AndroidCellularSignalStrength androidCellularSignalStrength) {
        this.a = androidCellularSignalStrength;
    }

    public final void run() {
        bcir bcir = new bcir(this.a);
    }
}
