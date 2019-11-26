package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: ahvw */
public final class ahvw implements ahku, ahoj {
    public final Set a = new CopyOnWriteArraySet();
    public awfe b;
    private final Context c;
    private final akkq d;
    private final ViewGroup e;
    private ahvq f;
    private boolean g;

    public ahvw(Context context, akkq akkq, ViewGroup viewGroup) {
        this.c = (Context) amqw.a((Object) context);
        this.d = (akkq) amqw.a((Object) akkq);
        this.e = (ViewGroup) amqw.a((Object) viewGroup);
    }

    public final void a(ahkx ahkx) {
        this.a.add((ahkx) amqw.a((Object) ahkx));
    }

    public final void b(ahkx ahkx) {
        this.a.remove(amqw.a((Object) ahkx));
    }

    public final void b(awfe awfe, boolean z) {
        if (this.f != null && awfe != null) {
            if (!awfe.equals(this.b) || this.g != z) {
                arml arml;
                this.b = awfe;
                this.g = z;
                ahvq ahvq = this.f;
                arml arml2 = null;
                if ((awfe.a & 2) != 0) {
                    arml = awfe.c;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                String obj = ajqy.a(arml).toString();
                if ((awfe.a & 4) != 0) {
                    arml2 = awfe.d;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                }
                String obj2 = ajqy.a(arml2).toString();
                aygk aygk = awfe.k;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                ahvq.b.m_(true);
                ahvq.a.b(aklb.e(aygk), new ahvx(ahvq));
                ahvq.e.a(obj);
                ahvq.e.b(obj2);
                ahrt ahrt = ahvq.c;
                ahrt.a.b.l = true;
                ahrw ahrw = ahrt.i;
                if (ahrw != null) {
                    ahrw.c();
                }
                ahvq.l = false;
            }
        }
    }

    public final void ag_() {
        ahvq ahvq = this.f;
        if (ahvq != null) {
            ahvq.l = true;
            this.b = null;
        }
    }

    public final void b(long j, long j2) {
        ahvq ahvq = this.f;
        if (ahvq != null) {
            ahmt ahmt = ahvq.f;
            if (ahmt == null) {
                xtl.c("Attempting to update progress on a null countdown progress UI component.");
                return;
            }
            ahmw ahmw = ahmt.k;
            if (!(ahmw == null || ahmw.isIndeterminate())) {
                ahmt.j.post(new ahmv(ahmt, j, j2));
            }
            if (j == j2 && j != 0) {
                ahrt ahrt = ahvq.c;
                if (ahrt != null) {
                    ahrt.g();
                }
            }
        }
    }

    public final void a(ahry ahry, ahrt ahrt) {
        this.f = new ahvq(this.c, ahry, ahrt, this.d, this.e, this);
        ahrt.a(this.f);
        ahrt.k = this.f;
    }

    public final void bz_() {
        this.f = null;
    }
}
