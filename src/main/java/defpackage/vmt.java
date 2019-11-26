package defpackage;

import android.os.RemoteException;

/* renamed from: vmt */
final class vmt extends xto {
    private final /* synthetic */ tar a;
    private final /* synthetic */ aoqb b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ vmq e;

    vmt(vmq vmq, String str, tar tar, aoqb aoqb, String str2, String str3) {
        this.e = vmq;
        this.a = tar;
        this.b = aoqb;
        this.c = str2;
        this.d = str3;
        super(str);
    }

    public final /* bridge */ /* synthetic */ Object a() {
        tas a;
        vmq vmq = this.e;
        tar tar = this.a;
        aoqb aoqb = this.b;
        String str = this.c;
        String str2 = this.d;
        if (aoqb != null) {
            aopx aopx = aoqb.b;
            if (aopx == null) {
                aopx = aopx.c;
            }
            int a2 = aopw.a(aopx.b);
            if (a2 != 0 && a2 == 4) {
                a = tar.a(vmq.c, vmq.a, false);
                a.a(str, str2);
                return a;
            }
        }
        a = tar.a(vmq.c, vmq.a);
        try {
            a.a(str, str2);
        } catch (RemoteException unused) {
        }
        return a;
    }
}
