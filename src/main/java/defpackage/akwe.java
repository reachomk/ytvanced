package defpackage;

import android.text.TextUtils;

/* renamed from: akwe */
public class akwe extends akuz implements aktv, akui, akxk, akxl, xcp {
    private boolean a;
    private akxm b;

    public akwe(aana aana, akvz akvz, xci xci, xoi xoi, acvx acvx, akyd akyd) {
        this(aana, akvz, xci, xoi, acvx, akyd, new akpk());
    }

    public akwe(aana aana, akvz akvz, xci xci, xoi xoi, acvx acvx, akyd akyd, amqp amqp) {
        this(aana, akvz, xci, xoi, acvx, akyd, new akpk(), amqp);
    }

    public akwe(aana aana, akvz akvz, xci xci, xoi xoi, acvx acvx, akyd akyd, akpk akpk) {
        this(aana, akvz, xci, xoi, acvx, akyd, akpk, ampo.a);
    }

    private akwe(aana aana, akvz akvz, xci xci, xoi xoi, acvx acvx, akyd akyd, akpk akpk, amqp amqp) {
        akvz.get();
        super(aana, xci, xoi, acvx, akyd.a(akyd), akpk);
        akvz.a(aafj.class);
        amqw.a((Object) xci);
        if (akyd instanceof akwh) {
            this.a = ((akwh) akyd).a;
        }
        xci.a((Object) this);
        akpk.a(new akwa(this));
        akpk.a(new akya(this));
        this.b = new akxm();
        a(new akwc(amqp));
    }

    public final void a(Object obj) {
        b(obj);
    }

    public void a(Object obj, int i) {
        if (this.a) {
            b(obj, i + 1);
        } else {
            b(obj, i);
        }
    }

    public final void c(Object obj, Object obj2) {
        b(obj, obj2);
    }

    public final void a(aaxd aaxd) {
        super.c(aaxd.b);
    }

    public void a(zyg zyg) {
        super.c(zyg.d);
    }

    public final void a(akwd akwd) {
        super.c(akwd.a);
    }

    public void a(zyp zyp) {
        amqv amqv = zyp.b;
        if (amqv == null) {
            super.c(zyp.a);
        } else {
            super.a(amqv);
        }
    }

    public void a(aafj aafj) {
        b();
        ajwt ajwt = aafj.a;
        ajws ajws = ajwt != null ? ajwt.d : null;
        this.a = false;
        if (ajws != null) {
            if (ajws.a != null) {
                a(ajws);
            } else {
                atvt atvt = ajws.b;
                if (atvt == null) {
                    Object obj = ajws.c;
                    if (obj == null) {
                        obj = ajws.e;
                        if (obj == null) {
                            arbs arbs = ajws.d;
                            obj = arbs != null ? arbs : null;
                        }
                    }
                    if (obj != null) {
                        b(obj);
                        this.a = true;
                    }
                } else {
                    atvx atvx = atvt.c;
                    if (atvx == null) {
                        atvx = atvx.c;
                    }
                    if ((atvx.a & 1) != 0) {
                        b(ajws.b);
                        this.a = true;
                    }
                }
            }
        }
        b(aafj);
    }

    /* Access modifiers changed, original: protected */
    public void a(ajws ajws) {
        arml arml = ajws.a.b;
        if (arml == null) {
            arml = arml.f;
        }
        if (!TextUtils.isEmpty(ajqy.a(arml))) {
            b(ajws.a);
            this.a = true;
        }
    }

    public void a(awzv awzv) {
        b();
        a(ajtj.a(awzv));
    }

    public akyd E_() {
        return new akwh(super.E_(), this.a);
    }

    /* Access modifiers changed, original: protected */
    public void b(aafj aafj) {
        if (aafj != null) {
            b(aafj.b());
            a(this.b.a(aafj.a.b));
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(aafj aafj, ajti ajti) {
        super.a((Object) aafj, ajti);
        if (aafj != null) {
            if (ajti == ajti.RELOAD) {
                a(aafj);
                return;
            }
            b(aafj);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(akxt akxt) {
        this.b.a(akxt);
    }

    public Class[] a(Class cls, Object obj, int i) {
        if (cls != akwe.class) {
            return akuj.a((akuz) this, obj, i);
        }
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{zyg.class, zyp.class, aaxd.class, akwd.class};
        } else if (i == 0) {
            a((zyg) obj);
        } else if (i == 1) {
            a((zyp) obj);
        } else if (i == 2) {
            a((aaxd) obj);
        } else if (i == 3) {
            a((akwd) obj);
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
