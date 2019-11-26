package defpackage;

import android.text.TextUtils;

/* renamed from: ambi */
final class ambi implements Comparable {
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final int e;

    public ambi(String str, String str2, long j, String str3, int i) {
        boolean z = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            z = false;
        }
        amqw.a(z);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = i;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return (this.c > ((ambi) obj).c ? 1 : (this.c == ((ambi) obj).c ? 0 : -1));
    }

    /* synthetic */ ambi(String str, String str2, long j, String str3) {
        this(str, str2, j, str3, 0);
    }
}
