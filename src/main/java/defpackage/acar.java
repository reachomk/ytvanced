package defpackage;

import android.text.Spanned;
import android.text.SpannedString;

/* renamed from: acar */
public final class acar implements acaz {
    public int a;
    public Spanned b;
    public Runnable c;
    private final int d;

    private acar(int i, Spanned spanned, Runnable runnable) {
        this.d = i;
        this.a = -1;
        this.b = spanned;
        this.c = runnable;
    }

    public final String toString() {
        int i = this.d;
        int i2 = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 56);
        stringBuilder.append("[HealthStatus: id=");
        stringBuilder.append(i);
        stringBuilder.append(", state=");
        stringBuilder.append(i2);
        stringBuilder.append(", text=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /* synthetic */ acar(String str) {
        this(-1, str != null ? new SpannedString(str) : null, null);
    }

    /* synthetic */ acar(int i, Runnable runnable) {
        this(i, null, runnable);
    }
}
