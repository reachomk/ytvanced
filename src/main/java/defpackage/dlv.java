package defpackage;

import android.view.View;

/* renamed from: dlv */
final class dlv implements aeay {
    private final aeba a;
    private volatile Object b = new baqe();
    private final /* synthetic */ diu c;

    public final void a(aeaw aeaw) {
        Object obj = this.b;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof baqe) {
                    aeas aeas = new aeas((View) baqd.a(this.a.a, "Cannot return null from a non-@Nullable @Provides method"), (aeat) baqd.a(this.a.b, "Cannot return null from a non-@Nullable @Provides method"), this.c.s());
                    this.b = bapx.a(this.b, aeas);
                    obj2 = aeas;
                }
            }
            obj = obj2;
        }
        aeaw.a = (aeas) obj;
    }

    /* synthetic */ dlv(diu diu, aeba aeba) {
        this.c = diu;
        this.a = aeba;
    }
}
