package defpackage;

import java.util.List;

/* renamed from: agbt */
final /* synthetic */ class agbt implements Runnable {
    private final agbu a;
    private final String b;
    private final List c;
    private final avrp d;
    private final long e;
    private final int f = 1;
    private final avsi g;
    private final agqq h;
    private final int i;
    private final byte[] j;
    private final int k;

    agbt(agbu agbu, String str, List list, avrp avrp, long j, avsi avsi, agqq agqq, int i, byte[] bArr, int i2) {
        this.a = agbu;
        this.b = str;
        this.c = list;
        this.d = avrp;
        this.e = j;
        this.g = avsi;
        this.h = agqq;
        this.i = i;
        this.j = bArr;
        this.k = i2;
    }

    public final void run() {
        agbu agbu = this.a;
        String str = this.b;
        List list = this.c;
        avrp avrp = this.d;
        long j = this.e;
        int i = this.f;
        avsi avsi = this.g;
        agqq agqq = this.h;
        int i2 = this.i;
        byte[] bArr = this.j;
        int i3 = this.k;
        if (agbu.b.v()) {
            agbu.a(str, list, avrp, j, false, false, i, avsi, agqq, i2, bArr, i3);
        }
    }
}
