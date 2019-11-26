package defpackage;

import android.app.Activity;
import com.google.android.youtube.R;

/* renamed from: ahbc */
public class ahbc implements ahcd {
    public final xoi a;
    public final xhv b;
    public final xpa c;
    public final agwa d;
    private final Activity e;
    private final afpu f;
    private final agwc g;
    private final afqe h;
    private final agvs i;
    private final ahcp j;
    private final ahcf k;
    private final ahcc l;

    public ahbc(Activity activity, afpu afpu, agwc agwc, afqe afqe, xoi xoi, xhv xhv, agvs agvs, ahcp ahcp, ahcf ahcf, ahcc ahcc, xpa xpa, agwa agwa) {
        this.e = activity;
        this.f = afpu;
        this.g = agwc;
        this.h = afqe;
        this.a = xoi;
        this.b = xhv;
        this.i = agvs;
        this.j = ahcp;
        this.k = ahcf;
        this.l = ahcc;
        this.c = xpa;
        this.d = agwa;
    }

    public final agvx a() {
        return b().n();
    }

    public final agvz b() {
        return this.g.b();
    }

    public final void a(String str, avsj avsj, acvx acvx) {
        xvd.a(str);
        if (!this.b.c()) {
            this.c.a();
        } else if (a().f(str) != null) {
            a(str, 1, null);
        } else if (avsj == null) {
            a(str, 2, null);
        } else if (!avsj.b) {
            Object obj;
            avso avso = avsj.c;
            if (avso == null) {
                avso = avso.d;
            }
            if ((avso.a & 2) == 0) {
                avso = avsj.c;
                if (avso == null) {
                    avso = avso.d;
                }
                if ((avso.a & 1) != 0) {
                    avso = avsj.c;
                    if (avso == null) {
                        avso = avso.d;
                    }
                    obj = avso.b;
                    if (obj == null) {
                        obj = aqwx.g;
                    }
                } else {
                    obj = null;
                }
            } else {
                avso = avsj.c;
                if (avso == null) {
                    avso = avso.d;
                }
                obj = avso.c;
                if (obj == null) {
                    obj = ayvi.r;
                }
            }
            this.l.a(obj, acvx, null, null);
        } else if (this.f.a()) {
            b(str, avsj, acvx);
        } else {
            this.h.a(this.e, null, new ahbd(this, str, avsj, acvx));
        }
    }

    public final void b(String str, avsj avsj, acvx acvx) {
        byte[] d;
        if ((avsj.a & 64) != 0) {
            d = avsj.g.d();
        } else {
            d = zzp.b;
        }
        if (this.i.a(avsj)) {
            this.k.a(avsj, acvx, new ahbb(this, avsj, acvx, str, d));
            return;
        }
        avsi g = this.i.g();
        ahce.a(avsj, acvx, null, str, g, true, agqq.OFFLINE_IMMEDIATELY);
        a(str, g, agqq.OFFLINE_IMMEDIATELY, d, null);
    }

    public final void a(String str, avsi avsi, agqq agqq, byte[] bArr, ahcg ahcg) {
        this.k.f(new ahbg(this, str, avsi, agqq, bArr, null));
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str, int i, agqq agqq) {
        int i2 = R.string.add_playlist_to_offline_start;
        if (i != 0) {
            if (i == 1) {
                i2 = R.string.playlist_already_added_to_offline;
            } else if (i == 2) {
                i2 = R.string.add_playlist_to_offline_error;
            } else {
                return;
            }
        } else if (agqq != null && agqq == agqq.DEFER_FOR_DISCOUNTED_DATA) {
            i2 = R.string.add_playlist_to_offline_waiting_for_discount;
        } else if (this.i.j() && !this.b.e()) {
            i2 = R.string.add_to_offline_waiting_for_wifi;
        }
        a(str, i2);
    }

    /* Access modifiers changed, original: protected */
    public void a(String str, int i) {
        xpr.a(this.e, i, 1);
    }

    public final void a(String str) {
        this.k.a(new ahbf(this, str));
    }

    public final void b(String str) {
        xvd.a(str);
        this.k.a(new ahbi(this, str));
    }

    public void a(String str, ahbv ahbv) {
        if (ahbv.a()) {
            xvd.a(str);
            agqh f = a().f(str);
            if (f != null) {
                ahbh ahbh = new ahbh(this, str);
                if (f.e()) {
                    this.k.d(ahbh);
                } else {
                    this.k.e(ahbh);
                    return;
                }
            }
        }
        xvd.a(str);
        agvx a = a();
        if (a.f(str) != null) {
            a.g(str);
        }
    }

    public final void a(String str, String str2) {
        xvd.a(str2);
        xvd.a(str);
        agqy a = b().k().a(str2);
        if (a == null || (a.v() && a.w())) {
            this.j.a(new ahbe(this, str, str2));
        }
    }
}
