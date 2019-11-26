package defpackage;

import java.lang.reflect.Array;

/* renamed from: aht */
public final class aht {
    public final Object[] a;
    public int b;
    public int c;
    public aht d;

    public aht(Class cls, int i) {
        this.a = (Object[]) Array.newInstance(cls, i);
    }
}
