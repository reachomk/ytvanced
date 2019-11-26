package defpackage;

/* renamed from: zf */
abstract class zf implements yy {
    private final zc a;

    zf(zc zcVar) {
        this.a = zcVar;
    }

    public abstract boolean a();

    public final boolean a(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        zc zcVar = this.a;
        if (zcVar == null) {
            return a();
        }
        int a = zcVar.a(charSequence, i);
        if (a != 0) {
            return a != 1 ? a() : false;
        } else {
            return true;
        }
    }
}
