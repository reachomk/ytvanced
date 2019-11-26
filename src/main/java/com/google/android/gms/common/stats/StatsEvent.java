package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.qou;

public abstract class StatsEvent extends qou implements ReflectedParcelable {
    public abstract long a();

    public abstract int b();

    public abstract long c();

    public abstract String d();

    public final String toString() {
        long a = a();
        int b = b();
        long c = c();
        String d = d();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(d).length() + 53);
        stringBuilder.append(a);
        String str = "\t";
        stringBuilder.append(str);
        stringBuilder.append(b);
        stringBuilder.append(str);
        stringBuilder.append(c);
        stringBuilder.append(d);
        return stringBuilder.toString();
    }
}
