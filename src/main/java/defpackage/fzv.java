package defpackage;

import java.util.Arrays;

/* renamed from: fzv */
public final class fzv {
    public static final fzv a = new fzv(false, 0, null);
    public static final fzv b = fzv.a(2, "Action not supported");
    public static final fzv c = fzv.a(4, "Required premium account to perform action in background");
    public final boolean d;
    public final int e;
    public final String f;

    public static fzv a(int i, String str) {
        return new fzv(true, i, str);
    }

    private fzv(boolean z, int i, String str) {
        this.d = z;
        this.e = i;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fzv fzv = (fzv) obj;
            return this.d == fzv.d && this.e == fzv.e && amqq.a(this.f, fzv.f);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.d), Integer.valueOf(this.e), this.f});
    }

    public final String toString() {
        if (!this.d) {
            return "MediaSessionResult Successful";
        }
        int i = this.e;
        String str = this.f;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 40);
        stringBuilder.append("MediaSessionResult Error: ");
        stringBuilder.append(i);
        stringBuilder.append(" : ");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }
}
