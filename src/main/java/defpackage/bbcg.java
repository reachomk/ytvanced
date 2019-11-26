package defpackage;

/* renamed from: bbcg */
final class bbcg {
    private final /* synthetic */ bbcd a;

    public final int a() {
        bbcd bbcd = this.a;
        int i = bbcd.f;
        int i2 = bbcd.e;
        if (i - i2 > 0) {
            i = bbcd.d[i2] & 255;
            bbcd.a(bbcd, 1);
        } else {
            i = bbcd.a.b();
        }
        this.a.b.update(i);
        bbcd.b(this.a, 1);
        return i;
    }

    public final void a(int i) {
        int min;
        bbcd bbcd = this.a;
        int i2 = bbcd.f - bbcd.e;
        if (i2 > 0) {
            min = Math.min(i2, i);
            bbcd bbcd2 = this.a;
            bbcd2.b.update(bbcd2.d, bbcd2.e, min);
            bbcd.a(this.a, min);
            min = i - min;
        } else {
            min = i;
        }
        if (min > 0) {
            byte[] bArr = new byte[512];
            int i3 = 0;
            while (i3 < min) {
                int min2 = Math.min(min - i3, 512);
                this.a.a.a(bArr, 0, min2);
                this.a.b.update(bArr, 0, min2);
                i3 += min2;
            }
        }
        bbcd.b(this.a, i);
    }

    public final int b() {
        bbcd bbcd = this.a;
        return (bbcd.f - bbcd.e) + bbcd.a.a;
    }

    public final boolean c() {
        while (b() > 0) {
            if (a() == 0) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return a() | (a() << 8);
    }

    public final long e() {
        return (((long) d()) << 16) | ((long) d());
    }

    /* synthetic */ bbcg(bbcd bbcd) {
        this.a = bbcd;
    }
}
