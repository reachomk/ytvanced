package defpackage;

/* renamed from: bbmf */
public final class bbmf {
    public static final bbmf b = new bbmf(null);
    public final Object a;

    private bbmf(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bbmf)) {
            return false;
        }
        return bbow.a(this.a, ((bbmf) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        String str = "]";
        if (bbyy.c(obj)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("OnErrorNotification[");
            stringBuilder.append(bbyy.e(obj));
            stringBuilder.append(str);
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("OnNextNotification[");
        stringBuilder2.append(this.a);
        stringBuilder2.append(str);
        return stringBuilder2.toString();
    }

    public static bbmf a(Object obj) {
        bbow.a(obj, "value is null");
        return new bbmf(obj);
    }

    public static bbmf a(Throwable th) {
        bbow.a((Object) th, "error is null");
        return new bbmf(bbyy.a(th));
    }
}
