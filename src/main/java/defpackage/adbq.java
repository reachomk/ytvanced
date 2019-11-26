package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: adbq */
public final class adbq implements adbj {
    public static final String a = xtl.b("MDX.CastSdkClient");
    public final adbm b;
    public final adbo c;
    public final String d;
    public adbl e;
    public tbn f;
    private final Context g;
    private final tby h;
    private tci i;
    private tch j;
    private boolean k;

    public adbq(Context context, adbm adbm, adbo adbo, adby adby, tby tby) {
        this.g = context;
        this.b = adbm;
        this.c = adbo;
        this.h = tby;
        this.d = adby.j();
    }

    public final void a() {
        xak.a();
        if (!this.k) {
            this.i = this.h.a(this.g).a();
            this.j = new adbp(this);
            this.i.a(this.j);
            this.k = true;
        }
    }

    public final void b() {
        if (this.k) {
            this.i.b(this.j);
            this.k = false;
        }
    }

    public final void a(bbs bbs) {
        Intent intent = new Intent();
        intent.putExtra("CAST_INTENT_TO_CAST_NO_TOAST_KEY", true);
        intent.putExtra("CAST_INTENT_TO_CAST_ROUTE_ID_KEY", bbs.c);
        this.i.a(intent);
    }

    public final void c() {
        this.h.a(this.g);
    }

    public final void d() {
        this.f = null;
        this.e = null;
    }
}
