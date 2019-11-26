package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: iwx */
public final class iwx {
    public final iwz a = new iwz();
    public final iwy b = new iwy(this);
    public WeakReference c;
    private final akwy d;
    private final akpk e = new akpk();

    public iwx(akwy akwy) {
        this.d = akwy;
        ((akpd) akwy.e).a(this.b);
    }

    public final void a(ajwc ajwc) {
        if (ajwc != null) {
            ajwc.setExtension(ajwb.a, Boolean.valueOf(true));
            ajwc.c = null;
            this.e.clear();
            this.e.add(ajwc);
            this.d.a(this.e);
            ajwe[] ajweArr = ajwc.a;
            if (ajweArr != null) {
                for (ajwe ajwe : ajweArr) {
                    axdo axdo = ajwe.c;
                    if (axdo != null) {
                        anxr access$000 = anxl.checkIsLite(axdm.b);
                        axdo.a(access$000);
                        if (axdo.h.a(access$000.d)) {
                            Object obj;
                            access$000 = anxl.checkIsLite(axdm.b);
                            axdo.a(access$000);
                            Object b = axdo.h.b(access$000.d);
                            if (b == null) {
                                obj = access$000.b;
                            } else {
                                obj = access$000.a(b);
                            }
                            if (((Boolean) obj).booleanValue()) {
                                this.a.b = axdo;
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }
}
