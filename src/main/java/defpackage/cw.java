package defpackage;

import java.util.Arrays;

/* renamed from: cw */
public final class cw {
    public dc a = null;
    public float b = 0.0f;
    public boolean c = false;
    public final cx d;
    public boolean e = false;

    public cw(cz czVar) {
        this.d = new cx(this, czVar);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        cx cxVar = this.d;
        int i = cxVar.f;
        int i2 = 0;
        while (i != -1 && i2 < cxVar.a) {
            dc dcVar = cxVar.b.c[cxVar.c[i]];
            int i3 = 0;
            while (true) {
                int i4 = dcVar.g;
                if (i3 >= i4) {
                    cw[] cwVarArr = dcVar.f;
                    int length = cwVarArr.length;
                    if (i4 >= length) {
                        dcVar.f = (cw[]) Arrays.copyOf(cwVarArr, length + length);
                    }
                    cwVarArr = dcVar.f;
                    i4 = dcVar.g;
                    cwVarArr[i4] = this;
                    dcVar.g = i4 + 1;
                } else if (dcVar.f[i3] == this) {
                    break;
                } else {
                    i3++;
                }
            }
            i = cxVar.d[i];
            i2++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be  */
    public final java.lang.String toString() {
        /*
        r8 = this;
        r0 = r8.a;
        if (r0 == 0) goto L_0x0018;
    L_0x0004:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "";
        r0.append(r1);
        r1 = r8.a;
        r0.append(r1);
        r0 = r0.toString();
        goto L_0x001a;
    L_0x0018:
        r0 = "0";
    L_0x001a:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r0);
        r0 = " = ";
        r1.append(r0);
        r0 = r1.toString();
        r1 = r8.b;
        r2 = 0;
        r3 = 1;
        r4 = 0;
        r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1));
        if (r1 == 0) goto L_0x0048;
    L_0x0034:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r0);
        r0 = r8.b;
        r1.append(r0);
        r0 = r1.toString();
        r1 = r0;
        r0 = 1;
        goto L_0x004a;
    L_0x0048:
        r1 = r0;
        r0 = 0;
    L_0x004a:
        r5 = r8.d;
        r5 = r5.a;
    L_0x004e:
        if (r2 >= r5) goto L_0x00d3;
    L_0x0050:
        r6 = r8.d;
        r6 = r6.a(r2);
        if (r6 == 0) goto L_0x00cf;
    L_0x0058:
        r6 = r8.d;
        r6 = r6.b(r2);
        if (r0 != 0) goto L_0x0076;
    L_0x0060:
        r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x009e;
    L_0x0064:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r1);
        r1 = "- ";
        r0.append(r1);
        r1 = r0.toString();
        goto L_0x008b;
    L_0x0076:
        r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r0 > 0) goto L_0x008d;
    L_0x007a:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r1);
        r1 = " - ";
        r0.append(r1);
        r1 = r0.toString();
    L_0x008b:
        r6 = -r6;
        goto L_0x009e;
    L_0x008d:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r1);
        r1 = " + ";
        r0.append(r1);
        r1 = r0.toString();
    L_0x009e:
        r0 = "null";
        r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r7 == 0) goto L_0x00be;
    L_0x00a6:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r7.append(r1);
        r7.append(r6);
        r1 = " ";
        r7.append(r1);
        r7.append(r0);
        r0 = r7.toString();
        goto L_0x00cd;
    L_0x00be:
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r6.append(r1);
        r6.append(r0);
        r0 = r6.toString();
    L_0x00cd:
        r1 = r0;
        r0 = 1;
    L_0x00cf:
        r2 = r2 + 1;
        goto L_0x004e;
    L_0x00d3:
        if (r0 != 0) goto L_0x00e7;
    L_0x00d5:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r1);
        r1 = "0.0";
        r0.append(r1);
        r0 = r0.toString();
        return r0;
    L_0x00e7:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cw.toString():java.lang.String");
    }

    public final cw a(dc dcVar, int i) {
        if (i < 0) {
            this.b = (float) (-i);
            this.d.a(dcVar, 1.0f);
        } else {
            this.b = (float) i;
            this.d.a(dcVar, -1.0f);
        }
        return this;
    }

    public final cw a(dc dcVar, dc dcVar2, int i) {
        if (i != 0) {
            Object obj;
            if (i < 0) {
                i = -i;
                obj = 1;
            } else {
                obj = null;
            }
            this.b = (float) i;
            if (obj != null) {
                this.d.a(dcVar, 1.0f);
                this.d.a(dcVar2, -1.0f);
                return this;
            }
        }
        this.d.a(dcVar, -1.0f);
        this.d.a(dcVar2, 1.0f);
        return this;
    }

    public final cw a(dc dcVar, dc dcVar2, dc dcVar3, int i) {
        if (i != 0) {
            Object obj;
            if (i < 0) {
                i = -i;
                obj = 1;
            } else {
                obj = null;
            }
            this.b = (float) i;
            if (obj != null) {
                this.d.a(dcVar, 1.0f);
                this.d.a(dcVar2, -1.0f);
                this.d.a(dcVar3, -1.0f);
                return this;
            }
        }
        this.d.a(dcVar, -1.0f);
        this.d.a(dcVar2, 1.0f);
        this.d.a(dcVar3, 1.0f);
        return this;
    }

    public final cw b(dc dcVar, dc dcVar2, dc dcVar3, int i) {
        if (i != 0) {
            Object obj;
            if (i < 0) {
                i = -i;
                obj = 1;
            } else {
                obj = null;
            }
            this.b = (float) i;
            if (obj != null) {
                this.d.a(dcVar, 1.0f);
                this.d.a(dcVar2, -1.0f);
                this.d.a(dcVar3, 1.0f);
                return this;
            }
        }
        this.d.a(dcVar, -1.0f);
        this.d.a(dcVar2, 1.0f);
        this.d.a(dcVar3, -1.0f);
        return this;
    }

    public final cw a(float f, float f2, float f3, dc dcVar, int i, dc dcVar2, int i2, dc dcVar3, int i3, dc dcVar4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.b = (float) ((((-i) - i2) + i3) + i4);
            this.d.a(dcVar, 1.0f);
            this.d.a(dcVar2, -1.0f);
            this.d.a(dcVar4, 1.0f);
            this.d.a(dcVar3, -1.0f);
        } else {
            f = (f / f2) / (f3 / f2);
            this.b = (((float) ((-i) - i2)) + (((float) i3) * f)) + (((float) i4) * f);
            this.d.a(dcVar, 1.0f);
            this.d.a(dcVar2, -1.0f);
            this.d.a(dcVar4, f);
            this.d.a(dcVar3, -f);
        }
        return this;
    }

    /* Access modifiers changed, original: final */
    public final cw a(dc dcVar, dc dcVar2, int i, float f, dc dcVar3, dc dcVar4, int i2) {
        if (dcVar2 == dcVar3) {
            this.d.a(dcVar, 1.0f);
            this.d.a(dcVar4, 1.0f);
            this.d.a(dcVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.d.a(dcVar, 1.0f);
            this.d.a(dcVar2, -1.0f);
            this.d.a(dcVar3, -1.0f);
            this.d.a(dcVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.d.a(dcVar, -1.0f);
            this.d.a(dcVar2, 1.0f);
            this.b = (float) i;
        } else if (f < 1.0f) {
            float f2 = 1.0f - f;
            this.d.a(dcVar, f2);
            this.d.a(dcVar2, -f2);
            this.d.a(dcVar3, -f);
            this.d.a(dcVar4, f);
            if (i > 0 || i2 > 0) {
                this.b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        } else {
            this.d.a(dcVar3, -1.0f);
            this.d.a(dcVar4, 1.0f);
            this.b = (float) i2;
        }
        return this;
    }

    public final cw a(dc dcVar, dc dcVar2) {
        this.d.a(dcVar, 1.0f);
        this.d.a(dcVar2, -1.0f);
        return this;
    }

    public final cw a(dc dcVar, dc dcVar2, dc dcVar3, dc dcVar4, float f) {
        this.d.a(dcVar, -1.0f);
        this.d.a(dcVar2, 1.0f);
        this.d.a(dcVar3, f);
        this.d.a(dcVar4, -f);
        return this;
    }

    public final boolean a(cw cwVar) {
        this.d.a(this, cwVar);
        return true;
    }

    public final void a(dc dcVar) {
        dc dcVar2 = this.a;
        if (dcVar2 != null) {
            this.d.a(dcVar2, -1.0f);
            this.a = null;
        }
        float f = -this.d.a(dcVar);
        this.a = dcVar;
        if (f != 1.0f) {
            this.b /= f;
            cx cxVar = this.d;
            int i = cxVar.f;
            int i2 = 0;
            while (i != -1 && i2 < cxVar.a) {
                float[] fArr = cxVar.e;
                fArr[i] = fArr[i] / f;
                i = cxVar.d[i];
                i2++;
            }
        }
    }
}
