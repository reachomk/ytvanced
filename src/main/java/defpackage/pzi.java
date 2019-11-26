package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: pzi */
public final class pzi {
    private final List a = new ArrayList();
    private final Object b;

    public final pzi a(String str, Object obj) {
        List list = this.a;
        str = (String) pzr.a((Object) str);
        String valueOf = String.valueOf(obj);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + valueOf.length());
        stringBuilder.append(str);
        stringBuilder.append("=");
        stringBuilder.append(valueOf);
        list.add(stringBuilder.toString());
        return this;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append(this.b.getClass().getSimpleName());
        stringBuilder.append('{');
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append((String) this.a.get(i));
            if (i < size - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* synthetic */ pzi(Object obj) {
        this.b = pzr.a(obj);
    }
}
