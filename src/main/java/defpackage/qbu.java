package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: qbu */
abstract class qbu extends qbs {
    private static final WeakReference b = new WeakReference(null);
    private WeakReference a = b;

    qbu(byte[] bArr) {
        super(bArr);
    }

    public abstract byte[] d();

    /* Access modifiers changed, original: final */
    public final byte[] c() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.a.get();
            if (bArr == null) {
                bArr = d();
                this.a = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
