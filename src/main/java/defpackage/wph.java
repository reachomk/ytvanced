package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: wph */
public final class wph {
    public static final String a = wph.class.getSimpleName();
    public final ablj b;
    public final abkx c;
    public final Context d;
    public final wxd e;
    public final tnq f;
    public final acwa g;
    public final acum h;
    public final bcaa i;
    public boolean j;
    public wpk k;
    public wpm l;
    public wpl m = this;
    private final afpu n;
    private final afpo o;
    private final xoi p;
    private final tem q;
    private final tno r;
    private final tnv s;
    private final tns t;
    private final nn u;

    public wph(Context context, wxd wxd, ablj ablj, abkx abkx, afpu afpu, afpo afpo, xoi xoi, tem tem, tno tno, tnq tnq, tnv tnv, tns tns, acwa acwa, acum acum, bcaa bcaa, nn nnVar) {
        this.d = context;
        this.e = wxd;
        this.b = ablj;
        this.c = abkx;
        this.n = afpu;
        this.o = afpo;
        this.p = xoi;
        this.q = tem;
        this.r = tno;
        this.f = tnq;
        this.s = tnv;
        this.t = tns;
        this.g = acwa;
        this.h = acum;
        this.i = bcaa;
        this.u = nnVar;
    }

    public final void a(atqe atqe) {
        aqhy aqhy;
        atqm atqm = atqe.j;
        if (atqm == null) {
            atqm = atqm.c;
        }
        CharSequence charSequence = null;
        if (atqm.a != 64099105) {
            aqhy = null;
        } else {
            atqm = atqe.j;
            if (atqm == null) {
                atqm = atqm.c;
            }
            if (atqm.a == 64099105) {
                aqhy = (aqhy) atqm.b;
            } else {
                aqhy = aqhy.q;
            }
        }
        if (aqhy == null) {
            atqm = atqe.j;
            if (atqm == null) {
                atqm = atqm.c;
            }
            if (atqm.a == 65500215) {
                atqm = atqe.j;
                if (atqm == null) {
                    atqm = atqm.c;
                }
                charSequence = wqk.a(atqm.a == 65500215 ? (azpm) atqm.b : azpm.b);
            }
            if (charSequence == null) {
                if ((atqe.a & 128) != 0) {
                    wpm wpm = this.l;
                    if (wpm != null) {
                        atqm atqm2 = atqe.j;
                        if (atqm2 == null) {
                            atqm2 = atqm.c;
                        }
                        CharSequence a = wpm.a(atqm2);
                        if (a != null) {
                            String.valueOf(a).length();
                            a(a);
                            return;
                        }
                    }
                }
                int i = atqe.b;
                wpk wpk;
                if (i == 15) {
                    Object obj = this.k;
                    amqw.a(obj);
                    amqw.a((Object) atqe);
                    wpo wpo = new wpo();
                    wpo.Z = obj;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("get_cart_response", atqe.toByteArray());
                    wpo.f(bundle);
                    wpo.a(this.u.f(), "upgrade_dialog");
                    wpk = this.k;
                    if (wpk != null) {
                        wpk.d();
                    }
                } else if (this.j) {
                    this.j = false;
                    return;
                } else {
                    Object obj2;
                    Intent a2 = a((i == 7 ? (anvu) atqe.c : anvu.a).d(), atqe.l.d());
                    if ((atqe.a & 16) == 0) {
                        obj2 = aqdf.c;
                    } else {
                        aqde aqde = (aqde) aqdf.c.createBuilder();
                        String str = atqe.g;
                        aqde.copyOnWrite();
                        aqdf aqdf = (aqdf) aqde.instance;
                        if (str != null) {
                            aqdf.a |= 1;
                            aqdf.b = str;
                            obj2 = (aqdf) ((anxl) aqde.build());
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    asmz asmz = (asmz) asmw.f.createBuilder();
                    asmz.copyOnWrite();
                    asmw asmw = (asmw) asmz.instance;
                    if (obj2 != null) {
                        asmw.c = obj2;
                        asmw.b = 136;
                        this.h.a((asmw) ((anxl) asmz.build()));
                        if ((atqe.a & 4096) != 0) {
                            acum acum = this.h;
                            wpp wpp = new wpp();
                            wpp.a(atqe.m.d());
                            acum.a(wpp.a());
                        }
                        this.e.a(a2, 906, new wpn(this, atqe));
                        wpk = this.k;
                        if (wpk != null) {
                            wpk.a();
                        }
                    } else {
                        throw new NullPointerException();
                    }
                }
                return;
            }
            String.valueOf(charSequence).length();
            a(charSequence);
            return;
        }
        akcq.a(this.d, aqhy, (aaas) this.i.get(), this.g.t(), null);
        a();
    }

    public final void a(abmd abmd) {
        ablj ablj = this.b;
        ablj.h.a((aaml) abmd, new wpg(this));
    }

    private final Intent a(byte[] bArr, byte[] bArr2) {
        tnt a = this.t.a();
        a.a();
        tnv tnv = (tnv) this.s.a(this.o.a(this.n.c()));
        this.r.a();
        ((tnv) tnv.a()).a(bArr).a(this.r.b());
        try {
            this.s.a(a);
        } catch (UnsupportedOperationException unused) {
        }
        if (bArr2 != null && bArr2.length > 0) {
            this.s.b(bArr2);
        }
        Intent b = this.s.b();
        b.setPackage(this.q.a());
        return b;
    }

    public final void a(CharSequence charSequence) {
        wpk wpk = this.k;
        if (wpk != null) {
            wpk.a(charSequence);
        }
    }

    public final void a(Throwable th) {
        a(this.p.a(th));
    }

    public final void a() {
        wpk wpk = this.k;
        if (wpk != null) {
            wpk.b();
        }
    }
}
