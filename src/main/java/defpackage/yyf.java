package defpackage;

import android.text.TextUtils;

/* renamed from: yyf */
public final class yyf extends ahd {
    private final /* synthetic */ amul a;
    private final /* synthetic */ yyc b;

    public yyf(yyc yyc, amul amul) {
        this.b = yyc;
        this.a = amul;
    }

    public final int a() {
        return this.b.a.a();
    }

    public final int b() {
        return this.a.size();
    }

    public final boolean a(int i, int i2) {
        return TextUtils.equals(this.b.a.f(i).a(), ((yya) this.a.get(i2)).a());
    }

    public final boolean b(int i, int i2) {
        return amqq.a(this.b.a.f(i), this.a.get(i2));
    }
}
