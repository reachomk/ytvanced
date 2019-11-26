package defpackage;

/* renamed from: ojp */
public final class ojp implements ojf {
    private final oza a;
    private final ofs b;
    private final String c;
    private String d;
    private ofy e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    public ojp() {
        this(null);
    }

    public final void b() {
    }

    public ojp(String str) {
        this.f = 0;
        this.a = new oza(4);
        this.a.a[0] = (byte) -1;
        this.b = new ofs();
        this.c = str;
    }

    public final void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
    }

    public final void a(ofo ofo, okl okl) {
        okl.a();
        this.d = okl.c();
        this.e = ofo.a(okl.b(), 1);
    }

    public final void a(long j, int i) {
        this.l = j;
    }

    public final void a(oza oza) {
        oza oza2 = oza;
        while (oza.b() > 0) {
            int i = this.f;
            int i2;
            if (i == 0) {
                byte[] bArr = oza2.a;
                int i3 = oza2.c;
                for (i2 = oza2.b; i2 < i3; i2++) {
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    Object obj = (this.i && (b & 224) == 224) ? 1 : null;
                    this.i = z;
                    if (obj != null) {
                        oza2.c(i2 + 1);
                        this.i = false;
                        this.a.a[1] = bArr[i2];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                }
                oza2.c(i3);
            } else if (i == 1) {
                i = Math.min(oza.b(), 4 - this.g);
                oza2.a(this.a.a, this.g, i);
                i2 = this.g + i;
                this.g = i2;
                if (i2 >= 4) {
                    this.a.c(0);
                    if (ofs.a(this.a.k(), this.b)) {
                        ofs ofs = this.b;
                        this.k = ofs.c;
                        if (!this.h) {
                            i2 = ofs.g;
                            int i4 = ofs.d;
                            this.j = (((long) i2) * 1000000) / ((long) i4);
                            this.e.a(nzw.a(this.d, ofs.b, -1, 4096, ofs.e, i4, null, null, this.c));
                            this.h = true;
                        }
                        this.a.c(0);
                        this.e.a(this.a, 4);
                        this.f = 2;
                    } else {
                        this.g = 0;
                        this.f = 1;
                    }
                }
            } else if (i == 2) {
                i = Math.min(oza.b(), this.k - this.g);
                this.e.a(oza2, i);
                int i5 = this.g + i;
                this.g = i5;
                int i6 = this.k;
                if (i5 >= i6) {
                    this.e.a(this.l, 1, i6, 0, null);
                    this.l += this.j;
                    this.g = 0;
                    this.f = 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }
}
