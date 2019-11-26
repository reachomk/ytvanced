package defpackage;

import java.util.List;

/* renamed from: iut */
final class iut implements Runnable {
    private final /* synthetic */ List a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;
    private final /* synthetic */ iup d;

    iut(iup iup, List list, int i, int i2) {
        this.d = iup;
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    public final void run() {
        Object obj;
        iup iup = this.d;
        List list = this.a;
        int i = this.b;
        int i2 = this.c;
        azhe azhe = (azhe) list.get(i);
        akpk akpk = iup.a;
        Object obj2 = akpk.get(iup.e + i2);
        if (azhe.a == 122814739) {
            obj = (azhw) azhe.b;
        } else {
            obj = azhw.n;
        }
        akpk.a(obj2, obj);
        if (iup.a(azhe) && i < list.size() - 1) {
            akpk akpk2 = iup.a;
            akpk2.a(akpk2.get((i2 + 1) + iup.e), new ivy());
        }
    }
}
