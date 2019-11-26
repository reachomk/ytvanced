package defpackage;

import java.io.File;

/* renamed from: bxe */
public class bxe implements bwv {
    private final long a;
    private final bxd b;

    public bxe(bxd bxd, long j) {
        this.a = j;
        this.b = bxd;
    }

    public final bww a() {
        File a = this.b.a();
        if (a == null) {
            return null;
        }
        if (a.mkdirs() || (a.exists() && a.isDirectory())) {
            return new bxg(a, this.a);
        }
        return null;
    }
}
