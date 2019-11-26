package defpackage;

import java.util.ArrayDeque;

/* renamed from: zqi */
final class zqi {
    public final ArrayDeque a = new ArrayDeque();

    private zqi() {
    }

    public final synchronized void a(xsd xsd) {
        while (!this.a.isEmpty()) {
            xsd.a(this.a.pop());
        }
    }

    /* synthetic */ zqi(byte b) {
    }
}
