package defpackage;

/* renamed from: hnp */
final class hnp implements hns {
    private final Class a;
    private final Class b;

    hnp(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final Class annotationType() {
        return hns.class;
    }

    public final Class a() {
        return this.a;
    }

    public final Class b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("@com.google.android.apps.youtube.app.offline.renderergenerator.OfflineModelToRendererGeneratorKey(");
        stringBuilder.append("offlineModelType=");
        stringBuilder.append(this.a);
        stringBuilder.append(", rendererType=");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hns) {
            hns hns = (hns) obj;
            return this.a.equals(hns.a()) && this.b.equals(hns.b());
        }
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ 1192979616) + (this.b.hashCode() ^ 399516643);
    }
}
