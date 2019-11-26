package defpackage;

/* renamed from: zsl */
public final class zsl {
    zsl() {
    }

    public static void a(zsj zsj, zsk zsk, zsk zsk2, float f) {
        if (zsk2.a() >= 0.001f && zsk2.a() < zsk.a()) {
            float f2 = zsk2.b;
            float f3 = zsk2.c;
            float f4 = zsk.b;
            float f5 = f2 - f4;
            if (f5 < f) {
                f2 = f4;
            }
            Object obj = 1;
            Object obj2 = f5 >= f ? null : 1;
            float f6 = zsk.c;
            float f7 = f6 - f3;
            if (f7 >= f) {
                obj = obj2;
            }
            if (f7 >= f) {
                f6 = f3;
            }
            if (obj != null) {
                zsj.a.remove(zsk2);
                zsk2.b = f2;
                zsk2.c = f6;
                zsj.a.add(zsk2);
            }
        }
    }
}
