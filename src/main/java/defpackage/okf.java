package defpackage;

/* renamed from: okf */
final class okf implements ojx {
    private final oyx a = new oyx(new byte[4]);
    private final /* synthetic */ okc b;

    public okf(okc okc) {
        this.b = okc;
    }

    public final void a(ozo ozo, ofo ofo, okl okl) {
    }

    public final void a(oza oza) {
        if (oza.d() == 0) {
            oza.d(7);
            int b = oza.b() / 4;
            for (int i = 0; i < b; i++) {
                oza.a(this.a, 4);
                int c = this.a.c(16);
                this.a.b(3);
                if (c == 0) {
                    this.a.b(13);
                } else {
                    c = this.a.c(13);
                    okc okc = this.b;
                    okc.h.put(c, new ojw(new oke(okc, c)));
                    okc okc2 = this.b;
                    okc2.l++;
                }
            }
            okc okc3 = this.b;
            if (okc3.e != 2) {
                okc3.h.remove(0);
            }
        }
    }
}
