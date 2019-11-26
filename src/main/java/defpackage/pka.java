package defpackage;

import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;

@Deprecated
/* renamed from: pka */
public final class pka implements pjj {
    public final Object a = new Object();
    public final pom b;
    public final pkg c;
    public pkf d;
    public pke e;
    public pkc f;
    public pkh g;

    public pka() {
        pom pom = new pom();
        this.b = pom;
        this.b.b = new pqa(this);
        this.c = new pkg(this);
        this.b.a(this.c);
    }

    public final ptg a(ptd ptd, long j, int i) {
        return ptd.b(new pql(this, ptd, ptd, j, i));
    }

    public final ptg a(ptd ptd, pkl pkl) {
        if (pkl != null) {
            return ptd.b(new pqc(this, ptd, ptd, pkl));
        }
        throw new IllegalArgumentException("trackStyle cannot be null");
    }

    public final long a() {
        long a;
        synchronized (this.a) {
            a = this.b.a();
        }
        return a;
    }

    public final long b() {
        long b;
        synchronized (this.a) {
            b = this.b.b();
        }
        return b;
    }

    public final pjz c() {
        pjz pjz;
        synchronized (this.a) {
            pjz = this.b.a;
        }
        return pjz;
    }

    public final MediaInfo d() {
        MediaInfo c;
        synchronized (this.a) {
            c = this.b.c();
        }
        return c;
    }

    public final String e() {
        return this.b.j;
    }

    public final void a(CastDevice castDevice, String str, String str2) {
        this.b.a(str2);
    }
}
