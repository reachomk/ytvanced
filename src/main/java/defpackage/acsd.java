package defpackage;

/* renamed from: acsd */
public final /* synthetic */ class acsd implements Runnable {
    private final acrz a;
    private final zos b;
    private final znq c;
    private final boolean d;
    private final String e;

    public acsd(acrz acrz, zos zos, znq znq, boolean z, String str) {
        this.a = acrz;
        this.b = zos;
        this.c = znq;
        this.d = z;
        this.e = str;
    }

    public final void run() {
        acrz acrz = this.a;
        zos zos = this.b;
        znq znq = this.c;
        boolean z = this.d;
        String str = this.e;
        synchronized (acrz.q) {
            if (acrz.p) {
                return;
            }
            acrz.m.a(acrz.c, zos, znq, z, str);
        }
    }
}
