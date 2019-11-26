package defpackage;

import java.io.EOFException;

/* renamed from: oih */
final class oih {
    private static final int g = ozp.f("OggS");
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    private final oza h = new oza(255);

    oih() {
    }

    public final void a() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public final boolean a(ofp ofp, boolean z) {
        ofp ofp2 = ofp;
        this.h.a();
        a();
        long j = ((ofl) ofp2).b;
        if ((j != -1 && j - ofp.b() < 27) || !ofp2.b(this.h.a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.h.i() == ((long) g)) {
            if (this.h.d() == 0) {
                this.a = this.h.d();
                oza oza = this.h;
                byte[] bArr = oza.a;
                int i = oza.b;
                int i2 = i + 1;
                oza.b = i2;
                byte b = bArr[i];
                int i3 = i2 + 1;
                oza.b = i3;
                byte b2 = bArr[i2];
                int i4 = i3 + 1;
                oza.b = i4;
                byte b3 = bArr[i3];
                int i5 = i4 + 1;
                oza.b = i5;
                byte b4 = bArr[i4];
                int i6 = i5 + 1;
                oza.b = i6;
                byte b5 = bArr[i5];
                int i7 = i6 + 1;
                oza.b = i7;
                byte b6 = bArr[i6];
                int i8 = i7 + 1;
                oza.b = i8;
                byte b7 = bArr[i7];
                oza.b = i8 + 1;
                this.b = (((((((((long) b) & 255) | ((((long) b2) & 255) << 8)) | ((((long) b3) & 255) << 16)) | ((((long) b4) & 255) << 24)) | ((((long) b5) & 255) << 32)) | ((((long) b6) & 255) << 40)) | ((((long) b7) & 255) << 48)) | ((((long) bArr[i8]) & 255) << 56);
                oza.j();
                this.h.j();
                this.h.j();
                int d = this.h.d();
                this.c = d;
                this.d = d + 27;
                this.h.a();
                ofp2.c(this.h.a, 0, this.c);
                for (int i9 = 0; i9 < this.c; i9++) {
                    this.f[i9] = this.h.d();
                    this.e += this.f[i9];
                }
                return true;
            } else if (z) {
                return false;
            } else {
                throw new oae("unsupported bit stream revision");
            }
        } else if (z) {
            return false;
        } else {
            throw new oae("expected OggS capture pattern at begin of page");
        }
    }
}
