package defpackage;

import android.content.Context;

/* renamed from: aczm */
public final class aczm {
    public static final String a = xtl.b("MDX.FirebaseJobDispatcherUtil");
    public final ddv b;

    aczm(Context context) {
        this.b = new ddv(new dea(context));
    }

    public final void a(Class cls, String str, int i) {
        String str2 = a;
        StringBuilder stringBuilder = new StringBuilder(49);
        stringBuilder.append("Scheduling immediate job. constraints:");
        stringBuilder.append(i);
        xtl.c(str2, stringBuilder.toString());
        this.b.b(a(cls, str, dfe.a, i).a());
    }

    public final void a(Class cls, String str, int i, int i2) {
        String str2 = a;
        StringBuilder stringBuilder = new StringBuilder(66);
        stringBuilder.append("Scheduling delayed job. delay: ");
        stringBuilder.append(i);
        stringBuilder.append(" constraints:");
        stringBuilder.append(i2);
        xtl.c(str2, stringBuilder.toString());
        this.b.b(a(cls, str, dfe.a(i, i), i2).a());
    }

    private final dek a(Class cls, String str, dew dew, int i) {
        dek a = this.b.a();
        a.a(cls);
        a.c = str;
        a.i = false;
        a.e = 1;
        a.d = dew;
        a.h = true;
        a.g = dfc.a;
        a.f = new int[]{i};
        return a;
    }
}
