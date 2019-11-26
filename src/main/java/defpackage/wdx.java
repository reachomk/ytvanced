package defpackage;

import android.app.AlertDialog.Builder;
import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: wdx */
public final class wdx implements afsw, wcx, wec {
    public final wei a;
    public final ajsn b;
    private final Context c;
    private final wlx d;
    private final wcv e;
    private final akso f;
    private final akrx g;
    private final xoi h;
    private final akvy i;
    private final wef j;
    private final acvx k;
    private final boolean l;

    public wdx(Context context, wlx wlx, wcv wcv, akso akso, akrx akrx, xoi xoi, akvy akvy, wei wei, ajsn ajsn, acvx acvx, boolean z) {
        this.c = context;
        this.d = (wlx) amqw.a((Object) wlx);
        this.e = (wcv) amqw.a((Object) wcv);
        this.f = (akso) amqw.a((Object) akso);
        this.g = (akrx) amqw.a((Object) akrx);
        this.h = (xoi) amqw.a((Object) xoi);
        this.i = akvy;
        this.a = (wei) amqw.a((Object) wei);
        this.j = new wey(akvy);
        this.b = (ajsn) amqw.a((Object) ajsn);
        this.k = acvx;
        this.l = z;
    }

    public final wei b() {
        return this.a;
    }

    public final ajsn a() {
        return this.b;
    }

    public final void a(Object obj) {
        akpk akpk = null;
        if (obj instanceof ajsj) {
            ajri[] ajriArr = ((ajsj) obj).a;
            int length = ajriArr.length;
            int i = 0;
            while (i < length) {
                ajri ajri = ajriArr[i];
                wcv wcv = this.e;
                akvy akvy = this.i;
                wcv.a(ajri, akvy != null ? amur.a("sectionController", akvy) : null);
                int i2 = ajri.h;
                int i3 = i2 - 1;
                if (i2 != 0) {
                    if (i3 != 1) {
                        wef wef;
                        ajrh ajrh;
                        ajst ajst;
                        if (i3 == 9) {
                            c();
                            wef = this.j;
                            if (wef != null) {
                                ajrh = ajri.c;
                                if (ajrh != null) {
                                    ajst = ajrh.a;
                                    if (ajst != null) {
                                        wef.a(ajst, true);
                                    }
                                }
                            }
                        } else if (i3 == 10) {
                            c();
                            wef = this.j;
                            if (wef != null) {
                                ajrh = ajri.c;
                                if (ajrh != null) {
                                    ajst = ajrh.a;
                                    if (ajst != null) {
                                        wef.a(ajst, false);
                                    }
                                }
                            }
                        } else if (i3 == 15) {
                            ajrh = ajri.c;
                            if (ajrh != null) {
                                ajst = ajrh.a;
                                if (ajst != null) {
                                    akvy akvy2 = this.i;
                                    akxk akxk = akvy2 instanceof akxk ? (akxk) akvy2 : null;
                                    if (akxk != null) {
                                        akxk.c(this.a.b(), ajst);
                                    }
                                }
                            }
                        } else if (i3 != 16) {
                        }
                        i++;
                    }
                    c();
                    if (!(this.a.b() == null || this.a.b().a == null || this.a.b().a.a == null)) {
                        this.d.a(this.a.b().a.a.g, ajri.f, ajri.e);
                    }
                    i++;
                } else {
                    throw null;
                }
            }
        } else if (obj instanceof asop) {
            asop asop = (asop) obj;
            if (asop == null) {
                xpr.a(this.c, (int) R.string.video_flagged, 1);
                return;
            }
            this.g.a(asop);
            Context context = this.c;
            if ((asop.a & 2) == 0) {
                wdx.a(context, asop, this);
                return;
            }
            Builder cancelable = new Builder(context).setCancelable(true);
            arml arml = asop.c;
            if (arml == null) {
                arml = arml.f;
            }
            cancelable.setMessage(ajqy.a(arml)).setPositiveButton(R.string.ok, new wea(context, asop, this)).show();
        } else if (obj instanceof ajzx) {
            ajzx ajzx = (ajzx) obj;
            if (ajzx != null) {
                akaa akaa = ajzx.a;
                if (akaa != null) {
                    axav axav = akaa.a;
                    if (axav != null) {
                        this.k.a(axav.k.d());
                        this.f.a(axav, (Object) this);
                    }
                }
            }
        } else if (obj instanceof asob) {
            wei wei = this.a;
            obj = wei != null ? wei.b() : null;
            akvy akvy3 = this.i;
            if (akvy3 != null) {
                akpk = (akpk) akvy3.a();
            }
            if (!(akpk == null || obj == null)) {
                akpk.remove(obj);
            }
        }
    }

    public final void a(bqn bqn) {
        this.h.c(bqn);
    }

    public static void a(Context context, asop asop, wcx wcx) {
        if ((asop.a & 4) != 0) {
            asol asol = asop.d;
            if (asol == null) {
                asol = asol.c;
            }
            arml arml = asol.b;
            if (arml == null) {
                arml = arml.f;
            }
            xpr.a(context, ajqy.a(arml), 1);
        }
        if (!(wcx == null || wcx.a() == null || wcx.b() == null)) {
            ajsn a = wcx.a();
            wei b = wcx.b();
            ajst b2 = b.b();
            if (b2 != null && b2.a == null) {
                b.b(a);
            } else if (b2 != null) {
                ajsu ajsu = b2.a;
                if (ajsu != null) {
                    ajsn ajsn = ajsu.a;
                    if (ajsn != null) {
                        if (aocf.messageNanoEquals(ajsn, a)) {
                            b.c();
                            return;
                        }
                        b.b(a);
                    }
                }
            }
        }
    }

    private final void c() {
        ajst b = this.a.b();
        if (b != null) {
            ajsu ajsu = b.a;
            if (ajsu != null) {
                ajsn ajsn = ajsu.a;
                if (ajsn != null) {
                    if (aocf.messageNanoEquals(ajsn, this.b)) {
                        this.a.c();
                        return;
                    } else if (this.l) {
                        this.a.a(null, this.b);
                        return;
                    } else {
                        this.a.b(this.b);
                        return;
                    }
                }
            }
        }
        this.a.b(this.b);
    }
}
