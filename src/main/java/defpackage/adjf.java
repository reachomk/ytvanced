package defpackage;

import java.io.Serializable;

/* renamed from: adjf */
public class adjf implements Serializable {
    public final String a;

    public adjf(String str) {
        amqw.a((Object) str);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adjf)) {
            return false;
        }
        return this.a.equals(((adjf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
