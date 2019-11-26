package defpackage;

import android.view.View.MeasureSpec;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;

/* renamed from: cmo */
final class cmo implements YogaMeasureFunction {
    private final aaa a = new aaa(2);

    cmo() {
    }

    private final void a(crd crd) {
        this.a.a(crd);
    }

    public final long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        coz coz = (coz) yogaNode.e;
        cnz cnz = coz.K ? coz.H : null;
        cmm B = coz.B();
        boolean d = cno.d();
        int a = crc.a(f, yogaMeasureMode);
        int a2 = crc.a(f2, yogaMeasureMode2);
        if (d) {
            String valueOf = String.valueOf(B.b());
            String str = "measure:";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
            cnn b = cno.b();
            MeasureSpec.toString(a);
            b = b.a();
            MeasureSpec.toString(a2);
            if (b != null) {
                int i = B.j;
            } else {
                throw null;
            }
        }
        coz.a(a);
        coz.b(a2);
        if (cma.g(B) || coz.g != null) {
            cmg cmg = coz.b;
            if (cmg.g()) {
                if (coz.A() != null) {
                    cmg = coz.A().b;
                } else {
                    cnh cnh = cmg.d;
                    if (cnh != null) {
                        String b2 = B.b();
                        String str2 = B.l;
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(b2).length() + 78) + String.valueOf(str2).length());
                        stringBuilder.append("component ");
                        stringBuilder.append(b2);
                        stringBuilder.append(" is a nested tree but does not have a parent component.[mGlobalKey:");
                        stringBuilder.append(str2);
                        stringBuilder.append("]");
                        cnh.a(2, stringBuilder.toString());
                    }
                }
            }
            coz a3 = cpg.a(cmg, coz, a, a2);
            int a4 = a3.a();
            a2 = a3.b();
            a = a4;
        } else if (cnz != null && cnz.i == a && cnz.j == a2 && !B.z()) {
            a = (int) cnz.g;
            a2 = (int) cnz.h;
        } else {
            crd crd = (crd) this.a.a();
            if (crd == null) {
                crd = new crd();
            }
            crd.a = aocf.UNSET_ENUM_VALUE;
            crd.b = aocf.UNSET_ENUM_VALUE;
            try {
                B.a(B.p, coz, a, a2, crd);
                int i2 = crd.a;
                if (i2 >= 0) {
                    int i3 = crd.b;
                    if (i3 >= 0) {
                        cnz cnz2 = coz.H;
                        if (cnz2 != null) {
                            cnz2.i = a;
                            cnz2.j = a2;
                            cnz2.g = (float) i2;
                            cnz2.h = (float) i3;
                        }
                        a(crd);
                        a = i2;
                        a2 = i3;
                    }
                }
                String valueOf2 = String.valueOf(B);
                StringBuilder stringBuilder2 = new StringBuilder(valueOf2.length() + 46);
                stringBuilder2.append("MeasureOutput not set, ComponentLifecycle is: ");
                stringBuilder2.append(valueOf2);
                throw new IllegalStateException(stringBuilder2.toString());
            } catch (Throwable th) {
                a(crd);
            }
        }
        f = (float) a;
        coz.a(f);
        float f3 = (float) a2;
        coz.b(f3);
        if (d) {
            cno.c();
        }
        return (((long) Float.floatToRawIntBits(f)) << 32) | ((long) Float.floatToRawIntBits(f3));
    }
}
