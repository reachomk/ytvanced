package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: anzw */
final class anzw extends anvu {
    public static final int[] c = new int[]{1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public static final long serialVersionUID = 1;
    public final int d;
    public final anvu e;
    public final anvu f;
    public final int g;
    private final int h;

    private anzw(anvu anvu, anvu anvu2) {
        this.e = anvu;
        this.f = anvu2;
        int b = anvu.b();
        this.h = b;
        this.d = b + anvu2.b();
        this.g = Math.max(anvu.i(), anvu2.i()) + 1;
    }

    static anvu a(anvu anvu, anvu anvu2) {
        if (anvu2.b() == 0) {
            return anvu;
        }
        if (anvu.b() == 0) {
            return anvu2;
        }
        int b = anvu.b() + anvu2.b();
        if (b < 128) {
            return anzw.b(anvu, anvu2);
        }
        if (anvu instanceof anzw) {
            anzw anzw = (anzw) anvu;
            if (anzw.f.b() + anvu2.b() < 128) {
                return new anzw(anzw.e, anzw.b(anzw.f, anvu2));
            } else if (anzw.e.i() > anzw.f.i() && anzw.g > anvu2.i()) {
                return new anzw(anzw.e, new anzw(anzw.f, anvu2));
            }
        }
        if (b >= c[Math.max(anvu.i(), anvu2.i()) + 1]) {
            return new anzw(anvu, anvu2);
        }
        anzy anzy = new anzy();
        anzy.a(anvu);
        anzy.a(anvu2);
        anvu = (anvu) anzy.a.pop();
        while (!anzy.a.isEmpty()) {
            anvu = new anzw((anvu) anzy.a.pop(), anvu, (byte) 0);
        }
        return anvu;
    }

    private static anvu b(anvu anvu, anvu anvu2) {
        int b = anvu.b();
        int b2 = anvu2.b();
        byte[] bArr = new byte[(b + b2)];
        anvu.a(bArr, 0, 0, b);
        anvu2.a(bArr, 0, b, b2);
        return anvu.b(bArr);
    }

    public final byte a(int i) {
        anvu.b(i, this.d);
        return b(i);
    }

    /* Access modifiers changed, original: final */
    public final byte b(int i) {
        int i2 = this.h;
        if (i < i2) {
            return this.e.b(i);
        }
        return this.f.b(i - i2);
    }

    public final int b() {
        return this.d;
    }

    public final anvz a() {
        return new anzv(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final int i() {
        return this.g;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean j() {
        return this.d >= c[this.g];
    }

    public final anvu a(int i, int i2) {
        int c = anvu.c(i, i2, this.d);
        if (c == 0) {
            return anvu.a;
        }
        if (c == this.d) {
            return this;
        }
        c = this.h;
        if (i2 <= c) {
            return this.e.a(i, i2);
        }
        if (i >= c) {
            return this.f.a(i - c, i2 - c);
        }
        anvu anvu = this.e;
        return new anzw(anvu.a(i, anvu.b()), this.f.a(0, i2 - this.h));
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.h;
        if (i + i3 <= i4) {
            this.e.b(bArr, i, i2, i3);
        } else if (i < i4) {
            i4 -= i;
            this.e.b(bArr, i, i2, i4);
            this.f.b(bArr, 0, i2 + i4, i3 - i4);
        } else {
            this.f.b(bArr, i - i4, i2, i3);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(anvr anvr) {
        this.e.a(anvr);
        this.f.a(anvr);
    }

    /* Access modifiers changed, original: protected|final */
    public final String a(Charset charset) {
        return new String(d(), charset);
    }

    public final boolean f() {
        int a = this.e.a(0, 0, this.h);
        anvu anvu = this.f;
        if (anvu.a(a, 0, anvu.b()) == 0) {
            return true;
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(int i, int i2, int i3) {
        int i4 = this.h;
        if (i2 + i3 <= i4) {
            return this.e.a(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f.a(i, i2 - i4, i3);
        }
        i4 -= i2;
        return this.f.a(this.e.a(i, i2, i4), 0, i3 - i4);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof anvu) {
            anvu anvu = (anvu) obj;
            if (this.d == anvu.b()) {
                if (this.d != 0) {
                    int i = this.b;
                    int i2 = anvu.b;
                    if (i == 0 || i2 == 0 || i == i2) {
                        anzx anzx = new anzx(this);
                        anvu anvu2 = (anwb) anzx.next();
                        anzx anzx2 = new anzx(anvu);
                        anvu anvu3 = (anwb) anzx2.next();
                        int i3 = 0;
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            boolean a;
                            int b = anvu2.b() - i3;
                            int b2 = anvu3.b() - i4;
                            int min = Math.min(b, b2);
                            if (i3 == 0) {
                                a = anvu2.a(anvu3, i4, min);
                            } else {
                                a = anvu3.a(anvu2, i3, min);
                            }
                            if (!a) {
                                z = false;
                                break;
                            }
                            i5 += min;
                            int i6 = this.d;
                            if (i5 < i6) {
                                if (min == b) {
                                    anvu2 = (anwb) anzx.next();
                                    i3 = 0;
                                } else {
                                    i3 += min;
                                }
                                if (min == b2) {
                                    anvu3 = (anwb) anzx2.next();
                                    i4 = 0;
                                } else {
                                    i4 += min;
                                }
                            } else if (i5 != i6) {
                                throw new IllegalStateException();
                            }
                        }
                    } else {
                        return false;
                    }
                }
                return z;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final int b(int i, int i2, int i3) {
        int i4 = this.h;
        if (i2 + i3 <= i4) {
            return this.e.b(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f.b(i, i2 - i4, i3);
        }
        i4 -= i2;
        return this.f.b(this.e.b(i, i2, i4), 0, i3 - i4);
    }

    public final anwf g() {
        return anwf.a(new aoaa(this));
    }

    /* Access modifiers changed, original: final */
    public final Object writeReplace() {
        return anvu.b(d());
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    /* synthetic */ anzw(anvu anvu, anvu anvu2, byte b) {
        this(anvu, anvu2);
    }
}
