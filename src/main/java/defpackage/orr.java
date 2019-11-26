package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: orr */
public final class orr extends osa {
    public static final int[] a = new int[]{-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] d = new int[]{11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] e = new int[]{0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] f = new int[]{32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, afy.av, 231, 247, 209, 241, 9632};
    private static final int[] g = new int[]{174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] h = new int[]{193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] i = new int[]{195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] j = new boolean[]{false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final oza k = new oza();
    private final int l;
    private final int m;
    private final int n;
    private final ArrayList o = new ArrayList();
    private oru p = new oru(0, 4);
    private List q;
    private List r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private byte w;
    private byte x;
    private int y = 0;
    private boolean z;

    public orr(String str, int i) {
        this.l = !"application/x-mp4-cea-608".equals(str) ? 3 : 2;
        if (i == 1) {
            this.n = 0;
            this.m = 0;
        } else if (i == 2) {
            this.n = 1;
            this.m = 0;
        } else if (i == 3) {
            this.n = 0;
            this.m = 1;
        } else if (i != 4) {
            oyp.a("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.n = 0;
            this.m = 0;
        } else {
            this.n = 1;
            this.m = 1;
        }
        a(0);
        k();
        this.z = true;
    }

    private static int b(byte b) {
        return (b >> 3) & 1;
    }

    public final String a() {
        throw null;
    }

    public final void e() {
    }

    public final void d() {
        super.d();
        this.q = null;
        this.r = null;
        a(0);
        b(4);
        k();
        this.u = false;
        this.v = false;
        this.w = (byte) 0;
        this.x = (byte) 0;
        this.y = 0;
        this.z = true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean f() {
        return this.q != this.r;
    }

    /* Access modifiers changed, original: protected|final */
    public final ork g() {
        List list = this.q;
        this.r = list;
        return new osb(list);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(orn orn) {
        orn orn2 = orn;
        this.k.a(orn2.b.array(), orn2.b.limit());
        Object obj = null;
        while (true) {
            int b = this.k.b();
            int i = this.l;
            if (b >= i) {
                i = i != 2 ? (byte) this.k.d() : -4;
                int d = this.k.d();
                int d2 = this.k.d();
                if ((i & 2) == 0 && (i & 1) == this.m) {
                    byte b2 = d & 127;
                    byte b3 = d2 & 127;
                    if (b2 != (byte) 0 || b3 != (byte) 0) {
                        boolean z = this.v;
                        this.v = false;
                        boolean z2 = this.u;
                        boolean z3 = (i & 4) == 4;
                        this.u = z3;
                        if (z3) {
                            boolean[] zArr = j;
                            if (zArr[d] && zArr[d2]) {
                                if (b2 > (byte) 0 && b2 <= (byte) 15) {
                                    this.z = false;
                                } else if ((b2 & 247) == 20) {
                                    if (!(b3 == (byte) 32 || b3 == (byte) 47)) {
                                        switch (b3) {
                                            case (byte) 37:
                                            case (byte) 38:
                                            case (byte) 39:
                                                break;
                                            default:
                                                switch (b3) {
                                                    case (byte) 41:
                                                        break;
                                                    case (byte) 42:
                                                    case (byte) 43:
                                                        this.z = false;
                                                        break;
                                                }
                                                break;
                                        }
                                    }
                                    this.z = true;
                                }
                                if (this.z) {
                                    d = b2 & 247;
                                    byte b4 = (byte) b2;
                                    if (d != 17 || (b3 & 240) != 48) {
                                        int i2 = b2 & 246;
                                        if (i2 != 18 || (b3 & 224) != 32) {
                                            byte b5 = (byte) b3;
                                            if ((b2 & 224) == 0) {
                                                b = orr.b(b4);
                                                this.y = b;
                                                int i3 = b2 & 240;
                                                if (i3 == 16) {
                                                    if (!(z && this.w == b2 && this.x == b3)) {
                                                        this.v = true;
                                                        this.w = b4;
                                                        this.x = b5;
                                                    }
                                                }
                                                if (b == this.n) {
                                                    int i4;
                                                    if (d == 17 && (b3 & 240) == 32) {
                                                        this.p.a(' ');
                                                        this.p.a((b3 >> 1) & 7, (b3 & 1) != 0);
                                                    } else if (i3 == 16 && (b3 & 192) == 64) {
                                                        i4 = d[b2 & 7];
                                                        if ((b3 & 32) != 0) {
                                                            i4++;
                                                        }
                                                        oru oru = this.p;
                                                        if (i4 != oru.d) {
                                                            if (!(this.s == 1 || oru.a())) {
                                                                this.p = new oru(this.s, this.t);
                                                                this.o.add(this.p);
                                                            }
                                                            oru = this.p;
                                                            oru.d = i4;
                                                        }
                                                        i4 = b3 & 16;
                                                        d = (b3 >> 1) & 7;
                                                        oru.a(i4 != 16 ? d : 8, (b3 & 1) != 0);
                                                        if (i4 == 16) {
                                                            this.p.e = e[d];
                                                        }
                                                    } else if (d == 23 && b3 >= (byte) 33 && b3 <= (byte) 35) {
                                                        this.p.f = b3 - 32;
                                                    } else if (i2 == 20 && (b3 & 240) == 32) {
                                                        if (b3 == (byte) 32) {
                                                            a(2);
                                                        } else if (b3 != (byte) 41) {
                                                            switch (b3) {
                                                                case (byte) 37:
                                                                    a(1);
                                                                    b(2);
                                                                    break;
                                                                case (byte) 38:
                                                                    a(1);
                                                                    b(3);
                                                                    break;
                                                                case (byte) 39:
                                                                    a(1);
                                                                    b(4);
                                                                    break;
                                                                default:
                                                                    i4 = this.s;
                                                                    if (i4 != 0) {
                                                                        if (b3 == (byte) 33) {
                                                                            this.p.b();
                                                                            break;
                                                                        }
                                                                        switch (b3) {
                                                                            case (byte) 44:
                                                                                this.q = Collections.emptyList();
                                                                                i4 = this.s;
                                                                                if (i4 == 1 || i4 == 3) {
                                                                                    k();
                                                                                    break;
                                                                                }
                                                                            case (byte) 45:
                                                                                if (i4 == 1 && !this.p.a()) {
                                                                                    oru oru2 = this.p;
                                                                                    oru2.b.add(oru2.c());
                                                                                    oru2.c.setLength(0);
                                                                                    oru2.a.clear();
                                                                                    b = Math.min(oru2.h, oru2.d);
                                                                                    while (oru2.b.size() >= b) {
                                                                                        oru2.b.remove(0);
                                                                                    }
                                                                                    break;
                                                                                }
                                                                            case (byte) 46:
                                                                                k();
                                                                                break;
                                                                            case (byte) 47:
                                                                                this.q = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                }
                                            } else if (this.y == this.n) {
                                                this.p.a(orr.a(b4));
                                                if ((b3 & 224) != 0) {
                                                    this.p.a(orr.a(b5));
                                                }
                                            }
                                        } else if (orr.b(b4) == this.n) {
                                            this.p.b();
                                            if ((b2 & 1) == 0) {
                                                this.p.a((char) h[b3 & 31]);
                                            } else {
                                                this.p.a((char) i[b3 & 31]);
                                            }
                                        }
                                    } else if (orr.b(b4) == this.n) {
                                        this.p.a((char) g[b3 & 15]);
                                    }
                                }
                            } else {
                                k();
                            }
                        } else if (z2) {
                            k();
                        }
                        obj = 1;
                    }
                }
            } else if (obj != null) {
                int i5 = this.s;
                if (i5 == 1 || i5 == 3) {
                    this.q = j();
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    private final List j() {
        int size = this.o.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            orf b = ((oru) this.o.get(i2)).b(aocf.UNSET_ENUM_VALUE);
            arrayList.add(b);
            if (b != null) {
                i = Math.min(i, b.d);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = (orf) arrayList.get(i3);
            if (obj != null) {
                if (obj.d != i) {
                    obj = ((oru) this.o.get(i3)).b(i);
                }
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    private final void a(int i) {
        int i2 = this.s;
        if (i2 != i) {
            this.s = i;
            if (i != 3) {
                k();
                if (i2 == 3 || i == 1 || i == 0) {
                    this.q = Collections.emptyList();
                }
                return;
            }
            for (i = 0; i < this.o.size(); i++) {
                ((oru) this.o.get(i)).g = 3;
            }
        }
    }

    private final void b(int i) {
        this.t = i;
        this.p.h = i;
    }

    private final void k() {
        this.p.a(this.s);
        this.o.clear();
        this.o.add(this.p);
    }

    private static char a(byte b) {
        return (char) f[b - 32];
    }

    public final /* bridge */ /* synthetic */ orq h() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ orn i() {
        return super.b();
    }
}
