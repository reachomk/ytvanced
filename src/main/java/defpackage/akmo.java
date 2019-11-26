package defpackage;

import android.net.Uri;

/* renamed from: akmo */
abstract class akmo implements wyi {
    private final bxh a;
    private final zq b;

    akmo(bxh bxh, zq zqVar) {
        this.a = bxh;
        this.b = zqVar;
    }

    public abstract bvw a(afmc afmc);

    public abstract boolean a(bvw bvw);

    public final void a() {
        this.a.a();
    }

    public final /* synthetic */ void a(Object obj, Object obj2) {
        obj = (Uri) obj;
        afmc afmc = (afmc) obj2;
        if (obj != null && afmc != null) {
            bvw a = a(afmc);
            if (a != null) {
                this.a.b((bsm) this.b.a(obj), a);
            }
        }
    }
}
