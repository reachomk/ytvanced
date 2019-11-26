package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cek */
public final class cek {
    private final List a = new ArrayList();

    public final synchronized void a(Class cls, Class cls2, ceh ceh) {
        this.a.add(new cej(cls, cls2, ceh));
    }

    public final synchronized ceh a(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return cem.a;
        }
        for (cej cej : this.a) {
            if (cej.a(cls, cls2)) {
                return cej.a;
            }
        }
        String valueOf = String.valueOf(cls);
        String valueOf2 = String.valueOf(cls2);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 47) + valueOf2.length());
        stringBuilder.append("No transcoder registered to transcode from ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" to ");
        stringBuilder.append(valueOf2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (cej a : this.a) {
            if (a.a(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
