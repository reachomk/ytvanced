package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;

/* renamed from: adkh */
public final class adkh implements adaa {
    private final int a;
    private final int b;
    private final long c;
    private final long d;
    private final abdf e;
    private final adbz f;
    private final xsc g;
    private final adkk h;
    private final bcaa i;
    private final bcaa j;
    private final boolean k;
    private final SharedPreferences l;
    private final adqf m;
    private final tbq n;
    private boolean o;
    private final afsw p = new adkg();

    public adkh(abdf abdf, adbz adbz, adkk adkk, xsc xsc, bcaa bcaa, bcaa bcaa2, SharedPreferences sharedPreferences, adqf adqf, tbq tbq, long j, long j2, int i, int i2, boolean z) {
        this.e = abdf;
        this.f = adbz;
        this.h = adkk;
        this.g = xsc;
        this.i = bcaa;
        this.j = bcaa2;
        this.c = j;
        this.d = j2;
        this.b = i;
        this.a = i2;
        this.o = false;
        this.k = z;
        this.l = sharedPreferences;
        this.m = adqf;
        this.n = tbq;
    }

    public final String b() {
        return "LivingRoomNotificationRequestManager";
    }

    public final void d() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARNING: Missing block: B:7:0x002f, code skipped:
            if ((r8.g.a() - r4) < r8.d) goto L_0x0032;
     */
    public final defpackage.adac c() {
        /*
        r8 = this;
        r0 = defpackage.adac.e();
        r1 = r8.g;
        r1 = defpackage.adld.a(r1);
        r2 = 1;
        r3 = 0;
        if (r1 != 0) goto L_0x0032;
    L_0x000e:
        r1 = r8.l;
        r4 = "MdxDisableLrNotifThrottleAfterPrevNotifShown";
        r1 = r1.getBoolean(r4, r3);
        if (r1 != 0) goto L_0x0033;
    L_0x0018:
        r1 = r8.h;
        r4 = r1.a();
        r6 = 0;
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 == 0) goto L_0x0033;
    L_0x0024:
        r1 = r8.g;
        r6 = r1.a();
        r6 = r6 - r4;
        r4 = r8.d;
        r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r1 < 0) goto L_0x0032;
    L_0x0031:
        goto L_0x0033;
    L_0x0032:
        r2 = 0;
    L_0x0033:
        r0 = r0.a(r2);
        r1 = r8.a;
        r0 = r0.a(r1);
        r1 = r8.k;
        r2 = 15;
        if (r1 != 0) goto L_0x0046;
    L_0x0043:
        r1 = r8.b;
        goto L_0x0048;
    L_0x0046:
        r1 = 15;
    L_0x0048:
        r0 = r0.c(r1);
        r1 = r8.k;
        if (r1 != 0) goto L_0x0052;
    L_0x0050:
        r2 = r8.b;
    L_0x0052:
        r0 = r0.b(r2);
        r0 = r0.a();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adkh.c():adac");
    }

    public final void a() {
        amqw.b(this.o ^ 1);
        ((afyb) this.i.get()).a((afxo) this.j.get());
        this.o = true;
    }

    public final void a(amul amul) {
        ArrayList arrayList = new ArrayList();
        amxn amxn = (amxn) amul.listIterator();
        while (amxn.hasNext()) {
            bbs bbs = (bbs) amxn.next();
            tbn a = this.n.a(bbs.r);
            if (a == null || a.d()) {
                arrayList.add(bbs);
            }
        }
        if (!arrayList.isEmpty()) {
            String str = "mdx.lr_notification_last_request_time_ms";
            long j = this.h.a.getLong(str, 0);
            if ((j == 0 || this.g.a() - j >= this.c || this.k) && this.m.c() == null) {
                String string = this.l.getString("gcm_registration_id", "");
                if (!string.isEmpty()) {
                    aswi aswi = (aswi) aswf.g.createBuilder();
                    adbz adbz = this.f;
                    xak.a();
                    List<bbs> a2 = adbz.b.a();
                    adbz.a.a();
                    for (bbs bbs2 : a2) {
                        aurf aurf = adbz.a;
                        auri auri = (auri) aurg.e.createBuilder();
                        auri.a(bbs2.d);
                        String str2 = bbs2.c;
                        auri.copyOnWrite();
                        aurg aurg = (aurg) auri.instance;
                        if (str2 != null) {
                            aurg.a |= 2;
                            aurg.c = str2;
                            aurf.a(auri);
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    aswi.a((aurc) ((anxl) adbz.a.build()));
                    anvu a3 = anvu.a(string.getBytes());
                    aswi.copyOnWrite();
                    aswf aswf = (aswf) aswi.instance;
                    if (a3 != null) {
                        aswf.a |= 16;
                        aswf.f = a3;
                        aswi.copyOnWrite();
                        aswf aswf2 = (aswf) aswi.instance;
                        aswf2.a |= 8;
                        aswf2.e = true;
                        abdf abdf = this.e;
                        abdf.b.a(new abdc(abdf.c, abdf.d.c(), aswi), this.p);
                    } else {
                        throw new NullPointerException();
                    }
                }
                adkk adkk = this.h;
                adkk.a.edit().putLong(str, this.g.a()).apply();
            }
        }
    }
}
