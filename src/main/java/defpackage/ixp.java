package defpackage;

import android.content.SharedPreferences;
import android.media.AudioRecord;
import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: ixp */
public final class ixp {
    public final iym A;
    public final boolean B;
    public final float C;
    public final int D;
    public boolean E;
    private final arzv F;
    private final arzv G;
    public final amor a;
    public final AudioRecord b;
    public final Handler c;
    public final iyf d;
    public final iyc e;
    public final String f;
    public final Executor g;
    public final amol h;
    public final amoq i;
    public final bciz j;
    public final arzx k;
    public String l;
    public final aamd m;
    public final iyj n = new iyj();
    public final byte[] o;
    public final afpu p;
    public final SharedPreferences q;
    public final String r;
    public final int s;
    public final baum t;
    public final utc u;
    public amoy v;
    public bbio w;
    public bauk x;
    public final bbio y = new ixw(this);
    public final Runnable z = new ixs(this);

    public ixp(bciz bciz, utc utc, aamd aamd, afpu afpu, Executor executor, Handler handler, SharedPreferences sharedPreferences, String str, iyf iyf, iyc iyc, int i, String str2, String str3, String str4, byte[] bArr, arzx arzx, arzv arzv, boolean z, float f, int i2, int i3, int i4) {
        arzv arzv2;
        int i5 = i;
        String str5 = str2;
        String str6 = str3;
        iym iym = new iym();
        this.D = i5;
        this.A = iym;
        this.j = bciz;
        this.u = utc;
        this.m = aamd;
        this.d = iyf;
        this.e = iyc;
        this.t = new baum();
        this.f = str4;
        this.g = executor;
        this.c = handler;
        this.o = bArr;
        this.p = afpu;
        this.q = sharedPreferences;
        this.k = arzx;
        this.r = str;
        this.G = arzv;
        int e = e();
        this.E = a(this.D);
        e = iym.b(e);
        int i6 = 4;
        if (e == 4 || iym.a(iym.a(e)) == null || !this.E) {
            arzv2 = arzv.YOUTUBE_ASSISTANT_AUDIO_ENCODING_LINEAR16;
        } else {
            arzv2 = this.G;
        }
        this.F = arzv2;
        this.s = i2 > 0 ? i2 : 1024;
        amoo amoo = (amoo) amol.c.createBuilder();
        int ordinal = this.F.ordinal();
        if (ordinal == 2) {
            i6 = 5;
        } else if (ordinal == 3) {
            i6 = 6;
        } else if (ordinal != 4) {
            i6 = 3;
        }
        amoo.copyOnWrite();
        ((amol) amoo.instance).a = amon.a(i6);
        amoo.copyOnWrite();
        ((amol) amoo.instance).b = i5;
        this.h = (amol) ((anxl) amoo.build());
        amop amop = (amop) amoq.d.createBuilder();
        amop.copyOnWrite();
        ((amoq) amop.instance).a = amos.a(3);
        amop.copyOnWrite();
        ((amoq) amop.instance).b = 16000;
        amop.copyOnWrite();
        ((amoq) amop.instance).c = 100;
        this.i = (amoq) ((anxl) amop.build());
        this.b = new AudioRecord(6, i, i4, i3, Math.max(1280, AudioRecord.getMinBufferSize(i5, i4, i3)));
        amou amou = (amou) amor.c.createBuilder();
        amou.copyOnWrite();
        amor amor = (amor) amou.instance;
        if (str6 != null) {
            amor.a = str6;
            amou.copyOnWrite();
            amor amor2 = (amor) amou.instance;
            if (str5 != null) {
                amor2.b = str5;
                this.a = (amor) ((anxl) amou.build());
                this.B = z;
                this.C = f;
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    public final void a() {
        AudioRecord audioRecord = this.b;
        if (audioRecord != null) {
            audioRecord.stop();
        }
        d();
        this.g.execute(new ixq(this));
    }

    public final void b() {
        AudioRecord audioRecord = this.b;
        if (audioRecord != null) {
            audioRecord.stop();
        }
        d();
        this.g.execute(new ixt(this));
    }

    public final boolean a(int i) {
        int e = e();
        if (e != 1) {
            try {
                iym iym = this.A;
                iym.b(e);
                iym.d = new iyl(iym.a);
                iym.d.a(i, e);
                iym.c = true;
                iym.b = false;
                return true;
            } catch (iyo | IOException unused) {
            }
        }
        return false;
    }

    private final void d() {
        this.E = false;
        if (c()) {
            try {
                iym iym = this.A;
                if (!iym.c) {
                    throw new IllegalStateException("You forgot to call init()!");
                } else if (iym.b) {
                    throw new IllegalStateException("Already flushed. You must reinitialize.");
                } else {
                    iym.b = true;
                    iym.d.a();
                    iym.c = false;
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public final boolean c() {
        return this.F != arzv.YOUTUBE_ASSISTANT_AUDIO_ENCODING_LINEAR16;
    }

    private final int e() {
        arzv arzv = this.F;
        if (arzv == null) {
            arzv = this.G;
        }
        int ordinal = arzv.ordinal();
        if (ordinal != 2) {
            return ordinal != 4 ? 1 : 2;
        } else {
            return 23851;
        }
    }
}
