package defpackage;

import java.util.Arrays;

/* renamed from: bpq */
final class bpq {
    public int a;
    public bpn[] b;

    private bpq() {
        this.a = 0;
        this.b = new bpn[4];
    }

    public final void a(bpn bpn) {
        int i = this.a;
        bpn[] bpnArr = this.b;
        if (i == bpnArr.length) {
            this.b = (bpn[]) Arrays.copyOf(bpnArr, i + i);
        }
        bpn[] bpnArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        bpnArr2[i2] = bpn;
    }

    public final void a(int i) {
        bpn[] bpnArr = this.b;
        int i2 = this.a - 1;
        this.a = i2;
        bpnArr[i] = bpnArr[i2];
        bpnArr[i2] = null;
    }

    /* synthetic */ bpq(byte b) {
        this.a = 0;
        this.b = new bpn[4];
    }
}
