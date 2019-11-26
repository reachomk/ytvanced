package defpackage;

/* renamed from: ogg */
final class ogg extends oge {
    private final oza b = new oza(oyw.a);
    private final oza c = new oza(4);
    private int d;
    private boolean e;
    private int f;

    public ogg(ofy ofy) {
        super(ofy);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(oza oza) {
        int d = oza.d();
        int i = (d >> 4) & 15;
        d &= 15;
        if (d == 7) {
            this.f = i;
            return i != 5;
        } else {
            StringBuilder stringBuilder = new StringBuilder(39);
            stringBuilder.append("Video format not supported: ");
            stringBuilder.append(d);
            throw new ogh(stringBuilder.toString());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(oza oza, long j) {
        int d = oza.d();
        byte[] bArr = oza.a;
        int i = oza.b;
        int i2 = i + 1;
        oza.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        oza.b = i3;
        byte b2 = bArr[i2];
        oza.b = i3 + 1;
        long j2 = j + (((long) ((bArr[i3] & 255) | ((((b & 255) << 24) >> 8) | ((b2 & 255) << 8)))) * 1000);
        if (d != 0) {
            if (d == 1 && this.e) {
                byte[] bArr2 = this.c.a;
                bArr2[0] = (byte) 0;
                bArr2[1] = (byte) 0;
                bArr2[2] = (byte) 0;
                d = 4 - this.d;
                int i4 = 0;
                while (oza.b() > 0) {
                    oza.a(this.c.a, d, this.d);
                    this.c.c(0);
                    i = this.c.o();
                    this.b.c(0);
                    this.a.a(this.b, 4);
                    this.a.a(oza, i);
                    i4 = (i4 + 4) + i;
                }
                this.a.a(j2, this.f == 1 ? 1 : 0, i4, 0, null);
            }
        } else if (!this.e) {
            oza oza2 = new oza(new byte[oza.b()]);
            oza.a(oza2.a, 0, oza.b());
            ozu a = ozu.a(oza2);
            this.d = a.b;
            this.a.a(nzw.a(null, "video/avc", null, a.c, a.d, a.a, a.e));
            this.e = true;
        }
    }
}
