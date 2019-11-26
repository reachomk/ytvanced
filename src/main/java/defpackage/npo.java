package defpackage;

import android.net.Uri;

/* renamed from: npo */
public final class npo extends npm {
    public final Uri g;
    public final long h;
    public final npj i;
    private final npg j;

    public npo(String str, long j, nom nom, npu npu, String str2, long j2, String str3) {
        npj npj;
        npu npu2 = npu;
        super(str, j, nom, str3, npu, str2);
        this.g = Uri.parse(str3);
        long j3 = npu2.e;
        npg npg = null;
        if (j3 > 0) {
            npj npj2 = new npj(null, npu2.d, j3);
        } else {
            npj = null;
        }
        this.i = npj;
        this.h = j2;
        if (this.i == null) {
            npg = new npg(new npj("", 0, j2));
        }
        this.j = npg;
    }

    public final npj c() {
        return this.i;
    }

    public final npa d() {
        return this.j;
    }
}
