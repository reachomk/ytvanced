package defpackage;

import java.util.concurrent.Callable;

/* renamed from: abok */
public final /* synthetic */ class abok implements Callable {
    private final abol a;
    private final String b;
    private final boolean c;
    private final int d;
    private final String e;
    private final boolean f;
    private final String g;
    private final long h;

    public abok(abol abol, String str, boolean z, int i, String str2, boolean z2, String str3, long j) {
        this.a = abol;
        this.b = str;
        this.c = z;
        this.d = i;
        this.e = str2;
        this.f = z2;
        this.g = str3;
        this.h = j;
    }

    public final Object call() {
        return this.a.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
