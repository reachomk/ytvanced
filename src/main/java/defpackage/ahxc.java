package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.vr.ndk.base.DaydreamApi;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ahxc */
public final class ahxc implements ahov, ahsp, ajan, xcp {
    public final ahnq a;
    public final ahxs b;
    public final Handler c;
    public final Set d = new HashSet();
    public wxd e;
    public DaydreamApi f;
    public ahxn g;
    public ahxl h;
    public nn i;
    public ahxk j;
    public boolean k;
    private final afhw l;
    private final bcaa m;
    private final bcaa n;

    public ahxc(ahnq ahnq, afhw afhw, bcaa bcaa, bcaa bcaa2, ahxs ahxs) {
        this.a = (ahnq) amqw.a((Object) ahnq);
        this.l = (afhw) amqw.a((Object) afhw);
        this.m = (bcaa) amqw.a((Object) bcaa);
        this.n = (bcaa) amqw.a((Object) bcaa2);
        this.b = (ahxs) amqw.a((Object) ahxs);
        this.c = new Handler(Looper.getMainLooper());
        ahxj ahxj = new ahxj(this);
        ahxj.getClass();
        ahnq.o = new ahoh(ahxj);
        ahni ahni = ahnq.i;
        if (ahni != null) {
            ahni.b(ahnq.o);
        }
        ahnq.r = this;
    }

    public final long e() {
        return 256;
    }

    public final void a() {
        this.a.a(null, false);
        b(false);
        for (ahxm d : this.d) {
            d.d(false);
        }
        this.l.a(false);
    }

    public final boolean b() {
        aizy aizy = (aizy) this.m.get();
        return aizy.D() != null && aizy.D().r().a() && ((Boolean) this.n.get()).booleanValue() && !this.k;
    }

    public final void c() {
        if (b()) {
            if (!this.b.a()) {
                ahxl ahxl = this.h;
                if (ahxl == null || !ahxl.c()) {
                    aizy aizy = (aizy) this.m.get();
                    if (!aizy.r()) {
                        aizy.a();
                    }
                    for (ahxm d : this.d) {
                        d.d(true);
                    }
                    this.a.a(new ahos(this), true);
                    this.l.a(true);
                    b(true);
                } else {
                    return;
                }
            }
            return;
        }
        xtl.c("Attempted to enter VR mode when it wasn't available. Doing nothing.");
    }

    public final void a(boolean z) {
        this.c.post(new ahxi(this, z));
    }

    public final void a(ahsj ahsj) {
        a();
        ahxn ahxn = this.g;
        if (ahxn != null) {
            ahxn.a(false);
        }
    }

    public final void b(boolean z) {
        ahxk ahxk = this.j;
        if (ahxk != null) {
            ahxk.a(z);
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.P().b.a(ajcg.b(ajam.O(), 256)).a(ajcg.a(ajam.O(), 256, 0)).a(new ahxe(this), ahxh.a)};
    }

    /* Access modifiers changed, original: final */
    public final void a(ahjn ahjn) {
        if (ahjn.b != airc.FULLSCREEN && this.a.t) {
            a();
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjn.class};
        } else if (i == 0) {
            a((ahjn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        if (ahxt.c(this.i, i)) {
            if (!this.b.a()) {
                if (ahxt.a(this.i, i)) {
                    ahxt.a(this.i, i, this.f, (aizy) this.m.get());
                } else if (!(this.i == null || this.e == null)) {
                    ahxf ahxf = new ahxf(this, i);
                    this.e.a(ahxt.b(this.i, i), 500, ahxf);
                }
            }
            return;
        }
        xtl.c("Attempted to launch the YouTube VR app on a non-supported device. Doing nothing.");
    }
}
