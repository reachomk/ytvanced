package defpackage;

/* renamed from: anwl */
abstract class anwl extends anwm {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;

    anwl(int i) {
        super();
        if (i >= 0) {
            this.a = new byte[Math.max(i, 20)];
            this.b = this.a.length;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    public final int a() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    /* Access modifiers changed, original: final */
    public final void a(byte b) {
        byte[] bArr = this.a;
        int i = this.c;
        this.c = i + 1;
        bArr[i] = b;
        this.d++;
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, int i2) {
        a(aobj.a(i, i2));
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        if (anwm.e) {
            byte[] bArr;
            int i2;
            long j = (long) this.c;
            while ((i & -128) != 0) {
                bArr = this.a;
                i2 = this.c;
                this.c = i2 + 1;
                aoax.a(bArr, (long) i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            bArr = this.a;
            i2 = this.c;
            this.c = i2 + 1;
            aoax.a(bArr, (long) i2, (byte) i);
            this.d += (int) (((long) this.c) - j);
            return;
        }
        byte[] bArr2;
        int i3;
        while ((i & -128) != 0) {
            bArr2 = this.a;
            i3 = this.c;
            this.c = i3 + 1;
            bArr2[i3] = (byte) ((i & 127) | 128);
            this.d++;
            i >>>= 7;
        }
        bArr2 = this.a;
        i3 = this.c;
        this.c = i3 + 1;
        bArr2[i3] = (byte) i;
        this.d++;
    }

    /* Access modifiers changed, original: final */
    public final void a(long j) {
        byte[] bArr;
        int i;
        if (anwm.e) {
            long j2 = (long) this.c;
            while ((j & -128) != 0) {
                bArr = this.a;
                int i2 = this.c;
                this.c = i2 + 1;
                aoax.a(bArr, (long) i2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            bArr = this.a;
            i = this.c;
            this.c = i + 1;
            aoax.a(bArr, (long) i, (byte) ((int) j));
            this.d += (int) (((long) this.c) - j2);
            return;
        }
        while ((j & -128) != 0) {
            bArr = this.a;
            int i3 = this.c;
            this.c = i3 + 1;
            bArr[i3] = (byte) ((((int) j) & 127) | 128);
            this.d++;
            j >>>= 7;
        }
        bArr = this.a;
        i = this.c;
        this.c = i + 1;
        bArr[i] = (byte) ((int) j);
        this.d++;
    }

    /* Access modifiers changed, original: final */
    public final void b(int i) {
        byte[] bArr = this.a;
        int i2 = this.c;
        int i3 = i2 + 1;
        this.c = i3;
        bArr[i2] = (byte) i;
        i2 = i3 + 1;
        this.c = i2;
        bArr[i3] = (byte) (i >> 8);
        i3 = i2 + 1;
        this.c = i3;
        bArr[i2] = (byte) (i >> 16);
        this.c = i3 + 1;
        bArr[i3] = (byte) (i >> 24);
        this.d += 4;
    }

    /* Access modifiers changed, original: final */
    public final void b(long j) {
        byte[] bArr = this.a;
        int i = this.c;
        int i2 = i + 1;
        this.c = i2;
        bArr[i] = (byte) ((int) (j & 255));
        i = i2 + 1;
        this.c = i;
        bArr[i2] = (byte) ((int) ((j >> 8) & 255));
        i2 = i + 1;
        this.c = i2;
        bArr[i] = (byte) ((int) ((j >> 16) & 255));
        i = i2 + 1;
        this.c = i;
        bArr[i2] = (byte) ((int) (255 & (j >> 24)));
        i2 = i + 1;
        this.c = i2;
        bArr[i] = (byte) ((int) (j >> 32));
        i = i2 + 1;
        this.c = i;
        bArr[i2] = (byte) ((int) (j >> 40));
        i2 = i + 1;
        this.c = i2;
        bArr[i] = (byte) ((int) (j >> 48));
        this.c = i2 + 1;
        bArr[i2] = (byte) ((int) (j >> 56));
        this.d += 8;
    }
}
