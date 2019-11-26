package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: agce */
public final class agce implements agwi {
    public volatile long a = 0;
    public final xsc b;
    public final String c;
    public final bcaa d;
    public final bcaa e;
    public final agej f;
    public final bcaa g;
    public final bcaa h;
    public final agbg i;
    public final bcaa j;
    public final bcaa k;
    private volatile long m = 0;
    private final bcaa n;
    private final afzg o;
    private final bcaa p;
    private final bcaa q;
    private final zzl r;
    private final zyw s;

    public agce(xsc xsc, String str, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, agej agej, bcaa bcaa4, afzg afzg, bcaa bcaa5, agbg agbg, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, zzl zzl, zyw zyw) {
        this.b = xsc;
        this.c = str;
        this.n = bcaa;
        this.d = bcaa2;
        this.e = bcaa3;
        this.f = agej;
        this.g = bcaa4;
        this.o = afzg;
        this.h = bcaa5;
        this.i = agbg;
        this.j = bcaa6;
        this.k = bcaa7;
        this.p = bcaa8;
        this.q = bcaa9;
        this.r = zzl;
        this.s = zyw;
    }

    public final agqw a(String str) {
        xak.b();
        if (this.i.v()) {
            agfi agfi = (agfi) this.h.get();
            xvd.a(str);
            agid c = agfi.h.c(str);
            if (c != null) {
                return c.g();
            }
        }
        return null;
    }

    public final boolean a(agqw agqw) {
        xak.b();
        boolean z = false;
        if (this.i.v()) {
            String str = agqw.a;
            agfi agfi = (agfi) this.h.get();
            aakj i = agfi.i(str);
            if (i != null) {
                try {
                    aajx aajx = (aajx) this.q.get();
                    avqc avqc = agqw.b;
                    ajxu ajxu = new ajxu();
                    aocf.mergeFrom(ajxu, aocf.toByteArray(i.a));
                    ajxu.i = avqc;
                    long j = i.b;
                    aakj aakj = new aakj(ajxu, j, aakj.a(aajx, ajxu, j));
                    z = agfi.a(str, aakj, agqw.d, false, (aajx) this.q.get());
                    if (z) {
                        ((agci) this.k.get()).l(agqw.a);
                        return true;
                    }
                } catch (anyg | aocg unused) {
                    return false;
                }
            }
            String valueOf = String.valueOf(str);
            String str2 = "No player response found for video: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            xtl.c(valueOf);
        }
        return z;
    }

    public final void b(String str) {
        xvd.a(str);
        this.i.a(new agcd(this, str));
    }

    public final void c(String str) {
        xvd.a(str);
        this.i.a(new agcg(this, str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e8 A:{Catch:{ aocg -> 0x0138 }} */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e7 A:{Catch:{ aocg -> 0x0138 }} */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0100 A:{Catch:{ aocg -> 0x0138 }} */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0114 A:{Catch:{ aocg -> 0x0138 }} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0113 A:{Catch:{ aocg -> 0x0138 }} */
    public final defpackage.aakj d(java.lang.String r13) {
        /*
        r12 = this;
        defpackage.xak.b();
        r0 = r12.i;
        r0 = r0.v();
        if (r0 == 0) goto L_0x015f;
    L_0x000b:
        r0 = r12.k;
        r0 = r0.get();
        r0 = (defpackage.agci) r0;
        r0 = r0.a(r13);
        if (r0 == 0) goto L_0x0159;
    L_0x0019:
        r1 = r0.r();
        if (r1 != 0) goto L_0x0153;
    L_0x001f:
        r1 = r0.t();
        if (r1 != 0) goto L_0x013f;
    L_0x0025:
        r0 = r0.n();
        if (r0 != 0) goto L_0x003a;
    L_0x002b:
        r0 = r12.s;
        r0 = defpackage.ahda.b(r0);
        if (r0 == 0) goto L_0x0034;
    L_0x0033:
        goto L_0x003a;
    L_0x0034:
        r13 = new aglx;
        r13.<init>();
        throw r13;
    L_0x003a:
        r0 = r12.h;
        r0 = r0.get();
        r0 = (defpackage.agfi) r0;
        r0 = r0.i(r13);
        if (r0 == 0) goto L_0x0139;
    L_0x0048:
        r1 = r0.c;
        if (r1 == 0) goto L_0x0139;
    L_0x004c:
        r1 = r12.p;
        r1 = r1.get();
        r1 = (defpackage.agbo) r1;
        r2 = new agdl;
        r3 = r12.n;
        r3 = r3.get();
        r3 = (defpackage.agsu) r3;
        r4 = r12.b;
        r4 = r4.b();
        r6 = 18000000; // 0x112a880 float:2.6936858E-38 double:8.8931816E-317;
        r4 = r4 + r6;
        r2.<init>(r3, r4);
        r13 = r1.a(r13, r2);
        if (r13 == 0) goto L_0x0138;
    L_0x0071:
        r1 = r12.s;	 Catch:{ aocg -> 0x0138 }
        r1 = defpackage.ahda.b(r1);	 Catch:{ aocg -> 0x0138 }
        if (r1 == 0) goto L_0x00a1;
    L_0x0079:
        r1 = r12.q;	 Catch:{ aocg -> 0x0138 }
        r1 = r1.get();	 Catch:{ aocg -> 0x0138 }
        r2 = r1;
        r2 = (defpackage.aajx) r2;	 Catch:{ aocg -> 0x0138 }
        r3 = r13.b();	 Catch:{ aocg -> 0x0138 }
        r4 = r13.c();	 Catch:{ aocg -> 0x0138 }
        r13 = r12.b;	 Catch:{ aocg -> 0x0138 }
        r8 = r13.b();	 Catch:{ aocg -> 0x0138 }
        r13 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ aocg -> 0x0138 }
        r1 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ aocg -> 0x0138 }
        r10 = r13.convert(r6, r1);	 Catch:{ aocg -> 0x0138 }
        r1 = r0;
        r5 = r8;
        r7 = r10;
        r0 = r1.a(r2, r3, r4, r5, r7);	 Catch:{ aocg -> 0x0138 }
        goto L_0x0138;
    L_0x00a1:
        r1 = r12.r;	 Catch:{ aocg -> 0x0138 }
        if (r1 != 0) goto L_0x00a6;
    L_0x00a5:
        goto L_0x00c9;
    L_0x00a6:
        r2 = r1.b();	 Catch:{ aocg -> 0x0138 }
        if (r2 == 0) goto L_0x00c9;
    L_0x00ac:
        r1 = r1.b();	 Catch:{ aocg -> 0x0138 }
        r1 = r1.l;	 Catch:{ aocg -> 0x0138 }
        if (r1 != 0) goto L_0x00b6;
    L_0x00b4:
        r1 = defpackage.awdw.E;	 Catch:{ aocg -> 0x0138 }
    L_0x00b6:
        r1 = r1.B;	 Catch:{ aocg -> 0x0138 }
        r2 = 8;
        if (r1 != r2) goto L_0x00c9;
    L_0x00bc:
        r1 = r13.a;	 Catch:{ aocg -> 0x0138 }
        r1 = defpackage.agce.a(r1);	 Catch:{ aocg -> 0x0138 }
        r13 = r13.b;	 Catch:{ aocg -> 0x0138 }
        r13 = defpackage.agce.a(r13);	 Catch:{ aocg -> 0x0138 }
        goto L_0x00e1;
    L_0x00c9:
        r1 = r12.o;	 Catch:{ aocg -> 0x0138 }
        r1 = r1.a();	 Catch:{ aocg -> 0x0138 }
        r2 = r12.r;	 Catch:{ aocg -> 0x0138 }
        r1 = r13.a(r1, r2);	 Catch:{ aocg -> 0x0138 }
        r2 = r12.o;	 Catch:{ aocg -> 0x0138 }
        r2 = r2.a();	 Catch:{ aocg -> 0x0138 }
        r3 = r12.r;	 Catch:{ aocg -> 0x0138 }
        r13 = r13.b(r2, r3);	 Catch:{ aocg -> 0x0138 }
    L_0x00e1:
        r4 = r13;
        r3 = r1;
        r13 = r12.r;	 Catch:{ aocg -> 0x0138 }
        if (r13 != 0) goto L_0x00e8;
    L_0x00e7:
        goto L_0x00fe;
    L_0x00e8:
        r1 = r13.b();	 Catch:{ aocg -> 0x0138 }
        if (r1 == 0) goto L_0x00fe;
    L_0x00ee:
        r13 = r13.b();	 Catch:{ aocg -> 0x0138 }
        r13 = r13.l;	 Catch:{ aocg -> 0x0138 }
        if (r13 != 0) goto L_0x00f8;
    L_0x00f6:
        r13 = defpackage.awdw.E;	 Catch:{ aocg -> 0x0138 }
    L_0x00f8:
        r13 = r13.B;	 Catch:{ aocg -> 0x0138 }
        r1 = 4;
        if (r13 != r1) goto L_0x00fe;
    L_0x00fd:
        goto L_0x011a;
    L_0x00fe:
        if (r4 != 0) goto L_0x0109;
    L_0x0100:
        if (r3 == 0) goto L_0x0103;
    L_0x0102:
        goto L_0x0109;
    L_0x0103:
        r13 = new agma;	 Catch:{ aocg -> 0x0138 }
        r13.<init>();	 Catch:{ aocg -> 0x0138 }
        throw r13;	 Catch:{ aocg -> 0x0138 }
    L_0x0109:
        if (r3 == 0) goto L_0x011a;
    L_0x010b:
        r13 = r3.D();	 Catch:{ aocg -> 0x0138 }
        if (r13 == 0) goto L_0x011a;
    L_0x0111:
        if (r4 == 0) goto L_0x0114;
    L_0x0113:
        goto L_0x011a;
    L_0x0114:
        r13 = new agma;	 Catch:{ aocg -> 0x0138 }
        r13.<init>();	 Catch:{ aocg -> 0x0138 }
        throw r13;	 Catch:{ aocg -> 0x0138 }
    L_0x011a:
        r13 = r12.q;	 Catch:{ aocg -> 0x0138 }
        r13 = r13.get();	 Catch:{ aocg -> 0x0138 }
        r2 = r13;
        r2 = (defpackage.aajx) r2;	 Catch:{ aocg -> 0x0138 }
        r13 = r12.b;	 Catch:{ aocg -> 0x0138 }
        r8 = r13.b();	 Catch:{ aocg -> 0x0138 }
        r13 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ aocg -> 0x0138 }
        r1 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ aocg -> 0x0138 }
        r10 = r13.convert(r6, r1);	 Catch:{ aocg -> 0x0138 }
        r1 = r0;
        r5 = r8;
        r7 = r10;
        r0 = r1.a(r2, r3, r4, r5, r7);	 Catch:{ aocg -> 0x0138 }
    L_0x0138:
        return r0;
    L_0x0139:
        r13 = new agma;
        r13.<init>();
        throw r13;
    L_0x013f:
        r13 = r0.j;
        r13 = r13.c();
        if (r13 == 0) goto L_0x014d;
    L_0x0147:
        r13 = new agme;
        r13.<init>();
        throw r13;
    L_0x014d:
        r13 = new agmb;
        r13.<init>();
        throw r13;
    L_0x0153:
        r13 = new agma;
        r13.<init>();
        throw r13;
    L_0x0159:
        r13 = new aglz;
        r13.<init>();
        throw r13;
    L_0x015f:
        r13 = 0;
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agce.d(java.lang.String):aakj");
    }

    public final void a() {
        this.i.a(new agcf(this));
    }

    public final void a(String str, boolean z) {
        String str2 = str;
        xak.b();
        agci agci = (agci) this.k.get();
        agci.o(str2);
        agqy a = agci.a(str2);
        if (a != null) {
            xak.b();
            String valueOf;
            String str3;
            if (((agfi) this.h.get()).j(str2) == null) {
                valueOf = String.valueOf(str);
                str3 = "Refresh video failed because snapshot invalid for ";
                xtl.c(valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf));
            } else {
                valueOf = String.valueOf(str);
                str3 = "Updating offlined video ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str3);
                } else {
                    str3.concat(valueOf);
                }
                ((agdo) this.j.get()).a(str2, true);
            }
            if (z && agmn.a(a.B())) {
                xak.b();
                if (agci.j.v()) {
                    agqn a2 = ((agbo) agci.p.get()).a(str2, 0);
                    if (a2 == null) {
                        xtl.c("YTB metadata update requested for video with no stream pair.");
                    } else if (agmn.a(a2.i)) {
                        agfi agfi = (agfi) agci.m.get();
                        agqf p = agfi.p(str2);
                        agoz agoz;
                        String a3;
                        int i;
                        try {
                            agfi.a(str2, agqf.ACTIVE);
                            agoz = agci.s;
                            Uri uri = a2.e;
                            if (uri == null) {
                                throw new IOException("Attempted to update YTB but had no URI.");
                            } else if (xvt.a(uri)) {
                                String path = uri.getPath();
                                if (path != null) {
                                    a3 = a2.a();
                                    i = a2.i;
                                    File file = new File(path);
                                    path = "Updating metadata for YTB file: ";
                                    String valueOf2 = String.valueOf(file.getName());
                                    xtl.e(valueOf2.length() == 0 ? new String(path) : path.concat(valueOf2));
                                    if (file.canWrite()) {
                                        Object obj;
                                        aaxf aaxf = (aaxf) agoz.a.get();
                                        String a4 = a2.a();
                                        ampo ampo = ampo.a;
                                        atqp atqp = (atqp) atqq.f.createBuilder();
                                        atqp.a(a4);
                                        atqp.copyOnWrite();
                                        atqq atqq = (atqq) atqp.instance;
                                        atqq.a |= 4;
                                        atqq.e = true;
                                        atqs a5 = aaxf.a(aaxf.a(atqp, ampo));
                                        azqv azqv = a5.c;
                                        if (azqv == null) {
                                            azqv = azqv.c;
                                        }
                                        azqt azqt = azqv.b;
                                        if (azqt == null) {
                                            azqt = azqt.i;
                                        }
                                        byte[] d = azqt.f.d();
                                        azqv azqv2 = a5.c;
                                        if (azqv2 == null) {
                                            azqv2 = azqv.c;
                                        }
                                        azqt azqt2 = azqv2.b;
                                        if (azqt2 == null) {
                                            azqt2 = azqt.i;
                                        }
                                        azqj azqj = azqt2.g;
                                        if (azqj == null) {
                                            azqj = azqj.b;
                                        }
                                        Iterator it = azqj.a.iterator();
                                        while (true) {
                                            valueOf2 = "moov";
                                            if (!it.hasNext()) {
                                                obj = null;
                                                break;
                                            }
                                            obj = (azqh) it.next();
                                            azpz azpz = obj.b;
                                            if (azpz == null) {
                                                azpz = azpz.g;
                                            }
                                            if (agos.b(azpz.b).equals(valueOf2)) {
                                                break;
                                            }
                                        }
                                        if (obj == null || d == null) {
                                            agoz.b.a(a3, i, 4);
                                            throw new IOException("YTB Blueprint did not have moov data to complete refresh.");
                                        }
                                        anbe a6 = anbe.a();
                                        try {
                                            agmh a7 = agoz.d.a(String.format(Locale.US, "REFRESH_YT4_REFRESH_TRANSFER_ID_%s", new Object[]{a3}), uri);
                                            agnr agnr = agoz.c;
                                            amqp a8 = agny.a((agnf) agnr.a.get(), uri);
                                            if (a8.a()) {
                                                a7.a((azqp) a8.b());
                                                File file2 = new File((String) amqw.a(uri.getPath()));
                                                if (file2.renameTo(agmn.a(file2))) {
                                                    agou agou = (agou) a6.a(new agou(agnr.b(uri, i), a7));
                                                    agow d2 = agou.d();
                                                    agou.a(valueOf2, 1).a(d);
                                                    agou.a();
                                                    azqj azqj2 = d2.c.d;
                                                    ArrayList arrayList = new ArrayList();
                                                    arrayList.add(obj);
                                                    for (azqh azqh : azqj2.a) {
                                                        azpz azpz2 = azqh.b;
                                                        if (azpz2 == null) {
                                                            azpz2 = azpz.g;
                                                        }
                                                        if (!azpz2.b.equals(valueOf2)) {
                                                            arrayList.add(azqh);
                                                        }
                                                    }
                                                    agno agno = d2.c;
                                                    azqi azqi = (azqi) azqj.b.createBuilder();
                                                    azqi.copyOnWrite();
                                                    azqj azqj3 = (azqj) azqi.instance;
                                                    if (!azqj3.a.a()) {
                                                        azqj3.a = anxl.mutableCopy(azqj3.a);
                                                    }
                                                    anvf.addAll(arrayList, azqj3.a);
                                                    agno.d = (azqj) ((anxl) azqi.build());
                                                    agou.a("uuid[1]", 4).a((long) d2.c.d.toByteArray().length);
                                                    agou.a();
                                                    agou.a(true);
                                                    agou.b();
                                                    a6.close();
                                                    agoz.b.a(a3, i, 2);
                                                    agfi.a(str2, p);
                                                    return;
                                                }
                                                throw new agnx(13, "Failed to rename completed file to incomplete file.");
                                            }
                                            throw new agnx(1, "Failed to create progress for completed file.");
                                        } catch (IOException e) {
                                            throw new agnx(8, e);
                                        } catch (Throwable th) {
                                            try {
                                                agoz.b.a(a3, i, 1);
                                                RuntimeException a9 = a6.a(th);
                                            } catch (Throwable th2) {
                                                a6.close();
                                            }
                                        }
                                    } else {
                                        agoz.b.a(a3, i, 5);
                                        throw new IOException("Can't update YTB because we do not have write access");
                                    }
                                }
                                throw new IOException("Attempted to update YTB but had no file path.");
                            } else {
                                String str4 = "Attempted to refresh YTB for URI with unsupported scheme: ";
                                String valueOf3 = String.valueOf(uri.getScheme());
                                throw new IOException(valueOf3.length() == 0 ? new String(str4) : str4.concat(valueOf3));
                            }
                        } catch (aanq e2) {
                            agoz.b.a(a3, i, 3);
                            throw new IOException(e2);
                        } catch (IOException th3) {
                            try {
                                xtl.a("Caught exception updating metadata for YTB file: ", th3);
                            } finally {
                                agfi.a(str2, p);
                            }
                        }
                    } else {
                        xtl.c("Trying to update YTB metadata, for non YTB video.");
                    }
                }
            }
        }
    }

    private static aahr a(agql agql) {
        return (agql == null || !agql.u()) ? null : agql.a();
    }
}
