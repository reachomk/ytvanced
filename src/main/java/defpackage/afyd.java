package defpackage;

import android.os.Binder;

/* renamed from: afyd */
public final class afyd extends xah {
    private final /* synthetic */ agxi g;

    public afyd(Class cls, agxi agxi) {
        this.g = agxi;
        super(cls);
    }

    public final /* synthetic */ void b(Binder binder) {
        agxq agxq = (agxq) binder;
        agxq.a.d.remove(this.g);
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ void a(Binder binder) {
        agxq agxq = (agxq) binder;
        if (agxq != null) {
            agxq.a.a(this.g);
        }
    }
}
