package defpackage;

/* renamed from: afey */
final class afey extends affk {
    private final long a;
    private final afne b;
    private final int c;
    private final afkn d;
    private final String e;
    private final int f;

    public final long a() {
        return this.a;
    }

    public final afne b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final afkn d() {
        return this.d;
    }

    public final String e() {
        return this.e;
    }

    public final String toString() {
        String str;
        switch (this.f) {
            case 1:
                str = "ATTACH_MEDIA_VIEW";
                break;
            case 2:
                str = "DETACH_MEDIA_VIEW";
                break;
            case 3:
                str = "SET_LISTENER";
                break;
            case 4:
                str = "SET_NULL_LISTENER";
                break;
            case 5:
                str = "SET_MEDIA_VIEW_TYPE";
                break;
            case 6:
                str = "RESET_MEDIA_VIEW_TYPE";
                break;
            case 7:
                str = "SET_SURFACE";
                break;
            case 8:
                str = "SET_NULL_SURFACE";
                break;
            case 9:
                str = "SET_SURFACE_HOLDER";
                break;
            case 10:
                str = "LOAD_VIDEO";
                break;
            case 11:
                str = "STOP_VIDEO";
                break;
            case 12:
                str = "BLOCKING_STOP_VIDEO";
                break;
            case 13:
                str = "SURFACE_CREATED";
                break;
            case 14:
                str = "SURFACE_DESTROYED";
                break;
            case 15:
                str = "SURFACE_ERROR";
                break;
            case 16:
                str = "UNEXPECTED_NULL_MEDIA_VIEW_LISTENER";
                break;
            case 17:
                str = "NOT_ON_MAIN_THREAD";
                break;
            default:
                str = "null";
                break;
        }
        long j = this.a;
        String valueOf = String.valueOf(this.b);
        int i = this.c;
        String valueOf2 = String.valueOf(this.d);
        String str2 = this.e;
        int length = str.length();
        int length2 = valueOf.length();
        StringBuilder stringBuilder = new StringBuilder((((length + 128) + length2) + valueOf2.length()) + String.valueOf(str2).length());
        stringBuilder.append("Event{eventType=");
        stringBuilder.append(str);
        stringBuilder.append(", elapsedMillis=");
        stringBuilder.append(j);
        stringBuilder.append(", playerType=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", surfaceHashCode=");
        stringBuilder.append(i);
        stringBuilder.append(", mediaViewType=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", additionalInfo=");
        stringBuilder.append(str2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof affk)) {
            return false;
        }
        affk affk = (affk) obj;
        int i = this.f;
        int f = affk.f();
        if (i != 0) {
            if (i == f && this.a == affk.a() && this.b.equals(affk.b()) && this.c == affk.c() && this.d.equals(affk.d())) {
                String str = this.e;
                if (str == null ? affk.e() == null : str.equals(affk.e())) {
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.f;
        if (i != 0) {
            long j = this.a;
            i = (((((((((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003;
            String str = this.e;
            return i ^ (str != null ? str.hashCode() : 0);
        }
        throw null;
    }

    afey(int i, long j, afne afne, int i2, afkn afkn, String str) {
        if (i != 0) {
            this.f = i;
            this.a = j;
            if (afne != null) {
                this.b = afne;
                this.c = i2;
                if (afkn != null) {
                    this.d = afkn;
                    this.e = str;
                    return;
                }
                throw new NullPointerException("Null mediaViewType");
            }
            throw new NullPointerException("Null playerType");
        }
        throw new NullPointerException("Null eventType");
    }

    public final int f() {
        return this.f;
    }
}
