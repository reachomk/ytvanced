package defpackage;

import android.content.Intent;

/* renamed from: pp */
final class pp implements po {
    private final Intent a;
    private final int b;
    private final /* synthetic */ pl c;

    pp(pl plVar, Intent intent, int i) {
        this.c = plVar;
        this.a = intent;
        this.b = i;
    }

    public final Intent a() {
        return this.a;
    }

    public final void b() {
        this.c.stopSelf(this.b);
    }
}
