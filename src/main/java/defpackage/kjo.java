package defpackage;

import android.view.View;

/* renamed from: kjo */
final /* synthetic */ class kjo implements akok {
    private final kjm a;
    private final int b;

    kjo(kjm kjm, int i) {
        this.a = kjm;
        this.b = i;
    }

    public final boolean a(View view) {
        kjm kjm = this.a;
        int i = this.b;
        if (kjm.c.c == i) {
            kjm.a(0);
            kjm.c.g();
            return true;
        }
        kjm.a(i);
        return false;
    }
}
