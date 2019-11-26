package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: fno */
public final class fno {
    public final Uri a;
    public final String b;
    public auvn c;
    public boolean d;
    public boolean e;
    public double f;
    public double g;
    public double h;
    public int i;
    public int j = 1;

    public fno(String str, auvn auvn, String str2) {
        this.b = xvd.a(str);
        this.c = (auvn) amqw.a((Object) auvn);
        this.a = !TextUtils.isEmpty(str2) ? Uri.parse(str2) : null;
        this.j = 1;
        this.f = 0.0d;
        this.g = 0.0d;
        this.h = 0.0d;
    }

    public final void a(amec amec) {
        this.i = 0;
        int a = amee.a(amec.b);
        if (a == 0) {
            a = 1;
        }
        a--;
        if (a == 0) {
            a = ayuc.a(amec.c);
            if (a != 0 && a == 8) {
                this.i = 1;
                return;
            }
            int a2 = ayuc.a(amec.c);
            if (a2 != 0 && a2 == 9) {
                this.i = 2;
            }
        } else if (a == 1) {
            this.g = 1.0d;
        } else if (a == 3) {
            this.d = true;
        }
    }

    public final void a() {
        this.e = true;
    }
}
