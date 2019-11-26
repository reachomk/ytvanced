package defpackage;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.ConditionVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: agif */
public final class agif {
    public final Executor a;
    public final afzi b;
    public final agfu c;
    public final aghw d;
    public final agio e;
    public final agmp f;
    public final ConditionVariable g = new ConditionVariable();
    public final List h = new ArrayList();
    public volatile agip i;
    private final agfd j;
    private final aghn k;
    private final agja l;
    private final zzl m;
    private volatile boolean n;

    public agif(Executor executor, afzi afzi, agfd agfd, agio agio, aghn aghn, agfu agfu, aghw aghw, agex agex, agip agip, agja agja, zzl zzl, agmp agmp) {
        this.a = executor;
        this.b = afzi;
        this.j = agfd;
        this.e = agio;
        this.k = aghn;
        this.c = agfu;
        this.d = aghw;
        this.i = agip;
        this.l = agja;
        this.f = agmp;
        this.m = zzl;
        this.n = false;
        aghn.a(new agim(this));
        agfu.a(new agij(this));
        aghw.a(new agil(this));
        agex.a(new agik(this));
    }

    public final void a(agqp agqp, avsi avsi, int i, byte[] bArr, agqf agqf, agqq agqq, long j) {
        a(agqp, avsi, i, bArr, agqf, agqq, null, j);
    }

    /* Access modifiers changed, original: final */
    public final void a(agqp agqp, avsi avsi, int i, byte[] bArr, agqf agqf, agqq agqq, String str, long j) {
        e().a(agqp, avsi, i, bArr, agqf, agqq, j);
        for (agih a : this.h) {
            avsi avsi2 = avsi;
            a.a(agqp.a(), avsi, agqq.a(), str);
        }
    }

    public final void a(agql agql) {
        if (agmn.a(agql.p())) {
            Uri o = agql.o();
            if (o != null) {
                this.f.a(o);
            }
        }
        agip e = e();
        synchronized (e.l) {
            if (e.a.get(agql.q()) != null) {
                e.a(agql);
            } else {
                agql agql2 = null;
                agql agql3 = !agql.b() ? null : agql;
                if (!agql.b()) {
                    agql2 = agql;
                }
                e.a.put(agql.q(), new agir(e, agql2, agql3));
            }
        }
    }

    public final agie a(String str) {
        return e().a(str);
    }

    public final void b(String str) {
        this.f.a();
        agip e = e();
        synchronized (e.l) {
            xvd.a(str);
            e.a.remove(str);
        }
    }

    public final agid c(String str) {
        return e().b(str);
    }

    public final List a() {
        LinkedList linkedList;
        agip e = e();
        synchronized (e.l) {
            linkedList = new LinkedList();
            for (agiu h : e.b.values()) {
                linkedList.add(h.h());
            }
        }
        return linkedList;
    }

    public final void d(String str) {
        this.f.a();
        agip e = e();
        synchronized (e.l) {
            xvd.a(str);
            agiu agiu = (agiu) e.b.remove(str);
            e.e.remove(str);
            if (agiu != null) {
                e.f.b(agiu);
            }
        }
    }

    public final void a(agqi agqi, List list, avsi avsi, int i, long j, int i2) {
        e().a(agqi, list, avsi, i, j, i2);
    }

    public final agib e(String str) {
        return e().c(str);
    }

    public final void f(String str) {
        agip e = e();
        synchronized (e.l) {
            xvd.a(str);
            e.c.remove(str);
            Set<String> set = (Set) e.h.remove(str);
            if (set != null) {
                for (String b : set) {
                    xsb.b(e.g, b, str);
                }
            }
        }
    }

    public final void a(agqr agqr, List list, List list2, int i) {
        e().a(agqr, list, list2, i);
    }

    public final agig g(String str) {
        agig agig;
        agip e = e();
        synchronized (e.l) {
            xvd.a(str);
            agig = (agig) e.d.get(str);
        }
        return agig;
    }

    public final List b() {
        LinkedList linkedList;
        agip e = e();
        synchronized (e.l) {
            linkedList = new LinkedList();
            for (agig b : e.d.values()) {
                linkedList.add(b.b());
            }
        }
        return linkedList;
    }

    public final void h(String str) {
        e().d(str);
    }

    public final Set i(String str) {
        Set b;
        agip e = e();
        synchronized (e.l) {
            b = xsb.b(e.i, str);
        }
        return b;
    }

    public final Collection c() {
        Collection values;
        agip e = e();
        synchronized (e.l) {
            values = e.c.values();
        }
        return values;
    }

    public final SQLiteDatabase d() {
        g();
        return this.j.a();
    }

    public final agip e() {
        g();
        return this.i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0185 A:{Catch:{ anyg -> 0x0480, all -> 0x04d4 }} */
    public final synchronized void f() {
        /*
        r23 = this;
        r1 = r23;
        monitor-enter(r23);
        r0 = r1.n;	 Catch:{ all -> 0x04e7 }
        if (r0 != 0) goto L_0x04e5;
    L_0x0007:
        r0 = r1.g;	 Catch:{ all -> 0x04e7 }
        r0.close();	 Catch:{ all -> 0x04e7 }
        r0 = r1.j;	 Catch:{ all -> 0x04de }
        r10 = r0.a();	 Catch:{ all -> 0x04de }
        r3 = "videosV2";
        r5 = "media_status != ?";
        r11 = 1;
        r6 = new java.lang.String[r11];	 Catch:{ all -> 0x04de }
        r0 = defpackage.agqf.DELETED;	 Catch:{ all -> 0x04de }
        r0 = r0.p;	 Catch:{ all -> 0x04de }
        r0 = java.lang.Integer.toString(r0);	 Catch:{ all -> 0x04de }
        r12 = 0;
        r6[r12] = r0;	 Catch:{ all -> 0x04de }
        r4 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r2 = r10;
        r2 = r2.query(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x04de }
        r0 = r1.l;	 Catch:{ all -> 0x04d9 }
        r3 = new agix;	 Catch:{ all -> 0x04d9 }
        r4 = r0.a;	 Catch:{ all -> 0x04d9 }
        r4 = r4.get();	 Catch:{ all -> 0x04d9 }
        r4 = (defpackage.agpi) r4;	 Catch:{ all -> 0x04d9 }
        r4 = defpackage.agja.a(r4, r11);	 Catch:{ all -> 0x04d9 }
        r4 = (defpackage.agpi) r4;	 Catch:{ all -> 0x04d9 }
        r0 = r0.b;	 Catch:{ all -> 0x04d9 }
        r0 = r0.get();	 Catch:{ all -> 0x04d9 }
        r0 = (defpackage.agew) r0;	 Catch:{ all -> 0x04d9 }
        r13 = 2;
        r0 = defpackage.agja.a(r0, r13);	 Catch:{ all -> 0x04d9 }
        r0 = (defpackage.agew) r0;	 Catch:{ all -> 0x04d9 }
        r5 = 3;
        r5 = defpackage.agja.a(r2, r5);	 Catch:{ all -> 0x04d9 }
        r5 = (android.database.Cursor) r5;	 Catch:{ all -> 0x04d9 }
        r3.<init>(r4, r0, r5);	 Catch:{ all -> 0x04d9 }
        r0 = r1.i;	 Catch:{ all -> 0x04d9 }
    L_0x005a:
        r4 = r3.a;	 Catch:{ all -> 0x04d9 }
        r4 = r4.moveToNext();	 Catch:{ all -> 0x04d9 }
        if (r4 == 0) goto L_0x00f9;
    L_0x0062:
        r4 = r3.b;	 Catch:{ all -> 0x04d9 }
        r4 = r4.a();	 Catch:{ all -> 0x04d9 }
        r5 = r3.a;	 Catch:{ all -> 0x04d9 }
        r6 = r3.d;	 Catch:{ all -> 0x04d9 }
        r5 = r5.getInt(r6);	 Catch:{ all -> 0x04d9 }
        r6 = r3.a;	 Catch:{ all -> 0x04d9 }
        r7 = r3.e;	 Catch:{ all -> 0x04d9 }
        r17 = r6.getInt(r7);	 Catch:{ all -> 0x04d9 }
        r6 = r3.a;	 Catch:{ all -> 0x04d9 }
        r7 = r3.f;	 Catch:{ all -> 0x04d9 }
        r18 = r6.getBlob(r7);	 Catch:{ all -> 0x04d9 }
        r6 = r3.a;	 Catch:{ all -> 0x04d9 }
        r7 = r3.m;	 Catch:{ all -> 0x04d9 }
        r21 = r6.getLong(r7);	 Catch:{ all -> 0x04d9 }
        r6 = r3.a;	 Catch:{ all -> 0x04d9 }
        r7 = r3.k;	 Catch:{ all -> 0x04d9 }
        r6 = r6.getInt(r7);	 Catch:{ all -> 0x04d9 }
        r19 = defpackage.agqf.a(r6);	 Catch:{ all -> 0x04d9 }
        r6 = r3.a;	 Catch:{ all -> 0x04d9 }
        r7 = r3.l;	 Catch:{ all -> 0x04d9 }
        r6 = r6.getInt(r7);	 Catch:{ all -> 0x04d9 }
        r20 = defpackage.agqq.a(r6);	 Catch:{ all -> 0x04d9 }
        r16 = defpackage.ahdl.a(r5);	 Catch:{ all -> 0x04d9 }
        r14 = r0;
        r15 = r4;
        r14.a(r15, r16, r17, r18, r19, r20, r21);	 Catch:{ all -> 0x04d9 }
        r5 = r3.c;	 Catch:{ all -> 0x04d9 }
        r15 = r5.a();	 Catch:{ all -> 0x04d9 }
        r4 = r4.a();	 Catch:{ all -> 0x04d9 }
        r4 = r0.b(r4);	 Catch:{ all -> 0x04d9 }
        if (r15 == 0) goto L_0x00e2;
    L_0x00b9:
        r5 = r3.a;	 Catch:{ all -> 0x04d9 }
        r6 = r3.g;	 Catch:{ all -> 0x04d9 }
        r16 = r5.getLong(r6);	 Catch:{ all -> 0x04d9 }
        r5 = r3.a;	 Catch:{ all -> 0x04d9 }
        r6 = r3.h;	 Catch:{ all -> 0x04d9 }
        r18 = r5.getLong(r6);	 Catch:{ all -> 0x04d9 }
        r14 = r4;
        r14.a(r15, r16, r18);	 Catch:{ all -> 0x04d9 }
        r5 = r3.a;	 Catch:{ all -> 0x04d9 }
        r6 = r3.i;	 Catch:{ all -> 0x04d9 }
        r5 = r5.isNull(r6);	 Catch:{ all -> 0x04d9 }
        if (r5 != 0) goto L_0x00e2;
    L_0x00d7:
        r5 = r3.a;	 Catch:{ all -> 0x04d9 }
        r6 = r3.i;	 Catch:{ all -> 0x04d9 }
        r5 = r5.getLong(r6);	 Catch:{ all -> 0x04d9 }
        r4.a(r5);	 Catch:{ all -> 0x04d9 }
    L_0x00e2:
        r5 = r3.a;	 Catch:{ all -> 0x04d9 }
        r6 = r3.j;	 Catch:{ all -> 0x04d9 }
        r5 = r5.isNull(r6);	 Catch:{ all -> 0x04d9 }
        if (r5 != 0) goto L_0x005a;
    L_0x00ec:
        r5 = r3.a;	 Catch:{ all -> 0x04d9 }
        r6 = r3.j;	 Catch:{ all -> 0x04d9 }
        r5 = r5.getLong(r6);	 Catch:{ all -> 0x04d9 }
        r4.b(r5);	 Catch:{ all -> 0x04d9 }
        goto L_0x005a;
    L_0x00f9:
        r2.close();	 Catch:{ all -> 0x04de }
        r0 = r1.c;	 Catch:{ all -> 0x04de }
        r0 = r0.a();	 Catch:{ all -> 0x04de }
        r0 = r0.iterator();	 Catch:{ all -> 0x04de }
    L_0x0106:
        r2 = r0.hasNext();	 Catch:{ all -> 0x04de }
        if (r2 == 0) goto L_0x011c;
    L_0x010c:
        r2 = r0.next();	 Catch:{ all -> 0x04de }
        r2 = (defpackage.agqp) r2;	 Catch:{ all -> 0x04de }
        r3 = r1.i;	 Catch:{ all -> 0x04de }
        r2 = r2.a();	 Catch:{ all -> 0x04de }
        r3.d(r2);	 Catch:{ all -> 0x04de }
        goto L_0x0106;
    L_0x011c:
        r0 = r1.k;	 Catch:{ all -> 0x04de }
        r2 = r0.c;	 Catch:{ all -> 0x04de }
        r14 = r2.a();	 Catch:{ all -> 0x04de }
        r15 = "streams";
        r16 = defpackage.aghn.a;	 Catch:{ all -> 0x04de }
        r17 = 0;
        r18 = 0;
        r19 = 0;
        r20 = 0;
        r21 = 0;
        r22 = 0;
        r2 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22);	 Catch:{ all -> 0x04de }
        r3 = new aghm;	 Catch:{ all -> 0x04d4 }
        r0 = r0.b;	 Catch:{ all -> 0x04d4 }
        r3.<init>(r0, r2);	 Catch:{ all -> 0x04d4 }
        r4 = new java.util.HashMap;	 Catch:{ all -> 0x04d4 }
        r4.<init>();	 Catch:{ all -> 0x04d4 }
    L_0x0144:
        r0 = r3.b;	 Catch:{ all -> 0x04d4 }
        r0 = r0.moveToNext();	 Catch:{ all -> 0x04d4 }
        if (r0 != 0) goto L_0x0338;
    L_0x014c:
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x04d4 }
        r0.<init>();	 Catch:{ all -> 0x04d4 }
        r3 = r4.values();	 Catch:{ all -> 0x04d4 }
        r3 = r3.iterator();	 Catch:{ all -> 0x04d4 }
    L_0x0159:
        r4 = r3.hasNext();	 Catch:{ all -> 0x04d4 }
        if (r4 == 0) goto L_0x01a6;
    L_0x015f:
        r4 = r3.next();	 Catch:{ all -> 0x04d4 }
        r4 = (android.util.Pair) r4;	 Catch:{ all -> 0x04d4 }
        r5 = r4.first;	 Catch:{ all -> 0x04d4 }
        if (r5 == 0) goto L_0x017f;
    L_0x0169:
        r5 = r4.first;	 Catch:{ all -> 0x04d4 }
        r5 = (defpackage.agql) r5;	 Catch:{ all -> 0x04d4 }
        r5 = r5.b();	 Catch:{ all -> 0x04d4 }
        if (r5 == 0) goto L_0x017a;
    L_0x0173:
        r5 = r4.first;	 Catch:{ all -> 0x04d4 }
        r5 = (defpackage.agql) r5;	 Catch:{ all -> 0x04d4 }
        r6 = r5;
        r5 = 0;
        goto L_0x0181;
    L_0x017a:
        r5 = r4.first;	 Catch:{ all -> 0x04d4 }
        r5 = (defpackage.agql) r5;	 Catch:{ all -> 0x04d4 }
        goto L_0x0180;
    L_0x017f:
        r5 = 0;
    L_0x0180:
        r6 = 0;
    L_0x0181:
        r7 = r4.second;	 Catch:{ all -> 0x04d4 }
        if (r7 == 0) goto L_0x019a;
    L_0x0185:
        r7 = r4.second;	 Catch:{ all -> 0x04d4 }
        r7 = (defpackage.agql) r7;	 Catch:{ all -> 0x04d4 }
        r7 = r7.b();	 Catch:{ all -> 0x04d4 }
        if (r7 == 0) goto L_0x0195;
    L_0x018f:
        r4 = r4.second;	 Catch:{ all -> 0x04d4 }
        r6 = r4;
        r6 = (defpackage.agql) r6;	 Catch:{ all -> 0x04d4 }
        goto L_0x019a;
    L_0x0195:
        r4 = r4.second;	 Catch:{ all -> 0x04d4 }
        r5 = r4;
        r5 = (defpackage.agql) r5;	 Catch:{ all -> 0x04d4 }
    L_0x019a:
        if (r5 != 0) goto L_0x019e;
    L_0x019c:
        if (r6 == 0) goto L_0x0159;
    L_0x019e:
        r4 = defpackage.agqn.a(r5, r6);	 Catch:{ all -> 0x04d4 }
        r0.add(r4);	 Catch:{ all -> 0x04d4 }
        goto L_0x0159;
    L_0x01a6:
        r2.close();	 Catch:{ all -> 0x04de }
        r0 = r0.iterator();	 Catch:{ all -> 0x04de }
    L_0x01ad:
        r2 = r0.hasNext();	 Catch:{ all -> 0x04de }
        if (r2 == 0) goto L_0x01e6;
    L_0x01b3:
        r2 = r0.next();	 Catch:{ all -> 0x04de }
        r2 = (defpackage.agqn) r2;	 Catch:{ all -> 0x04de }
        r3 = r1.i;	 Catch:{ all -> 0x04de }
        r4 = r2.a();	 Catch:{ all -> 0x04de }
        r5 = r2.a;	 Catch:{ all -> 0x04de }
        r6 = r2.b;	 Catch:{ all -> 0x04de }
        r7 = r3.l;	 Catch:{ all -> 0x04de }
        monitor-enter(r7);	 Catch:{ all -> 0x04de }
        r8 = r3.a;	 Catch:{ all -> 0x01e3 }
        r9 = new agir;	 Catch:{ all -> 0x01e3 }
        r9.<init>(r3, r5, r6);	 Catch:{ all -> 0x01e3 }
        r8.put(r4, r9);	 Catch:{ all -> 0x01e3 }
        monitor-exit(r7);	 Catch:{ all -> 0x01e3 }
        r3 = r2.i;	 Catch:{ all -> 0x04de }
        r3 = defpackage.agmn.a(r3);	 Catch:{ all -> 0x04de }
        if (r3 == 0) goto L_0x01ad;
    L_0x01d9:
        r2 = r2.e;	 Catch:{ all -> 0x04de }
        if (r2 == 0) goto L_0x01ad;
    L_0x01dd:
        r3 = r1.f;	 Catch:{ all -> 0x04de }
        r3.a(r2);	 Catch:{ all -> 0x04de }
        goto L_0x01ad;
    L_0x01e3:
        r0 = move-exception;
        monitor-exit(r7);	 Catch:{ all -> 0x01e3 }
        throw r0;	 Catch:{ all -> 0x04de }
    L_0x01e6:
        r0 = r1.c;	 Catch:{ all -> 0x04de }
        r0 = r0.b();	 Catch:{ all -> 0x04de }
        r0 = r0.iterator();	 Catch:{ all -> 0x04de }
    L_0x01f0:
        r2 = r0.hasNext();	 Catch:{ all -> 0x04de }
        if (r2 == 0) goto L_0x0275;
    L_0x01f6:
        r2 = r0.next();	 Catch:{ all -> 0x04de }
        r15 = r2;
        r15 = (defpackage.agqi) r15;	 Catch:{ all -> 0x04de }
        r9 = new java.util.ArrayList;	 Catch:{ all -> 0x04de }
        r9.<init>();	 Catch:{ all -> 0x04de }
        r3 = "playlist_video";
        r4 = new java.lang.String[r13];	 Catch:{ all -> 0x04de }
        r2 = "playlist_id";
        r4[r12] = r2;	 Catch:{ all -> 0x04de }
        r2 = "video_id";
        r4[r11] = r2;	 Catch:{ all -> 0x04de }
        r5 = "playlist_id=?";
        r6 = new java.lang.String[r11];	 Catch:{ all -> 0x04de }
        r2 = r15.a;	 Catch:{ all -> 0x04de }
        r6[r12] = r2;	 Catch:{ all -> 0x04de }
        r16 = "index_in_playlist ASC";
        r7 = 0;
        r8 = 0;
        r2 = r10;
        r14 = r9;
        r9 = r16;
        r2 = r2.query(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x04de }
        r3 = "video_id";
        r3 = r2.getColumnIndexOrThrow(r3);	 Catch:{ all -> 0x0270 }
    L_0x0228:
        r4 = r2.moveToNext();	 Catch:{ all -> 0x0270 }
        if (r4 == 0) goto L_0x023d;
    L_0x022e:
        r4 = r2.getString(r3);	 Catch:{ all -> 0x0270 }
        r5 = r1.i;	 Catch:{ all -> 0x0270 }
        r6 = r15.a;	 Catch:{ all -> 0x0270 }
        r5.a(r6, r4);	 Catch:{ all -> 0x0270 }
        r14.add(r4);	 Catch:{ all -> 0x0270 }
        goto L_0x0228;
    L_0x023d:
        r2.close();	 Catch:{ all -> 0x04de }
        r2 = r1.c;	 Catch:{ all -> 0x04de }
        r3 = r15.a;	 Catch:{ all -> 0x04de }
        r2 = r2.f(r3);	 Catch:{ all -> 0x04de }
        r3 = r1.c;	 Catch:{ all -> 0x04de }
        r4 = r15.a;	 Catch:{ all -> 0x04de }
        r19 = r3.d(r4);	 Catch:{ all -> 0x04de }
        r3 = r1.c;	 Catch:{ all -> 0x04de }
        r4 = r15.a;	 Catch:{ all -> 0x04de }
        r20 = r3.g(r4);	 Catch:{ all -> 0x04de }
        r3 = r1.c;	 Catch:{ all -> 0x04de }
        r4 = r15.a;	 Catch:{ all -> 0x04de }
        r22 = r3.h(r4);	 Catch:{ all -> 0x04de }
        r3 = r1.i;	 Catch:{ all -> 0x04de }
        r18 = defpackage.ahdl.a(r2);	 Catch:{ all -> 0x04de }
        r2 = r15;
        r15 = r3;
        r16 = r2;
        r17 = r14;
        r15.a(r16, r17, r18, r19, r20, r22);	 Catch:{ all -> 0x04de }
        goto L_0x01f0;
    L_0x0270:
        r0 = move-exception;
        r2.close();	 Catch:{ all -> 0x04de }
        throw r0;	 Catch:{ all -> 0x04de }
    L_0x0275:
        r0 = r1.d;	 Catch:{ all -> 0x04de }
        r0 = r0.a();	 Catch:{ all -> 0x04de }
        r0 = r0.iterator();	 Catch:{ all -> 0x04de }
    L_0x027f:
        r2 = r0.hasNext();	 Catch:{ all -> 0x04de }
        if (r2 == 0) goto L_0x032f;
    L_0x0285:
        r2 = r0.next();	 Catch:{ all -> 0x04de }
        r14 = r2;
        r14 = (defpackage.agqr) r14;	 Catch:{ all -> 0x04de }
        r15 = new java.util.ArrayList;	 Catch:{ all -> 0x04de }
        r15.<init>();	 Catch:{ all -> 0x04de }
        r3 = "video_list_videos";
        r4 = new java.lang.String[r13];	 Catch:{ all -> 0x04de }
        r2 = "video_list_id";
        r4[r12] = r2;	 Catch:{ all -> 0x04de }
        r2 = "video_id";
        r4[r11] = r2;	 Catch:{ all -> 0x04de }
        r5 = "video_list_id=?";
        r6 = new java.lang.String[r11];	 Catch:{ all -> 0x04de }
        r2 = r14.a;	 Catch:{ all -> 0x04de }
        r6[r12] = r2;	 Catch:{ all -> 0x04de }
        r9 = "index_in_video_list ASC";
        r7 = 0;
        r8 = 0;
        r2 = r10;
        r2 = r2.query(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x04de }
        r3 = "video_id";
        r3 = r2.getColumnIndexOrThrow(r3);	 Catch:{ all -> 0x032a }
    L_0x02b4:
        r4 = r2.moveToNext();	 Catch:{ all -> 0x032a }
        if (r4 == 0) goto L_0x02c9;
    L_0x02ba:
        r4 = r2.getString(r3);	 Catch:{ all -> 0x032a }
        r5 = r1.i;	 Catch:{ all -> 0x032a }
        r6 = r14.a;	 Catch:{ all -> 0x032a }
        r5.b(r6, r4);	 Catch:{ all -> 0x032a }
        r15.add(r4);	 Catch:{ all -> 0x032a }
        goto L_0x02b4;
    L_0x02c9:
        r2.close();	 Catch:{ all -> 0x04de }
        r9 = new java.util.ArrayList;	 Catch:{ all -> 0x04de }
        r9.<init>();	 Catch:{ all -> 0x04de }
        r3 = "final_video_list_video_ids";
        r4 = new java.lang.String[r13];	 Catch:{ all -> 0x04de }
        r2 = "video_list_id";
        r4[r12] = r2;	 Catch:{ all -> 0x04de }
        r2 = "video_id";
        r4[r11] = r2;	 Catch:{ all -> 0x04de }
        r5 = "video_list_id=?";
        r6 = new java.lang.String[r11];	 Catch:{ all -> 0x04de }
        r2 = r14.a;	 Catch:{ all -> 0x04de }
        r6[r12] = r2;	 Catch:{ all -> 0x04de }
        r16 = "index_in_video_list ASC";
        r7 = 0;
        r8 = 0;
        r2 = r10;
        r13 = r9;
        r9 = r16;
        r2 = r2.query(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ all -> 0x04de }
        r3 = "video_id";
        r3 = r2.getColumnIndexOrThrow(r3);	 Catch:{ all -> 0x0325 }
    L_0x02f7:
        r4 = r2.moveToNext();	 Catch:{ all -> 0x0325 }
        if (r4 == 0) goto L_0x0305;
    L_0x02fd:
        r4 = r2.getString(r3);	 Catch:{ all -> 0x0325 }
        r13.add(r4);	 Catch:{ all -> 0x0325 }
        goto L_0x02f7;
    L_0x0305:
        r2.close();	 Catch:{ all -> 0x04de }
        r2 = r1.d;	 Catch:{ all -> 0x04de }
        r3 = r14.a;	 Catch:{ all -> 0x04de }
        r2 = r2.g(r3);	 Catch:{ all -> 0x04de }
        r3 = r13.isEmpty();	 Catch:{ all -> 0x04de }
        if (r3 == 0) goto L_0x031d;
    L_0x0316:
        r3 = r1.i;	 Catch:{ all -> 0x04de }
        r4 = 0;
        r3.a(r14, r15, r4, r2);	 Catch:{ all -> 0x04de }
        goto L_0x0322;
    L_0x031d:
        r3 = r1.i;	 Catch:{ all -> 0x04de }
        r3.a(r14, r15, r13, r2);	 Catch:{ all -> 0x04de }
    L_0x0322:
        r13 = 2;
        goto L_0x027f;
    L_0x0325:
        r0 = move-exception;
        r2.close();	 Catch:{ all -> 0x04de }
        throw r0;	 Catch:{ all -> 0x04de }
    L_0x032a:
        r0 = move-exception;
        r2.close();	 Catch:{ all -> 0x04de }
        throw r0;	 Catch:{ all -> 0x04de }
    L_0x032f:
        r1.n = r11;	 Catch:{ all -> 0x04de }
        r0 = r1.g;	 Catch:{ all -> 0x04e7 }
        r0.open();	 Catch:{ all -> 0x04e7 }
        monitor-exit(r23);
        return;
    L_0x0338:
        r0 = r3.b;	 Catch:{ all -> 0x04d4 }
        r5 = r3.c;	 Catch:{ all -> 0x04d4 }
        r5 = r0.getString(r5);	 Catch:{ all -> 0x04d4 }
        r0 = defpackage.arlv.E;	 Catch:{ anyg -> 0x0480 }
        r0 = r0.createBuilder();	 Catch:{ anyg -> 0x0480 }
        r0 = (defpackage.arlx) r0;	 Catch:{ anyg -> 0x0480 }
        r6 = r3.b;	 Catch:{ anyg -> 0x0480 }
        r7 = r3.d;	 Catch:{ anyg -> 0x0480 }
        r6 = r6.getBlob(r7);	 Catch:{ anyg -> 0x0480 }
        r0 = r0.mergeFrom(r6);	 Catch:{ anyg -> 0x0480 }
        r0 = (defpackage.anvi) r0;	 Catch:{ anyg -> 0x0480 }
        r0 = (defpackage.arlx) r0;	 Catch:{ anyg -> 0x0480 }
        r0 = r0.build();	 Catch:{ anyg -> 0x0480 }
        r0 = (defpackage.anxl) r0;	 Catch:{ anyg -> 0x0480 }
        r6 = r0;
        r6 = (defpackage.arlv) r6;	 Catch:{ anyg -> 0x0480 }
        r0 = r3.b;	 Catch:{ anyg -> 0x0480 }
        r7 = r3.e;	 Catch:{ anyg -> 0x0480 }
        r7 = r0.getLong(r7);	 Catch:{ anyg -> 0x0480 }
        r0 = r3.b;	 Catch:{ anyg -> 0x0480 }
        r9 = r3.p;	 Catch:{ anyg -> 0x0480 }
        r0 = r0.getBlob(r9);	 Catch:{ anyg -> 0x0480 }
        if (r0 == 0) goto L_0x037b;
    L_0x0373:
        r14 = new java.lang.String;	 Catch:{ anyg -> 0x0480 }
        r9 = defpackage.ampv.c;	 Catch:{ anyg -> 0x0480 }
        r14.<init>(r0, r9);	 Catch:{ anyg -> 0x0480 }
        goto L_0x037c;
    L_0x037b:
        r14 = 0;
    L_0x037c:
        r0 = r3.b;	 Catch:{ anyg -> 0x0480 }
        r9 = r3.n;	 Catch:{ anyg -> 0x0480 }
        r9 = r0.getBlob(r9);	 Catch:{ anyg -> 0x0480 }
        r0 = r3.b;	 Catch:{ anyg -> 0x0480 }
        r13 = r3.o;	 Catch:{ anyg -> 0x0480 }
        r0 = r0.getBlob(r13);	 Catch:{ anyg -> 0x0480 }
        r13 = defpackage.azxz.c;	 Catch:{ anyg -> 0x0480 }
        r13 = r13.createBuilder();	 Catch:{ anyg -> 0x0480 }
        r13 = (defpackage.azxy) r13;	 Catch:{ anyg -> 0x0480 }
        if (r0 != 0) goto L_0x0397;
    L_0x0396:
        goto L_0x03ae;
    L_0x0397:
        r15 = r0.length;	 Catch:{ anyg -> 0x0480 }
        if (r15 <= 0) goto L_0x03ae;
    L_0x039a:
        r15 = r3.a;	 Catch:{ anyg -> 0x0480 }
        r0 = defpackage.xsf.b(r9, r0, r15);	 Catch:{ anyg -> 0x0480 }
        r15 = defpackage.anxa.c();	 Catch:{ anyg -> 0x03a8 }
        r13.mergeFrom(r0, r15);	 Catch:{ anyg -> 0x03a8 }
        goto L_0x03ae;
    L_0x03a8:
        r0 = move-exception;
        r15 = "Failed to parse disco key.";
        defpackage.xtl.a(r15, r0);	 Catch:{ anyg -> 0x0480 }
    L_0x03ae:
        r0 = defpackage.agql.z();	 Catch:{ anyg -> 0x0480 }
        r15 = new aahr;	 Catch:{ anyg -> 0x0480 }
        r15.<init>(r6, r5, r7);	 Catch:{ anyg -> 0x0480 }
        r0 = r0.a(r15);	 Catch:{ anyg -> 0x0480 }
        r6 = r3.b;	 Catch:{ anyg -> 0x0480 }
        r7 = r3.f;	 Catch:{ anyg -> 0x0480 }
        r6 = defpackage.xbs.a(r6, r7, r12);	 Catch:{ anyg -> 0x0480 }
        r0 = r0.a(r6);	 Catch:{ anyg -> 0x0480 }
        r6 = r3.b;	 Catch:{ anyg -> 0x0480 }
        r7 = r3.g;	 Catch:{ anyg -> 0x0480 }
        r6 = r6.getLong(r7);	 Catch:{ anyg -> 0x0480 }
        r0 = r0.a(r6);	 Catch:{ anyg -> 0x0480 }
        r6 = r3.b;	 Catch:{ anyg -> 0x0480 }
        r7 = r3.h;	 Catch:{ anyg -> 0x0480 }
        r6 = r6.getInt(r7);	 Catch:{ anyg -> 0x0480 }
        r7 = defpackage.agql.a;	 Catch:{ anyg -> 0x0480 }
        r8 = r7.length;	 Catch:{ anyg -> 0x0480 }
        r15 = 0;
    L_0x03df:
        if (r15 >= r8) goto L_0x03e9;
    L_0x03e1:
        r11 = r7[r15];	 Catch:{ anyg -> 0x0480 }
        if (r11 == r6) goto L_0x03ea;
    L_0x03e5:
        r15 = r15 + 1;
        r11 = 1;
        goto L_0x03df;
    L_0x03e9:
        r11 = 0;
    L_0x03ea:
        r0 = r0.a(r11);	 Catch:{ anyg -> 0x0480 }
        r6 = r3.b;	 Catch:{ anyg -> 0x0480 }
        r7 = r3.i;	 Catch:{ anyg -> 0x0480 }
        r6 = r6.getLong(r7);	 Catch:{ anyg -> 0x0480 }
        r0 = r0.b(r6);	 Catch:{ anyg -> 0x0480 }
        r6 = r3.b;	 Catch:{ anyg -> 0x0480 }
        r7 = r3.j;	 Catch:{ anyg -> 0x0480 }
        r6 = r6.getLong(r7);	 Catch:{ anyg -> 0x0480 }
        r0 = r0.c(r6);	 Catch:{ anyg -> 0x0480 }
        r6 = r3.b;	 Catch:{ anyg -> 0x0480 }
        r7 = r3.k;	 Catch:{ anyg -> 0x0480 }
        r6 = r6.getLong(r7);	 Catch:{ anyg -> 0x0480 }
        r0 = r0.d(r6);	 Catch:{ anyg -> 0x0480 }
        r6 = r3.b;	 Catch:{ anyg -> 0x0480 }
        r7 = r3.l;	 Catch:{ anyg -> 0x0480 }
        r6 = r6.getInt(r7);	 Catch:{ anyg -> 0x0480 }
        r6 = defpackage.avod.b(r6);	 Catch:{ anyg -> 0x0480 }
        r0 = r0.c(r6);	 Catch:{ anyg -> 0x0480 }
        r6 = r3.b;	 Catch:{ anyg -> 0x0480 }
        r7 = r3.m;	 Catch:{ anyg -> 0x0480 }
        r6 = r6.getBlob(r7);	 Catch:{ anyg -> 0x0480 }
        r0 = r0.a(r6);	 Catch:{ anyg -> 0x0480 }
        r0 = r0.b(r9);	 Catch:{ anyg -> 0x0480 }
        r6 = r13.build();	 Catch:{ anyg -> 0x0480 }
        r6 = (defpackage.anxl) r6;	 Catch:{ anyg -> 0x0480 }
        r6 = (defpackage.azxz) r6;	 Catch:{ anyg -> 0x0480 }
        r0 = r0.a(r6);	 Catch:{ anyg -> 0x0480 }
        r0 = r0.a(r14);	 Catch:{ anyg -> 0x0480 }
        r6 = r3.b;	 Catch:{ anyg -> 0x0480 }
        r7 = r3.q;	 Catch:{ anyg -> 0x0480 }
        r6 = r6.getInt(r7);	 Catch:{ anyg -> 0x0480 }
        r0 = r0.b(r6);	 Catch:{ anyg -> 0x0480 }
        r6 = r3.b;	 Catch:{ anyg -> 0x0480 }
        r7 = r3.s;	 Catch:{ anyg -> 0x0480 }
        r6 = r6.getString(r7);	 Catch:{ anyg -> 0x0480 }
        r0 = r0.b(r6);	 Catch:{ anyg -> 0x0480 }
        r6 = r3.b;	 Catch:{ anyg -> 0x0480 }
        r7 = r3.t;	 Catch:{ anyg -> 0x0480 }
        r6 = defpackage.xbs.a(r6, r7, r12);	 Catch:{ anyg -> 0x0480 }
        r0 = r0.b(r6);	 Catch:{ anyg -> 0x0480 }
        r6 = r3.b;	 Catch:{ anyg -> 0x0480 }
        r7 = r3.r;	 Catch:{ anyg -> 0x0480 }
        r6 = r6.getString(r7);	 Catch:{ anyg -> 0x0480 }
        r7 = android.text.TextUtils.isEmpty(r6);	 Catch:{ anyg -> 0x0480 }
        if (r7 != 0) goto L_0x047b;
    L_0x0474:
        r6 = android.net.Uri.parse(r6);	 Catch:{ anyg -> 0x0480 }
        r0.a(r6);	 Catch:{ anyg -> 0x0480 }
    L_0x047b:
        r14 = r0.a();	 Catch:{ anyg -> 0x0480 }
        goto L_0x049b;
    L_0x0480:
        r0 = move-exception;
        r6 = "Error reading stream for video ";
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x04d4 }
        r7 = r5.length();	 Catch:{ all -> 0x04d4 }
        if (r7 != 0) goto L_0x0493;
    L_0x048d:
        r5 = new java.lang.String;	 Catch:{ all -> 0x04d4 }
        r5.<init>(r6);	 Catch:{ all -> 0x04d4 }
        goto L_0x0497;
    L_0x0493:
        r5 = r6.concat(r5);	 Catch:{ all -> 0x04d4 }
    L_0x0497:
        defpackage.xtl.a(r5, r0);	 Catch:{ all -> 0x04d4 }
        r14 = 0;
    L_0x049b:
        if (r14 == 0) goto L_0x04d0;
    L_0x049d:
        r0 = r14.q();	 Catch:{ all -> 0x04d4 }
        r5 = r4.get(r0);	 Catch:{ all -> 0x04d4 }
        r5 = (android.util.Pair) r5;	 Catch:{ all -> 0x04d4 }
        if (r5 != 0) goto L_0x04b3;
    L_0x04a9:
        r5 = new android.util.Pair;	 Catch:{ all -> 0x04d4 }
        r6 = 0;
        r5.<init>(r14, r6);	 Catch:{ all -> 0x04d4 }
        r4.put(r0, r5);	 Catch:{ all -> 0x04d4 }
        goto L_0x04d0;
    L_0x04b3:
        r6 = r5.first;	 Catch:{ all -> 0x04d4 }
        if (r6 != 0) goto L_0x04c4;
    L_0x04b7:
        r6 = new android.util.Pair;	 Catch:{ all -> 0x04d4 }
        r5 = r5.second;	 Catch:{ all -> 0x04d4 }
        r5 = (defpackage.agql) r5;	 Catch:{ all -> 0x04d4 }
        r6.<init>(r14, r5);	 Catch:{ all -> 0x04d4 }
        r4.put(r0, r6);	 Catch:{ all -> 0x04d4 }
        goto L_0x04d0;
    L_0x04c4:
        r6 = new android.util.Pair;	 Catch:{ all -> 0x04d4 }
        r5 = r5.first;	 Catch:{ all -> 0x04d4 }
        r5 = (defpackage.agql) r5;	 Catch:{ all -> 0x04d4 }
        r6.<init>(r5, r14);	 Catch:{ all -> 0x04d4 }
        r4.put(r0, r6);	 Catch:{ all -> 0x04d4 }
    L_0x04d0:
        r11 = 1;
        r13 = 2;
        goto L_0x0144;
    L_0x04d4:
        r0 = move-exception;
        r2.close();	 Catch:{ all -> 0x04de }
        throw r0;	 Catch:{ all -> 0x04de }
    L_0x04d9:
        r0 = move-exception;
        r2.close();	 Catch:{ all -> 0x04de }
        throw r0;	 Catch:{ all -> 0x04de }
    L_0x04de:
        r0 = move-exception;
        r2 = r1.g;	 Catch:{ all -> 0x04e7 }
        r2.open();	 Catch:{ all -> 0x04e7 }
        throw r0;	 Catch:{ all -> 0x04e7 }
    L_0x04e5:
        monitor-exit(r23);
        return;
    L_0x04e7:
        r0 = move-exception;
        monitor-exit(r23);
        goto L_0x04eb;
    L_0x04ea:
        throw r0;
    L_0x04eb:
        goto L_0x04ea;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agif.f():void");
    }

    public final boolean a(agql agql, List list) {
        if (agql == null) {
            return true;
        }
        agpv b = agql.b(list, this.m);
        if (b == null) {
            return false;
        }
        if (agql.m() == null && b.a != null) {
            agie a = this.i.a(agql.q());
            if (a != null) {
                a.a(agql.y().b(b.a).a());
                aghn aghn = this.k;
                String q = agql.q();
                int r = agql.r();
                String str = b.a;
                ContentValues contentValues = new ContentValues();
                contentValues.put("storage_id", str);
                long update = (long) aghn.c.a().update("streams", contentValues, "video_id = ? AND itag = ?", new String[]{q, Integer.toString(r)});
                if (update != 1) {
                    StringBuilder stringBuilder = new StringBuilder(75);
                    stringBuilder.append("Update stream transfer_started_timestamp affected ");
                    stringBuilder.append(update);
                    stringBuilder.append(" rows");
                    throw new SQLException(stringBuilder.toString());
                }
            }
        }
        return true;
    }

    private final void g() {
        this.g.block();
    }
}
