package defpackage;

import android.net.Uri;
import java.io.File;

/* renamed from: amjf */
public final class amjf {
    private final amez a;
    private final atlx b;

    public amjf(amez amez, atlx atlx) {
        this.a = amez;
        this.b = atlx;
    }

    public final azyl a(amea amea, amex amex) {
        amev a;
        amec amec = amea.m;
        if (amec == null) {
            amec = amec.g;
        }
        int a2 = amee.a(amec.b);
        if (a2 == 0 || a2 != 2) {
            a = this.a.a(Uri.parse(amea.d), amex);
        } else {
            a = this.a.a(Uri.parse(amea.l), amex);
        }
        File a3 = amjq.a(amea);
        amdl amdl = amea.n;
        if (amdl == null) {
            amdl = amdl.h;
        }
        amji amji = new amji(amdl, a, a3);
        amey a4 = amji.a();
        if (this.b.g && a4.a()) {
            return new amjk(amji, a4);
        }
        int i = !this.b.f ? 1048576 : 4194304;
        if (a4.a()) {
            return new azyu(a4, a4.b(), i);
        }
        return new amjh(a4, i);
    }
}
