package defpackage;

import android.view.View;

/* renamed from: akvv */
final /* synthetic */ class akvv implements Runnable {
    private final akvs a;
    private final auvn b;
    private final View c;
    private final Object d;
    private final acvx e;

    akvv(akvs akvs, auvn auvn, View view, Object obj, acvx acvx) {
        this.a = akvs;
        this.b = auvn;
        this.c = view;
        this.d = obj;
        this.e = acvx;
    }

    public final void run() {
        akvs akvs = this.a;
        akvs.a.a(this.b, this.c, this.d, this.e);
    }
}
