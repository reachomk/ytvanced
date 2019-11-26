package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: alft */
public final class alft extends aktw implements algm, almu, almv {
    public final akpk a = new akpk();
    private final Context b;
    private final akkq c;
    private final ayky d;
    private final List e = new ArrayList();

    public alft(ayky ayky, Context context, akkq akkq) {
        this.d = (ayky) amqw.a((Object) ayky);
        this.b = (Context) amqw.a((Object) context);
        this.c = (akkq) amqw.a((Object) akkq);
        d();
    }

    public final void b() {
    }

    private final void d() {
        e();
        this.a.add(this.d);
    }

    private final void e() {
        this.a.clear();
    }

    public final void a(boolean z) {
        if (z) {
            d();
        } else {
            e();
        }
    }

    public final void a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            alft alft = list.get(i);
            if (alft != this && (alft instanceof almv)) {
                this.e.add(alft);
            }
        }
    }

    public final void b(boolean z) {
        for (almv b : this.e) {
            b.b(z);
        }
    }

    public final void a(String str) {
        for (almv a : this.e) {
            a.a(str);
        }
    }

    public final aknh a() {
        return this.a;
    }

    public final void a(akpb akpb) {
        akpb.a(ayky.class, new alms(this.b, this.c, this));
    }
}
