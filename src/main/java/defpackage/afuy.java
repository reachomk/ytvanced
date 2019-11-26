package defpackage;

import android.content.Intent;

/* renamed from: afuy */
public final class afuy extends afuz {
    private final Intent a;
    private final Intent b;
    private final bcaa c = null;
    private final int d;
    private final int e;
    private final int f;
    private final String g;
    private final afvb h;

    public final Intent a() {
        return this.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final bcaa c() {
        return null;
    }

    public final Intent b() {
        return this.b;
    }

    public final int d() {
        return this.d;
    }

    public final int e() {
        return this.e;
    }

    public final int f() {
        return this.f;
    }

    public final String g() {
        return this.g;
    }

    public final afvb h() {
        return this.h;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        String str = this.g;
        String valueOf3 = String.valueOf(this.h);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        String str2 = "null";
        int length3 = str2.length();
        StringBuilder stringBuilder = new StringBuilder(((((length + 217) + length2) + length3) + String.valueOf(str).length()) + valueOf3.length());
        stringBuilder.append("NotificationModuleConfig{serviceIntent=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", mainActivityIntent=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", innerTubeIconResolverProvider=");
        stringBuilder.append(str2);
        stringBuilder.append(", smallIcon=");
        stringBuilder.append(i);
        stringBuilder.append(", largeIcon=");
        stringBuilder.append(i2);
        stringBuilder.append(", appLabel=");
        stringBuilder.append(i3);
        stringBuilder.append(", apiaryProjectId=");
        stringBuilder.append(str);
        stringBuilder.append(", notificationPlaybackServiceProvider=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afuz) {
            afuz afuz = (afuz) obj;
            Intent intent = this.a;
            if (intent == null ? afuz.a() != null : !intent.equals(afuz.a())) {
                intent = this.b;
                if (intent == null ? afuz.b() != null : !intent.equals(afuz.b())) {
                    if (afuz.c() == null && this.d == afuz.d() && this.e == afuz.e() && this.f == afuz.f()) {
                        String str = this.g;
                        if (str == null ? afuz.g() != null : !str.equals(afuz.g())) {
                            afvb afvb = this.h;
                            if (afvb == null ? afuz.h() == null : afvb.equals(afuz.h())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.a;
        int i = 0;
        int hashCode = ((intent != null ? intent.hashCode() : 0) ^ 1000003) * 1000003;
        Intent intent2 = this.b;
        hashCode = (((((((hashCode ^ (intent2 != null ? intent2.hashCode() : 0)) * -721379959) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003;
        String str = this.g;
        hashCode = (hashCode ^ (str != null ? str.hashCode() : 0)) * 1000003;
        afvb afvb = this.h;
        if (afvb != null) {
            i = afvb.hashCode();
        }
        return hashCode ^ i;
    }

    public /* synthetic */ afuy(Intent intent, Intent intent2, int i, int i2, int i3, String str, afvb afvb) {
        this.a = intent;
        this.b = intent2;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str;
        this.h = afvb;
    }
}
