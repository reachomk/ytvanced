package defpackage;

/* renamed from: aiev */
public final class aiev implements aies, ajan, xcp {
    private static final aywt[] a = new aywt[0];
    private final aizy b;
    private final aiet c;
    private aakj d;

    public aiev(aizy aizy, aiet aiet) {
        this.b = (aizy) amqw.a((Object) aizy);
        this.c = (aiet) amqw.a((Object) aiet);
        ((hxd) aiet).c.a((aies) this);
    }

    public final long e() {
        return 131072;
    }

    public final void a(float f) {
        this.b.b(f);
        a(ahjd.a(this.d));
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 131072)).a(ajcg.a(ajam.O(), 131072, 1)).a(new aieu(this), aiex.a), ajam.a(aiew.a, aiez.a).a(ajcg.b(ajam.O(), 131072)).a(ajcg.a(ajam.O(), 131072, 1)).a(new aiey(this), aifb.a)};
    }

    public final void a(ahjd ahjd) {
        a(ahjd.a);
    }

    public final void a(ahkn ahkn) {
        airi airi = ahkn.a;
        this.d = ahkn.b;
        if (airi.a()) {
            a();
        }
        if (airi == airi.VIDEO_PLAYING) {
            a(ahjd.a(ahkn.b));
            aiet aiet = this.c;
            awdg awdg = ahkn.b.n().c;
            boolean z = false;
            if ((awdg.b & 1) != 0) {
                aywv aywv = awdg.t;
                if (aywv == null) {
                    aywv = aywv.f;
                }
                if (aywv.d) {
                    z = true;
                }
            }
            aiet.b(z);
        }
    }

    private final void a(aywt[] aywtArr) {
        aizy aizy = this.b;
        int i = 0;
        boolean z = (aizy.D() == null || (aizy.D().r().a & 2) == 0) ? false : true;
        this.c.a(z);
        if (z) {
            while (i < aywtArr.length) {
                float f = aywtArr[i].c;
                aizy aizy2 = this.b;
                if (Float.compare(f, aizy2.D() != null ? aizy2.D().C() : 1.0f) == 0) {
                    break;
                }
                i++;
            }
            i = -1;
            this.c.a(aywtArr, i);
            return;
        }
        a();
    }

    private final void a() {
        this.c.a(false);
        this.c.a(a, -1);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjd.class, ahkn.class};
        } else if (i == 0) {
            a((ahjd) obj);
            return null;
        } else if (i == 1) {
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
