package defpackage;

/* renamed from: nio */
public final class nio implements ajan, xcp {
    private final /* synthetic */ nim a;

    public nio(nim nim) {
        this.a = nim;
    }

    public final long e() {
        return 1;
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(new nin(this), niq.a)};
    }

    public final void a(ahkn ahkn) {
        if (ahkn.a == airi.PLAYBACK_LOADED) {
            aakj aakj = ahkn.b;
            if (aakj != null) {
                ateb ateb = aakj.a.x;
                if (ateb != null) {
                    awdk awdk = ateb.b;
                    if (awdk == null) {
                        awdk = awdk.h;
                    }
                    if ((awdk.a & 32) != 0) {
                        muz muz = this.a.a;
                        awdk awdk2 = ateb.b;
                        if (awdk2 == null) {
                            awdk2 = awdk.h;
                        }
                        muz.f(awdk2.g);
                        return;
                    }
                }
                this.a.a.f(false);
                return;
            }
        }
        if (ahkn.a == airi.VIDEO_PLAYING) {
            this.a.a.f(false);
        }
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
