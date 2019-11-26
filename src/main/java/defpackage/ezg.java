package defpackage;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: ezg */
public final class ezg implements ejc {
    public static final String a = xtl.b("MA.UMC");
    private final Handler b;
    private final Executor c;
    private final xsc d;
    private final eif e;
    private final exu f;
    private final bcaa g;
    private ezj h = null;

    public ezg(eif eif, Handler handler, Executor executor, xsc xsc, exu exu, bcaa bcaa) {
        this.e = eif;
        this.b = handler;
        this.c = executor;
        this.d = xsc;
        this.f = exu;
        this.g = bcaa;
    }

    public final void a(String str, ezn ezn) {
        ezj b = b(str);
        String valueOf = String.valueOf(b.b);
        String str2 = "adding callback for ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            str2.concat(valueOf);
        }
        Object weakReference = new WeakReference(ezn);
        b.c.add(weakReference);
        List list = b.f;
        if (list != null) {
            ezj.a(list, amul.a(weakReference), Collections.emptyList(), b.b);
        }
    }

    public final void a(String str, ezk ezk) {
        ezj b = b(str);
        Object weakReference = new WeakReference(ezk);
        b.d.add(weakReference);
        List list = b.f;
        if (list != null) {
            ezj.a(list, Collections.emptyList(), amul.a(weakReference), b.b);
        }
    }

    public final void a(String str) {
        ezj ezj = this.h;
        if (ezj != null && ezj.b.equals(str)) {
            a();
        }
    }

    private final void a() {
        ezj ezj = this.h;
        if (ezj != null) {
            ezj.c();
            this.h = null;
            this.e.b(this);
        }
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (ejd2 == ejd.NONE && this.h != null) {
            a();
        }
    }

    public final ezj b(String str) {
        ezj ezj = this.h;
        if (ezj != null) {
            if (ezj.b.equals(str)) {
                return this.h;
            }
            this.h.c();
        }
        this.h = new ezj(this.b, this.d, this.f, this.g, str, this.c);
        this.e.a(this);
        return this.h;
    }
}
