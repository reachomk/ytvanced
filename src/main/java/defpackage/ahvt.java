package defpackage;

import android.os.Handler;

/* renamed from: ahvt */
final /* synthetic */ class ahvt implements ahnf {
    private final Handler a;
    private final ahvw b;
    private final ahrt c;

    ahvt(Handler handler, ahvw ahvw, ahrt ahrt) {
        this.a = handler;
        this.b = ahvw;
        this.c = ahrt;
    }

    public final boolean a() {
        Handler handler = this.a;
        ahvw ahvw = this.b;
        ahrt ahrt = this.c;
        ahvw.getClass();
        handler.post(new ahvu(ahvw));
        ahrt.a.b.l = false;
        ahrw ahrw = ahrt.i;
        if (ahrw != null) {
            ahrw.d();
        }
        return true;
    }
}
