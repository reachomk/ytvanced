package defpackage;

import android.os.Looper;

/* renamed from: unm */
final class unm implements nlu {
    private final /* synthetic */ nlp a;
    private final /* synthetic */ nlp b;
    private final /* synthetic */ Looper c;
    private final /* synthetic */ unl d;

    unm(unl unl, nlp nlp, nlp nlp2, Looper looper) {
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
        String str = "primaryAudioPlayer triggered onPlayerError: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        ujo.a(valueOf);
        this.a.f();
        this.b.g();
        this.a.g();
        this.c.quit();
    }
}
