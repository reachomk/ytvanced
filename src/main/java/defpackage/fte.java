package defpackage;

import android.support.v7.widget.RecyclerView;

/* renamed from: fte */
public final class fte {
    private final RecyclerView a;
    private final akpd b;
    private final aknh c;
    private final akpk d;
    private final ans e;
    private apn f;
    private boolean g;
    private int h;

    public fte(RecyclerView recyclerView, akpd akpd, aknh aknh) {
        Object akpk = new akpk();
        Object jvm = new jvm(recyclerView.getContext());
        this.a = (RecyclerView) amqw.a((Object) recyclerView);
        this.b = (akpd) amqw.a((Object) akpd);
        this.c = (aknh) amqw.a((Object) aknh);
        this.d = (akpk) amqw.a(akpk);
        this.e = (ans) amqw.a(jvm);
        this.e.b(1);
    }

    public final void a(boolean z) {
        if (this.g != z) {
            this.g = z;
            if (z) {
                apn apn = this.a.n;
                if (apn instanceof ans) {
                    this.h = ((ans) apn).r();
                    this.b.a(this.d);
                    this.d.clear();
                    for (int i = 0; i < this.c.d(); i++) {
                        Object c = this.c.c(i);
                        if ((c instanceof ycp) || (c instanceof ycs)) {
                            akpk akpk = this.d;
                            if (c instanceof ycs) {
                                ycs ycs = (ycs) c;
                                ycp ycp = new ycp(ycs.a, ycs.b);
                                ycp.a();
                                c = ycp;
                            }
                            akpk.add(c);
                        }
                    }
                    RecyclerView recyclerView = this.a;
                    this.f = recyclerView.n;
                    recyclerView.a(this.e);
                    return;
                }
                throw new IllegalStateException("RecyclerView layout manager is not instance of LinearLayoutManager");
            }
            this.b.a(this.c);
            this.a.a(this.f);
            this.a.c(this.h);
        }
    }
}
