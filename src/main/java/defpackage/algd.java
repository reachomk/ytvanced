package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;

/* renamed from: algd */
public final class algd extends aktw implements algm, alnx {
    private final Context a;
    private final akkq b;
    private final akpk c = new akpk();
    private final aaas d;
    private final akvp e;
    private final SharedPreferences f;
    private final List g = new ArrayList();
    private final arml h;

    public algd(ayly ayly, Context context, akkq akkq, aaas aaas, akvp akvp, SharedPreferences sharedPreferences) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (akkq) amqw.a((Object) akkq);
        this.d = (aaas) amqw.a((Object) aaas);
        this.e = (akvp) amqw.a((Object) akvp);
        this.f = (SharedPreferences) amqw.a((Object) sharedPreferences);
        arml arml = null;
        if (System.currentTimeMillis() - this.f.getLong("share_panel_promo_last_dismissed_millis", 0) <= ayly.f) {
            if ((ayly.a & 8) != 0) {
                arml = ayly.e;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            this.h = arml;
            return;
        }
        this.c.add(ayly);
        this.h = null;
    }

    public final void a(akpb akpb) {
        akpb.a(ayly.class, new alnu(this.a, this.b, this.d, this.e, this));
    }

    public final void a(arml arml) {
        this.c.clear();
        this.f.edit().putLong("share_panel_promo_last_dismissed_millis", System.currentTimeMillis()).apply();
        for (alnx a : this.g) {
            a.a(arml);
        }
    }

    public final void a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            algd algd = list.get(i);
            if (algd != this && (algd instanceof alnx)) {
                this.g.add(algd);
            }
        }
        if (this.h != null) {
            for (alnx a : this.g) {
                a.a(this.h);
            }
        }
    }

    public final aknh a() {
        return this.c;
    }
}
