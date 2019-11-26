package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Iterator;

/* renamed from: zwj */
public final class zwj implements xcp {
    private long A = 0;
    public final Activity a;
    public final acys b;
    public zuf c;
    public zuf d;
    public int e = -1;
    public String f;
    public boolean g;
    public zvv h;
    public aibd i;
    public zwq j;
    public final aaas k;
    public final aaas l;
    public final afpu m;
    public final afqe n;
    public final xoi o;
    private final xsc p;
    private final zwn q;
    private boolean r;
    private String s;
    private String t;
    private String u;
    private boolean v;
    private boolean w;
    private long x;
    private boolean y;
    private final acvx z;

    public zwj(Activity activity, Bundle bundle, afqv afqv, afti afti, acvx acvx, xsc xsc, aaas aaas, aaas aaas2, afpu afpu, afqe afqe, xoi xoi, zwn zwn) {
        this.a = (Activity) amqw.a((Object) activity);
        this.p = (xsc) amqw.a((Object) xsc);
        this.q = zwn;
        this.b = new acys(afqv, afti, "iv");
        a(null);
        if (bundle != null) {
            this.c = (zuf) bundle.getParcelable("info-card-collection");
            this.d = (zuf) bundle.getParcelable("shopping-info-card-collection");
            this.f = bundle.getString("last-pinged-video-id");
            this.r = bundle.getBoolean("info-cards-are-shown");
            this.e = bundle.getInt("active-card-index");
        }
        this.k = aaas;
        this.l = aaas2;
        this.z = acvx;
        this.m = (afpu) amqw.a((Object) afpu);
        this.n = (afqe) amqw.a((Object) afqe);
        this.o = (xoi) amqw.a((Object) xoi);
    }

    public final void a(zwq zwq) {
        c();
        zwq zwq2 = this.j;
        if (zwq2 != null) {
            zwq2.a(null);
        }
        this.j = zwq;
        zwq = this.j;
        if (zwq != null) {
            zwq.a(this);
        }
    }

    private final void a(zuf zuf, String str, String str2) {
        if (this.h == null) {
            xtl.c("Missing InfoCardOverlayPresenter for InfoCards to work.");
        } else if (this.i == null) {
            xtl.c("Missing ControlsOverlayPresenter for InfoCards to work.");
        } else if (str == null || !str.equals(this.s)) {
            this.s = str;
            this.h.a();
            this.b.a("CPN", str2);
            this.c = zuf;
            this.x = -1;
            this.y = false;
            if (zuf != null) {
                zvv zvv = this.h;
                zvv.d = zuf;
                zvs zvs = zvv.a;
                zwh zwh = zvv.c;
                zwj zwj = zvv.b;
                zvs.j = zwj;
                zvs.g.a(zuf.a(), zwh, zwj);
                zvs.i.c(true);
                CharSequence b = zuf.b();
                if (b != null) {
                    ((TextView) zvs.findViewById(R.id.info_cards_drawer_header)).setText(b);
                    zvs.d.setContentDescription(b);
                }
                a(zuf.c());
                if (this.r) {
                    this.r = false;
                    int i = this.e;
                    if (i > 0 && i >= zuf.a().size()) {
                        this.e = -1;
                    }
                    a(this.e, false);
                } else {
                    this.e = -1;
                }
            }
        }
    }

    public final zud a() {
        int i = this.e;
        if (i >= 0) {
            zuf zuf = this.c;
            if (zuf != null && i < zuf.a().size()) {
                return (zud) this.c.a().get(this.e);
            }
        }
        return null;
    }

    public final void b() {
        if (this.c == null) {
            xtl.d("Failed to show info card drawer - missing infoCardCollection");
        } else if (!this.g || h()) {
            a(this.e, true);
            zud a = a();
            if (a == null) {
                this.b.a(this.c.a.b);
                b(this.c.c());
                return;
            }
            this.b.a(a.a().e);
            b(a.j());
        } else {
            c();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0087  */
    public final void a(int r6, boolean r7) {
        /*
        r5 = this;
        r0 = r5.q;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r0.a();
    L_0x0007:
        r0 = r5.c;
        r5.a(r0);
        r5.d();
        r0 = -1;
        r1 = 0;
        if (r6 != r0) goto L_0x0015;
    L_0x0013:
        r0 = 0;
        goto L_0x0016;
    L_0x0015:
        r0 = r6;
    L_0x0016:
        r2 = r5.h;
        r3 = r2.d;
        r4 = 1;
        if (r3 != 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0049;
    L_0x001e:
        r3 = r3.a();
        r3 = r3.size();
        if (r3 == 0) goto L_0x0049;
    L_0x0028:
        if (r0 < 0) goto L_0x0043;
    L_0x002a:
        r3 = r2.d;
        r3 = r3.a();
        r3 = r3.size();
        if (r0 < r3) goto L_0x0037;
    L_0x0036:
        goto L_0x0043;
    L_0x0037:
        r3 = r2.a;
        r3.a(r0);
        r2.f = r4;
        r2 = r2.d();
        goto L_0x004f;
    L_0x0043:
        r2 = "Info card index outside of infoCardCollection";
        defpackage.xtl.d(r2);
        goto L_0x004e;
    L_0x0049:
        r2 = "Failed to show info card gallery - missing infoCardCollection";
        defpackage.xtl.d(r2);
    L_0x004e:
        r2 = 0;
    L_0x004f:
        if (r2 == 0) goto L_0x0056;
    L_0x0051:
        r3 = r5.i;
        r3.a();
    L_0x0056:
        r3 = r5.j;
        if (r3 != 0) goto L_0x005b;
    L_0x005a:
        goto L_0x007d;
    L_0x005b:
        if (r2 != 0) goto L_0x0073;
    L_0x005d:
        r2 = r5.h();
        if (r2 == 0) goto L_0x006b;
    L_0x0063:
        r7 = r5.j;
        r2 = r5.c;
        r7.a(r2, r0);
        goto L_0x007d;
    L_0x006b:
        r2 = r5.j;
        r3 = r5.c;
        r2.a(r3, r0, r7);
        goto L_0x007d;
    L_0x0073:
        r3.a(r1);
        r7 = r5.j;
        r2 = r5.c;
        r7.a(r2, r0, r1);
    L_0x007d:
        r5.e = r6;
        r5.g = r4;
        r6 = r5.h();
        if (r6 == 0) goto L_0x0089;
    L_0x0087:
        r5.v = r1;
    L_0x0089:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zwj.a(int, boolean):void");
    }

    public final void c() {
        if (this.g) {
            zwn zwn = this.q;
            if (zwn != null) {
                zwn.b();
            }
        }
        zvv zvv = this.h;
        if (zvv != null) {
            zvv.c();
        }
        zwq zwq = this.j;
        if (zwq != null) {
            zwq.a(true);
        }
        this.g = false;
        this.v = false;
    }

    public final void a(int i) {
        if (this.w) {
            zwq zwq = this.j;
            if (zwq != null) {
                zwq.a(i);
            }
            return;
        }
        this.h.a(i);
    }

    public final void d() {
        this.A = this.p.b();
    }

    public final boolean a(zud zud) {
        zuf zuf = this.c;
        return zuf != null && zuf.a().contains(zud);
    }

    public final void b(int i, boolean z) {
        if (this.g) {
            c();
        } else if (this.c != null) {
            if (i == -1) {
                i = this.e;
            }
            a(i, true);
            this.v = z;
        }
    }

    public final void e() {
        if (this.g) {
            c();
        } else if (this.c != null) {
            int i = 0;
            while (i < this.c.a().size()) {
                if (((zud) this.c.a().get(i)).b != zug.SHOPPING_CARD) {
                    i++;
                } else {
                    a(i, true);
                    return;
                }
            }
            a(this.e, true);
        }
    }

    public final void b(int i) {
        if (this.d == null) {
            return;
        }
        if (this.v) {
            c();
            return;
        }
        String str = this.u;
        String str2 = "CPN";
        if (str != null) {
            this.b.a(str2, str);
        }
        a(this.d);
        d();
        str = this.t;
        if (str != null) {
            this.b.a(str2, str);
        }
        this.g = true;
        this.v = true;
        zwq zwq = this.j;
        if (zwq != null) {
            zwq.a(this.d, i, true);
        }
    }

    public final void f() {
        if (this.d != null && this.v) {
            c();
        }
    }

    public final void g() {
        zuf zuf = this.c;
        if (zuf != null) {
            b(zuf.d());
            this.b.a(this.c.a.c);
        }
    }

    private final void a(zuf zuf) {
        Iterator it = zuf.a().iterator();
        while (true) {
            aule[] auleArr = null;
            if (it.hasNext()) {
                zud zud = (zud) it.next();
                acys acys = this.b;
                switch (zud.b.ordinal()) {
                    case 0:
                        auleArr = (aule[]) zud.b().g.toArray(new aule[0]);
                        break;
                    case 1:
                        auleArr = (aule[]) zud.c().j.toArray(new aule[0]);
                        break;
                    case 2:
                        auleArr = (aule[]) zud.d().i.toArray(new aule[0]);
                        break;
                    case 3:
                        auleArr = (aule[]) zud.e().k.toArray(new aule[0]);
                        break;
                    case 4:
                        auleArr = (aule[]) zud.f().j.toArray(new aule[0]);
                        break;
                    case 5:
                        auleArr = (aule[]) zud.g().h.toArray(new aule[0]);
                        break;
                    case 6:
                        auleArr = (aule[]) zud.c.a.e.toArray(new aule[0]);
                        break;
                    case 7:
                        auleArr = (aule[]) zud.h().i.toArray(new aule[0]);
                        break;
                }
                acys.a(auleArr);
                zug zug = zud.b;
                if (zug != null) {
                    ajwi ajwi;
                    switch (zug.ordinal()) {
                        case 0:
                            ajwi = zud.a.b;
                            arwq arwq = (arwq) ((anxo) ajwi.e.toBuilder());
                            arwq.copyOnWrite();
                            ((arwn) arwq.instance).g = anxl.emptyProtobufList();
                            ajwi.e = (arwn) ((anxl) arwq.build());
                            break;
                        case 1:
                            ajwi = zud.a.b;
                            arxi arxi = (arxi) ((anxo) ajwi.c.toBuilder());
                            arxi.copyOnWrite();
                            ((arxf) arxi.instance).j = anxl.emptyProtobufList();
                            ajwi.c = (arxf) ((anxl) arxi.build());
                            break;
                        case 2:
                            ajwi = zud.a.b;
                            arxs arxs = (arxs) ((anxo) ajwi.a.toBuilder());
                            arxs.copyOnWrite();
                            ((arxp) arxs.instance).i = anxl.emptyProtobufList();
                            ajwi.a = (arxp) ((anxl) arxs.build());
                            break;
                        case 3:
                            ajwi = zud.a.b;
                            arxv arxv = (arxv) ((anxo) ajwi.d.toBuilder());
                            arxv.copyOnWrite();
                            ((arxt) arxv.instance).k = anxl.emptyProtobufList();
                            ajwi.d = (arxt) ((anxl) arxv.build());
                            break;
                        case 4:
                            ajwi = zud.a.b;
                            arxe arxe = (arxe) ((anxo) ajwi.b.toBuilder());
                            arxe.copyOnWrite();
                            ((arxb) arxe.instance).j = anxl.emptyProtobufList();
                            ajwi.b = (arxb) ((anxl) arxe.build());
                            break;
                        case 5:
                            ajwi = zud.a.b;
                            arws arws = (arws) ((anxo) ajwi.f.toBuilder());
                            arws.copyOnWrite();
                            ((arwp) arws.instance).h = anxl.emptyProtobufList();
                            ajwi.f = (arwp) ((anxl) arws.build());
                            break;
                        case 6:
                            zun zun = zud.c;
                            awmb awmb = (awmb) ((anxo) zun.a.toBuilder());
                            awmb.copyOnWrite();
                            ((awly) awmb.instance).e = anxl.emptyProtobufList();
                            zun.a = (awly) ((anxl) awmb.build());
                            break;
                        case 7:
                            arxo arxo = (arxo) ((anxo) zud.h().toBuilder());
                            arxo.copyOnWrite();
                            ((arxl) arxo.instance).i = anxl.emptyProtobufList();
                            zud.a.b.h = (arxl) ((anxl) arxo.build());
                            break;
                        default:
                            break;
                    }
                }
            } else {
                a(zuf.d());
                for (zud zud2 : zuf.a()) {
                    byte[] d;
                    switch (zud2.b.ordinal()) {
                        case 0:
                            d = zud2.b().h.d();
                            break;
                        case 1:
                            d = zud2.c().i.d();
                            break;
                        case 2:
                            d = zud2.d().j.d();
                            break;
                        case 3:
                            d = zud2.e().j.d();
                            break;
                        case 4:
                            d = zud2.f().i.d();
                            break;
                        case 5:
                            d = zud2.g().g.d();
                            break;
                        case 6:
                            d = zud2.c.a.d.d();
                            break;
                        case 7:
                            d = zud2.h().j.d();
                            break;
                        default:
                            d = null;
                            break;
                    }
                    a(d);
                }
                return;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(byte[] bArr) {
        if (bArr != null) {
            this.z.a(bArr, null);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(byte[] bArr) {
        if (bArr != null) {
            this.z.a(3, new acvs(bArr), null);
        }
    }

    private final boolean h() {
        if (this.v) {
            zuf zuf = this.d;
            if (!(zuf == null || zuf == this.c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b5  */
    public final java.lang.Class[] a(java.lang.Class r20, java.lang.Object r21, int r22) {
        /*
        r19 = this;
        r0 = r19;
        r1 = r22;
        r2 = 3;
        r3 = 2;
        r4 = 1;
        r5 = 0;
        r6 = 0;
        switch(r1) {
            case -1: goto L_0x01e4;
            case 0: goto L_0x018c;
            case 1: goto L_0x0166;
            case 2: goto L_0x0154;
            case 3: goto L_0x013f;
            case 4: goto L_0x010a;
            case 5: goto L_0x0025;
            default: goto L_0x000c;
        };
    L_0x000c:
        r2 = new java.lang.IllegalStateException;
        r3 = new java.lang.StringBuilder;
        r4 = 32;
        r3.<init>(r4);
        r4 = "unsupported op code: ";
        r3.append(r4);
        r3.append(r1);
        r1 = r3.toString();
        r2.<init>(r1);
        throw r2;
    L_0x0025:
        r1 = r21;
        r1 = (defpackage.ahkm) r1;
        r2 = r0.c;
        if (r2 == 0) goto L_0x0201;
    L_0x002d:
        r2 = r2.a();
        r2 = r2.size();
        if (r2 == 0) goto L_0x0201;
    L_0x0037:
        r2 = r1.g;
        r3 = r0.y;
        if (r2 == r3) goto L_0x0042;
    L_0x003d:
        r19.d();
        r0.y = r2;
    L_0x0042:
        if (r2 == 0) goto L_0x0104;
    L_0x0044:
        r2 = r0.x;
        r7 = r1.a;
        r9 = r7 - r2;
        r9 = java.lang.Math.abs(r9);
        r11 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r4 > 0) goto L_0x0104;
    L_0x0054:
        r4 = r0.c;
        r4 = r4.a;
        r9 = r4.h;
        r11 = 0;
        r4 = -1;
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 <= 0) goto L_0x0074;
    L_0x0061:
        r13 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1));
        if (r13 < 0) goto L_0x0074;
    L_0x0065:
        r13 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r13 >= 0) goto L_0x0074;
    L_0x0069:
        r9 = r0.w;
        if (r9 == 0) goto L_0x0074;
    L_0x006d:
        r9 = r0.g;
        if (r9 != 0) goto L_0x0074;
    L_0x0071:
        r0.b(r4, r5);
    L_0x0074:
        r9 = 0;
    L_0x0075:
        r10 = r0.c;
        r10 = r10.a();
        r10 = r10.size();
        if (r9 >= r10) goto L_0x00b1;
    L_0x0081:
        r10 = r0.c;
        r10 = r10.a();
        r10 = r10.get(r9);
        r10 = (defpackage.zud) r10;
        r13 = r10.i();
        r13 = r13.size();
        if (r13 <= 0) goto L_0x00ae;
    L_0x0097:
        r13 = r10.i();
        r13 = r13.get(r5);
        r13 = (defpackage.arwv) r13;
        r13 = r13.b;
        r15 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1));
        if (r15 <= 0) goto L_0x00a8;
    L_0x00a7:
        goto L_0x00ae;
    L_0x00a8:
        r15 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1));
        if (r15 >= 0) goto L_0x00ae;
    L_0x00ac:
        r14 = r10;
        goto L_0x00b3;
    L_0x00ae:
        r9 = r9 + 1;
        goto L_0x0075;
    L_0x00b1:
        r14 = r6;
        r9 = -1;
    L_0x00b3:
        if (r9 < 0) goto L_0x0104;
    L_0x00b5:
        r0.e = r9;
        r2 = r0.g;
        if (r2 == 0) goto L_0x00c1;
    L_0x00bb:
        r2 = r19.h();
        if (r2 == 0) goto L_0x00e9;
    L_0x00c1:
        r2 = r14.i();
        r2 = r2.get(r5);
        r2 = (defpackage.arwv) r2;
        r3 = r14.a;
        r3 = r3.e;
        if (r3 == 0) goto L_0x00d9;
    L_0x00d1:
        r3 = r0.w;
        if (r3 == 0) goto L_0x00d9;
    L_0x00d5:
        r0.b(r4, r5);
        goto L_0x00e9;
    L_0x00d9:
        r3 = r2.c;
        r5 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1));
        if (r5 <= 0) goto L_0x00e9;
    L_0x00df:
        r13 = r0.h;
        r7 = r2.d;
        r15 = r3;
        r17 = r7;
        r13.a(r14, r15, r17);
    L_0x00e9:
        r2 = r0.p;
        r2 = r2.b();
        r4 = r0.A;
        r2 = r2 - r4;
        r4 = 5500; // 0x157c float:7.707E-42 double:2.7174E-320;
        r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r7 <= 0) goto L_0x0104;
    L_0x00f8:
        r2 = r0.h;
        r2.a(r9);
        r2 = r0.j;
        if (r2 == 0) goto L_0x0104;
    L_0x0101:
        r2.b(r9);
    L_0x0104:
        r1 = r1.a;
        r0.x = r1;
        goto L_0x0201;
    L_0x010a:
        r1 = r21;
        r1 = (defpackage.ahkn) r1;
        r2 = r1.a;
        r2 = r2.ordinal();
        if (r2 == r3) goto L_0x011f;
    L_0x0116:
        r3 = 7;
        if (r2 == r3) goto L_0x011f;
    L_0x0119:
        r3 = 8;
        if (r2 == r3) goto L_0x011f;
    L_0x011d:
        goto L_0x0201;
    L_0x011f:
        r2 = r1.e;
        r0.t = r2;
        r1 = r1.b;
        r2 = r1.a;
        r2 = r2.m;
        if (r2 == 0) goto L_0x0133;
    L_0x012b:
        r3 = new zuf;
        r2 = r2.a;
        r3.<init>(r2);
        goto L_0x0134;
    L_0x0133:
        r3 = r6;
    L_0x0134:
        r1 = r1.b();
        r2 = r0.t;
        r0.a(r3, r1, r2);
        goto L_0x0201;
    L_0x013f:
        r1 = r21;
        r1 = (defpackage.ahkk) r1;
        r1 = r1.a;
        if (r1 == 0) goto L_0x014f;
    L_0x0147:
        r1 = r0.w;
        if (r1 != 0) goto L_0x014c;
    L_0x014b:
        goto L_0x014f;
    L_0x014c:
        r19.c();
    L_0x014f:
        r19.d();
        goto L_0x0201;
    L_0x0154:
        r1 = r21;
        r1 = (defpackage.ahkf) r1;
        r1 = r1.e;
        if (r1 == r4) goto L_0x015e;
    L_0x015c:
        goto L_0x0201;
    L_0x015e:
        r0.s = r6;
        r1 = r0.h;
        r1.a();
        return r6;
    L_0x0166:
        r1 = r21;
        r1 = (defpackage.ahjn) r1;
        r1 = r1.b;
        r2 = defpackage.airc.FULLSCREEN;
        if (r1 != r2) goto L_0x0171;
    L_0x0170:
        goto L_0x0172;
    L_0x0171:
        r4 = 0;
    L_0x0172:
        r1 = r0.g;
        if (r1 == 0) goto L_0x0188;
    L_0x0176:
        r1 = r19.h();
        if (r1 != 0) goto L_0x0188;
    L_0x017c:
        r1 = r0.w;
        if (r1 == 0) goto L_0x0181;
    L_0x0180:
        goto L_0x0188;
    L_0x0181:
        if (r4 == 0) goto L_0x0188;
    L_0x0183:
        r1 = r0.i;
        r1.a();
    L_0x0188:
        r0.w = r4;
        goto L_0x0201;
    L_0x018c:
        r1 = r21;
        r1 = (defpackage.vpa) r1;
        r3 = r1.a;
        r3 = r3.ordinal();
        if (r3 == r4) goto L_0x01ad;
    L_0x0198:
        if (r3 == r2) goto L_0x019b;
    L_0x019a:
        goto L_0x0201;
    L_0x019b:
        r1 = r0.g;
        if (r1 == 0) goto L_0x0201;
    L_0x019f:
        r1 = r0.v;
        if (r1 != 0) goto L_0x01a7;
    L_0x01a3:
        r19.c();
        goto L_0x0201;
    L_0x01a7:
        r1 = r0.h;
        r1.c();
        goto L_0x0201;
    L_0x01ad:
        r2 = r1.f;
        if (r2 == 0) goto L_0x01db;
    L_0x01b1:
        r3 = r2.ag();
        if (r3 == 0) goto L_0x01c1;
    L_0x01b7:
        r3 = new zuf;
        r4 = r2.ag();
        r3.<init>(r4);
        goto L_0x01c2;
    L_0x01c1:
        r3 = r6;
    L_0x01c2:
        r0.d = r3;
        r1 = r1.f;
        if (r1 == 0) goto L_0x01cd;
    L_0x01c8:
        r1 = r1.l();
        goto L_0x01ce;
    L_0x01cd:
        r1 = r6;
    L_0x01ce:
        r0.u = r1;
        r1 = r0.d;
        r2 = r2.d();
        r3 = r0.u;
        r0.a(r1, r2, r3);
    L_0x01db:
        r1 = r0.g;
        if (r1 != 0) goto L_0x01e0;
    L_0x01df:
        goto L_0x0201;
    L_0x01e0:
        r19.c();
        return r6;
    L_0x01e4:
        r1 = 6;
        r6 = new java.lang.Class[r1];
        r1 = defpackage.vpa.class;
        r6[r5] = r1;
        r1 = defpackage.ahjn.class;
        r6[r4] = r1;
        r1 = defpackage.ahkf.class;
        r6[r3] = r1;
        r1 = defpackage.ahkk.class;
        r6[r2] = r1;
        r1 = 4;
        r2 = defpackage.ahkn.class;
        r6[r1] = r2;
        r1 = 5;
        r2 = defpackage.ahkm.class;
        r6[r1] = r2;
    L_0x0201:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zwj.a(java.lang.Class, java.lang.Object, int):java.lang.Class[]");
    }
}
