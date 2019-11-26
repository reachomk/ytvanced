package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.google.protos.youtube.api.innertube.MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: vcw */
public final class vcw implements ajan, vdw, xcp {
    public final List a;
    public final acvx b;
    @Deprecated
    public final vuu c = new vdf(this);
    public vdb d;
    public aaga e;
    public boolean f;
    public boolean g;
    public final Set h = new HashSet();
    public final waw i;
    public final Activity j;
    public final akkq k;
    public final vod l;
    public View m;
    public akor n;
    private final List o;
    private boolean p;
    private MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer q;
    private final Map r = new HashMap();
    private final aaas s;

    public vcw(Activity activity, akkq akkq, aaas aaas, acvx acvx, waw waw, vod vod) {
        Object arrayList = new ArrayList();
        Object arrayList2 = new ArrayList();
        this.j = activity;
        this.k = akkq;
        this.i = waw;
        this.s = aaas;
        this.l = vod;
        this.b = (acvx) amqw.a((Object) acvx);
        this.o = (List) amqw.a(arrayList);
        this.a = (List) amqw.a(arrayList2);
    }

    public final long e() {
        return 1;
    }

    public final void a(vcy vcy) {
        this.o.add(vcy);
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(bcut.a()).a(new vcz(this))};
    }

    private final void a(aaga aaga) {
        a();
        this.e = aaga;
    }

    public final vcy a(aakj aakj) {
        for (vcy vcy : this.o) {
            if (vcy.a(this.e, aakj)) {
                return vcy;
            }
        }
        return null;
    }

    public final void a(vdb vdb) {
        vdb vdb2 = this.d;
        this.d = vdb;
        if (vdb2 != this.d) {
            for (vda vda : this.h) {
                if (this.d == null) {
                    vda.c();
                } else {
                    vda.b();
                }
            }
        }
    }

    public final void a() {
        for (vdb a : this.o) {
            a.a(this.m);
        }
        for (vdb a2 : this.a) {
            a2.a(this.m);
        }
        a(null);
        this.r.clear();
        this.m = null;
        this.e = null;
        this.f = false;
        this.p = false;
        this.g = false;
    }

    public final void a(vrv vrv) {
        if (vrv.b() != null) {
            a(vrv.b(), vrv.c());
        } else {
            a(a(vrv.c()));
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        boolean z = true;
        Class[] clsArr = null;
        vdb vdb;
        if (i == -1) {
            clsArr = new Class[]{vde.class, vow.class, vpa.class};
        } else if (i == 0) {
            vde vde = (vde) obj;
            vdb = this.d;
            if (!(vdb == null || this.m == null || !(vdb instanceof vdd))) {
                vdd vdd = (vdd) vdb;
                MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer multiStateCompanionAdRendererOuterClass$CompanionStateRenderer = (MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer) this.r.get(vde.a);
                if (multiStateCompanionAdRendererOuterClass$CompanionStateRenderer != null) {
                    if (multiStateCompanionAdRendererOuterClass$CompanionStateRenderer.e) {
                        this.d.a(this.m);
                    } else if ((multiStateCompanionAdRendererOuterClass$CompanionStateRenderer.a & 2) != 0) {
                        axak axak = multiStateCompanionAdRendererOuterClass$CompanionStateRenderer.c;
                        if (axak == null) {
                            axak = axak.a;
                        }
                        ajzw a = ajzv.a(axak);
                        this.d.a(this.m);
                        boolean a2 = vdd.a(a, this.p);
                        this.q = multiStateCompanionAdRendererOuterClass$CompanionStateRenderer;
                        if (!a2) {
                            afpf afpf = afpf.ad;
                            String valueOf = String.valueOf(a);
                            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 44);
                            stringBuilder.append("Unable to load companion card with renderer ");
                            stringBuilder.append(valueOf);
                            afpc.a(2, afpf, stringBuilder.toString());
                        }
                        this.d.a(this.m, this.n);
                    }
                }
            }
        } else if (i == 1) {
            vow vow = (vow) obj;
            vdb = this.d;
            if (vdb != null) {
                z = vdb.a(vow, this.g);
            }
            if (z) {
                for (vda a3 : this.h) {
                    a3.a();
                }
            }
            this.p = false;
            vra vra = vow.b;
            if (!(vra == vra.VIDEO_ENDED || vra == vra.ENDCAP_ENDED || vra == vra.SURVEY_ENDED)) {
                MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2 = this.q;
                if (multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2 != null) {
                    Object a4;
                    apxu apxu;
                    if ((multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2.a & 2) != 0) {
                        axak axak2 = multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2.c;
                        if (axak2 == null) {
                            axak2 = axak.a;
                        }
                        a4 = ajzv.a(axak2);
                    } else {
                        a4 = null;
                    }
                    Map a5 = acwi.a(a4, false);
                    aaas aaas = this.s;
                    MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer multiStateCompanionAdRendererOuterClass$CompanionStateRenderer3 = this.q;
                    if ((multiStateCompanionAdRendererOuterClass$CompanionStateRenderer3.a & 4) == 0) {
                        apxu = null;
                    } else {
                        apxu = multiStateCompanionAdRendererOuterClass$CompanionStateRenderer3.d;
                        if (apxu == null) {
                            apxu = apxu.d;
                        }
                    }
                    aaas.a(apxu, a5);
                }
            }
            if (z) {
                a(null);
                return null;
            }
        } else if (i == 2) {
            vpa vpa = (vpa) obj;
            int ordinal = vpa.a.ordinal();
            aaga aaga;
            if (ordinal == 1) {
                aaga = vpa.f;
                aaga aaga2 = this.e;
                if (aaga2 == null || !TextUtils.equals(aaga2.l(), aaga.l())) {
                    a(aaga);
                    return null;
                }
            } else if (ordinal == 2) {
                aaga = vpa.f;
                if (this.e != aaga) {
                    a(aaga);
                }
                this.p = true;
                this.f = true;
                vdb = this.d;
                if (vdb != null) {
                    vdb.a();
                    return null;
                }
            }
        } else {
            StringBuilder stringBuilder2 = new StringBuilder(32);
            stringBuilder2.append("unsupported op code: ");
            stringBuilder2.append(i);
            throw new IllegalStateException(stringBuilder2.toString());
        }
        return clsArr;
    }

    public final void a(akcb akcb, aakj aakj) {
        if (this.e != null) {
            MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer multiStateCompanionAdRendererOuterClass$CompanionStateRenderer = null;
            if (akcb != null) {
                aveo aveo;
                ajtb ajtb = akcb.f;
                if (ajtb != null) {
                    aveo = ajtb.g;
                } else {
                    aveo = null;
                }
                if (aveo != null) {
                    for (axak axak : aveo.a) {
                        MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2;
                        anxr access$000 = anxl.checkIsLite(MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.companionStateRenderer);
                        axak.a(access$000);
                        if (axak.h.a(access$000.d)) {
                            access$000 = anxl.checkIsLite(MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.companionStateRenderer);
                            axak.a(access$000);
                            Object b = axak.h.b(access$000.d);
                            if (b == null) {
                                b = access$000.b;
                            } else {
                                b = access$000.a(b);
                            }
                            multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2 = (MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer) b;
                        } else {
                            multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2 = null;
                        }
                        if (!(multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2 == null || (multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2.a & 1) == 0)) {
                            this.r.put(multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2.b, multiStateCompanionAdRendererOuterClass$CompanionStateRenderer2);
                        }
                    }
                }
            }
            for (vdb vdb : this.a) {
                if (vdb.a(this.e, akcb)) {
                    a(vdb);
                    break;
                }
            }
            if (this.d == null) {
                if (akcb != null) {
                    ajtb ajtb2 = akcb.f;
                    aveo aveo2 = ajtb2 != null ? ajtb2.g : null;
                    if (aveo2 != null) {
                        for (axak axak2 : aveo2.a) {
                            anxr access$0002 = anxl.checkIsLite(MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.companionStateRenderer);
                            axak2.a(access$0002);
                            if (axak2.h.a(access$0002.d)) {
                                Object obj;
                                anxr access$0003 = anxl.checkIsLite(MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.companionStateRenderer);
                                axak2.a(access$0003);
                                Object b2 = axak2.h.b(access$0003.d);
                                if (b2 == null) {
                                    obj = access$0003.b;
                                } else {
                                    obj = access$0003.a(b2);
                                }
                                multiStateCompanionAdRendererOuterClass$CompanionStateRenderer = (MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer) obj;
                            }
                        }
                    }
                }
                if (multiStateCompanionAdRendererOuterClass$CompanionStateRenderer != null && (multiStateCompanionAdRendererOuterClass$CompanionStateRenderer.a & 2) != 0) {
                    axak axak3 = multiStateCompanionAdRendererOuterClass$CompanionStateRenderer.c;
                    if (axak3 == null) {
                        axak3 = axak.a;
                    }
                    ajzw a = ajzv.a(axak3);
                    for (vdb vdb2 : this.a) {
                        if ((vdb2 instanceof vdd) && ((vdd) vdb2).a(a)) {
                            a(vdb2);
                            this.q = multiStateCompanionAdRendererOuterClass$CompanionStateRenderer;
                            break;
                        }
                    }
                }
            }
            if (this.d == null) {
                a(a(aakj));
            }
            vdb vdb3 = this.d;
            if (vdb3 != null && this.f) {
                vdb3.a();
            }
        }
    }
}
