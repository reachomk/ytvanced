package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ihb */
public final class ihb implements ihc, xcp {
    private static final List e;
    public final igz a;
    public final acvx b;
    public boolean c;
    public ihd d;
    private final aaas f;
    private final vod g;
    private final List h = new ArrayList();
    private final xsc i;
    private final Handler j = new Handler(Looper.getMainLooper());
    private boolean k;
    private boolean l;
    private long m;
    private Object n;
    private aaga o;
    private int p;

    public ihb(igz igz, aaas aaas, vod vod, acvx acvx, xsc xsc) {
        this.a = (igz) amqw.a((Object) igz);
        this.f = (aaas) amqw.a((Object) aaas);
        this.g = (vod) amqw.a((Object) vod);
        this.b = (acvx) amqw.a((Object) acvx);
        this.i = (xsc) amqw.a((Object) xsc);
        a();
    }

    private final void a() {
        Object obj = this.n;
        if (obj != null) {
            this.g.b(obj);
            this.n = null;
        }
        this.a.e();
        this.p = 1;
        this.c = true;
        this.o = null;
        this.d = null;
        this.l = false;
        this.k = false;
        this.m = 0;
        this.h.clear();
    }

    private final void a(long j) {
        this.m = j;
        if (this.k && this.l && this.d != null && !this.h.isEmpty()) {
            int i = this.p;
            for (aohh aohh : this.h) {
                if (((float) this.m) >= aohh.c) {
                    int i2 = this.p;
                    int a = aohj.a(aohh.b);
                    boolean z = true;
                    if (a == 0) {
                        a = 1;
                    }
                    if (i2 != a) {
                        i2 = aohj.a(aohh.b);
                        if (i2 == 0) {
                            i2 = 1;
                        }
                        this.p = i2;
                        if (i2 != 2 && i == 3) {
                            z = false;
                        }
                        a(i2, z);
                        return;
                    }
                }
            }
        } else if (this.p != 3) {
            this.p = 3;
            a(3, false);
        }
    }

    public final void a(Object obj, List list) {
        if (!this.g.a(obj)) {
            this.n = obj;
            aabd.a(this.f, list, acwi.a(this.n, false));
        }
    }

    private final void a(ajxu ajxu) {
        if (this.d == null && ajxu != null) {
            arwl arwl = ajxu.y;
            boolean z = false;
            List list = null;
            aowm aowm;
            apxp apxp;
            if (arwl == null) {
                ajzw ajzw = ajxu.B;
                if (ajzw != null) {
                    if (ajzv.b(ajzw, aowm.class)) {
                        aowm = (aowm) ajzv.a(ajzw, aowm.class);
                        this.d = new ihd(aowm, aowm.f.d());
                        list = aowm.e;
                    } else if (ajzv.b(ajzw, apxp.class)) {
                        apxp = (apxp) ajzv.a(ajzw, apxp.class);
                        this.d = new ihd(apxp, apxp.f.d());
                        list = apxp.e;
                    } else if (ajzv.b(ajzw, arbx.class)) {
                        arbx arbx = (arbx) ajzv.a(ajzw, arbx.class);
                        this.d = new ihd(arbx, arbx.c.d());
                        list = e;
                    }
                    z = true;
                }
            } else {
                anyd anyd;
                int i = arwl.a;
                if (i == 133765738) {
                    aowm aowm2 = (aowm) arwl.b;
                    this.d = new ihd(aowm2, aowm2.f.d());
                    if (arwl.a == 133765738) {
                        aowm = (aowm) arwl.b;
                    } else {
                        aowm = aowm.h;
                    }
                    anyd = aowm.e;
                } else if (i == 156617590) {
                    apxp apxp2 = (apxp) arwl.b;
                    this.d = new ihd(apxp2, apxp2.f.d());
                    if (arwl.a == 156617590) {
                        apxp = (apxp) arwl.b;
                    } else {
                        apxp = apxp.h;
                    }
                    anyd = apxp.e;
                } else if (i == 211734746) {
                    arbx arbx2 = (arbx) arwl.b;
                    this.d = new ihd(arbx2, arbx2.c.d());
                    anyd = e;
                }
                list = anyd;
            }
            ihd ihd = this.d;
            if (ihd != null) {
                igz igz = this.a;
                Object obj = ihd.a;
                igz.e();
                if (obj instanceof aowm) {
                    igz.a.a((aowm) obj);
                    igz.e = igz.a;
                } else if (obj instanceof apxp) {
                    igz.b.a((apxp) obj);
                    igz.e = igz.b;
                } else if (obj instanceof arbx) {
                    igz.c.a((arbx) obj);
                    igz.e = igz.c;
                }
                iha iha = igz.e;
                if (iha != null) {
                    iha.a(igz.d);
                    igz.b(1);
                    igz.af_();
                }
                iha = this.a.e;
                if (iha != null) {
                    iha.a(z);
                }
                if (list != null) {
                    for (aohh aohh : list) {
                        int a = aohj.a(aohh.b);
                        if (a == 0) {
                            a = 1;
                        }
                        int i2 = a - 1;
                        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                            if (a != 1) {
                                this.h.add(aohh);
                            }
                        }
                    }
                }
            }
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        boolean z = false;
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{vpa.class, ahjn.class, ahkn.class, ahkm.class};
        } else if (i == 0) {
            vpa vpa = (vpa) obj;
            vpb vpb = vpa.a;
            aaga aaga = vpa.f;
            if (vpb.a() && aaga != null && aaga.ah() == null && !aagr.a.equalsIgnoreCase(aaga.m())) {
                if (this.o == null) {
                    this.o = vpa.f;
                }
                aaga aaga2 = this.o;
                if (!(aaga2 == null || aaga2.q() == null)) {
                    a(this.o.q().a);
                }
                if (vpb == vpb.AD_VIDEO_PLAYING && this.o.a(this.i)) {
                    this.l = true;
                }
            }
            if (vpb == vpb.AD_VIDEO_ENDED) {
                a();
                return null;
            }
        } else if (i == 1) {
            if (((ahjn) obj).a == airc.FULLSCREEN) {
                z = true;
            }
            if (this.k != z) {
                this.k = z;
                a(this.m);
                return null;
            }
        } else if (i == 2) {
            ahkn ahkn = (ahkn) obj;
            aakj aakj = ahkn.b;
            airi airi = ahkn.a;
            if (airi == airi.VIDEO_PLAYING) {
                a(aakj.a);
                this.l = true;
            } else if (!airi.a()) {
                a();
                return null;
            }
        } else if (i == 3) {
            ahkm ahkm = (ahkm) obj;
            if (this.l) {
                a(ahkm.a);
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }

    static {
        aohh[] aohhArr = new aohh[1];
        aohk aohk = (aohk) aohh.d.createBuilder();
        aohk.copyOnWrite();
        aohh aohh = (aohh) aohk.instance;
        aohh.a |= 2;
        aohh.c = 0.0f;
        aohk.copyOnWrite();
        aohh = (aohh) aohk.instance;
        aohh.a |= 1;
        aohh.b = 1;
        aohhArr[0] = (aohh) ((anxl) aohk.build());
        e = Arrays.asList(aohhArr);
    }

    private final void a(int i, boolean z) {
        this.j.post(new ihe(this, i, z));
    }
}
