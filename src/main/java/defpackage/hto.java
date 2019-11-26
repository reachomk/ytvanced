package defpackage;

/* renamed from: hto */
public final class hto implements ajan, ejc, xcp {
    public final aizy a;
    public final eif b;
    public final xci c;
    public final zyw d;
    public final ajam e;
    public final bdfu f = new bdfu();
    private final zzl g;
    private Runnable h;
    private boolean i;

    public hto(aizy aizy, eif eif, xci xci, zzl zzl, zyw zyw, ajam ajam) {
        this.a = aizy;
        this.b = eif;
        this.c = xci;
        this.g = zzl;
        this.d = zyw;
        this.e = ajam;
    }

    public final long e() {
        return 1;
    }

    public final void a(ejd ejd, ejd ejd2) {
        if (foh.c(this.g)) {
            if (ejd.h() && !ejd2.h()) {
                this.h = new htn(this);
            } else if (!ejd.h() && ejd2.h()) {
                this.h = new htq(this);
            }
            Runnable runnable = this.h;
            if (runnable != null && this.i) {
                runnable.run();
                this.h = null;
            }
        }
    }

    public final void a(ahkn ahkn) {
        airi airi = ahkn.a;
        if (airi == airi.PLAYBACK_LOADED) {
            this.i = true;
            Runnable runnable = this.h;
            if (runnable != null) {
                runnable.run();
                this.h = null;
            }
        } else if (airi == airi.NEW) {
            this.i = false;
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.f().a(emg.a(this.d, 32, 1)).a(new htp(this), hts.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
