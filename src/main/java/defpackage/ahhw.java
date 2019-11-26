package defpackage;

import android.text.TextUtils;

/* renamed from: ahhw */
final /* synthetic */ class ahhw implements bcvk {
    private final ahhu a;

    ahhw(ahhu ahhu) {
        this.a = ahhu;
    }

    public final void a(Object obj) {
        ahhu ahhu = this.a;
        ajpu ajpu = ((ahkq) obj).b;
        if (ahhu.c != null && TextUtils.equals(ajpu.Q(), ahhu.c.a)) {
            acxt acxt = (acxt) ajpu.Y().get();
            if (acxt != null) {
                acxt.a(ahhu.c.b);
            }
        }
        ahhu.c = null;
    }
}
