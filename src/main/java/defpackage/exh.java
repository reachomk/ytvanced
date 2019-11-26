package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: exh */
public final class exh implements wqt {
    public final exj a;
    public final exk b;
    public final ajam c;
    public final zyw d;
    public final bdfu e = new bdfu();
    public final int f;
    public final int g;
    public final wqq h;
    public final exs i;
    public boolean j;

    public exh(Context context, exs exs, wqq wqq, ajam ajam, zyw zyw) {
        this.i = exs;
        this.h = wqq;
        this.c = ajam;
        this.d = zyw;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f = xss.a(displayMetrics, 30);
        this.g = xss.a(displayMetrics, 12);
        this.a = new exj(this);
        this.b = new exk(this);
    }

    public final void ac_() {
    }

    public final void a(akcf akcf) {
        this.i.c();
    }
}
