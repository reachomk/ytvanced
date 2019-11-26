package defpackage;

/* renamed from: fmt */
final /* synthetic */ class fmt implements bbnw {
    private final fmq a;

    fmt(fmq fmq) {
        this.a = fmq;
    }

    public final void accept(Object obj) {
        fmq fmq = this.a;
        ayeo ayeo = (ayeo) ((aadz) obj).c();
        if (ayeo != null && (ayeo.b.a & 2) != 0 && !ayeo.getThemeMapMap().isEmpty() && foh.N(fmq.c)) {
            amuu e = amur.e();
            int[] iArr = new int[]{1, 2, 3};
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (i2 != 1) {
                    if (i2 == 0) {
                        throw null;
                    } else if (i2 != 0) {
                        String num = Integer.toString(i2 - 1);
                        String str = (String) ayeo.getThemeMapMap().get(num);
                        if (str != null) {
                            bbme b = fmq.a.b(str);
                            bbmd bbpk = new bbpk();
                            b.b(bbpk);
                            e.b(num, (aadq) bbpk.b());
                        }
                    } else {
                        throw null;
                    }
                }
            }
            fmq.b.put(ayeo.getActiveThemeKey(), e.b());
        }
    }
}
