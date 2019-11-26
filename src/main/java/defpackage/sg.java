package defpackage;

import android.graphics.Path;
import android.util.Log;

/* renamed from: sg */
public final class sg {
    public char a;
    public final float[] b;

    sg(char c, float[] fArr) {
        this.a = c;
        this.b = fArr;
    }

    sg(sg sgVar) {
        this.a = sgVar.a;
        float[] fArr = sgVar.b;
        this.b = se.a(fArr, fArr.length);
    }

    public static void a(sg[] sgVarArr, Path path) {
        sg[] sgVarArr2 = sgVarArr;
        Path path2 = path;
        float[] fArr = new float[6];
        int i = 0;
        char c = 'm';
        int i2 = 0;
        while (i2 < sgVarArr2.length) {
            int i3;
            int i4;
            float f;
            sg sgVar = sgVarArr2[i2];
            char c2 = sgVar.a;
            float[] fArr2 = sgVar.b;
            float f2 = fArr[i];
            float f3 = fArr[1];
            float f4 = fArr[2];
            float f5 = fArr[3];
            float f6 = fArr[4];
            float f7 = fArr[5];
            switch (c2) {
                case 'A':
                case 'a':
                    i3 = 7;
                    break;
                case 'C':
                case 'c':
                    i3 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i3 = 1;
                    break;
                case 'Q':
                case afy.au /*83*/:
                case 'q':
                case 's':
                    i3 = 4;
                    break;
                case 'Z':
                case afy.av /*122*/:
                    path.close();
                    path2.moveTo(f6, f7);
                    f2 = f6;
                    f4 = f2;
                    f3 = f7;
                    f5 = f3;
                    break;
            }
            i3 = 2;
            float f8 = f6;
            float f9 = f7;
            int i5 = 0;
            f7 = f2;
            f6 = f3;
            while (i5 < fArr2.length) {
                int i6;
                float[] fArr3;
                char c3;
                int i7;
                if (c2 != 'A') {
                    int i8;
                    float f10;
                    int i9;
                    float f11;
                    if (c2 == 'C') {
                        i6 = i5;
                        fArr3 = fArr2;
                        c3 = c2;
                        i4 = i2;
                        i5 = i6 + 2;
                        i8 = i6 + 3;
                        int i10 = i6 + 4;
                        int i11 = i6 + 5;
                        path.cubicTo(fArr3[i6], fArr3[i6 + 1], fArr3[i5], fArr3[i8], fArr3[i10], fArr3[i11]);
                        f7 = fArr3[i10];
                        f6 = fArr3[i11];
                        f10 = fArr3[i5];
                        f5 = fArr3[i8];
                        f4 = f10;
                    } else if (c2 == 'H') {
                        i6 = i5;
                        fArr3 = fArr2;
                        c3 = c2;
                        i4 = i2;
                        path2.lineTo(fArr3[i6], f6);
                        f7 = fArr3[i6];
                    } else if (c2 == 'Q') {
                        i6 = i5;
                        fArr3 = fArr2;
                        c3 = c2;
                        i4 = i2;
                        i5 = i6 + 1;
                        i8 = i6 + 2;
                        i9 = i6 + 3;
                        path2.quadTo(fArr3[i6], fArr3[i5], fArr3[i8], fArr3[i9]);
                        f2 = fArr3[i6];
                        f3 = fArr3[i5];
                        f7 = fArr3[i8];
                        f6 = fArr3[i9];
                        f4 = f2;
                        f5 = f3;
                    } else if (c2 == 'V') {
                        i6 = i5;
                        fArr3 = fArr2;
                        c3 = c2;
                        i4 = i2;
                        path2.lineTo(f7, fArr3[i6]);
                        f6 = fArr3[i6];
                    } else if (c2 != 'a') {
                        int i12;
                        if (c2 != 'c') {
                            int i13;
                            if (c2 == 'h') {
                                f = f6;
                                i4 = i2;
                                f11 = f7;
                                path2.rLineTo(fArr2[i5], 0.0f);
                                f7 = f11 + fArr2[i5];
                            } else if (c2 != 'q') {
                                if (c2 == 'v') {
                                    f = f6;
                                    i4 = i2;
                                    f11 = f7;
                                    path2.rLineTo(0.0f, fArr2[i5]);
                                    f10 = fArr2[i5];
                                } else if (c2 != 'L') {
                                    if (c2 == 'M') {
                                        i4 = i2;
                                        f7 = fArr2[i5];
                                        f6 = fArr2[i5 + 1];
                                        if (i5 > 0) {
                                            path2.lineTo(f7, f6);
                                        } else {
                                            path2.moveTo(f7, f6);
                                        }
                                    } else if (c2 == 'S') {
                                        f = f6;
                                        i4 = i2;
                                        f11 = f7;
                                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                            f3 = (f + f) - f5;
                                            f2 = (f11 + f11) - f4;
                                        } else {
                                            f3 = f;
                                            f2 = f11;
                                        }
                                        i8 = i5 + 1;
                                        i7 = i5 + 2;
                                        i = i5 + 3;
                                        path.cubicTo(f2, f3, fArr2[i5], fArr2[i8], fArr2[i7], fArr2[i]);
                                        f10 = fArr2[i5];
                                        f = fArr2[i8];
                                        f7 = fArr2[i7];
                                        f6 = fArr2[i];
                                        f5 = f;
                                        f4 = f10;
                                    } else if (c2 == 'T') {
                                        f = f6;
                                        i4 = i2;
                                        f11 = f7;
                                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                            f = (f + f) - f5;
                                            f11 = (f11 + f11) - f4;
                                        }
                                        i9 = i5 + 1;
                                        path2.quadTo(f11, f, fArr2[i5], fArr2[i9]);
                                        f7 = fArr2[i5];
                                        f6 = fArr2[i9];
                                        f5 = f;
                                        i6 = i5;
                                        fArr3 = fArr2;
                                        c3 = c2;
                                        f4 = f11;
                                    } else if (c2 == 'l') {
                                        f = f6;
                                        i4 = i2;
                                        f11 = f7;
                                        i9 = i5 + 1;
                                        path2.rLineTo(fArr2[i5], fArr2[i9]);
                                        f7 = f11 + fArr2[i5];
                                        f10 = fArr2[i9];
                                    } else if (c2 == 'm') {
                                        f = f6;
                                        i4 = i2;
                                        f11 = f7;
                                        f10 = fArr2[i5];
                                        f7 = f11 + f10;
                                        f2 = fArr2[i5 + 1];
                                        f6 = f + f2;
                                        if (i5 > 0) {
                                            path2.rLineTo(f10, f2);
                                        } else {
                                            path2.rMoveTo(f10, f2);
                                        }
                                    } else if (c2 != 's') {
                                        if (c2 == 't') {
                                            if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                                f3 = f7 - f4;
                                                f10 = f6 - f5;
                                            } else {
                                                f10 = 0.0f;
                                                f3 = 0.0f;
                                            }
                                            i13 = i5 + 1;
                                            path2.rQuadTo(f3, f10, fArr2[i5], fArr2[i13]);
                                            f3 += f7;
                                            f10 += f6;
                                            f7 += fArr2[i5];
                                            f6 += fArr2[i13];
                                            f5 = f10;
                                            f4 = f3;
                                        }
                                        i6 = i5;
                                        fArr3 = fArr2;
                                        c3 = c2;
                                        i4 = i2;
                                    } else {
                                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                            f3 = f6 - f5;
                                            f2 = f7 - f4;
                                        } else {
                                            f2 = 0.0f;
                                            f3 = 0.0f;
                                        }
                                        i7 = i5 + 1;
                                        i = i5 + 2;
                                        i12 = i5 + 3;
                                        f = f6;
                                        i4 = i2;
                                        f11 = f7;
                                        path.rCubicTo(f2, f3, fArr2[i5], fArr2[i7], fArr2[i], fArr2[i12]);
                                        f7 = f11 + fArr2[i5];
                                        f6 = f + fArr2[i7];
                                        f10 = fArr2[i] + f11;
                                        f2 = fArr2[i12];
                                    }
                                    f9 = f6;
                                    f8 = f7;
                                } else {
                                    i4 = i2;
                                    i8 = i5 + 1;
                                    path2.lineTo(fArr2[i5], fArr2[i8]);
                                    f7 = fArr2[i5];
                                    f6 = fArr2[i8];
                                }
                                f6 = f + f10;
                            } else {
                                f = f6;
                                i4 = i2;
                                f11 = f7;
                                i9 = i5 + 1;
                                i13 = i5 + 2;
                                int i14 = i5 + 3;
                                path2.rQuadTo(fArr2[i5], fArr2[i9], fArr2[i13], fArr2[i14]);
                                f7 = f11 + fArr2[i5];
                                f6 = f + fArr2[i9];
                                f10 = fArr2[i13] + f11;
                                f2 = fArr2[i14];
                            }
                            i6 = i5;
                            fArr3 = fArr2;
                            c3 = c2;
                        } else {
                            f = f6;
                            i4 = i2;
                            f11 = f7;
                            i7 = i5 + 2;
                            i = i5 + 3;
                            i12 = i5 + 4;
                            int i15 = i5 + 5;
                            path.rCubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i7], fArr2[i], fArr2[i12], fArr2[i15]);
                            f7 = f11 + fArr2[i7];
                            f6 = f + fArr2[i];
                            f10 = fArr2[i12] + f11;
                            f2 = fArr2[i15];
                        }
                        f5 = f6;
                        f4 = f7;
                        i6 = i5;
                        fArr3 = fArr2;
                        c3 = c2;
                        f6 = f + f2;
                        f7 = f10;
                    } else {
                        f = f6;
                        i4 = i2;
                        f11 = f7;
                        i7 = i5 + 5;
                        f4 = fArr2[i7] + f11;
                        i = i5 + 6;
                        f5 = fArr2[i] + f;
                        f6 = fArr2[i5];
                        f7 = fArr2[i5 + 1];
                        float f12 = fArr2[i5 + 2];
                        boolean z = fArr2[i5 + 3] != 0.0f;
                        boolean z2 = fArr2[i5 + 4] != 0.0f;
                        i6 = i5;
                        float f13 = f12;
                        fArr3 = fArr2;
                        c3 = c2;
                        sg.a(path, f11, f, f4, f5, f6, f7, f13, z, z2);
                        f7 = f11 + fArr3[i7];
                        f6 = f + fArr3[i];
                    }
                    i5 = i6 + i3;
                    sgVarArr2 = sgVarArr;
                    fArr2 = fArr3;
                    c = c3;
                    c2 = c;
                    i2 = i4;
                } else {
                    i6 = i5;
                    fArr3 = fArr2;
                    c3 = c2;
                    i4 = i2;
                    i7 = i6 + 5;
                    i = i6 + 6;
                    sg.a(path, f7, f6, fArr3[i7], fArr3[i], fArr3[i6], fArr3[i6 + 1], fArr3[i6 + 2], fArr3[i6 + 3] != 0.0f, fArr3[i6 + 4] != 0.0f);
                    f7 = fArr3[i7];
                    f6 = fArr3[i];
                }
                f5 = f6;
                f4 = f7;
                i5 = i6 + i3;
                sgVarArr2 = sgVarArr;
                fArr2 = fArr3;
                c = c3;
                c2 = c;
                i2 = i4;
            }
            f = f6;
            i4 = i2;
            fArr[0] = f7;
            fArr[1] = f;
            fArr[2] = f4;
            fArr[3] = f5;
            fArr[4] = f8;
            fArr[5] = f9;
            i2 = i4 + 1;
            c = sgVarArr[i4].a;
            i = 0;
            sgVarArr2 = sgVarArr;
        }
    }

    private static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        float f8 = f;
        float f9 = f3;
        float f10 = f5;
        float f11 = f6;
        boolean z3 = z2;
        double toRadians = Math.toRadians((double) f7);
        double cos = Math.cos(toRadians);
        double sin = Math.sin(toRadians);
        double d = (double) f8;
        double d2 = (double) f2;
        double d3 = toRadians;
        toRadians = (double) f10;
        Double.isNaN(d);
        double d4 = d * cos;
        Double.isNaN(d2);
        d4 += d2 * sin;
        Double.isNaN(toRadians);
        d4 /= toRadians;
        double d5 = d;
        d = (double) f11;
        double d6 = (double) (-f8);
        Double.isNaN(d6);
        d6 *= sin;
        Double.isNaN(d2);
        d6 += d2 * cos;
        Double.isNaN(d);
        double d7 = d2;
        d2 = (double) f4;
        double d8 = d6 / d;
        double d9 = (double) f9;
        Double.isNaN(d9);
        d9 *= cos;
        Double.isNaN(d2);
        d9 += d2 * sin;
        Double.isNaN(toRadians);
        d9 /= toRadians;
        double d10 = (double) (-f9);
        Double.isNaN(d10);
        d10 *= sin;
        Double.isNaN(d2);
        d10 += d2 * cos;
        Double.isNaN(d);
        d10 /= d;
        d2 = d4 - d9;
        double d11 = d8 - d10;
        double d12 = (d4 + d9) / 2.0d;
        double d13 = (d8 + d10) / 2.0d;
        double d14 = sin;
        sin = (d2 * d2) + (d11 * d11);
        String str = "PathParser";
        if (sin == 0.0d) {
            Log.w(str, " Points are coincident");
            return;
        }
        double d15 = (1.0d / sin) - 16.0d;
        if (d15 < 0.0d) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Points are too far apart ");
            stringBuilder.append(sin);
            Log.w(str, stringBuilder.toString());
            f10 = (float) (Math.sqrt(sin) / 1.99999d);
            sg.a(path, f, f2, f3, f4, f5 * f10, f6 * f10, f7, z, z2);
            return;
        }
        sin = Math.sqrt(d15);
        d2 *= sin;
        sin *= d11;
        if (z == z3) {
            d12 -= sin;
            d13 += d2;
        } else {
            d12 += sin;
            d13 -= d2;
        }
        double atan2 = Math.atan2(d8 - d13, d4 - d12);
        d9 = Math.atan2(d10 - d13, d9 - d12) - atan2;
        int i = 0;
        if (z3 != (d9 >= 0.0d)) {
            d9 += d9 > 0.0d ? -6.283185307179586d : 6.283185307179586d;
        }
        Double.isNaN(toRadians);
        d12 *= toRadians;
        Double.isNaN(d);
        d13 *= d;
        double d16 = (d12 * cos) - (d13 * d14);
        d12 = (d12 * d14) + (d13 * cos);
        int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
        sin = Math.cos(d3);
        d3 = Math.sin(d3);
        d4 = Math.cos(atan2);
        d8 = Math.sin(atan2);
        Double.isNaN(toRadians);
        cos = -toRadians;
        d11 = cos * sin;
        Double.isNaN(d);
        d13 = d * d3;
        double d17 = (d11 * d8) - (d13 * d4);
        cos *= d3;
        Double.isNaN(d);
        d *= sin;
        d8 = (d8 * cos) + (d4 * d);
        double d18 = atan2;
        atan2 = (double) ceil;
        Double.isNaN(atan2);
        d9 /= atan2;
        atan2 = d18;
        while (i < ceil) {
            d4 = atan2 + d9;
            d15 = Math.sin(d4);
            d14 = Math.cos(d4);
            Double.isNaN(toRadians);
            d18 = d9;
            d9 = (d16 + ((toRadians * sin) * d14)) - (d13 * d15);
            Double.isNaN(toRadians);
            double d19 = toRadians;
            int i2 = ceil;
            double d20 = (d12 + ((toRadians * d3) * d14)) + (d * d15);
            double d21 = (d11 * d15) - (d13 * d14);
            d15 = (d15 * cos) + (d14 * d);
            atan2 = d4 - atan2;
            d14 = Math.tan(atan2 / 2.0d);
            atan2 = (Math.sin(atan2) * (Math.sqrt(((d14 * 3.0d) * d14) + 4.0d) - 4.0d)) / 3.0d;
            int i3 = i2;
            double d22 = d16;
            path.rLineTo(0.0f, 0.0f);
            double d23 = cos;
            path.cubicTo((float) (d5 + (d17 * atan2)), (float) (d7 + (d8 * atan2)), (float) (d9 - (atan2 * d21)), (float) (d20 - (atan2 * d15)), (float) d9, (float) d20);
            i++;
            d16 = d22;
            cos = d23;
            d5 = d9;
            d7 = d20;
            atan2 = d4;
            d8 = d15;
            d17 = d21;
            toRadians = d19;
            ceil = i3;
            d9 = d18;
        }
    }
}
