package defpackage;

/* renamed from: aewf */
public final class aewf extends nuz {
    private final aewe v;
    private byte[] w;
    private int x;
    private int y;

    public aewf(aewe aewe) {
        super((byte) 0);
        this.v = aewe;
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(int i) {
        if (i == 165) {
            return 4;
        }
        if (i != 166) {
            if (i == 238) {
                return 2;
            }
            if (i != 30113) {
                return super.a(i);
            }
        }
        return 1;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, long j, long j2) {
        if (i == 166) {
            if (this.y == 2) {
                this.y = 3;
            }
            this.x = -1;
        } else if (i != 30113) {
            super.a(i, j, j2);
        } else {
            this.y = 2;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, long j) {
        if (i != 238) {
            super.a(i, j);
            return;
        }
        if (this.y == 3) {
            this.x = (int) j;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, int i2, nrb nrb) {
        if (i != 165) {
            super.a(i, i2, nrb);
            return;
        }
        if (this.y == 3 && this.x == 4) {
            this.w = new byte[(i2 + 1)];
            byte[] bArr = this.w;
            bArr[0] = (byte) 0;
            nrb.b(bArr, 1, i2);
            this.v.a(this.w, this.q);
        }
    }
}
