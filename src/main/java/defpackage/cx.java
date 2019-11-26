package defpackage;

import java.util.Arrays;

/* renamed from: cx */
public final class cx {
    public int a = 0;
    public final cz b;
    public int[] c = new int[8];
    public int[] d = new int[8];
    public float[] e = new float[8];
    public int f = -1;
    public int g = -1;
    public boolean h = false;
    private final cw i;
    private int j = 8;

    cx(cw cwVar, cz czVar) {
        this.i = cwVar;
        this.b = czVar;
    }

    public final void a(dc dcVar, float f) {
        if (f != 0.0f) {
            int i = this.f;
            if (i == -1) {
                this.f = 0;
                this.e[0] = f;
                this.c[0] = dcVar.a;
                this.d[0] = -1;
                this.a++;
                if (!this.h) {
                    this.g++;
                }
                return;
            }
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.a) {
                int i4 = this.c[i];
                int i5 = dcVar.a;
                if (i4 == i5) {
                    this.e[i] = f;
                    return;
                }
                if (i4 < i5) {
                    i3 = i;
                }
                i = this.d[i];
                i2++;
            }
            i = this.g;
            i2 = i + 1;
            if (this.h) {
                int[] iArr = this.c;
                if (iArr[i] != -1) {
                    i = iArr.length;
                }
            } else {
                i = i2;
            }
            i2 = this.c.length;
            if (i >= i2 && this.a < i2) {
                i2 = 0;
                while (true) {
                    int[] iArr2 = this.c;
                    if (i2 < iArr2.length) {
                        if (iArr2[i2] == -1) {
                            i = i2;
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            }
            i2 = this.c.length;
            if (i >= i2) {
                i = this.j;
                i += i;
                this.j = i;
                this.h = false;
                this.g = i2 - 1;
                this.e = Arrays.copyOf(this.e, i);
                this.c = Arrays.copyOf(this.c, this.j);
                this.d = Arrays.copyOf(this.d, this.j);
                i = i2;
            }
            int[] iArr3 = this.c;
            iArr3[i] = dcVar.a;
            this.e[i] = f;
            if (i3 != -1) {
                int[] iArr4 = this.d;
                iArr4[i] = iArr4[i3];
                iArr4[i3] = i;
            } else {
                this.d[i] = this.f;
                this.f = i;
            }
            int i6 = this.a + 1;
            this.a = i6;
            if (!this.h) {
                this.g++;
            }
            if (i6 >= iArr3.length) {
                this.h = true;
            }
            return;
        }
        a(dcVar);
    }

    public final void b(dc dcVar, float f) {
        if (f != 0.0f) {
            int i = this.f;
            if (i == -1) {
                this.f = 0;
                this.e[0] = f;
                this.c[0] = dcVar.a;
                this.d[0] = -1;
                this.a++;
                if (!this.h) {
                    this.g++;
                }
                return;
            }
            int[] iArr;
            int[] iArr2;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.a) {
                int i4 = this.c[i];
                int i5 = dcVar.a;
                if (i4 == i5) {
                    float[] fArr = this.e;
                    float f2 = fArr[i] + f;
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f) {
                            this.f = this.d[i];
                        } else {
                            iArr = this.d;
                            iArr[i3] = iArr[i];
                        }
                        this.b.c[i4].a(this.i);
                        if (this.h) {
                            this.g = i;
                        }
                        this.a--;
                    }
                    return;
                }
                if (i4 < i5) {
                    i3 = i;
                }
                i = this.d[i];
                i2++;
            }
            int i6 = this.g;
            i = i6 + 1;
            if (this.h) {
                iArr2 = this.c;
                if (iArr2[i6] != -1) {
                    i6 = iArr2.length;
                }
            } else {
                i6 = i;
            }
            i = this.c.length;
            if (i6 >= i && this.a < i) {
                i = 0;
                while (true) {
                    int[] iArr3 = this.c;
                    if (i < iArr3.length) {
                        if (iArr3[i] == -1) {
                            i6 = i;
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            i = this.c.length;
            if (i6 >= i) {
                i6 = this.j;
                i6 += i6;
                this.j = i6;
                this.h = false;
                this.g = i - 1;
                this.e = Arrays.copyOf(this.e, i6);
                this.c = Arrays.copyOf(this.c, this.j);
                this.d = Arrays.copyOf(this.d, this.j);
                i6 = i;
            }
            iArr2 = this.c;
            iArr2[i6] = dcVar.a;
            this.e[i6] = f;
            if (i3 != -1) {
                iArr = this.d;
                iArr[i6] = iArr[i3];
                iArr[i3] = i6;
            } else {
                this.d[i6] = this.f;
                this.f = i6;
            }
            this.a++;
            if (!this.h) {
                this.g++;
            }
            int i7 = this.g;
            int length = iArr2.length;
            if (i7 >= length) {
                this.h = true;
                this.g = length - 1;
            }
        }
    }

    public final float a(dc dcVar) {
        int i = this.f;
        if (i != -1) {
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.a) {
                int i4 = this.c[i];
                if (i4 == dcVar.a) {
                    if (i == this.f) {
                        this.f = this.d[i];
                    } else {
                        int[] iArr = this.d;
                        iArr[i3] = iArr[i];
                    }
                    this.b.c[i4].a(this.i);
                    this.a--;
                    this.c[i] = -1;
                    if (this.h) {
                        this.g = i;
                    }
                    return this.e[i];
                }
                i2++;
                i3 = i;
                i = this.d[i];
            }
        }
        return 0.0f;
    }

    /* Access modifiers changed, original: final */
    public final void a(cw cwVar, cw cwVar2) {
        int i = this.f;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.a) {
                int i3 = this.c[i];
                dc dcVar = cwVar2.a;
                if (i3 == dcVar.a) {
                    float f = this.e[i];
                    a(dcVar);
                    cx cxVar = cwVar2.d;
                    i3 = cxVar.f;
                    int i4 = 0;
                    while (i3 != -1 && i4 < cxVar.a) {
                        b(this.b.c[cxVar.c[i3]], cxVar.e[i3] * f);
                        i3 = cxVar.d[i3];
                        i4++;
                    }
                    cwVar.b += cwVar2.b * f;
                    cwVar2.a.a(cwVar);
                    i = this.f;
                } else {
                    i = this.d[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* Access modifiers changed, original: final */
    public final dc a(int i) {
        int i2 = this.f;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (i3 == i) {
                return this.b.c[this.c[i2]];
            }
            i2 = this.d[i2];
            i3++;
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final float b(int i) {
        int i2 = this.f;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (i3 == i) {
                return this.e[i2];
            }
            i2 = this.d[i2];
            i3++;
        }
        return 0.0f;
    }

    public final float b(dc dcVar) {
        int i = this.f;
        int i2 = 0;
        while (i != -1 && i2 < this.a) {
            if (this.c[i] == dcVar.a) {
                return this.e[i];
            }
            i = this.d[i];
            i2++;
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" -> ");
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.e[i]);
            stringBuilder.append(" : ");
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(this.b.c[this.c[i]]);
            str = stringBuilder.toString();
            i = this.d[i];
            i2++;
        }
        return str;
    }
}
