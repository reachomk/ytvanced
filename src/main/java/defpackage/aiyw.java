package defpackage;

import android.os.Handler;

/* renamed from: aiyw */
public final class aiyw implements xcp {
    public final bctz a;
    public final bctz b;
    public final ajbp c;
    public ahgk d;
    public Runnable e;
    public Runnable f;
    private final aiyx g;
    private final ahhq h;
    private final Handler i;
    private boolean j;
    private int k;
    private boolean l;

    public aiyw(aiyx aiyx, ahhq ahhq, Handler handler, bctz bctz, bctz bctz2, ajbp ajbp) {
        this.g = aiyx;
        this.h = (ahhq) amqw.a((Object) ahhq);
        this.i = handler;
        this.a = bctz;
        this.b = bctz2;
        this.c = ajbp;
    }

    /* Access modifiers changed, original: final */
    public final void a(aiob aiob) {
        int i = aiob.a;
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 0:
                case 1:
                case 2:
                case 6:
                case 7:
                    a();
                    return;
                case 3:
                case 4:
                case 5:
                    if (this.j) {
                        this.k++;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        throw null;
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkf ahkf) {
        if (ahkf.e == 5 && this.l && this.d.c()) {
            this.j = true;
            this.i.post(this.e);
            this.l = false;
            return;
        }
        if (ahkf.e == 2) {
            this.l = false;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkn ahkn) {
        if (ahkn.a == airi.PLAYBACK_PENDING && this.k > 0) {
            this.g.f().e_(new ahki());
        } else if (ahkn.a == airi.VIDEO_PLAYING) {
            a();
        }
    }

    public final void a() {
        this.k = 0;
        this.j = false;
    }

    /* Access modifiers changed, original: final */
    public final void a(ahjc ahjc) {
        ahgk ahgk = this.d;
        if (ahgk == null || !((ahgk.a() || this.d.b()) && ahjc.c() && this.k < this.h.l())) {
            a();
            return;
        }
        if (this.d.c()) {
            this.j = true;
            this.i.post(this.e);
        } else if (this.d.d()) {
            this.j = true;
            this.i.post(this.f);
        } else if (this.d.e()) {
            this.l = true;
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjc.class, ahkf.class, ahkn.class, aiob.class};
        } else if (i == 0) {
            a((ahjc) obj);
            return null;
        } else if (i == 1) {
            a((ahkf) obj);
            return null;
        } else if (i == 2) {
            a((ahkn) obj);
            return null;
        } else if (i == 3) {
            a((aiob) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
