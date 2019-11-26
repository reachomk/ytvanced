package defpackage;

/* renamed from: oix */
public final class oix implements ojf {
    public long a;
    private final oyx b;
    private final oza c;
    private final String d;
    private String e;
    private ofy f;
    private int g;
    private int h;
    private boolean i;
    private long j;
    private nzw k;
    private int l;

    public oix() {
        this(null);
    }

    public final void b() {
    }

    public oix(String str) {
        this.b = new oyx(new byte[128]);
        this.c = new oza(this.b.a);
        this.g = 0;
        this.d = str;
    }

    public final void a() {
        this.g = 0;
        this.h = 0;
        this.i = false;
    }

    public final void a(ofo ofo, okl okl) {
        okl.a();
        this.e = okl.c();
        this.f = ofo.a(okl.b(), 1);
    }

    public final void a(long j, int i) {
        this.a = j;
    }

    public final void a(oza oza) {
        oza oza2 = oza;
        while (oza.b() > 0) {
            int i = this.g;
            byte[] bArr;
            if (i == 0) {
                while (oza.b() > 0) {
                    if (this.i) {
                        i = oza.d();
                        if (i == 119) {
                            this.i = false;
                            this.g = 1;
                            bArr = this.c.a;
                            bArr[0] = (byte) 11;
                            bArr[1] = (byte) 119;
                            this.h = 2;
                            break;
                        }
                        this.i = i == 11;
                    } else {
                        this.i = oza.d() == 11;
                    }
                }
            } else if (i == 1) {
                bArr = this.c.a;
                int min = Math.min(oza.b(), 128 - this.h);
                oza2.a(bArr, this.h, min);
                i = this.h + min;
                this.h = i;
                if (i == 128) {
                    this.b.a(0);
                    obd a = obe.a(this.b);
                    nzw nzw = this.k;
                    if (!(nzw != null && a.c == nzw.v && a.b == nzw.w && a.a == nzw.i)) {
                        this.k = nzw.a(this.e, a.a, -1, -1, a.c, a.b, null, null, this.d);
                        this.f.a(this.k);
                    }
                    this.l = a.d;
                    this.j = (((long) a.e) * 1000000) / ((long) this.k.w);
                    this.c.c(0);
                    this.f.a(this.c, 128);
                    this.g = 2;
                }
            } else if (i == 2) {
                i = Math.min(oza.b(), this.l - this.h);
                this.f.a(oza2, i);
                int i2 = this.h + i;
                this.h = i2;
                int i3 = this.l;
                if (i2 == i3) {
                    this.f.a(this.a, 1, i3, 0, null);
                    this.a += this.j;
                    this.g = 0;
                }
            }
        }
    }
}
