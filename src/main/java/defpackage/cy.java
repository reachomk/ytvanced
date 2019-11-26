package defpackage;

import java.util.ArrayList;

/* renamed from: cy */
public final class cy {
    public final ArrayList a = new ArrayList();

    public final void a(db dbVar) {
        int i;
        int i2;
        db dbVar2 = dbVar;
        this.a.clear();
        for (i = 1; i < dbVar2.d; i++) {
            dc dcVar = dbVar2.f.c[i];
            for (i2 = 0; i2 < 6; i2++) {
                dcVar.e[i2] = 0.0f;
            }
            dcVar.e[dcVar.c] = 1.0f;
            if (dcVar.h == 4) {
                this.a.add(dcVar);
            }
        }
        i = this.a.size();
        for (int i3 = 0; i3 < i; i3++) {
            dc dcVar2 = (dc) this.a.get(i3);
            int i4 = dcVar2.b;
            if (i4 != -1) {
                cx cxVar = dbVar2.b[i4].d;
                int i5 = cxVar.a;
                for (int i6 = 0; i6 < i5; i6++) {
                    dc a = cxVar.a(i6);
                    if (a != null) {
                        float b = cxVar.b(i6);
                        for (int i7 = 0; i7 < 6; i7++) {
                            float[] fArr = a.e;
                            fArr[i7] = fArr[i7] + (dcVar2.e[i7] * b);
                        }
                        if (!this.a.contains(a)) {
                            this.a.add(a);
                        }
                    }
                }
                for (i2 = 0; i2 < 6; i2++) {
                    dcVar2.e[i2] = 0.0f;
                }
            }
        }
    }

    public final String toString() {
        int size = this.a.size();
        String str = "Goal: ";
        for (int i = 0; i < size; i++) {
            dc dcVar = (dc) this.a.get(i);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(dcVar);
            stringBuilder2.append("[");
            String stringBuilder3 = stringBuilder2.toString();
            for (int i2 = 0; i2 < dcVar.e.length; i2++) {
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append(stringBuilder3);
                stringBuilder4.append(dcVar.e[i2]);
                stringBuilder3 = stringBuilder4.toString();
                if (i2 < dcVar.e.length - 1) {
                    stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(stringBuilder3);
                    stringBuilder4.append(", ");
                    stringBuilder3 = stringBuilder4.toString();
                } else {
                    stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(stringBuilder3);
                    stringBuilder4.append("] ");
                    stringBuilder3 = stringBuilder4.toString();
                }
            }
            stringBuilder.append(stringBuilder3);
            str = stringBuilder.toString();
        }
        return str;
    }
}
