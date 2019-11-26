package defpackage;

import android.content.Context;

/* renamed from: dqs */
public final class dqs implements akvz {
    public akpb a;
    private final Context b;
    private final uya c;
    private final dve d;
    private final bcaa e;

    public dqs(Context context, uya uya, dve dve, bcaa bcaa) {
        this.b = context;
        this.c = uya;
        this.d = dve;
        this.e = bcaa;
    }

    public final void a(Class cls) {
        amqw.a(cls == aanw.class);
        this.a = new aknw();
        int a = this.d.a(this.b);
        if (a != 2 && a != 3) {
            this.a.a(aoep.class, new dqt(this.b, (aaas) this.e.get(), this.c));
        }
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return this.a;
    }
}
