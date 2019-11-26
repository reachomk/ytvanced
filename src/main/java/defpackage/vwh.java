package defpackage;

import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import com.google.protos.youtube.api.innertube.AdClickCommandRendererOuterClass;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: vwh */
public final class vwh implements vdo {
    public final vwf a;
    public final aaas b;
    public final waw c;
    public apxu d;
    public aogq e;
    public aogq f;
    public aogq g;
    public long h;
    private final bcud i;
    private final akkq j;
    private final Handler k = new Handler(Looper.getMainLooper());
    private final acvx l;
    private CountDownTimer m;
    private vdp n;
    private wxi o;
    private long p;

    public vwh(vwf vwf, akkq akkq, aaas aaas, bcud bcud, waw waw, acvx acvx) {
        this.a = (vwf) amqw.a((Object) vwf);
        this.b = (aaas) amqw.a((Object) aaas);
        this.i = (bcud) amqw.a((Object) bcud);
        this.c = (waw) amqw.a((Object) waw);
        this.j = (akkq) amqw.a((Object) akkq);
        this.l = (acvx) amqw.a((Object) acvx);
        ((ihy) vwf).d = new vwg(this);
    }

    public final void a(aogq aogq) {
        if (aogq != null) {
            List arrayList = new ArrayList();
            arrayList.addAll(aogq.c);
            if ((aogq.a & 1) != 0) {
                Object obj = aogq.b;
                if (obj == null) {
                    obj = apxu.d;
                }
                arrayList.add(obj);
            }
            this.b.a(arrayList, null);
        }
    }

    public final void a(vra vra) {
        this.i.e_(aiui.DISABLE);
        this.a.a(false);
        vdp vdp = this.n;
        if (vdp != null) {
            vdp.a(vra);
            this.n = null;
        }
        c();
    }

    public final boolean a(vdp vdp) {
        if (vdp.a().m() != null) {
            aolg aolg;
            anxl anxl;
            aoll aoll;
            c();
            this.n = vdp;
            anxl m = vdp.a().m();
            Iterator it = m.b.iterator();
            do {
                anxl = null;
                if (!it.hasNext()) {
                    aoll = null;
                    break;
                }
                aolg = (aolg) it.next();
            } while (aolg.a != 90451653);
            aoll = (aoll) ((anxo) ((aoli) aolg.b).toBuilder());
            Spanned a;
            Spanned a2;
            aygk aygk;
            aygk aygk2;
            axak b;
            axak axak;
            if (aoll == null || (((aoli) aoll.instance).a & 512) == 0) {
                int size = m.b.size();
                int i = 0;
                while (i < size) {
                    anxo anxo = (aolj) ((anxo) ((aolg) m.b.get(i)).toBuilder());
                    aolg = (aolg) anxo.instance;
                    if (aolg.a == 122556306) {
                        anxo anxo2 = (aoln) ((anxo) ((aolk) aolg.b).toBuilder());
                        if (anxo2.a()) {
                            arml arml;
                            aygk aygk3;
                            anxl anxl2;
                            aolm aolm;
                            if (anxo2.a(axog.b) && ((Boolean) anxo2.b(axog.b)).booleanValue()) {
                            } else {
                                a(Collections.unmodifiableList(((aolk) anxo2.instance).l));
                                this.l.a(((aolk) anxo2.instance).p.d(), null);
                                anxo2.a(axog.b, Boolean.valueOf(true));
                            }
                            aolk aolk = (aolk) anxo2.instance;
                            if ((aolk.a & 4) != 0) {
                                arml = aolk.d;
                                if (arml == null) {
                                    arml = arml.f;
                                }
                            } else {
                                arml = null;
                            }
                            a = ajqy.a(arml);
                            aolk = (aolk) anxo2.instance;
                            if ((aolk.a & 64) != 0) {
                                arml = aolk.i;
                                if (arml == null) {
                                    arml = arml.f;
                                }
                            } else {
                                arml = null;
                            }
                            a2 = ajqy.a(arml);
                            aolk = (aolk) anxo2.instance;
                            if ((aolk.a & 16) != 0) {
                                arml = aolk.f;
                                if (arml == null) {
                                    arml = arml.f;
                                }
                            } else {
                                arml = null;
                            }
                            Spanned a3 = ajqy.a(arml);
                            aolk = (aolk) anxo2.instance;
                            if ((aolk.a & 512) != 0) {
                                aygk3 = aolk.m;
                                if (aygk3 == null) {
                                    aygk3 = aygk.f;
                                }
                                aygk = aygk3;
                            } else {
                                aygk = null;
                            }
                            aolk = (aolk) anxo2.instance;
                            if ((aolk.a & 1) != 0) {
                                aygk3 = aolk.b;
                                if (aygk3 == null) {
                                    aygk3 = aygk.f;
                                }
                                aygk2 = aygk3;
                            } else {
                                aygk2 = null;
                            }
                            b = anxo2.b();
                            anxr access$000 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
                            b.a(access$000);
                            if (b.h.a(access$000.d)) {
                                b = anxo2.b();
                                access$000 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
                                b.a(access$000);
                                Object b2 = b.h.b(access$000.d);
                                if (b2 == null) {
                                    b2 = access$000.b;
                                } else {
                                    b2 = access$000.a(b2);
                                }
                                anxl2 = (aohe) b2;
                            } else {
                                anxl2 = null;
                            }
                            Integer valueOf = Integer.valueOf(((aolk) anxo2.instance).n);
                            aolk = (aolk) anxo2.instance;
                            if ((aolk.a & 16384) != 0) {
                                aolm aolm2 = aolk.q;
                                if (aolm2 == null) {
                                    aolm2 = aolm.d;
                                }
                                aolm = aolm2;
                            } else {
                                aolm = null;
                            }
                            float f = ((aolk) anxo2.instance).k;
                            if (anxo2.a()) {
                                anxl = ((aolk) anxo2.instance).j;
                                if (anxl == null) {
                                    anxl = apxu.d;
                                }
                            }
                            anxl anxl3 = anxl;
                            axak = ((aolk) anxo2.instance).c;
                            if (axak == null) {
                                axak = axak.a;
                            }
                            aogq a4 = vwh.a(axak);
                            axak = ((aolk) anxo2.instance).e;
                            if (axak == null) {
                                axak = axak.a;
                            }
                            aogq a5 = vwh.a(axak);
                            axak = ((aolk) anxo2.instance).g;
                            if (axak == null) {
                                axak = axak.a;
                            }
                            anxo anxo3 = anxo2;
                            anxo anxo4 = anxo;
                            anxl anxl4 = m;
                            int i2 = i;
                            a(a, a2, a3, 0.0f, null, aygk, aygk2, anxl2, valueOf, aolm, 1, f, anxl3, a4, a5, vwh.a(axak));
                            anxo4.copyOnWrite();
                            anxo anxo5 = anxo4;
                            aolg aolg2 = (aolg) anxo5.instance;
                            aolg2.b = (anxl) anxo3.build();
                            aolg2.a = 122556306;
                            aolf aolf = (aolf) ((anxo) anxl4.toBuilder());
                            aolf.copyOnWrite();
                            aolc aolc = (aolc) aolf.instance;
                            if (!aolc.b.a()) {
                                aolc.b = anxl.mutableCopy(aolc.b);
                            }
                            aolc.b.set(i2, (aolg) ((anxl) anxo5.build()));
                            aolf.build();
                            return true;
                        }
                    }
                    i++;
                    m = m;
                }
            } else {
                arml arml2;
                arml arml3;
                arml arml4;
                arml arml5;
                aohe aohe;
                if (!(aoll.a(aows.b) && ((Boolean) aoll.b(aows.b)).booleanValue())) {
                    a(Collections.unmodifiableList(((aoli) aoll.instance).o));
                    this.l.a(((aoli) aoll.instance).n.d(), null);
                    aoll.a(aows.b, Boolean.valueOf(true));
                }
                aoli aoli = (aoli) aoll.instance;
                if ((aoli.a & 4) != 0) {
                    arml2 = aoli.d;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                } else {
                    arml2 = null;
                }
                a = ajqy.a(arml2);
                aoli aoli2 = (aoli) aoll.instance;
                if ((aoli2.a & 256) != 0) {
                    arml3 = aoli2.k;
                    if (arml3 == null) {
                        arml3 = arml.f;
                    }
                } else {
                    arml3 = null;
                }
                a2 = ajqy.a(arml3);
                aoli aoli3 = (aoli) aoll.instance;
                if ((aoli3.a & 16) != 0) {
                    arml4 = aoli3.f;
                    if (arml4 == null) {
                        arml4 = arml.f;
                    }
                } else {
                    arml4 = null;
                }
                Spanned a6 = ajqy.a(arml4);
                aoli aoli4 = (aoli) aoll.instance;
                float f2 = aoli4.g;
                if ((aoli4.a & 128) != 0) {
                    arml5 = aoli4.j;
                    if (arml5 == null) {
                        arml5 = arml.f;
                    }
                } else {
                    arml5 = null;
                }
                Spanned a7 = ajqy.a(arml5);
                aoli aoli5 = (aoli) aoll.instance;
                if ((aoli5.a & 8192) != 0) {
                    aygk = aoli5.p;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                } else {
                    aygk = null;
                }
                aoli aoli6 = (aoli) aoll.instance;
                if ((aoli6.a & 1) != 0) {
                    aygk2 = aoli6.b;
                    if (aygk2 == null) {
                        aygk2 = aygk.f;
                    }
                } else {
                    aygk2 = null;
                }
                aoli aoli7 = (aoli) aoll.instance;
                if ((aoli7.a & 65536) != 0) {
                    anxp anxp = aoli7.s;
                    if (anxp == null) {
                        anxp = axak.a;
                    }
                    anxr access$0002 = anxl.checkIsLite(AdCtaButtonRendererOuterClass.adCtaButtonRenderer);
                    anxp.a(access$0002);
                    Object b3 = anxp.h.b(access$0002.d);
                    if (b3 == null) {
                        b3 = access$0002.b;
                    } else {
                        b3 = access$0002.a(b3);
                    }
                    aohe = (aohe) b3;
                } else {
                    aohe = null;
                }
                Integer valueOf2 = Integer.valueOf(((aoli) aoll.instance).q);
                aoli aoli8 = (aoli) aoll.instance;
                if ((aoli8.a & 131072) != 0) {
                    anxl = aoli8.t;
                    if (anxl == null) {
                        anxl = aolm.d;
                    }
                }
                anxl anxl5 = anxl;
                int a8 = awui.a(((aoli) aoll.instance).r);
                int i3 = a8 != 0 ? a8 : 1;
                aoli aoli9 = (aoli) aoll.instance;
                float f3 = aoli9.m;
                apxu apxu = aoli9.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                apxu apxu2 = apxu;
                axak = ((aoli) aoll.instance).c;
                if (axak == null) {
                    axak = axak.a;
                }
                aogq a9 = vwh.a(axak);
                axak = ((aoli) aoll.instance).e;
                if (axak == null) {
                    axak = axak.a;
                }
                aogq a10 = vwh.a(axak);
                b = ((aoli) aoll.instance).i;
                if (b == null) {
                    b = axak.a;
                }
                a(a, a2, a6, f2, a7, aygk, aygk2, aohe, valueOf2, anxl5, i3, f3, apxu2, a9, a10, vwh.a(b));
                return true;
            }
        }
        return false;
    }

    public final void a() {
        c();
    }

    public final void a(long j) {
        this.m = new vwj(this, j);
        this.m.start();
    }

    public final void b() {
        CountDownTimer countDownTimer = this.m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.m = null;
        }
    }

    public final void b(long j) {
        if (this.d != null) {
            if (j > 0) {
                this.a.a(j, this.p);
                return;
            }
            a(vra.ENDCAP_ENDED);
        }
    }

    private final void c() {
        b();
        wxi wxi = this.o;
        if (wxi != null) {
            wxi.a();
            this.o = null;
        }
        this.h = 0;
        this.p = 0;
        this.a.c();
        this.d = null;
        this.n = null;
        this.i.e_(aiui.DISABLE);
        this.e = null;
        this.f = null;
        this.g = null;
    }

    private final void a(List list) {
        if (!list.isEmpty()) {
            for (apxu a : list) {
                this.b.a(a, null);
            }
        }
    }

    private static aogq a(axak axak) {
        anxr access$000 = anxl.checkIsLite(AdClickCommandRendererOuterClass.adClickCommandRenderer);
        axak.a(access$000);
        if (!axak.h.a(access$000.d)) {
            return null;
        }
        access$000 = anxl.checkIsLite(AdClickCommandRendererOuterClass.adClickCommandRenderer);
        axak.a(access$000);
        Object b = axak.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        return (aogq) b;
    }

    private final void a(Spanned spanned, CharSequence charSequence, Spanned spanned2, float f, CharSequence charSequence2, aygk aygk, aygk aygk2, aohe aohe, Integer num, aolm aolm, int i, float f2, apxu apxu, aogq aogq, aogq aogq2, aogq aogq3) {
        aogq aogq4 = aogq;
        aogq aogq5 = aogq2;
        aogq aogq6 = aogq3;
        this.d = apxu;
        this.a.a(spanned, charSequence, spanned2, f, charSequence2, aygk, aohe, num, aolm, i, aogq4 != null, aogq5 != null, aogq6 != null);
        if (aygk2 != null) {
            this.o = wxi.a(new vwi(this));
            this.j.b(aklb.e(aygk2), wxl.a(this.k, this.o));
        }
        long convert = TimeUnit.MILLISECONDS.convert((long) ((int) f2), TimeUnit.SECONDS);
        this.p = convert;
        this.a.a(convert, convert);
        a(this.p);
        this.a.a(true);
        this.i.e_(aiui.ENABLE);
        this.e = aogq4;
        this.f = aogq5;
        this.g = aogq6;
        aogq4 = this.e;
        if (aogq4 != null) {
            this.l.a(aogq4.d.d(), null);
        }
        aogq4 = this.f;
        if (aogq4 != null) {
            this.l.a(aogq4.d.d(), null);
        }
        aogq4 = this.g;
        if (aogq4 != null) {
            this.l.a(aogq4.d.d(), null);
        }
    }
}
