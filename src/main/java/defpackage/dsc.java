package defpackage;

import android.net.Uri;

/* renamed from: dsc */
public final class dsc extends ekk implements akmz, xcp {
    private final xci a;
    private final afpu b;
    private final aaas c;
    private final akmx d;
    private final eld e;
    private final bcaa f;
    private boolean g;

    public dsc(elm elm, xci xci, afpu afpu, aaas aaas, akmx akmx, eld eld, bcaa bcaa) {
        super(elm);
        this.a = xci;
        this.b = afpu;
        this.c = aaas;
        this.d = akmx;
        this.e = eld;
        this.f = bcaa;
        this.g = afpu.a();
    }

    public final void A_() {
        this.a.a((Object) this);
        this.d.a(grw.k, (akmz) this);
    }

    public final void ar_() {
        this.a.b(this);
        this.d.a((akmz) this);
    }

    public final void a(Uri uri, Uri uri2) {
        if (amqq.a(uri, grw.k)) {
            grw grw = (grw) this.d.a(uri2);
            if (grw != null && grw.f() && grw.e()) {
                this.e.d();
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{fid.class, uru.class, uyw.class};
        } else if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    uyw uyw = (uyw) obj;
                    if (uyw.a == uyz.FINISHED && uyw.b) {
                        apxu apxu = uyw.c;
                        if (apxu == null || !elq.b(apxu)) {
                            boolean a = this.b.a();
                            if (!this.g && a) {
                                this.e.g();
                            } else {
                                ((lci) this.f.get()).g();
                            }
                            this.g = a;
                        } else {
                            ((lci) this.f.get()).g();
                            this.c.a(apxu, null);
                        }
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder(32);
                    stringBuilder.append("unsupported op code: ");
                    stringBuilder.append(i);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            } else if (!((uru) obj).a) {
                this.e.f();
                return null;
            }
        } else if (((fid) obj).c) {
            this.e.d();
            return null;
        }
        return clsArr;
    }
}
