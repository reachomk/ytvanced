package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.anmg;
import defpackage.anml;
import defpackage.anmq;
import defpackage.anmt;
import defpackage.qou;
import defpackage.qov;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;

public final class Thing extends qou implements anmg, ReflectedParcelable {
    public static final Creator CREATOR = new anmt();
    public final anml a;
    private final int b;
    private final Bundle c;
    private final String d;
    private final String e;

    public Thing(int i, Bundle bundle, anml anml, String str, String str2) {
        this.b = i;
        this.c = bundle;
        this.a = anml;
        this.d = str;
        this.e = str2;
        this.c.setClassLoader(getClass().getClassLoader());
    }

    public Thing(Bundle bundle, anml anml, String str, String str2) {
        this.b = 10;
        this.c = bundle;
        this.a = anml;
        this.d = str;
        this.e = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 1, this.c);
        qov.a(parcel, 2, this.a, i);
        qov.a(parcel, 3, this.d);
        qov.a(parcel, 4, this.e);
        qov.b(parcel, 1000, this.b);
        qov.a(parcel, a);
    }

    public static void a(Bundle bundle, StringBuilder stringBuilder) {
        try {
            Set keySet = bundle.keySet();
            String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
            Arrays.sort(strArr, anmq.a);
            for (String str : strArr) {
                stringBuilder.append("{ key: '");
                stringBuilder.append(str);
                stringBuilder.append("' value: ");
                Object obj = bundle.get(str);
                if (obj == null) {
                    stringBuilder.append("<null>");
                } else if (obj.getClass().isArray()) {
                    stringBuilder.append("[ ");
                    for (int i = 0; i < Array.getLength(obj); i++) {
                        stringBuilder.append("'");
                        stringBuilder.append(Array.get(obj, i));
                        stringBuilder.append("' ");
                    }
                    stringBuilder.append("]");
                } else {
                    stringBuilder.append(obj.toString());
                }
                stringBuilder.append(" } ");
            }
        } catch (RuntimeException unused) {
            stringBuilder.append("<error>");
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(!this.e.equals("Thing") ? this.e : "Indexable");
        stringBuilder.append(" { { id: ");
        if (this.d == null) {
            stringBuilder.append("<null>");
        } else {
            String str = "'";
            stringBuilder.append(str);
            stringBuilder.append(this.d);
            stringBuilder.append(str);
        }
        stringBuilder.append(" } Properties { ");
        a(this.c, stringBuilder);
        stringBuilder.append("} Metadata { ");
        stringBuilder.append(this.a.toString());
        stringBuilder.append(" } }");
        return stringBuilder.toString();
    }
}
