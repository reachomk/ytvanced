package defpackage;

import android.text.TextUtils;

/* renamed from: wbu */
public final class wbu extends wao {
    private final vuh a;
    private final vqy b;
    private final vso c;
    private boolean d;
    private boolean e;

    public wbu(vuh vuh, vqy vqy, vso vso) {
        this.a = (vuh) amqw.a((Object) vuh);
        this.b = (vqy) amqw.a((Object) vqy);
        this.c = (vso) amqw.a((Object) vso);
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void a(ahkm ahkm) {
        if (ahkm.g && !this.d) {
            this.a.a(this.b.k());
            this.d = true;
        }
        if (ahkm.g && !this.e && TextUtils.equals(ahkm.h, this.c.j)) {
            int i = (int) ahkm.a;
            int f = this.c.f() * 1000;
            if (i >= f - 1000 && i <= f && !this.e) {
                this.a.a(this.b.l());
                this.e = true;
            }
        }
    }
}
