package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: amdg */
public final class amdg {
    public final Context a;
    public final tgv b;
    public final Executor c;
    public final HashMap d = new HashMap();

    public amdg(Context context, zyw zyw, Executor executor, bapu bapu) {
        ayuw ayuw;
        this.a = context;
        if (zyw == null || zyw.a() == null) {
            ayuw = null;
        } else {
            ayuw = zyw.a().p;
            if (ayuw == null) {
                ayuw = ayuw.h;
            }
        }
        if (ayuw == null || !ayuw.c) {
            this.b = null;
            this.c = null;
            return;
        }
        this.b = (tgv) bapu.get();
        this.c = executor;
    }

    public final avak a(String str) {
        avan avan = (avan) avak.d.createBuilder();
        if (this.b == null) {
            avan.a(4);
            return (avak) ((anxl) avan.build());
        }
        if (this.d.containsKey(str)) {
            avan.a(2);
            anvu a = anvu.a(((String) this.d.get(str)).getBytes());
            avan.copyOnWrite();
            avak avak = (avak) avan.instance;
            if (a != null) {
                avak.a |= 1;
                avak.b = a;
            } else {
                throw new NullPointerException();
            }
        }
        avan.a(3);
        return (avak) ((anxl) avan.build());
    }
}
