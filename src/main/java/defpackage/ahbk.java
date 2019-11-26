package defpackage;

import android.app.Activity;
import android.util.Pair;
import com.google.android.youtube.R;

/* renamed from: ahbk */
public class ahbk implements ahcn {
    public final xoi a;
    public final xhv b;
    public final xpa c;
    private final Activity d;
    private final afpu e;
    private final agwc f;
    private final aguk g;
    private final afqe h;
    private final agvs i;
    private final ahcp j;
    private final ahcc k;

    public ahbk(Activity activity, afpu afpu, agwc agwc, aguk aguk, afqe afqe, xoi xoi, xhv xhv, agvs agvs, ahcp ahcp, ahcc ahcc, xpa xpa) {
        this.d = (Activity) amqw.a((Object) activity);
        this.f = (agwc) amqw.a((Object) agwc);
        this.g = (aguk) amqw.a((Object) aguk);
        this.h = (afqe) amqw.a((Object) afqe);
        this.e = (afpu) amqw.a((Object) afpu);
        this.a = (xoi) amqw.a((Object) xoi);
        this.b = (xhv) amqw.a((Object) xhv);
        this.i = (agvs) amqw.a((Object) agvs);
        this.j = (ahcp) amqw.a((Object) ahcp);
        this.k = (ahcc) amqw.a((Object) ahcc);
        this.c = xpa;
    }

    public final agvz a() {
        return this.f.b();
    }

    public final void a(String str, avsj avsj, ahcq ahcq, acvx acvx) {
        xvd.a(str);
        agqy a = a().k().a(str);
        if (!this.b.c() && (a == null || !a.i())) {
            this.c.a();
            return;
        }
        Object obj = null;
        if (a != null) {
            boolean w;
            if (a.v()) {
                w = a.w();
            } else {
                w = a.e ^ true;
            }
            if (!w) {
                if (ahcq != null) {
                    ahcq.a(str, 1);
                }
                a(1, null);
                return;
            }
        }
        if (avsj == null) {
            if (ahcq != null) {
                ahcq.a(str, 2);
            }
            a(2, null);
        } else if (!avsj.b) {
            avso avso = avsj.c;
            if (avso == null) {
                avso = avso.d;
            }
            avso avso2;
            if ((avso.a & 2) == 0) {
                avso = avsj.c;
                if (avso == null) {
                    avso = avso.d;
                }
                if ((avso.a & 1) != 0) {
                    avso2 = avsj.c;
                    if (avso2 == null) {
                        avso2 = avso.d;
                    }
                    obj = avso2.b;
                    if (obj == null) {
                        obj = aqwx.g;
                    }
                }
            } else {
                avso2 = avsj.c;
                if (avso2 == null) {
                    avso2 = avso.d;
                }
                obj = avso2.c;
                if (obj == null) {
                    obj = ayvi.r;
                }
            }
            a(str, obj, acvx);
        } else if (this.e.a()) {
            b(str, avsj, ahcq, acvx);
        } else {
            this.h.a(this.d, null, new ahbq(this, str, avsj, ahcq, acvx));
        }
    }

    public final void a(String str, Object obj, acvx acvx) {
        this.k.a(obj, acvx, a().k().a(str) != null ? new Pair(this.d.getString(R.string.remove_offline_confirmed_button), new ahbj(this, str)) : null, null);
    }

    public final void b(String str, avsj avsj, ahcq ahcq, acvx acvx) {
        byte[] d;
        if ((avsj.a & 64) != 0) {
            d = avsj.g.d();
        } else {
            d = zzp.b;
        }
        if (this.i.a(avsj)) {
            this.j.a(str, avsj, acvx, new ahbm(this, avsj, acvx, str, d, ahcq));
            return;
        }
        avsi g = this.i.g();
        ahce.a(avsj, acvx, str, null, g, true, agqq.OFFLINE_IMMEDIATELY);
        a(str, g, agqq.OFFLINE_IMMEDIATELY, d, ahcq);
    }

    public final void a(String str, avsi avsi, agqq agqq, byte[] bArr, ahcq ahcq) {
        int a = a().k().a(str, avsi, agqq, bArr, -1);
        if (ahcq != null) {
            ahcq.a(str, a);
        }
        a(a, agqq);
    }

    public final void a(String str, String str2, ahcq ahcq, boolean z) {
        if (z) {
            xvd.a(str2);
            agqy a = a().k().a(str2);
            if (a == null || (a.v() && a.w())) {
                this.j.a(new ahbn(this, str, str2, ahcq));
            }
            return;
        }
        a(str, str2, ahcq);
    }

    public final void a(String str, String str2) {
        xvd.a(str2);
        agqy a = a().k().a(str2);
        if (a != null && !a.z()) {
            this.j.c(new ahbl(this, str, str2));
        }
    }

    public final void a(String str) {
        this.j.b(new ahbo(this, str));
    }

    public final void a(String str, String str2, ahcq ahcq) {
        if (this.b.c()) {
            int c;
            if (str == null) {
                c = a().k().c(str2);
            } else {
                c = a().n().a(str, str2);
            }
            if (ahcq != null) {
                ahcq.a(str2, c);
            }
            a(c, agqq.OFFLINE_IMMEDIATELY);
            return;
        }
        this.c.a();
    }

    public static int a(int i, agqq agqq, agvs agvs, xhv xhv) {
        int i2 = R.string.add_to_offline_start;
        if (!(xhv == null || agvs == null)) {
            if (i != 0) {
                if (i == 1) {
                    return R.string.video_already_added_to_offline;
                }
                if (i == 2) {
                    return R.string.add_video_to_offline_error;
                }
            } else if (agqq == null || agqq != agqq.DEFER_FOR_DISCOUNTED_DATA) {
                if (agvs.j() && !xhv.e()) {
                    return R.string.add_to_offline_waiting_for_wifi;
                }
                return i2;
            } else {
                i2 = R.string.add_video_to_offline_waiting_for_discount;
                return i2;
            }
        }
        i2 = 0;
        return i2;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, agqq agqq) {
        i = ahbk.a(i, agqq, this.i, this.b);
        if (i != 0) {
            a(i);
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(int i) {
        xpr.a(this.d, i, 1);
    }

    public void a(String str, boolean z) {
        if (z) {
            xvd.a(str);
            agqy a = a().k().a(str);
            if (a != null) {
                ahcr ahbp = new ahbp(this, str);
                if (a.l == agqf.ACTIVE || a.l == agqf.PAUSED) {
                    this.j.c(ahbp);
                } else {
                    this.j.b(ahbp);
                    return;
                }
            }
        }
        xvd.a(str);
        agwh k = a().k();
        if (k.a(str) != null) {
            k.f(str);
        }
    }

    public void a(agqw agqw, boolean z) {
        if (z) {
            this.j.a(new ahbr(this));
            return;
        }
        b();
    }

    public final void b() {
        this.g.a(this.f.c());
    }
}
