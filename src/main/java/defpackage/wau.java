package defpackage;

import java.io.Serializable;

/* renamed from: wau */
public final class wau implements Serializable, Comparable {
    public final long a;
    public final apxu b;

    public wau(apxu apxu, long j) {
        this.b = apxu;
        this.a = j;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return Long.valueOf(this.a).compareTo(Long.valueOf(((wau) obj).a));
    }
}
