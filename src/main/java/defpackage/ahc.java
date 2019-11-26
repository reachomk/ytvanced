package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ahc */
public final class ahc {
    private final List a;
    private final int[] b;
    private final int[] c;
    private final ahd d;
    private final int e;
    private final int f;
    private final boolean g = true;

    ahc(ahd ahd, List list, int[] iArr, int[] iArr2) {
        this.a = list;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(this.b, 0);
        Arrays.fill(this.c, 0);
        this.d = ahd;
        this.e = ahd.a();
        this.f = ahd.b();
        ahh ahh = !this.a.isEmpty() ? (ahh) this.a.get(0) : null;
        if (!(ahh != null && ahh.a == 0 && ahh.b == 0)) {
            ahh = new ahh();
            ahh.a = 0;
            ahh.b = 0;
            ahh.d = false;
            ahh.c = 0;
            ahh.e = false;
            this.a.add(0, ahh);
        }
        int i = this.e;
        int i2 = this.f;
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                ahh ahh2 = (ahh) this.a.get(size);
                int i3 = ahh2.a;
                int i4 = ahh2.c;
                i3 += i4;
                int i5 = ahh2.b + i4;
                if (this.g) {
                    while (i > i3) {
                        i4 = i - 1;
                        if (this.b[i4] == 0) {
                            a(i, i2, size, false);
                        }
                        i = i4;
                    }
                    while (i2 > i5) {
                        i3 = i2 - 1;
                        if (this.c[i3] == 0) {
                            a(i, i2, size, true);
                        }
                        i2 = i3;
                    }
                }
                for (i = 0; i < ahh2.c; i++) {
                    i2 = ahh2.a + i;
                    i3 = ahh2.b + i;
                    i4 = !this.d.b(i2, i3) ? 2 : 1;
                    this.b[i2] = (i3 << 5) | i4;
                    this.c[i3] = (i2 << 5) | i4;
                }
                i = ahh2.a;
                i2 = ahh2.b;
            } else {
                return;
            }
        }
    }

    private final boolean a(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        if (z) {
            i2--;
            i4 = i;
            i5 = i2;
        } else {
            i4 = i - 1;
            i5 = i4;
        }
        while (i3 >= 0) {
            ahh ahh = (ahh) this.a.get(i3);
            int i6 = ahh.a;
            int i7 = ahh.c;
            i6 += i7;
            int i8 = ahh.b + i7;
            int i9 = 4;
            if (!z) {
                while (true) {
                    i2--;
                    if (i2 < i8) {
                        continue;
                        break;
                    } else if (this.d.a(i5, i2)) {
                        if (this.d.b(i5, i2)) {
                            i9 = 8;
                        }
                        i--;
                        this.b[i] = (i2 << 5) | 16;
                        this.c[i2] = (i << 5) | i9;
                        return true;
                    }
                }
            } else {
                while (true) {
                    i4--;
                    if (i4 < i6) {
                        continue;
                        break;
                    } else if (this.d.a(i4, i5)) {
                        if (this.d.b(i4, i5)) {
                            i9 = 8;
                        }
                        this.c[i5] = (i4 << 5) | 16;
                        this.b[i4] = (i5 << 5) | i9;
                        return true;
                    }
                }
            }
            i4 = ahh.a;
            i2 = ahh.b;
            i3--;
        }
        return false;
    }

    public final void a(apa apa) {
        ahg ahg;
        ags ags = new ags(apa);
        if (ags instanceof agy) {
            ahg = (agy) ags;
        } else {
            ahg = new agy(ags);
        }
        ArrayList arrayList = new ArrayList();
        int i = this.e;
        int i2 = this.f;
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                int i3;
                int i4;
                ahf ahf;
                StringBuilder stringBuilder;
                ahh ahh = (ahh) this.a.get(size);
                int i5 = ahh.c;
                int i6 = ahh.a + i5;
                int i7 = ahh.b + i5;
                String str = " ";
                String str2 = "unknown flag for pos ";
                int i8 = 4;
                if (i6 < i) {
                    i -= i6;
                    if (this.g) {
                        i--;
                        while (i >= 0) {
                            int i9 = i6 + i;
                            i3 = this.b[i9];
                            i4 = i3 & 31;
                            if (i4 == 0) {
                                ahg.b(i9, 1);
                                i3 = arrayList.size();
                                for (i4 = 0; i4 < i3; i4++) {
                                    ahf = (ahf) arrayList.get(i4);
                                    ahf.b--;
                                }
                            } else if (i4 == i8 || i4 == 8) {
                                ahf a = ahc.a(arrayList, i3 >> 5, false);
                                ahg.c(i9, a.b - 1);
                                if (i4 == 4) {
                                    ahg.a(a.b - 1, 1, null);
                                }
                            } else if (i4 == 16) {
                                arrayList.add(new ahf(i9, i9, true));
                            } else {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(str2);
                                stringBuilder.append(i9);
                                stringBuilder.append(str);
                                stringBuilder.append(Long.toBinaryString((long) i4));
                                throw new IllegalStateException(stringBuilder.toString());
                            }
                            i--;
                            i8 = 4;
                        }
                    } else {
                        ahg.b(i6, i);
                    }
                }
                if (i7 < i2) {
                    i2 -= i7;
                    if (this.g) {
                        while (true) {
                            i2--;
                            if (i2 < 0) {
                                break;
                            }
                            i = i7 + i2;
                            i3 = this.c[i];
                            i4 = i3 & 31;
                            if (i4 != 0) {
                                if (i4 != 4) {
                                    if (i4 != 8) {
                                        if (i4 == 16) {
                                            arrayList.add(new ahf(i, i6, false));
                                        } else {
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append(str2);
                                            stringBuilder.append(i);
                                            stringBuilder.append(str);
                                            stringBuilder.append(Long.toBinaryString((long) i4));
                                            throw new IllegalStateException(stringBuilder.toString());
                                        }
                                    }
                                }
                                ahg.c(ahc.a(arrayList, i3 >> 5, true).b, i6);
                                if (i4 == 4) {
                                    ahg.a(i6, 1, null);
                                }
                            } else {
                                i3 = 1;
                                ahg.a(i6, 1);
                                i4 = arrayList.size();
                                i = 0;
                                while (i < i4) {
                                    ahf = (ahf) arrayList.get(i);
                                    ahf.b += i3;
                                    i++;
                                    i3 = 1;
                                }
                            }
                        }
                    } else {
                        ahg.a(i6, i2);
                    }
                }
                while (true) {
                    i5--;
                    if (i5 < 0) {
                        break;
                    }
                    i2 = ahh.a + i5;
                    if ((this.b[i2] & 31) == 2) {
                        ahg.a(i2, 1, null);
                    }
                }
                i = ahh.a;
                i2 = ahh.b;
            } else {
                ahg.a();
                return;
            }
        }
    }

    private static ahf a(List list, int i, boolean z) {
        int size = list.size() - 1;
        while (size >= 0) {
            ahf ahf = (ahf) list.get(size);
            if (ahf.a == i && ahf.c == z) {
                list.remove(size);
                while (size < list.size()) {
                    ahf ahf2 = (ahf) list.get(size);
                    ahf2.b += !z ? -1 : 1;
                    size++;
                }
                return ahf;
            }
            size--;
        }
        return null;
    }
}
