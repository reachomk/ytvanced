package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: csm */
final class csm implements ctp {
    private final ArrayList a = new ArrayList();
    private final /* synthetic */ csf b;

    public final void a(ctq ctq) {
        e(ctq);
        if (!TextUtils.isEmpty((String) this.b.c.a(ctq.hashCode()))) {
            ctq.hashCode();
            cno.e().b();
        }
    }

    public final void b(ctq ctq) {
        f(ctq);
    }

    public final void c(ctq ctq) {
        f(ctq);
    }

    public final boolean d(ctq ctq) {
        ctq.a(this.a);
        int size = this.a.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            ctw ctw = (ctw) this.a.get(i);
            Float f = ((csk) ((csi) this.b.b.a(ctw.a())).a.get(ctw.b())).d;
            if (!(f == null || f.floatValue() == ctw.b)) {
                z = false;
            }
        }
        this.a.clear();
        return z;
    }

    private final void e(ctq ctq) {
        ctq.a(this.a);
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ctw ctw = (ctw) this.a.get(i);
            csk csk = (csk) ((csi) this.b.b.a(ctw.a())).a.get(ctw.b());
            csk.c = Float.valueOf(ctw.b);
            csk.b = ctq;
        }
        this.a.clear();
    }

    private final void f(ctq ctq) {
        List list = (List) this.b.a.remove(ctq);
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                boolean z;
                ctv ctv = (ctv) list.get(i);
                csd csd = ctv.a;
                csi csi = (csi) this.b.b.a(csd);
                cto cto = ctv.b;
                String str = "Some animation bookkeeping is wrong: tried to remove an animation from the list of active animations, but it wasn't there.";
                csk csk;
                if (csi.c == 2) {
                    csk csk2 = (csk) csi.a.get(cto);
                    if (csk2 != null) {
                        csk2.e--;
                        if (csi.c == 2) {
                            for (csk csk3 : csi.a.values()) {
                                if (csk3.e > 0) {
                                    z = false;
                                    break;
                                }
                            }
                            z = true;
                            if (z && csi.b != null) {
                                for (cto a : csi.a.keySet()) {
                                    csf.a(a, csi.b);
                                }
                            }
                        } else {
                            throw new RuntimeException("This should only be checked for disappearing animations");
                        }
                    }
                    throw new RuntimeException(str);
                }
                csk3 = (csk) csi.a.get(cto);
                if (csk3 != null) {
                    int i2 = csk3.e - 1;
                    csk3.e = i2;
                    if (i2 <= 0) {
                        csi.a.remove(cto);
                        boolean isEmpty = csi.a.isEmpty();
                        if (csi.b != null) {
                            csf.a(cto, cto.a((clm) csi.e.a()), csi.b);
                        }
                        z = isEmpty;
                    } else {
                    }
                } else {
                    throw new RuntimeException(str);
                }
                if (z) {
                    cqo cqo = csi.b;
                    if (cqo != null) {
                        this.b.a(cqo, true);
                    }
                    csh csh = this.b.h;
                    if (csh != null) {
                        csh.b(csd);
                    }
                    this.b.b.b(csd);
                    csf.a(csi);
                }
            }
            if (!TextUtils.isEmpty((String) this.b.c.a(ctq.hashCode()))) {
                ctq.hashCode();
                cno.e().e();
                this.b.c.b(ctq.hashCode());
            }
        }
    }

    /* synthetic */ csm(csf csf) {
        this.b = csf;
    }
}
