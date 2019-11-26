package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: oke */
final class oke implements ojx {
    private final oyx a = new oyx(new byte[5]);
    private final SparseArray b = new SparseArray();
    private final SparseIntArray c = new SparseIntArray();
    private final int d;
    private final /* synthetic */ okc e;

    public oke(okc okc, int i) {
        this.e = okc;
        this.d = i;
    }

    public final void a(ozo ozo, ofo ofo, okl okl) {
    }

    public final void a(oza oza) {
        oza oza2 = oza;
        if (oza.d() == 2) {
            ozo ozo;
            int c;
            int i;
            int d;
            okc okc = this.e;
            int i2 = okc.e;
            if (i2 == 1 || i2 == 2 || okc.l == 1) {
                ozo = (ozo) okc.f.get(0);
            } else {
                ozo = new ozo(((ozo) okc.f.get(0)).a);
                this.e.f.add(ozo);
            }
            oza2.d(2);
            int e = oza.e();
            int i3 = 3;
            oza2.d(3);
            oza2.a(this.a, 2);
            this.a.b(3);
            int i4 = 13;
            this.e.o = this.a.c(13);
            oza2.a(this.a, 2);
            this.a.b(4);
            int i5 = 12;
            oza2.d(this.a.c(12));
            okc okc2 = this.e;
            if (okc2.e == 2 && okc2.n == null) {
                okj okj = new okj(21, null, null, ozp.f);
                okc okc3 = this.e;
                okc3.n = okc3.g.a(21, okj);
                okc2 = this.e;
                okc2.n.a(ozo, okc2.k, new okl(e, 21, 8192));
            }
            this.b.clear();
            this.c.clear();
            int b = oza.b();
            while (b > 0) {
                int i6 = 5;
                oza2.a(this.a, 5);
                c = this.a.c(8);
                this.a.b(i3);
                int c2 = this.a.c(i4);
                this.a.b(4);
                i4 = this.a.c(i5);
                i5 = oza2.b;
                int i7 = i5 + i4;
                i = -1;
                String str = null;
                ArrayList arrayList = null;
                while (oza2.b < i7) {
                    int d2 = oza.d();
                    d = oza2.b + oza.d();
                    int i8 = 172;
                    if (d2 == i6) {
                        long i9 = oza.i();
                        if (i9 != okc.a) {
                            if (i9 != okc.b) {
                                if (i9 == okc.c) {
                                    i = 172;
                                } else if (i9 == okc.d) {
                                    i = 36;
                                }
                                oza2.d(d - oza2.b);
                                i6 = 5;
                            }
                        }
                        i = 129;
                        oza2.d(d - oza2.b);
                        i6 = 5;
                    } else {
                        if (d2 != 106) {
                            if (d2 != afy.av) {
                                if (d2 == 127) {
                                    if (oza.d() != 21) {
                                        i8 = i;
                                    }
                                    i = i8;
                                } else if (d2 == 123) {
                                    i = 138;
                                } else if (d2 == 10) {
                                    str = oza2.e(i3).trim();
                                } else if (d2 == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (oza2.b < d) {
                                        String trim = oza2.e(i3).trim();
                                        oza.d();
                                        byte[] bArr = new byte[4];
                                        oza2.a(bArr, 0, 4);
                                        arrayList2.add(new okg(trim, bArr));
                                        i3 = 3;
                                    }
                                    i = 89;
                                    arrayList = arrayList2;
                                }
                                oza2.d(d - oza2.b);
                                i6 = 5;
                            }
                        }
                        i = 129;
                        oza2.d(d - oza2.b);
                        i6 = 5;
                    }
                    i = 135;
                    oza2.d(d - oza2.b);
                    i6 = 5;
                }
                oza2.c(i7);
                okj okj2 = new okj(i, str, arrayList, Arrays.copyOfRange(oza2.a, i5, i7));
                if (c == 6) {
                    c = okj2.a;
                }
                b -= i4 + 5;
                okc okc4 = this.e;
                i4 = okc4.e == 2 ? c : c2;
                if (!okc4.i.get(i4)) {
                    Object obj;
                    okc4 = this.e;
                    if (okc4.e == 2) {
                        if (c == 21) {
                            obj = okc4.n;
                            if (this.e.e == 2 || c2 < this.c.get(i4, 8192)) {
                                this.c.put(i4, c2);
                                this.b.put(i4, obj);
                            }
                        }
                    }
                    obj = okc4.g.a(c, okj2);
                    if (this.e.e == 2) {
                    }
                    this.c.put(i4, c2);
                    this.b.put(i4, obj);
                }
                i4 = 13;
                i5 = 12;
            }
            int size = this.c.size();
            for (i = 0; i < size; i++) {
                d = this.c.keyAt(i);
                c = this.c.valueAt(i);
                this.e.i.put(d, true);
                this.e.j.put(c, true);
                okh okh = (okh) this.b.valueAt(i);
                if (okh != null) {
                    okc2 = this.e;
                    if (okh != okc2.n) {
                        okh.a(ozo, okc2.k, new okl(e, d, 8192));
                    }
                    this.e.h.put(c, okh);
                }
            }
            okc okc5 = this.e;
            if (okc5.e != 2) {
                okc5.h.remove(this.d);
                okc5 = this.e;
                d = okc5.e != 1 ? okc5.l - 1 : 0;
                okc5.l = d;
                if (d == 0) {
                    okc5.k.a();
                    this.e.m = true;
                }
            } else if (!okc5.m) {
                okc5.k.a();
                okc5 = this.e;
                okc5.l = 0;
                okc5.m = true;
            }
        }
    }
}
