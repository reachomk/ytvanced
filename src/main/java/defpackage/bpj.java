package defpackage;

import java.util.ArrayDeque;

/* renamed from: bpj */
public final class bpj {
    private final bpm a;

    public bpj(bpm bpm) {
        bpr bpr = new bpr();
        this.a = bpm;
    }

    public final void a(Object obj) {
        bpn bpn;
        long j;
        bpn bpn2;
        bpl bpl;
        bpn bpn3;
        Object obj2 = obj;
        ArrayDeque arrayDeque = new ArrayDeque();
        bpn bpn4 = new bpn();
        bpn4.a = obj2;
        bpn4.b = 0;
        bpn4.i = 0;
        this.a.a(obj2, bpn4);
        ArrayDeque arrayDeque2 = new ArrayDeque();
        arrayDeque2.push(new bpo(bpn4));
        for (Object bpo : this.a.b(obj2)) {
            arrayDeque2.push(new bpo(bpn4, bpo));
        }
        long j2 = 1;
        long j3 = 1;
        while (!arrayDeque2.isEmpty()) {
            bpo bpo2 = (bpo) arrayDeque2.pop();
            Object obj3 = bpo2.b;
            if (obj3 == null) {
                bpo2.a.c = -1 + j3;
            } else {
                bpn = (bpn) this.a.a(obj3);
                if (bpn == null) {
                    bpn = new bpn();
                    this.a.a(bpo2.b, bpn);
                    bpn.a = bpo2.b;
                    j = j3 + j2;
                    bpn.b = j3;
                    bpn.d.a(bpo2.a.b);
                    bpn.e = bpo2.a;
                    bpn.e.g.a(bpn);
                    bpn2 = bpo2.a;
                    bpn.f = bpn2;
                    bpn.i = bpn2.i + j2;
                    arrayDeque2.push(new bpo(bpn));
                    for (Object bpo3 : this.a.b(bpo2.b)) {
                        arrayDeque2.push(new bpo(bpn, bpo3));
                    }
                    j3 = j;
                } else {
                    long j4;
                    bpl = bpn.d;
                    long j5 = bpl.b[bpl.a - 1];
                    bpl.a(bpo2.a.b);
                    bpn3 = bpo2.a;
                    while (true) {
                        j4 = bpn3.b;
                        if (j4 <= j5) {
                            break;
                        }
                        bpn3 = bpn3.e;
                    }
                    bpn3 = bpn.e;
                    if (bpn3.b > j4) {
                        bpn bpn5 = bpn.f;
                        if (bpn3 == bpn5) {
                            if (bpn5.h == null) {
                                bpn5.h = new bpq();
                                arrayDeque.add(bpn.f);
                            }
                            bpn.f.h.a(bpn);
                        }
                        bpq bpq = bpn.e.g;
                        for (int i = 0; i < bpq.a; i++) {
                            if (bpq.b[i] == bpn) {
                                bpq.a(i);
                                break;
                            }
                        }
                        while (true) {
                            bpn.e = bpn.e.e;
                            bpn3 = bpn.e;
                            if (bpn3.b <= j4) {
                                break;
                            }
                        }
                        bpn3.g.a(bpn);
                        j2 = 1;
                    }
                }
            }
            j2 = 1;
        }
        while (!arrayDeque.isEmpty()) {
            bpn bpn6;
            int i2;
            bpn3 = (bpn) arrayDeque.poll();
            bpq bpq2 = bpn3.h;
            bpn3.h = null;
            int i3 = 0;
            while (true) {
                bpq bpq3 = bpn3.g;
                if (i3 >= bpq3.a) {
                    break;
                }
                bpn6 = bpq3.b[i3];
                int i4 = 0;
                while (i4 < bpq2.a) {
                    bpn bpn7 = bpq2.b[i4];
                    j = bpn6.b;
                    long j6 = bpn7.b;
                    if (j < j6) {
                        bpl = bpn6.d;
                        long j7 = bpn7.c;
                        int i5 = 0;
                        while (i5 < bpl.a) {
                            long j8 = bpl.b[i5];
                            if (j6 > j8 || j8 > j7) {
                                i5++;
                            }
                        }
                        continue;
                        i4++;
                    } else if (j > bpn7.c) {
                        i4++;
                    }
                    bpn = bpn6.e;
                    bpn2 = bpn6.f;
                    if (bpn == bpn2) {
                        if (bpn2.h == null) {
                            bpn2.h = new bpq();
                            arrayDeque.add(bpn6.f);
                        }
                        bpn6.f.h.a(bpn6);
                    }
                    i2 = i3 - 1;
                    bpn3.g.a(i3);
                    bpn6.e = bpn7.e;
                    bpn6.e.g.a(bpn6);
                    i3 = i2 + 1;
                }
                i2 = i3;
                i3 = i2 + 1;
            }
            for (i2 = 0; i2 < bpq2.a; i2++) {
                bpn bpn8 = bpq2.b[i2];
                bpn8.f = bpn3.f;
                bpn6 = bpn8.f;
                if (bpn6 != bpn8.e) {
                    if (bpn6.h == null) {
                        bpn6.h = new bpq();
                        arrayDeque.add(bpn8.f);
                    }
                    bpn8.f.h.a(bpn8);
                }
            }
        }
        arrayDeque.add(bpn4);
        while (!arrayDeque.isEmpty()) {
            bpn3 = (bpn) arrayDeque.poll();
            this.a.a(bpn3.a, null);
            int i6 = 0;
            while (true) {
                bpq bpq4 = bpn3.g;
                if (i6 < bpq4.a) {
                    bpn = bpq4.b[i6];
                    this.a.b(bpn.a, bpn3.a);
                    arrayDeque.add(bpn);
                    i6++;
                }
            }
        }
    }
}
