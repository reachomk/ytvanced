package defpackage;

/* renamed from: caw */
public final class caw implements bzq {
    private static final bsl a = bsl.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(2500));
    private final bzl b;

    public caw() {
        this(null);
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    public caw(bzl bzl) {
        this.b = bzl;
    }

    public final /* synthetic */ bzp a(Object obj, int i, int i2, bsq bsq) {
        bzc bzc = (bzc) obj;
        bzl bzl = this.b;
        if (bzl != null) {
            bzn a = bzn.a(bzc);
            Object b = bzl.a.b(a);
            a.a();
            bzc bzc2 = (bzc) b;
            if (bzc2 == null) {
                bzl = this.b;
                bzl.a.b(bzn.a(bzc), bzc);
            } else {
                bzc = bzc2;
            }
        }
        return new bzp(bzc, new btf(bzc, ((Integer) bsq.a(a)).intValue()));
    }
}
