package defpackage;

import java.util.Arrays;

/* renamed from: nvp */
public final class nvp implements nvi {
    private final int a;
    private int b;
    private int c;
    private nvf[] d;

    public nvp(int i) {
        nwf.a(i > 0);
        nwf.a(true);
        this.a = i;
        this.c = 0;
        this.d = new nvf[100];
    }

    public final synchronized nvf a() {
        nvf nvf;
        this.b++;
        int i = this.c;
        if (i > 0) {
            nvf[] nvfArr = this.d;
            i--;
            this.c = i;
            nvf = nvfArr[i];
            nvfArr[i] = null;
        } else {
            nvf = new nvf(new byte[this.a]);
        }
        return nvf;
    }

    public final synchronized void a(nvf nvf) {
        byte[] bArr = nvf.a;
        boolean z = true;
        if (bArr != null) {
            if (bArr.length != this.a) {
                z = false;
            }
        }
        nwf.a(z);
        this.b--;
        int i = this.c;
        nvf[] nvfArr = this.d;
        int length = nvfArr.length;
        if (i == length) {
            this.d = (nvf[]) Arrays.copyOf(nvfArr, length + length);
        }
        nvf[] nvfArr2 = this.d;
        int i2 = this.c;
        this.c = i2 + 1;
        nvfArr2[i2] = nvf;
        notifyAll();
    }

    public final synchronized void a(nvf[] nvfArr) {
        int i = this.c;
        i += r1;
        nvf[] nvfArr2 = this.d;
        int length = nvfArr2.length;
        if (i >= length) {
            this.d = (nvf[]) Arrays.copyOf(nvfArr2, Math.max(length + length, i));
        }
        for (nvf nvf : nvfArr) {
            byte[] bArr = nvf.a;
            boolean z = true;
            if (bArr != null) {
                if (bArr.length != this.a) {
                    z = false;
                }
            }
            nwf.a(z);
            nvf[] nvfArr3 = this.d;
            int i2 = this.c;
            this.c = i2 + 1;
            nvfArr3[i2] = nvf;
        }
        this.b -= nvfArr.length;
        notifyAll();
    }

    public final synchronized void a(int i) {
        i = Math.max(0, nxf.a(i, this.a) - this.b);
        int i2 = this.c;
        if (i < i2) {
            Arrays.fill(this.d, i, i2, null);
            this.c = i;
        }
    }

    public final synchronized int b() {
        return this.b * this.a;
    }

    public final synchronized void b(int i) {
        while (b() > i) {
            wait();
        }
    }

    public final int c() {
        return this.a;
    }
}
