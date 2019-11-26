package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.List;

/* renamed from: algr */
public final class algr extends aktw implements alfd, algm, alop {
    public final Context a;
    public final akvp b;
    public final aaas c;
    private final akpk d = new akpk();
    private final List e = new ArrayList();
    private final alha f;

    public algr(aymi aymi, Context context, alha alha, akvp akvp, aaas aaas) {
        this.d.a(new almp());
        this.d.a(new almo());
        this.a = (Context) amqw.a((Object) context);
        this.f = (alha) amqw.a((Object) alha);
        this.b = (akvp) amqw.a((Object) akvp);
        this.c = (aaas) amqw.a((Object) aaas);
        for (axak axak : aymi.a) {
            anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            axak.a(access$000);
            if (axak.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                axak.a(access$000);
                Object b = axak.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                aphg aphg = (aphg) b;
                this.e.add(aphg);
                this.d.add(aphg);
            }
        }
        alha.d(true);
    }

    public final void a(aqhy aqhy, bcaa bcaa) {
    }

    public final void a(List list) {
    }

    public final aknh a() {
        return this.d;
    }

    public final void a(akpb akpb) {
        akpb.a(aphg.class, new algq(this));
    }

    public final void a(apxu apxu, CharSequence charSequence, arwf arwf, int i, Long l) {
        if (i <= 0) {
            if (this.d.isEmpty()) {
                this.d.addAll(this.e);
            }
            this.f.d(true);
            return;
        }
        this.d.clear();
    }

    public final void b() {
        this.f.d();
    }
}
