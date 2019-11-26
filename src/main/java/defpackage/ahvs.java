package defpackage;

import android.os.Handler;

/* renamed from: ahvs */
final /* synthetic */ class ahvs implements ahnf {
    private final Handler a;
    private final ahvw b;
    private final ahrt c;

    ahvs(Handler handler, ahvw ahvw, ahrt ahrt) {
        this.a = handler;
        this.b = ahvw;
        this.c = ahrt;
    }

    public final boolean a() {
        Handler handler = this.a;
        ahvw ahvw = this.b;
        ahrt ahrt = this.c;
        ahvw.getClass();
        handler.post(new ahvv(ahvw));
        ahrt.g();
        return true;
    }
}
