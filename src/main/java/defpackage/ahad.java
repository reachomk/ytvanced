package defpackage;

import android.content.SharedPreferences;
import android.database.sqlite.SQLiteFullException;
import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;

/* renamed from: ahad */
public final class ahad {
    public final zyw a;
    public final zzl b;
    public final SharedPreferences c;
    private final xsc d;
    private final bcaa e;
    private final bcaa f;
    private final ahcz g;
    private final abka h;
    private final agwp i;
    private final agps j;
    private final agem k;
    private final agmk l;
    private final bcaa m;

    public ahad(xsc xsc, bcaa bcaa, bcaa bcaa2, ahcz ahcz, zyw zyw, zzl zzl, SharedPreferences sharedPreferences, abka abka, agwp agwp, agps agps, agem agem, bcaa bcaa3, bcaa bcaa4) {
        this.d = xsc;
        this.e = bcaa;
        this.f = bcaa2;
        this.g = ahcz;
        this.a = zyw;
        this.b = zzl;
        this.c = sharedPreferences;
        this.h = abka;
        this.i = agwp;
        this.j = agps;
        this.k = agem;
        this.l = (agmk) bcaa3.get();
        this.m = bcaa4;
    }

    public static void a(String str, aakj aakj) {
        String str2 = "pudl task[";
        StringBuilder stringBuilder;
        if (!ahcz.a(aakj)) {
            stringBuilder = new StringBuilder(String.valueOf(str).length() + 50);
            stringBuilder.append(str2);
            stringBuilder.append(str);
            stringBuilder.append("] received actionable playability error.");
            xtl.d(stringBuilder.toString());
            throw agyc.a("Playability error", null, agqf.CANNOT_OFFLINE, 11);
        } else if (!ahcz.b(aakj)) {
            stringBuilder = new StringBuilder(String.valueOf(str).length() + 41);
            stringBuilder.append(str2);
            stringBuilder.append(str);
            stringBuilder.append("] received offline state error.");
            xtl.c(stringBuilder.toString());
            throw agyc.a("Offline state error", null, agqf.CANNOT_OFFLINE, 7);
        }
    }

    public final aajs a(String str, String str2, aakj aakj) {
        try {
            aajs aajs = aakj.c;
            if (aajs.t) {
                ((aesg) this.m.get()).a(aakj.b(), aajs.y(), aajs.n, str2, aajs.z());
            }
            return aajs;
        } catch (aesh | aesl e) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 47);
            stringBuilder.append("pudl task[");
            stringBuilder.append(str);
            stringBuilder.append("] offline widevine helper unavailable");
            xtl.c(stringBuilder.toString());
            throw agyc.a("Cannot offline protected content. Widevine support is unavailable.", e, agqf.CANNOT_OFFLINE, 24);
        } catch (aesi e2) {
            throw agyc.a("DRM error occurred while downloading the video", e2, agqf.CANNOT_OFFLINE, 24);
        }
    }

    public static void a(String str, String str2, String str3, aivp aivp, agql agql, long j, long j2, aghl aghl, String str4, oxb oxb, oxb oxb2, agwa agwa) {
        String str5 = str4;
        if (agql.u()) {
            oxb2.a(0, j2);
            return;
        }
        long j3 = j2;
        oxb oxb3 = oxb2;
        long t = agql.t() - agql.c();
        if (agwa.c() > t) {
            String.format(Locale.US, "pudl task[%s] start stream<%d> uri<%s> download", new Object[]{str2, Integer.valueOf(agql.r()), agql.a().d});
            if (str5 != null) {
                String str6 = str;
                aghl.a(str, agql.r(), str5);
            }
            aivp.a(agql.a(), j, j2, str3, oxb, oxb2);
            return;
        }
        throw new agxm(t);
    }

    public final agyc a(IOException iOException) {
        String str;
        if (iOException instanceof aiwf) {
            return agyc.b("Error network timed out", iOException, agqf.NETWORK_READ_ERROR, 25);
        } else if ((iOException instanceof owb) || (iOException instanceof SocketTimeoutException)) {
            return agyc.b("Error reading from network", iOException, agqf.NETWORK_READ_ERROR, 25);
        } else if ((iOException instanceof ovv) || (iOException instanceof oxa)) {
            str = "Error trying to read from or write to local disk.";
            if (a()) {
                return agyc.b(str, iOException, agqf.DISK_IO_ERROR, 22);
            }
            return agyc.a(str, iOException, agqf.DISK_IO_ERROR, 22);
        } else if (iOException instanceof agxm) {
            return agyc.b("Out of storage error.", iOException, agqf.NO_STORAGE_ERROR, 12);
        } else if (iOException instanceof ahan) {
            return agyc.b("Error offline time window exceeded.", iOException, agqf.NETWORK_READ_ERROR, 26);
        } else if (iOException instanceof agml) {
            xtl.a("ytb pudl error", (Throwable) iOException);
            str = "Error writing YTB file.";
            if (a()) {
                return agyc.b(str, iOException, agqf.DISK_IO_ERROR, 32);
            }
            return agyc.a(str, iOException, agqf.DISK_IO_ERROR, 32);
        } else {
            xtl.a("unknown pudl error", (Throwable) iOException);
            str = "Error trying to download video for offline.";
            if (a()) {
                return agyc.b(str, iOException, agqf.DISK_IO_ERROR, 22);
            }
            return agyc.a(str, iOException, agqf.DISK_IO_ERROR, 22);
        }
    }

    public final void a(agfi agfi, agpk agpk, agqz agqz) {
        String valueOf;
        String b = agxj.b(agqz.f);
        agqp a = agfi.a(b);
        if (a != null) {
            String str;
            try {
                if (agxj.o(agqz.f)) {
                    agpk.b(a);
                } else {
                    agpk.a(a);
                }
                agpy agpy = a.a;
                if (agpy != null) {
                    str = agpy.a;
                    if (!TextUtils.isEmpty(str)) {
                        agpy = agfi.d(str);
                        if (agpy != null) {
                            agpk.a(agpy);
                        }
                    } else {
                        return;
                    }
                }
                agid c = agfi.h.c(b);
                if (!(c == null || c.a().b == null)) {
                    c.a(new agqp(c.a().e, c.a().c, agfi.b.a(b, c.a().b), c.a().a));
                }
                agfi.u(b);
            } catch (agxm e) {
                throw agyc.a("Out of storage error.", e, agqf.NO_STORAGE_ERROR, 12);
            } catch (aiwf | SocketTimeoutException | owb e2) {
                valueOf = String.valueOf(b);
                str = "Nonfatal exception for saving thumbnails for ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                xtl.b(valueOf, e2);
                throw agyc.b("Non-fatal thumbnail saving error", e2, agqf.NETWORK_READ_ERROR, 25);
            } catch (IOException | ExecutionException e22) {
                valueOf = String.valueOf(b);
                str = "Failed saving thumbnails for ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                xtl.b(valueOf, e22);
                b = "Fatal thumbnail saving error";
                if (a()) {
                    throw agyc.b(b, e22, agqf.DISK_IO_ERROR, 22);
                }
                throw agyc.a(b, e22, agqf.DISK_IO_ERROR, 22);
            }
        }
    }

    public final void a(String str, String str2, aakj aakj, agfi agfi, long j, aajx aajx) {
        String str3 = str2;
        agfi agfi2 = agfi;
        if (agfi.j(str2) != null) {
            try {
                if (!agfi.a(str2, aakj, j, true, aajx)) {
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 43);
                    stringBuilder.append("pudl task[");
                    str3 = str;
                    stringBuilder.append(str);
                    stringBuilder.append("] failed to save player response.");
                    xtl.c(stringBuilder.toString());
                    String str4 = "Fail to save playerResponse";
                    if (a()) {
                        throw agyc.b(str4, null, agqf.FAILED_UNKNOWN, 19);
                    }
                    throw agyc.a(str4, null, agqf.FAILED_UNKNOWN, 19);
                }
                return;
            } catch (SQLiteFullException e) {
                Exception exception = e;
                String str5 = "Error trying to write to local disk.";
                if (a()) {
                    throw agyc.b(str5, exception, agqf.DISK_IO_ERROR, 19);
                }
                throw agyc.a(str5, exception, agqf.DISK_IO_ERROR, 19);
            }
        }
        throw agyc.a("Video not found in database", null, agqf.FAILED_UNKNOWN, 21);
    }

    public final void a(String str, String str2, agfi agfi, agxz agxz) {
        String str3 = "pudl task[";
        apxn a = this.a.a();
        if ((a.a & 524288) != 0) {
            avnm avnm = a.l;
            if (avnm == null) {
                avnm = avnm.q;
            }
            if (avnm.b) {
                try {
                    abkg a2 = this.h.a();
                    a2.c(str2);
                    a2.g();
                    aafv a3 = this.h.a(a2);
                    if (agfi.j(str2) != null) {
                        try {
                            if (agfi.a(str2, a3)) {
                                agxz.a();
                                return;
                            }
                            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 45);
                            stringBuilder.append(str3);
                            stringBuilder.append(str);
                            stringBuilder.append("] failed to save watchNextResponse.");
                            xtl.c(stringBuilder.toString());
                            str2 = "Fail to save watchNextResponse";
                            if (a()) {
                                throw agyc.b(str2, null, agqf.FAILED_UNKNOWN, 19);
                            }
                            throw agyc.a(str2, null, agqf.FAILED_UNKNOWN, 19);
                        } catch (SQLiteFullException e) {
                            String str4 = "Error trying to write to local disk.";
                            if (a()) {
                                throw agyc.b(str4, e, agqf.DISK_IO_ERROR, 19);
                            }
                            throw agyc.a(str4, e, agqf.DISK_IO_ERROR, 19);
                        }
                    }
                    throw agyc.a("Video not found in database", null, agqf.FAILED_UNKNOWN, 21);
                } catch (aanq e2) {
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 50);
                    stringBuilder2.append(str3);
                    stringBuilder2.append(str);
                    stringBuilder2.append("] failed to retrieve watch next response");
                    xtl.a(stringBuilder2.toString(), e2);
                    throw agyc.b("Cannot retrieve watch next response from the server.", e2, agqf.NETWORK_READ_ERROR, 25);
                }
            }
        }
    }

    public static void a(aakj aakj, agpk agpk, agfi agfi) {
        agfi agfi2 = agfi;
        String b = aakj.b();
        try {
            ajiu a = ajiu.a(aakj, null);
            if (a != null) {
                List a2 = a.a();
                List o = agfi2.o(b);
                if (!a2.isEmpty()) {
                    Iterator it = a2.iterator();
                    while (it.hasNext()) {
                        ajis ajis = (ajis) it.next();
                        if (o.contains(ajis) || ajis.a()) {
                            agpk agpk2 = agpk;
                        } else {
                            Iterator it2 = it;
                            ajis ajis2 = r6;
                            ajis ajis3 = new ajis(ajis.a, ajis.b, ajis.c, ajis.d, ajis.e, ajis.f, agpk.a(b, ajis), ajis.h, ajis.i, ajis.j.toString());
                            agfi2.a(ajis2);
                            it = it2;
                        }
                    }
                }
            }
        } catch (IOException | ExecutionException e) {
            b = String.valueOf(b);
            String str = "Failed saving video subtitles ";
            xtl.b(b.length() == 0 ? new String(str) : str.concat(b), e);
        }
    }

    public final void a(agqz agqz, agql agql, aghl aghl) {
        avnm avnm = this.a.a().l;
        if (avnm == null) {
            avnm = avnm.q;
        }
        if (avnm.e) {
            agwn a = this.i.a(agql);
            if (a == null) {
                return;
            }
            avqv avqv;
            if (a.a()) {
                avqv = (avqv) ((anxo) agpp.a(agqz).toBuilder());
                avqv.c(16);
                avqv.b(a.b);
                avqv.f(a.e);
                this.j.a((avqw) ((anxl) avqv.build()));
                return;
            }
            avqv = (avqv) ((anxo) agpp.a(agqz).toBuilder());
            avqv.c(15);
            avqv.b(a.b);
            avqv.f(a.e);
            avqv.copyOnWrite();
            ((avqw) avqv.instance).y = anxl.emptyProtobufList();
            avra[] avraArr = new avra[a.c.length];
            for (int i = 0; i < a.c.length; i++) {
                avqz avqz = (avqz) avra.d.createBuilder();
                long j = a.c[i].c;
                avqz.copyOnWrite();
                avra avra = (avra) avqz.instance;
                avra.a |= 2;
                avra.c = j;
                int i2 = a.c[i].b;
                avqz.copyOnWrite();
                avra avra2 = (avra) avqz.instance;
                avra2.a |= 1;
                avra2.b = i2;
                avraArr[i] = (avra) ((anxl) avqz.build());
            }
            List asList = Arrays.asList(avraArr);
            avqv.copyOnWrite();
            avqw avqw = (avqw) avqv.instance;
            if (!avqw.y.a()) {
                avqw.y = anxl.mutableCopy(avqw.y);
            }
            anvf.addAll(asList, avqw.y);
            this.j.a((avqw) ((anxl) avqv.build()));
            aghl.a(agql.q(), agql.r());
            throw agyc.b("Stream verification failed", null, agqf.STREAM_CORRUPT, 29);
        }
    }

    public final boolean a() {
        avoa avoa = this.b.b().h;
        if (avoa == null) {
            avoa = avoa.w;
        }
        return avoa.h;
    }

    public final long a(agql agql, String str) {
        Uri o = agql.o();
        long j = 0;
        if (o == null) {
            return 0;
        }
        try {
            long j2;
            agmh a = this.l.a(str, o);
            if (a.c()) {
                azqp a2 = a.a();
                if (a2 != null) {
                    for (azqr azqr : a2.e) {
                        Object obj = azqr.c;
                        if (obj == null) {
                            obj = azlk.f;
                        }
                        String.valueOf(obj).length();
                        if ((azqr.a & 2) != 0) {
                            azlk azlk = azqr.c;
                            if (azlk == null) {
                                azlk = azlk.f;
                            }
                            if (azlk.c == agql.r()) {
                                for (azpz azpz : azqr.f) {
                                    if (azpz.d == 0) {
                                        j = azpz.e;
                                        break;
                                    }
                                }
                                j2 = j;
                            }
                        }
                    }
                    throw new agml(String.format(Locale.US, "External YTB file at %s is missing entry for stream with itag %d", new Object[]{o, Integer.valueOf(agql.r())}));
                }
                throw new agml(String.format(Locale.US, "Failed to load YTB progress for ytb file at %s with itag %d", new Object[]{o, Integer.valueOf(agql.r())}));
            }
            j2 = agql.c();
            return j2;
        } catch (IOException e) {
            throw agyc.a("Error accessing write position for YTB file.", e, agqf.CANNOT_OFFLINE, 32);
        }
    }

    public final aakj a(String str, byte[] bArr, agqz agqz, byte[] bArr2, int i, int i2) {
        try {
            return this.g.a(str, bArr2, i, i2, agxj.j(agqz.f), bArr);
        } catch (aanq e) {
            String str2 = agqz.a;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 46);
            stringBuilder.append("pudl task[");
            stringBuilder.append(str2);
            stringBuilder.append("] failed to retrieve player response");
            xtl.a(stringBuilder.toString(), e);
            throw agyc.b("Cannot retrieve player response from the server.", e, agqf.NETWORK_READ_ERROR, 25);
        }
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARNING: Missing block: B:36:0x00b4, code skipped:
            if (r1.w().equals(r0.a.w()) != false) goto L_0x00b6;
     */
    /* JADX WARNING: Missing block: B:43:0x00ce, code skipped:
            if (r1.w().equals(r0.b.w()) != false) goto L_0x00e3;
     */
    public final defpackage.agqn a(int r17, int r18, java.lang.String r19, defpackage.aajs r20, defpackage.aajj r21, defpackage.aghl r22, boolean r23) {
        /*
        r16 = this;
        r9 = r16;
        r10 = 0;
        r11 = r19;
        r12 = r22;
        r13 = r12.a(r11, r10);
        r6 = 0;
        r0 = r16;
        r1 = r17;
        r2 = r18;
        r3 = r19;
        r4 = r20;
        r5 = r13;
        r7 = r21;
        r8 = r22;
        r14 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8);
        r0 = defpackage.ahcz.a(r17);
        if (r0 != 0) goto L_0x003a;
    L_0x0025:
        r0 = r9.k;
        r0 = r0.i();
        if (r0 != 0) goto L_0x003a;
    L_0x002d:
        if (r14 == 0) goto L_0x0030;
    L_0x002f:
        goto L_0x003a;
    L_0x0030:
        r0 = defpackage.agqf.CANNOT_OFFLINE;
        r1 = 6;
        r2 = "Video stream not found.";
        r0 = defpackage.agyc.a(r2, r10, r0, r1);
        throw r0;
    L_0x003a:
        r0 = 0;
        if (r14 == 0) goto L_0x0053;
    L_0x003d:
        r1 = defpackage.aahv.o();
        r2 = r14.r();
        r2 = java.lang.Integer.valueOf(r2);
        r1 = r1.contains(r2);
        if (r1 != 0) goto L_0x0050;
    L_0x004f:
        goto L_0x0053;
    L_0x0050:
        r0 = 1;
        r15 = 1;
        goto L_0x0054;
    L_0x0053:
        r15 = 0;
    L_0x0054:
        if (r15 == 0) goto L_0x0069;
    L_0x0056:
        r0 = r9.a;
        r0 = r0.a();
        r0 = r0.l;
        if (r0 != 0) goto L_0x0062;
    L_0x0060:
        r0 = defpackage.avnm.q;
    L_0x0062:
        r0 = r0.c;
        if (r0 != 0) goto L_0x0067;
    L_0x0066:
        goto L_0x0069;
    L_0x0067:
        r0 = r10;
        goto L_0x0082;
    L_0x0069:
        r6 = 1;
        r0 = r16;
        r1 = r17;
        r2 = r18;
        r3 = r19;
        r4 = r20;
        r5 = r13;
        r7 = r21;
        r8 = r22;
        r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8);
        if (r15 == 0) goto L_0x0080;
    L_0x007f:
        goto L_0x0082;
    L_0x0080:
        if (r0 == 0) goto L_0x00e4;
    L_0x0082:
        r0 = defpackage.agqn.a(r14, r0);
        if (r23 == 0) goto L_0x00e3;
    L_0x0088:
        r1 = r9.b;
        r1 = r1.b();
        r1 = r1.h;
        if (r1 != 0) goto L_0x0094;
    L_0x0092:
        r1 = defpackage.avoa.w;
    L_0x0094:
        r1 = r1.s;
        if (r1 != 0) goto L_0x0099;
    L_0x0098:
        goto L_0x00e3;
    L_0x0099:
        r1 = r0.a;
        r2 = 31;
        if (r1 != 0) goto L_0x00a0;
    L_0x009f:
        goto L_0x00b6;
    L_0x00a0:
        if (r13 == 0) goto L_0x00da;
    L_0x00a2:
        r1 = r13.a;
        if (r1 == 0) goto L_0x00da;
    L_0x00a6:
        r1 = r1.w();
        r3 = r0.a;
        r3 = r3.w();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00da;
    L_0x00b6:
        r1 = r0.b;
        if (r1 == 0) goto L_0x00e3;
    L_0x00ba:
        if (r13 == 0) goto L_0x00d1;
    L_0x00bc:
        r1 = r13.b;
        if (r1 == 0) goto L_0x00d1;
    L_0x00c0:
        r1 = r1.w();
        r3 = r0.b;
        r3 = r3.w();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x00d1;
    L_0x00d0:
        goto L_0x00e3;
    L_0x00d1:
        r0 = defpackage.agqf.STREAMS_OUT_OF_DATE;
        r1 = "Proposed audio stream do not match saved streams.";
        r0 = defpackage.agyc.a(r1, r10, r0, r2);
        throw r0;
    L_0x00da:
        r0 = defpackage.agqf.STREAMS_OUT_OF_DATE;
        r1 = "Proposed video stream does not match saved streams.";
        r0 = defpackage.agyc.a(r1, r10, r0, r2);
        throw r0;
    L_0x00e3:
        return r0;
    L_0x00e4:
        r0 = defpackage.agqf.CANNOT_OFFLINE;
        r1 = 27;
        r2 = "Audio stream not found.";
        r0 = defpackage.agyc.a(r2, r10, r0, r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahad.a(int, int, java.lang.String, aajs, aajj, aghl, boolean):agqn");
    }

    private final agql a(int i, int i2, String str, aajs aajs, agqn agqn, boolean z, aajj aajj, aghl aghl) {
        agqn agqn2 = agqn;
        boolean z2 = z;
        aghl aghl2 = aghl;
        agql agql = agqn2 == null ? null : z2 ? agqn2.b : agqn2.a;
        if (agql == null) {
            aajs aajs2 = aajs;
        } else {
            int r = agql.r();
            aahr b = aajs.b(r);
            if (b != null) {
                b = this.g.a(b);
                if (b.c() == agql.a().c() && b.C() == agql.a().C() && TextUtils.equals(b.t(), agql.s())) {
                    return agql.y().a(b).a();
                }
            }
            aghl2.a(str, r);
        }
        aahr a = this.g.a(i, Integer.MAX_VALUE, i2, aajs, z, aajj);
        if (a == null) {
            return null;
        }
        if (a.x()) {
            arlx arlx = (arlx) arlv.E.createBuilder(a.a);
            arlx.a(ammu.b, Boolean.valueOf(false));
            a = new aahr((arlv) ((anxl) arlx.build()), a.b, a.c, a.g);
        }
        agql = agql.z().a(a).a(z2).a(0).a(0).b(this.d.a()).a();
        aghl2.a(agql);
        return agql;
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0160 A:{Catch:{ Exception -> 0x021d }} */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0159 A:{Catch:{ Exception -> 0x021d }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0052 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Missing block: B:18:?, code skipped:
            defpackage.xtl.c("Can't parse proto buf");
     */
    /* JADX WARNING: Missing block: B:28:0x0080, code skipped:
            if (r7.c != false) goto L_0x0082;
     */
    public final int a(defpackage.aahr r12, boolean r13) {
        /*
        r11 = this;
        r0 = 1;
        r1 = r11.f;	 Catch:{ Exception -> 0x021d }
        r1 = r1.get();	 Catch:{ Exception -> 0x021d }
        r1 = (defpackage.afhg) r1;	 Catch:{ Exception -> 0x021d }
        r1 = r1.a();	 Catch:{ Exception -> 0x021d }
        r2 = r11.e;	 Catch:{ Exception -> 0x021d }
        r2 = r2.get();	 Catch:{ Exception -> 0x021d }
        r2 = (defpackage.ahdo) r2;	 Catch:{ Exception -> 0x021d }
        r3 = r12.b;	 Catch:{ Exception -> 0x021d }
        r12 = r12.a;	 Catch:{ Exception -> 0x021d }
        r4 = 14;
        r5 = 15;
        r6 = 2;
        if (r1 == 0) goto L_0x0215;
    L_0x0020:
        r7 = r2.b;	 Catch:{ Exception -> 0x021d }
        r7 = r7.b();	 Catch:{ Exception -> 0x021d }
        r7 = r7.i;	 Catch:{ Exception -> 0x021d }
        if (r7 != 0) goto L_0x002c;
    L_0x002a:
        r7 = defpackage.avpu.d;	 Catch:{ Exception -> 0x021d }
    L_0x002c:
        if (r7 == 0) goto L_0x020d;
    L_0x002e:
        r8 = r7.c;	 Catch:{ Exception -> 0x021d }
        r8 = r7.a;	 Catch:{ Exception -> 0x021d }
        r8 = r8 & r6;
        r9 = 0;
        if (r8 == 0) goto L_0x0058;
    L_0x0036:
        r8 = new azxu;	 Catch:{ aocg -> 0x0052 }
        r8.<init>();	 Catch:{ aocg -> 0x0052 }
        r10 = r7.b;	 Catch:{ aocg -> 0x0052 }
        r10 = r10.d();	 Catch:{ aocg -> 0x0052 }
        defpackage.aocf.mergeFrom(r8, r10);	 Catch:{ aocg -> 0x0052 }
        r8 = defpackage.azxw.a(r8);	 Catch:{ aocg -> 0x0052 }
        if (r8 == 0) goto L_0x005d;
    L_0x004a:
        r10 = r8.isEmpty();	 Catch:{ aocg -> 0x0052 }
        if (r10 != 0) goto L_0x005d;
    L_0x0050:
        r9 = r8;
        goto L_0x005d;
    L_0x0052:
        r8 = "Can't parse proto buf";
        defpackage.xtl.c(r8);	 Catch:{ Exception -> 0x021d }
        goto L_0x005d;
    L_0x0058:
        r8 = "No ECDSA verification keys.";
        defpackage.xtl.c(r8);	 Catch:{ Exception -> 0x021d }
    L_0x005d:
        if (r9 != 0) goto L_0x0068;
    L_0x005f:
        r12 = "null KeyMap";
        defpackage.xtl.c(r12);	 Catch:{ Exception -> 0x021d }
        r4 = 11;
        goto L_0x021c;
    L_0x0068:
        r8 = r12.a;	 Catch:{ Exception -> 0x021d }
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r8 = r8 & r10;
        if (r8 != 0) goto L_0x008e;
    L_0x006f:
        r12 = r12.c;	 Catch:{ Exception -> 0x021d }
        r13 = defpackage.ahdo.a;	 Catch:{ Exception -> 0x021d }
        r12 = java.lang.Integer.valueOf(r12);	 Catch:{ Exception -> 0x021d }
        r12 = r13.contains(r12);	 Catch:{ Exception -> 0x021d }
        if (r12 == 0) goto L_0x007e;
    L_0x007d:
        goto L_0x0085;
    L_0x007e:
        r12 = r7.c;	 Catch:{ Exception -> 0x021d }
        if (r12 == 0) goto L_0x0085;
    L_0x0082:
        r4 = 2;
        goto L_0x021c;
    L_0x0085:
        r12 = "verification signature missing";
        defpackage.xtl.c(r12);	 Catch:{ Exception -> 0x021d }
        r4 = 12;
        goto L_0x021c;
    L_0x008e:
        r7 = r12.A;	 Catch:{ IllegalStateException -> 0x0207 }
        if (r7 != 0) goto L_0x0094;
    L_0x0092:
        r7 = defpackage.armd.d;	 Catch:{ IllegalStateException -> 0x0207 }
    L_0x0094:
        r7 = r7.b;	 Catch:{ IllegalStateException -> 0x0207 }
        r7 = defpackage.avpw.a(r7);	 Catch:{ IllegalStateException -> 0x0207 }
        if (r7 == 0) goto L_0x009d;
    L_0x009c:
        goto L_0x009e;
    L_0x009d:
        r7 = 1;
    L_0x009e:
        r7 = r7 + -1;
        r8 = 3;
        if (r7 == r0) goto L_0x0149;
    L_0x00a3:
        if (r7 == r6) goto L_0x011e;
    L_0x00a5:
        if (r7 == r8) goto L_0x00d3;
    L_0x00a7:
        r12 = r12.A;	 Catch:{ IllegalStateException -> 0x0207 }
        if (r12 != 0) goto L_0x00ad;
    L_0x00ab:
        r12 = defpackage.armd.d;	 Catch:{ IllegalStateException -> 0x0207 }
    L_0x00ad:
        r12 = r12.b;	 Catch:{ IllegalStateException -> 0x0207 }
        r12 = defpackage.avpw.a(r12);	 Catch:{ IllegalStateException -> 0x0207 }
        if (r12 == 0) goto L_0x00b6;
    L_0x00b5:
        goto L_0x00b7;
    L_0x00b6:
        r12 = 1;
    L_0x00b7:
        r12 = r12 + -1;
        r13 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0207 }
        r1 = 39;
        r13.<init>(r1);	 Catch:{ IllegalStateException -> 0x0207 }
        r1 = "unsupported hash algorithm: ";
        r13.append(r1);	 Catch:{ IllegalStateException -> 0x0207 }
        r13.append(r12);	 Catch:{ IllegalStateException -> 0x0207 }
        r12 = r13.toString();	 Catch:{ IllegalStateException -> 0x0207 }
        defpackage.xtl.c(r12);	 Catch:{ IllegalStateException -> 0x0207 }
        r4 = 13;
        goto L_0x021c;
    L_0x00d3:
        r13 = defpackage.ahdh.a(r3, r12);	 Catch:{ IllegalStateException -> 0x0207 }
        r13 = r13.toByteArray();	 Catch:{ IllegalStateException -> 0x0207 }
        r1 = new ahdw;	 Catch:{ IllegalStateException -> 0x0207 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0207 }
        r2 = r13.length;	 Catch:{ IllegalStateException -> 0x0207 }
        r1.a(r13, r2);	 Catch:{ IllegalStateException -> 0x0207 }
        r13 = r1.a();	 Catch:{ IllegalStateException -> 0x0207 }
        r12 = r12.A;	 Catch:{ IllegalStateException -> 0x0207 }
        if (r12 != 0) goto L_0x00ee;
    L_0x00ec:
        r12 = defpackage.armd.d;	 Catch:{ IllegalStateException -> 0x0207 }
    L_0x00ee:
        r12 = r12.c;	 Catch:{ IllegalStateException -> 0x0207 }
        r12 = r12.d();	 Catch:{ IllegalStateException -> 0x0207 }
        r12 = defpackage.azxw.a(r9, r13, r12);	 Catch:{ IllegalStateException -> 0x0207 }
        if (r12 == 0) goto L_0x011a;
    L_0x00fa:
        r12 = "digest: ";
        r13 = r1.a();	 Catch:{ IllegalStateException -> 0x0207 }
        r13 = java.util.Arrays.toString(r13);	 Catch:{ IllegalStateException -> 0x0207 }
        r13 = java.lang.String.valueOf(r13);	 Catch:{ IllegalStateException -> 0x0207 }
        r1 = r13.length();	 Catch:{ IllegalStateException -> 0x0207 }
        if (r1 != 0) goto L_0x0115;
    L_0x010e:
        r13 = new java.lang.String;	 Catch:{ IllegalStateException -> 0x0207 }
        r13.<init>(r12);	 Catch:{ IllegalStateException -> 0x0207 }
        goto L_0x0082;
    L_0x0115:
        r12.concat(r13);	 Catch:{ IllegalStateException -> 0x0207 }
        goto L_0x0082;
    L_0x011a:
        r4 = 15;
        goto L_0x021c;
    L_0x011e:
        r2 = r2.c;	 Catch:{ IllegalStateException -> 0x0207 }
        r2 = r2.get();	 Catch:{ IllegalStateException -> 0x0207 }
        r2 = (defpackage.agwc) r2;	 Catch:{ IllegalStateException -> 0x0207 }
        r2 = r2.b();	 Catch:{ IllegalStateException -> 0x0207 }
        r2 = r2.q();	 Catch:{ IllegalStateException -> 0x0207 }
        r7 = r12.c;	 Catch:{ IllegalStateException -> 0x0207 }
        r7 = r2.a(r3, r7);	 Catch:{ IllegalStateException -> 0x0207 }
        if (r7 < 0) goto L_0x013d;
    L_0x0136:
        r1 = new ahdn;	 Catch:{ IllegalStateException -> 0x0207 }
        r1.<init>(r2, r7, r13);	 Catch:{ IllegalStateException -> 0x0207 }
        r13 = r1;
        goto L_0x0153;
    L_0x013d:
        r2 = new ahdv;	 Catch:{ IllegalStateException -> 0x0207 }
        r7 = new ahdq;	 Catch:{ IllegalStateException -> 0x0207 }
        r7.<init>(r13);	 Catch:{ IllegalStateException -> 0x0207 }
        r2.<init>(r1, r7);	 Catch:{ IllegalStateException -> 0x0207 }
        r13 = r2;
        goto L_0x0153;
    L_0x0149:
        r13 = new ahdv;	 Catch:{ IllegalStateException -> 0x0207 }
        r2 = new ahdw;	 Catch:{ IllegalStateException -> 0x0207 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0207 }
        r13.<init>(r1, r2);	 Catch:{ IllegalStateException -> 0x0207 }
    L_0x0153:
        r13 = r13.a(r3, r12);	 Catch:{ Exception -> 0x021d }
        if (r13 != 0) goto L_0x0160;
    L_0x0159:
        r12 = "cannot compute digest.";
        defpackage.xtl.c(r12);	 Catch:{ Exception -> 0x021d }
        goto L_0x021c;
    L_0x0160:
        r1 = r12.c;	 Catch:{ Exception -> 0x021d }
        r2 = 0;
        r4 = android.util.Base64.encodeToString(r13, r2);	 Catch:{ Exception -> 0x021d }
        r7 = java.lang.String.valueOf(r3);	 Catch:{ Exception -> 0x021d }
        r7 = r7.length();	 Catch:{ Exception -> 0x021d }
        r7 = r7 + 37;
        r10 = java.lang.String.valueOf(r4);	 Catch:{ Exception -> 0x021d }
        r10 = r10.length();	 Catch:{ Exception -> 0x021d }
        r7 = r7 + r10;
        r10 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x021d }
        r10.<init>(r7);	 Catch:{ Exception -> 0x021d }
        r7 = "Digest computed for (";
        r10.append(r7);	 Catch:{ Exception -> 0x021d }
        r10.append(r3);	 Catch:{ Exception -> 0x021d }
        r7 = ", ";
        r10.append(r7);	 Catch:{ Exception -> 0x021d }
        r10.append(r1);	 Catch:{ Exception -> 0x021d }
        r1 = "): ";
        r10.append(r1);	 Catch:{ Exception -> 0x021d }
        r10.append(r4);	 Catch:{ Exception -> 0x021d }
        r1 = r10.toString();	 Catch:{ Exception -> 0x021d }
        defpackage.xtl.e(r1);	 Catch:{ Exception -> 0x021d }
        r1 = new byte[r6][];	 Catch:{ Exception -> 0x021d }
        r4 = "UTF-8";
        r4 = java.nio.charset.Charset.forName(r4);	 Catch:{ Exception -> 0x021d }
        r3 = r3.getBytes(r4);	 Catch:{ Exception -> 0x021d }
        r1[r2] = r3;	 Catch:{ Exception -> 0x021d }
        r1[r0] = r13;	 Catch:{ Exception -> 0x021d }
        r13 = 0;
        r3 = 0;
    L_0x01b0:
        if (r13 >= r6) goto L_0x01b9;
    L_0x01b2:
        r4 = r1[r13];	 Catch:{ Exception -> 0x021d }
        r4 = r4.length;	 Catch:{ Exception -> 0x021d }
        r3 = r3 + r4;
        r13 = r13 + 1;
        goto L_0x01b0;
    L_0x01b9:
        r13 = new byte[r3];	 Catch:{ Exception -> 0x021d }
        r3 = 0;
        r4 = 0;
    L_0x01bd:
        if (r3 >= r6) goto L_0x01c9;
    L_0x01bf:
        r7 = r1[r3];	 Catch:{ Exception -> 0x021d }
        r10 = r7.length;	 Catch:{ Exception -> 0x021d }
        java.lang.System.arraycopy(r7, r2, r13, r4, r10);	 Catch:{ Exception -> 0x021d }
        r4 = r4 + r10;
        r3 = r3 + 1;
        goto L_0x01bd;
    L_0x01c9:
        r1 = r12.A;	 Catch:{ Exception -> 0x021d }
        if (r1 != 0) goto L_0x01cf;
    L_0x01cd:
        r1 = defpackage.armd.d;	 Catch:{ Exception -> 0x021d }
    L_0x01cf:
        r1 = r1.c;	 Catch:{ Exception -> 0x021d }
        r1 = r1.d();	 Catch:{ Exception -> 0x021d }
        r13 = defpackage.azxw.a(r9, r13, r1);	 Catch:{ Exception -> 0x021d }
        if (r13 == 0) goto L_0x01dd;
    L_0x01db:
        goto L_0x0082;
    L_0x01dd:
        r13 = r12.A;	 Catch:{ Exception -> 0x021d }
        if (r13 != 0) goto L_0x01e3;
    L_0x01e1:
        r13 = defpackage.armd.d;	 Catch:{ Exception -> 0x021d }
    L_0x01e3:
        r13 = r13.b;	 Catch:{ Exception -> 0x021d }
        r13 = defpackage.avpw.a(r13);	 Catch:{ Exception -> 0x021d }
        if (r13 == 0) goto L_0x01f1;
    L_0x01eb:
        if (r13 == r8) goto L_0x01ee;
    L_0x01ed:
        goto L_0x01f1;
    L_0x01ee:
        r4 = 16;
        goto L_0x021c;
    L_0x01f1:
        r12 = r12.A;	 Catch:{ Exception -> 0x021d }
        if (r12 != 0) goto L_0x01f7;
    L_0x01f5:
        r12 = defpackage.armd.d;	 Catch:{ Exception -> 0x021d }
    L_0x01f7:
        r12 = r12.b;	 Catch:{ Exception -> 0x021d }
        r12 = defpackage.avpw.a(r12);	 Catch:{ Exception -> 0x021d }
        if (r12 == 0) goto L_0x011a;
    L_0x01ff:
        r13 = 4;
        if (r12 == r13) goto L_0x0204;
    L_0x0202:
        goto L_0x011a;
    L_0x0204:
        r12 = 17;
        return r12;
    L_0x0207:
        r12 = "Error instantiating digest algorithm.";
        defpackage.xtl.c(r12);	 Catch:{ Exception -> 0x021d }
        goto L_0x021c;
    L_0x020d:
        r12 = "OfflineSharingConfig is null";
        defpackage.xtl.c(r12);	 Catch:{ Exception -> 0x021d }
        r4 = 10;
        goto L_0x021c;
    L_0x0215:
        r12 = "DataSource is null";
        defpackage.xtl.c(r12);	 Catch:{ Exception -> 0x021d }
        r4 = 9;
    L_0x021c:
        return r4;
    L_0x021d:
        r12 = move-exception;
        r13 = defpackage.agqf.CANNOT_OFFLINE;
        r1 = "getVerificationStatus threw an exception";
        r12 = defpackage.agyc.a(r1, r12, r13, r0);
        goto L_0x0228;
    L_0x0227:
        throw r12;
    L_0x0228:
        goto L_0x0227;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahad.a(aahr, boolean):int");
    }
}
