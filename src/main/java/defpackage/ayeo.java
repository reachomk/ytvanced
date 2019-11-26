package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: ayeo */
public final class ayeo implements aadq {
    public static final aaeb a = new ayeq();
    public final ayes b;
    private final aadw c;

    public final aaeb getType() {
        return a;
    }

    public final byte[] c() {
        return this.b.toByteArray();
    }

    public final String a() {
        return this.b.b;
    }

    public final String getActiveThemeKey() {
        return this.b.c;
    }

    public final Map getThemeMapMap() {
        return Collections.unmodifiableMap(this.b.d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ayeo) {
            ayeo ayeo = (ayeo) obj;
            if (this.c == ayeo.c && this.b.equals(ayeo.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 21);
        stringBuilder.append("ThemeSetEntityModel{");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* synthetic */ ayeo(ayes ayes, aadw aadw) {
        this.b = ayes;
        this.c = aadw;
    }

    public final amuw d() {
        return amwp.a;
    }
}
