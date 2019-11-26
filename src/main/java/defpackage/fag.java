package defpackage;

import android.view.View;

/* renamed from: fag */
public final class fag implements ezz {
    public final amuw a;
    public final faa b;
    private final CharSequence c;
    private final View d;
    private final boolean e;
    private final boolean f;
    private final Object g;
    private final boolean h;

    public final CharSequence a() {
        return this.c;
    }

    public final View b() {
        return this.d;
    }

    public final faa h() {
        return this.b;
    }

    public final amuw c() {
        return this.a;
    }

    public final boolean d() {
        return this.e;
    }

    public final boolean e() {
        return this.f;
    }

    public final Object f() {
        return this.g;
    }

    public final boolean g() {
        return this.h;
    }

    public final faf i() {
        faf faf = new faf();
        faf.a = this.c;
        faf.b = this.d;
        faf.c = this.b;
        faf.a(this.a);
        faf.d = this.e;
        faf.e = this.f;
        return faf;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.e;
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 31) + valueOf2.length());
        stringBuilder.append("title ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" style ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(" translucent ");
        stringBuilder.append(z);
        return stringBuilder.toString();
    }

    /* synthetic */ fag(CharSequence charSequence, View view, amuw amuw, boolean z, boolean z2, Object obj, boolean z3, faa faa) {
        this.c = charSequence;
        this.d = view;
        this.a = (amuw) amqw.a((Object) amuw);
        this.e = z;
        this.f = z2;
        this.b = faa;
        this.g = obj;
        this.h = z3;
    }
}
