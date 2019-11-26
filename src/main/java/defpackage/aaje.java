package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aaje */
public final class aaje {
    public final Uri a;
    public final String b;
    public final avtm c;
    public final awdg d;
    public final aajj e;
    public final Map f;
    public String g;
    public atbq h;
    public aajh i;
    public aajs j;
    public long k;
    public boolean l;
    public bcaa m;
    public int n = 1;

    public aaje(avtm avtm, String str, long j) {
        boolean z = true;
        amqw.a((Object) avtm);
        if ((avtm.a & 1) == 0) {
            z = false;
        }
        amqw.a(z);
        this.a = Uri.parse(avtm.c);
        this.b = xvd.a(str);
        this.k = Math.max(j, 0);
        this.c = avtm;
        this.f = new HashMap();
        this.f.put("Content-Type", "application/x-protobuf");
        awdf awdf = (awdf) awdg.J.createBuilder();
        if ((avtm.a & 2) != 0) {
            avti avti = avtm.d;
            if (avti == null) {
                avti = avti.c;
            }
            arhh arhh = avti.b;
            if (arhh == null) {
                arhh = arhh.bv;
            }
            awdf.a(arhh);
        }
        if ((avtm.a & 131072) != 0) {
            avto avto = avtm.k;
            if (avto == null) {
                avto = avto.c;
            }
            axur axur = avto.b;
            if (axur == null) {
                axur = axur.g;
            }
            awdf.a(axur);
        }
        if ((avtm.a & 8388608) != 0) {
            aqsq aqsq = avtm.m;
            if (aqsq == null) {
                aqsq = aqsq.h;
            }
            awdf.copyOnWrite();
            awdg awdg = (awdg) awdf.instance;
            if (aqsq != null) {
                awdg.z = aqsq;
                awdg.b |= 256;
            } else {
                throw new NullPointerException();
            }
        }
        if ((avtm.b & 128) != 0) {
            aoth aoth = avtm.w;
            if (aoth == null) {
                aoth = aoth.k;
            }
            awdf.a(aoth);
        }
        if ((avtm.b & 256) != 0) {
            avjo avjo = avtm.x;
            if (avjo == null) {
                avjo = avjo.d;
            }
            awdf.a(avjo);
        }
        this.d = (awdg) ((anxl) awdf.build());
        this.e = new aajj(this.d);
    }

    public final void a(String str) {
        this.g = xvd.a(str);
    }

    public final void a(long j) {
        this.k = Math.max(j, 0);
    }

    public final boolean a() {
        return this.c.e;
    }

    public final int b() {
        return this.c.u;
    }

    public final int c() {
        return this.c.h;
    }

    public final String d() {
        return this.c.l;
    }

    public final void a(aajs aajs) {
        this.n = 2;
        this.j = aajs;
    }

    public final boolean e() {
        return this.n == 2;
    }
}
