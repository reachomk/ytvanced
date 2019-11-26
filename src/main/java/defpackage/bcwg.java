package defpackage;

import java.io.Serializable;

/* renamed from: bcwg */
final class bcwg implements Serializable {
    public static final long serialVersionUID = 3;
    public final Throwable a;

    public bcwg(Throwable th) {
        this.a = th;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Notification=>Error:");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}
