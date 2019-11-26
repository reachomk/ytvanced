package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: zov */
public final /* synthetic */ class zov implements OnClickListener {
    private final zos a;
    private final zjt b;

    public zov(zos zos, zjt zjt) {
        this.a = zos;
        this.b = zjt;
    }

    public final void onClick(View view) {
        zos zos = this.a;
        zjt zjt = this.b;
        zos.d(zjt.a);
        String str = zjt.a;
        if (str != null) {
            uit uit = zos.h;
            if (uit != null) {
                uit.a(str);
            }
        }
        zon zon = zos.g;
        if (zon != null) {
            zon.f();
        }
    }
}
