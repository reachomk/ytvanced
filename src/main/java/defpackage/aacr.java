package defpackage;

import android.content.Context;

/* renamed from: aacr */
public final class aacr implements swm {
    public final aadw a;
    private final bcaa b;

    public aacr(aadw aadw, Context context, bcaa bcaa) {
        this.a = (aadw) amqw.a((Object) aadw);
        amqw.a((Object) context);
        this.b = (bcaa) amqw.a((Object) bcaa);
    }

    public final void a(String str, byte[] bArr) {
        swl.a(this, str, bArr);
    }

    public final void a(String str, byte[] bArr, boolean z) {
        this.a.b(str).a(new aacq(this, z, bArr, str), new aact(this, str, bArr, z), new aacs(this, str, bArr, z)).a();
    }

    public final bbme b(String str, byte[] bArr, boolean z) {
        return aacr.a(z, this.a.b().a(((aaeq) this.b.get()).a(str, bArr))).d();
    }

    public static bblt a(boolean z, aaea aaea) {
        if (z) {
            return aaea.a();
        }
        return aaea.b();
    }

    public final void a(String str) {
        this.a.b().a(str).a();
    }

    public final bbmi b(String str) {
        return this.a.e(str).c(aacv.a);
    }
}
