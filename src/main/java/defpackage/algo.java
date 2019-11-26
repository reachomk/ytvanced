package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: algo */
public final class algo extends aktw implements algm, alnx, aloe {
    private final Context a;
    private final aaas b;
    private final akpk c = new akpk();
    private boolean d;

    public algo(aymg aymg, Context context, aaas aaas) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c.add(amqw.a((Object) aymg));
    }

    public final void a(List list) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (list.get(i) instanceof alfb) {
                this.d = true;
                this.c.a();
                return;
            }
            i = i2;
        }
    }

    public final aknh a() {
        return this.c;
    }

    public final void a(akpb akpb) {
        akpb.a(aymg.class, new alof(this.a, this.b, this));
    }

    public final void a(arml arml) {
        aymg aymg = (aymg) this.c.get(0);
        akpk akpk = this.c;
        aymj aymj = (aymj) ((anxo) aymg.toBuilder());
        aymj.copyOnWrite();
        aymg aymg2 = (aymg) aymj.instance;
        if (arml != null) {
            aymg2.c = arml;
            aymg2.a |= 2;
            akpk.set(0, (anxl) aymj.build());
            this.c.a();
            return;
        }
        throw new NullPointerException();
    }

    public final boolean b() {
        return this.d;
    }
}
