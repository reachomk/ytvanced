package defpackage;

import android.app.Notification;

/* renamed from: qm */
final class qm implements qq {
    private final String a;
    private final int b;
    private final String c;
    private final Notification d;

    qm(String str, int i, String str2, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = notification;
    }

    public final void a(pj pjVar) {
        pjVar.a(this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NotifyTask[");
        stringBuilder.append("packageName:");
        stringBuilder.append(this.a);
        stringBuilder.append(", id:");
        stringBuilder.append(this.b);
        stringBuilder.append(", tag:");
        stringBuilder.append(this.c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
