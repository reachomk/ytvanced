package defpackage;

import android.os.Looper;

/* renamed from: unp */
final class unp implements nlu {
    private final /* synthetic */ nlp a;
    private final /* synthetic */ nlp b;
    private final /* synthetic */ Looper c;
    private final /* synthetic */ unl d;

    unp(unl unl, nlp nlp, nlp nlp2, Looper looper) {
        this.d = unl;
        this.a = nlp;
        this.b = nlp2;
        this.c = looper;
    }

    public final void a() {
    }

    public final void a(boolean z, int i) {
    }

    public final void a(nlq nlq) {
        this.d.a = nlq;
        String valueOf = String.valueOf(nlq.toString());
        String str = "audioSwapPlayer triggered onPlayerError: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        ujo.a(valueOf);
        this.a.f();
        this.a.g();
        this.b.g();
        this.c.quit();
    }
}
