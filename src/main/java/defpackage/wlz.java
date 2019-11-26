package defpackage;

/* renamed from: wlz */
public final class wlz implements akmw {
    public final Object a;
    public long b;

    public wlz(Object obj, long j) {
        this.a = obj;
        this.b = j;
    }

    public wlz(Object obj) {
        this(obj, 0);
    }

    public final akmw a(akmw akmw) {
        if (akmw instanceof wlz) {
            wlz wlz = (wlz) akmw;
            wlz.b = Math.max(this.b, wlz.b);
        }
        return akmw;
    }
}
