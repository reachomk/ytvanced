package defpackage;

import android.content.Context;
import android.view.View;
import java.util.List;

/* renamed from: alet */
public final class alet extends aktw implements algm, almb {
    private final Context a;
    private final aaas b;
    private final akpi c;
    private final acvx d;
    private final alha e;
    private final akpk f = new akpk();
    private final ayks g;
    private final alev h;

    public alet(ayks ayks, Context context, aaas aaas, akpi akpi, acvx acvx, alha alha, alev alev) {
        this.g = (ayks) amqw.a((Object) ayks);
        this.a = (Context) amqw.a((Object) context);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = (akpi) amqw.a((Object) akpi);
        this.d = (acvx) amqw.a((Object) acvx);
        this.e = (alha) amqw.a((Object) alha);
        this.h = (alev) amqw.a((Object) alev);
        this.f.add(ayks);
    }

    public final void a(List list) {
    }

    public final aknh a() {
        return this.f;
    }

    public final void a(akpb akpb) {
        Context context = this.a;
        aaas aaas = this.b;
        akpi akpi = this.c;
        acvx acvx = this.d;
        alha alha = this.e;
        alha.getClass();
        akpb.a(ayks.class, new ally(context, aaas, akpi, acvx, new ales(alha), this));
    }

    public final void a(View view) {
        aykq aykq = this.g.e;
        if (aykq == null) {
            aykq = aykq.c;
        }
        if (aykq.a == 102716411) {
            aruh aruh;
            alev alev = this.h;
            aykq aykq2 = this.g.e;
            if (aykq2 == null) {
                aykq2 = aykq.c;
            }
            if (aykq2.a == 102716411) {
                aruh = (aruh) aykq2.b;
            } else {
                aruh = aruh.j;
            }
            alev.a(aruh, view);
        }
    }
}
