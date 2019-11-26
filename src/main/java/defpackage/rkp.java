package defpackage;

import android.os.RemoteException;

/* renamed from: rkp */
public final class rkp {
    public int a;
    public int b;
    private final byte[] c;
    private final /* synthetic */ rkn d;

    public final synchronized void a() {
        try {
            rkn rkn = this.d;
            if (rkn.b) {
                rkn.a.a(this.c);
                this.d.a.a(this.a);
                this.d.a.b(this.b);
                this.d.a.b();
                this.d.a.a();
            }
        } catch (RemoteException unused) {
        }
    }

    /* synthetic */ rkp(rkn rkn, byte[] bArr) {
        this.d = rkn;
        this.c = bArr;
    }
}
