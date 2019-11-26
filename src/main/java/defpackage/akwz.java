package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: akwz */
public abstract class akwz {
    public final akpk a = new akpk();
    public final akpd b;
    private final acwa c;
    private final akod d;

    public akwz(RecyclerView recyclerView, akpe akpe, akvz akvz, acwa acwa) {
        this.c = acwa;
        this.b = akpe.a((akpb) akvz.get());
        this.b.a(this.a);
        this.d = new akod();
        this.b.a(this.d);
        recyclerView.a(this.b);
    }

    public abstract void a(Object obj, akpk akpk);

    public final void a(Object[] objArr) {
        this.d.a = this.c.t();
        for (Object a : objArr) {
            a(a, this.a);
        }
    }
}
