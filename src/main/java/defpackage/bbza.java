package defpackage;

import java.io.Serializable;

/* renamed from: bbza */
public final class bbza implements Serializable {
    public static final long serialVersionUID = -8759979445933046293L;
    public final Throwable a;

    bbza(Throwable th) {
        this.a = th;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NotificationLite.Error[");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bbza)) {
            return false;
        }
        return bbow.a(this.a, ((bbza) obj).a);
    }
}
