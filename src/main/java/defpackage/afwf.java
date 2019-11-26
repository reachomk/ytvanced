package defpackage;

import java.util.Set;

/* renamed from: afwf */
final /* synthetic */ class afwf implements Runnable {
    private final Set a;
    private final atun b;
    private final atur c;

    afwf(Set set, atun atun, atur atur) {
        this.a = set;
        this.b = atun;
        this.c = atur;
    }

    public final void run() {
        Set<afxc> set = this.a;
        atun atun = this.b;
        atur atur = this.c;
        for (afxc a : set) {
            a.a(atun, atur);
        }
    }
}
