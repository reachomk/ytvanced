package defpackage;

import java.lang.reflect.Field;

/* renamed from: dbn */
public final class dbn extends apr implements cps {
    private final int a;
    private final int b;

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean k_() {
        aqj aqj;
        try {
            if (dad.a == null) {
                Field declaredField = apr.class.getDeclaredField("c");
                dad.a = declaredField;
                declaredField.setAccessible(true);
            }
            aqj = (aqj) dad.a.get(this);
        } catch (Exception unused) {
            aqj = null;
        }
        if (aqj == null || aqj.d() != -1) {
            return false;
        }
        return true;
    }

    /* synthetic */ dbn(int i, int i2, int i3, int i4) {
        super(i, i2);
        this.a = i3;
        this.b = i4;
    }
}
