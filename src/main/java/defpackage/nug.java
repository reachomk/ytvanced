package defpackage;

/* renamed from: nug */
final class nug extends ntv {
    private final nwz a = new nwz(4);
    private final nww c;
    private int d = 0;
    private int e;
    private boolean f;
    private boolean g;
    private long h;
    private int i;
    private long j;

    public nug(nrs nrs) {
        super(nrs);
        this.a.a[0] = (byte) -1;
        this.c = new nww();
    }

    public final void b() {
    }

    public final void a() {
        this.d = 0;
        this.e = 0;
        this.g = false;
    }

    public final void a(long j, boolean z) {
        this.j = j;
    }

    public final void a(nwz nwz) {
        nwz nwz2 = nwz;
        while (nwz.b() > 0) {
            int i = this.d;
            int i2;
            if (i == 0) {
                byte[] bArr = nwz2.a;
                int i3 = nwz2.c;
                for (i2 = nwz2.b; i2 < i3; i2++) {
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    Object obj = (this.g && (b & 224) == 224) ? 1 : null;
                    this.g = z;
                    if (obj != null) {
                        nwz2.c(i2 + 1);
                        this.g = false;
                        this.a.a[1] = bArr[i2];
                        this.e = 2;
                        this.d = 1;
                        break;
                    }
                }
                nwz2.c(i3);
            } else if (i == 1) {
                i = Math.min(nwz.b(), 4 - this.e);
                nwz2.a(this.a.a, this.e, i);
                i2 = this.e + i;
                this.e = i2;
                if (i2 >= 4) {
                    this.a.c(0);
                    if (nww.a(this.a.j(), this.c)) {
                        nww nww = this.c;
                        this.i = nww.c;
                        if (!this.f) {
                            i2 = nww.g;
                            int i4 = nww.d;
                            this.h = (((long) i2) * 1000000) / ((long) i4);
                            this.b.a(nmx.a(null, nww.b, -1, 4096, -1, nww.e, i4, null, null));
                            this.f = true;
                        }
                        this.a.c(0);
                        this.b.a(this.a, 4);
                        this.d = 2;
                    } else {
                        this.e = 0;
                        this.d = 1;
                    }
                }
            } else if (i == 2) {
                i = Math.min(nwz.b(), this.i - this.e);
                this.b.a(nwz2, i);
                int i5 = this.e + i;
                this.e = i5;
                int i6 = this.i;
                if (i5 >= i6) {
                    this.b.a(this.j, 1, i6, 0, null);
                    this.j += this.h;
                    this.e = 0;
                    this.d = 0;
                }
            }
        }
    }
}
