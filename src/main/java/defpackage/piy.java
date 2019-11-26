package defpackage;

import android.os.IBinder;

/* renamed from: piy */
public final class piy implements pik {
    private final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public piy(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        rkc a = rkb.a(iBinder);
        pid pid = new pid();
        pid.b = this.a;
        pid.a = this.b;
        return ((pig) pih.a(a.a(pid))).a;
    }
}
