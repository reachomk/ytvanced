package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.LiveChatAction.ReplayChatItemAction;
import com.google.protos.youtube.api.innertube.LiveChatEndpointOuterClass$LiveChatEndpoint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: abpo */
public final class abpo implements abor, abow, abox, abpb, abrr, afsw, xsu {
    private boolean A;
    private boolean B;
    private xcq C;
    private String D;
    public final abov a = new abov();
    public abos b;
    public final abpe c;
    public abot d;
    public abpt e;
    public abqa f;
    public final abbf g;
    public final xoi h;
    public final aizy i;
    public abps j;
    public boolean k;
    public long l;
    public boolean m;
    public boolean n;
    private afxe o;
    private final aboq p;
    private abro q;
    private aufw[] r;
    private abxi s;
    private final abbj t;
    private final abps u;
    private final abpx v;
    private final xci w;
    private final akti x;
    private final abrj y;
    private final Handler z;

    public abpo(abbj abbj, abbf abbf, afxb afxb, xci xci, aizy aizy, xoi xoi, acvx acvx, Handler handler, akti akti, abrj abrj, aboq aboq) {
        afxb afxb2 = afxb;
        aboq aboq2 = aboq;
        this.t = (abbj) amqw.a((Object) abbj);
        this.g = (abbf) amqw.a((Object) abbf);
        this.h = (xoi) amqw.a((Object) xoi);
        this.w = xci;
        this.i = aizy;
        this.x = akti;
        this.y = abrj;
        this.z = (Handler) amqw.a((Object) handler);
        this.p = aboq2;
        this.b = new abos(aboq2, this);
        xci xci2 = xci;
        xoi xoi2 = xoi;
        acvx acvx2 = acvx;
        this.u = new abps(this, abbj, xci2, xoi2, acvx2);
        this.j = this.u;
        this.v = new abpx(this, abbf, xci2, xoi2, acvx2);
        this.c = new abpe(handler);
        if (afxb2 != null) {
            this.o = new afxe(this.u, afxb, new abqb(this));
        }
    }

    public final Object a(String str) {
        return null;
    }

    public final abow j() {
        return this;
    }

    public final synchronized abro e() {
        return this.q;
    }

    /* JADX WARNING: Missing block: B:9:0x0016, code skipped:
            return;
     */
    public final synchronized void a(defpackage.abro r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.q;	 Catch:{ all -> 0x006a }
        if (r3 == r0) goto L_0x0068;
    L_0x0005:
        if (r3 != 0) goto L_0x0017;
    L_0x0007:
        r3 = r2.y;	 Catch:{ all -> 0x006a }
        r1 = 0;
        r3.a = r1;	 Catch:{ all -> 0x006a }
        r3.b = r1;	 Catch:{ all -> 0x006a }
        if (r0 == 0) goto L_0x0015;
    L_0x0010:
        r0.l();	 Catch:{ all -> 0x006a }
        r2.q = r1;	 Catch:{ all -> 0x006a }
    L_0x0015:
        monitor-exit(r2);
        return;
    L_0x0017:
        if (r0 != 0) goto L_0x001a;
    L_0x0019:
        goto L_0x0030;
    L_0x001a:
        r0 = r0.p();	 Catch:{ all -> 0x006a }
        r1 = r2.q;	 Catch:{ all -> 0x006a }
        r1 = r1.q();	 Catch:{ all -> 0x006a }
        r3.b(r0, r1);	 Catch:{ all -> 0x006a }
        r0 = r2.q;	 Catch:{ all -> 0x006a }
        r0 = r0.r();	 Catch:{ all -> 0x006a }
        r3.a(r0);	 Catch:{ all -> 0x006a }
    L_0x0030:
        r2.q = r3;	 Catch:{ all -> 0x006a }
        r3 = r2.q;	 Catch:{ all -> 0x006a }
        r3.k();	 Catch:{ all -> 0x006a }
        r3 = r2.q;	 Catch:{ all -> 0x006a }
        r0 = r2.a;	 Catch:{ all -> 0x006a }
        r1 = r0.b;	 Catch:{ all -> 0x006a }
        r3.a(r0, r1);	 Catch:{ all -> 0x006a }
        r3 = r2.c;	 Catch:{ all -> 0x006a }
        r0 = r3.b;	 Catch:{ all -> 0x006a }
        r1 = r2.q;	 Catch:{ all -> 0x006a }
        r3 = r3.d;	 Catch:{ all -> 0x006a }
        r1.b(r0, r3);	 Catch:{ all -> 0x006a }
        r3 = r2.q;	 Catch:{ all -> 0x006a }
        r3.a(r2);	 Catch:{ all -> 0x006a }
        r3 = r2.s;	 Catch:{ all -> 0x006a }
        if (r3 == 0) goto L_0x0059;
    L_0x0054:
        r1 = r2.q;	 Catch:{ all -> 0x006a }
        r1.a(r3);	 Catch:{ all -> 0x006a }
    L_0x0059:
        r3 = r2.q;	 Catch:{ all -> 0x006a }
        r3.e();	 Catch:{ all -> 0x006a }
        r3 = new abpq;	 Catch:{ all -> 0x006a }
        r3.<init>(r2, r0);	 Catch:{ all -> 0x006a }
        r0.a(r3);	 Catch:{ all -> 0x006a }
        monitor-exit(r2);
        return;
    L_0x0068:
        monitor-exit(r2);
        return;
    L_0x006a:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abpo.a(abro):void");
    }

    public final void k() {
        this.a.a();
    }

    public final synchronized void a(abot abot) {
        this.d = abot;
    }

    public final synchronized void a(abxi abxi) {
        this.s = abxi;
        abro abro = this.q;
        if (abro != null) {
            abro.a(abxi);
        }
    }

    public final synchronized void a(abpt abpt) {
        this.e = abpt;
    }

    public final synchronized boolean l() {
        return this.k;
    }

    public final synchronized void a(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            abbj abbj = this.t;
            aaml a = abbj.a();
            a.a(apxu);
            abbj.a.a(a, (afsw) this);
            this.B = true;
            this.c.ah_();
            this.k = true;
            abro e = e();
            if (e != null) {
                e.m();
            }
            q();
        }
    }

    public final synchronized void a(ajxa ajxa) {
        if (abxy.b(ajxa)) {
            d(ajxa);
            if (ajxa.i) {
                abot abot = this.d;
                if (abot != null) {
                    abot.a();
                }
                this.j = this.v;
            } else {
                this.j = this.u;
            }
            Object obj = ajxa.b[0].b;
            if (obj == null) {
                obj = awzv.d;
            }
            ajtf a = ajtj.a(obj);
            this.m = a.a().equals(this.D) ^ 1;
            this.D = a.a();
            this.n = true;
            b(a);
        }
    }

    public final synchronized void b(ajtf ajtf) {
        this.j.b(Collections.singletonList(ajtf));
        this.c.ah_();
        abro abro = this.q;
        if (abro != null) {
            abro.ah_();
            this.q.m();
        }
        this.k = true;
        this.j.a(ajtf);
        this.B = true;
        q();
    }

    public final synchronized void b(ajxa ajxa) {
        if (l()) {
            m();
        } else {
            a(ajxa);
        }
    }

    public final synchronized void m() {
        this.b.ai_();
        this.c.ai_();
        abro abro = this.q;
        if (abro != null) {
            abro.ai_();
        }
        a(this.r);
        abro = e();
        if (abro != null) {
            abro.n();
        }
    }

    public final synchronized void n() {
        this.j.r();
        afxe afxe = this.o;
        if (afxe != null) {
            afxe.a();
        }
        this.b.aj_();
        this.c.aj_();
        abro abro = this.q;
        if (abro != null) {
            abro.aj_();
        }
    }

    public final synchronized void o() {
        a(false);
    }

    private final synchronized void q() {
        if (this.C != null) {
            this.w.a(r0);
            this.C = null;
        }
        if (this.k && this.j == this.v) {
            this.C = this.w.a((Object) this, ahkm.class, new abpr(this));
        }
    }

    private final void a(boolean z) {
        this.r = null;
        this.j.r();
        afxe afxe = this.o;
        if (afxe != null) {
            afxe.a();
        }
        this.b.ak_();
        this.a.a();
        this.c.ak_();
        abro abro = this.q;
        if (abro != null) {
            abro.ak_();
        }
        this.B = false;
        this.k = false;
        if (!z) {
            this.l = 0;
            this.A = false;
        }
        q();
    }

    public final synchronized void c() {
        o();
        this.u.c();
        this.v.c();
        afxe afxe = this.o;
        if (afxe != null) {
            afxe.a();
        }
    }

    public final void a(ajtf ajtf) {
        abro abro = this.q;
        if (abro != null) {
            abro.m();
        }
        a(true);
        b(ajtf);
    }

    public final abov f() {
        return this.a;
    }

    public final abpe g() {
        return this.c;
    }

    public final abpa h() {
        return this.q;
    }

    public final abot i() {
        return this.d;
    }

    public final void p() {
        abro abro = this.q;
        if (abro != null) {
            abro.e();
        }
    }

    public final void a(bqn bqn) {
        this.h.c(bqn);
    }

    public final long a() {
        aufw[] aufwArr = this.r;
        if (aufwArr != null) {
            int length = aufwArr.length;
            int i = 0;
            while (i < length) {
                aufw aufw = aufwArr[i];
                if ((aufw.a & 8) == 0) {
                    i++;
                } else {
                    auga auga = aufw.e;
                    if (auga == null) {
                        auga = auga.e;
                    }
                    return (long) auga.b;
                }
            }
        }
        return 0;
    }

    public final boolean b() {
        aufw[] aufwArr = this.r;
        if (aufwArr != null) {
            for (aufw aufw : aufwArr) {
                if ((aufw.a & 8) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d() {
        afxe afxe = this.o;
        if (afxe != null) {
            afxe.a();
        }
        aufw[] aufwArr = this.r;
        if (aufwArr != null) {
            for (aufw aufw : aufwArr) {
                if ((aufw.a & 8) != 0) {
                    abpx abpx = this.v;
                    Object obj = aufw.e;
                    if (obj == null) {
                        obj = auga.e;
                    }
                    abpx.a(ajtj.a(obj));
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean a(long j, Runnable runnable) {
        aufw[] aufwArr = this.r;
        if (aufwArr != null) {
            int length = aufwArr.length;
            int i = 0;
            while (i < length) {
                aufw aufw = aufwArr[i];
                if ((aufw.a & 16) == 0) {
                    i++;
                } else {
                    this.r = null;
                    abpx abpx = this.v;
                    Object obj = aufw.f;
                    if (obj == null) {
                        obj = awgm.d;
                    }
                    abro e = abpx.a.e();
                    if (e != null) {
                        e.m();
                    }
                    aucl aucl = (aucl) aucm.c.createBuilder();
                    aucl.copyOnWrite();
                    aucm aucm = (aucm) aucl.instance;
                    aucm.a |= 2;
                    aucm.b = j;
                    aucm aucm2 = (aucm) ((anxl) aucl.build());
                    ajtf a = ajtj.a(obj);
                    abbb a2 = abpx.a.g.a();
                    a2.a(a);
                    a2.a = aucm2;
                    a2.a(obj.c.d());
                    abpx.a(a2, a.c(), runnable);
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(audb audb) {
        if (this.s != null) {
            aufr aufr = (aufr) aufo.c.createBuilder();
            aufr.copyOnWrite();
            aufo aufo = (aufo) aufr.instance;
            if (audb != null) {
                aufo.b = audb;
                aufo.a = 130028801;
                this.s.a((aufo) ((anxl) aufr.build()));
                return;
            }
            throw new NullPointerException();
        }
    }

    /* Access modifiers changed, original: final */
    public final void c(ajxa ajxa) {
        if (ajxa != null) {
            int length;
            int i;
            if (!this.A) {
                d(ajxa);
                this.y.a(ajxa.h);
            } else if (this.B) {
                this.b.ah_();
            }
            ardw[] ardwArr = ajxa.g;
            if (ardwArr != null) {
                length = ardwArr.length;
                if (length > 0) {
                    akti akti = this.x;
                    akti.c = null;
                    akti.a.clear();
                    akti.b.clear();
                    StringBuilder stringBuilder = new StringBuilder(length);
                    for (i = 0; i < length; i++) {
                        ardw ardw = ardwArr[i];
                        if (ardw.e) {
                            akti.a.put(ardw.b, ardw);
                            for (String str : ardw.c) {
                                akti.b.put(str.toLowerCase(Locale.ROOT), ardw.b);
                                stringBuilder.append("(");
                                stringBuilder.append(str.replaceAll("([^a-zA-Z0-9 ])", "\\\\$1"));
                                stringBuilder.append(")");
                            }
                            if (i < length - 1) {
                                stringBuilder.append("|");
                            }
                        }
                    }
                    if (!akti.b.isEmpty()) {
                        akti.c = Pattern.compile(stringBuilder.toString(), 10);
                    }
                }
            }
            abpt abpt = this.e;
            if (abpt != null) {
                abpt.a(abxy.a(ajxa));
            }
            this.A = true;
            this.r = null;
            aufw[] aufwArr = ajxa.b;
            if (aufwArr != null) {
                a(aufwArr);
            }
            apxu[] apxuArr = ajxa.c;
            if (apxuArr != null) {
                int length2 = apxuArr.length;
                if (length2 > 0) {
                    anxp anxp = apxuArr[length2 - 1];
                    if (this.B && (this.b instanceof aboz) && anxp != null) {
                        anxr access$000 = anxl.checkIsLite(ReplayChatItemAction.replayChatItemAction);
                        anxp.a(access$000);
                        if (anxp.h.a(access$000.d)) {
                            access$000 = anxl.checkIsLite(ReplayChatItemAction.replayChatItemAction);
                            anxp.a(access$000);
                            Object b = anxp.h.b(access$000.d);
                            if (b == null) {
                                b = access$000.b;
                            } else {
                                b = access$000.a(b);
                            }
                            long j = ((ReplayChatItemAction) b).c;
                            long j2 = this.l;
                            if (j < j2) {
                                ((aboz) this.b).b(j2);
                            }
                        }
                    }
                    abos abos = this.b;
                    apxu[] apxuArr2 = ajxa.c;
                    aufw[] aufwArr2 = ajxa.b;
                    long j3 = 0;
                    if (aufwArr2 != null) {
                        i = aufwArr2.length;
                        int i2 = 0;
                        while (i2 < i) {
                            aufw aufw = aufwArr2[i2];
                            int i3 = aufw.a;
                            if ((i3 & 2) != 0) {
                                ayhc ayhc = aufw.c;
                                if (ayhc == null) {
                                    ayhc = ayhc.e;
                                }
                                length = ayhc.b;
                            } else if ((i3 & 4) == 0 || this.o == null) {
                                i2++;
                            } else {
                                atuj atuj = aufw.d;
                                if (atuj == null) {
                                    atuj = atuj.f;
                                }
                                length = atuj.c;
                            }
                            j3 = (long) length;
                        }
                    }
                    abos.a(apxuArr2, j3);
                }
            }
            abot abot = this.d;
            if (abot != null) {
                ajwv ajwv = ajxa.d;
                if (ajwv != null) {
                    abot.a(ajwv);
                }
            }
            abxi abxi = this.s;
            if (abxi != null) {
                aufo aufo = ajxa.f;
                if (aufo != null) {
                    abxi.a(aufo);
                }
            }
            abro e = e();
            if (e != null) {
                e.n();
            }
            this.B = false;
        }
    }

    private final void a(aufw[] aufwArr) {
        if (aufwArr != null) {
            this.r = aufwArr;
            List arrayList = new ArrayList();
            for (aufw aufw : aufwArr) {
                int i = aufw.a;
                afxe afxe;
                Object obj;
                if ((i & 2) != 0) {
                    afxe = this.o;
                    if (afxe != null) {
                        afxe.a();
                    }
                    abps abps = this.j;
                    obj = aufw.c;
                    if (obj == null) {
                        obj = ayhc.e;
                    }
                    obj = ajtj.a(obj);
                    abps.a(obj, (ajtf) obj);
                } else if ((i & 4) != 0) {
                    afxe = this.o;
                    if (afxe != null) {
                        obj = aufw.d;
                        if (obj == null) {
                            obj = atuj.f;
                        }
                        if (!afxe.a(ajtj.a(obj))) {
                            this.o.a();
                        }
                        this.j.r();
                        afxe = this.o;
                        obj = aufw.d;
                        if (obj == null) {
                            obj = atuj.f;
                        }
                        afxe.b(ajtj.a(obj));
                    }
                }
                i = aufw.a;
                Object obj2;
                if ((i & 1) != 0) {
                    obj2 = aufw.b;
                    if (obj2 == null) {
                        obj2 = awzv.d;
                    }
                    arrayList.add(ajtj.a(obj2));
                } else if ((i & 2) != 0) {
                    obj2 = aufw.c;
                    if (obj2 == null) {
                        obj2 = ayhc.e;
                    }
                    arrayList.add(ajtj.a(obj2));
                } else if ((i & 4) != 0) {
                    obj2 = aufw.d;
                    if (obj2 == null) {
                        obj2 = atuj.f;
                    }
                    arrayList.add(ajtj.a(obj2));
                } else if ((i & 8) != 0) {
                    obj2 = aufw.e;
                    if (obj2 == null) {
                        obj2 = auga.e;
                    }
                    arrayList.add(ajtj.a(obj2));
                } else if ((i & 16) != 0) {
                    obj2 = aufw.f;
                    if (obj2 == null) {
                        obj2 = awgm.d;
                    }
                    arrayList.add(ajtj.a(obj2));
                }
            }
            this.j.b(arrayList);
        }
    }

    private final void d(ajxa ajxa) {
        apxu[] apxuArr = ajxa.c;
        int i = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            anxp anxp = apxuArr[0];
            anxr access$000 = anxl.checkIsLite(ReplayChatItemAction.replayChatItemAction);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                i = 1;
            }
        }
        if (!ajxa.i && i == 0) {
            this.b = new abpd(this.z, this.p, this);
        } else {
            this.b = new aboz(this.z, this.p, this, this);
        }
        this.b.ah_();
    }
}
