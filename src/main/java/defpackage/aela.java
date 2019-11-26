package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.LinkedHashSet;
import java.util.Map;

/* renamed from: aela */
public final class aela implements ovx {
    private final ovx a;
    private final xsc b = new xvf();
    private final long c = 600000;
    private Uri d;
    private Uri e;
    private long f;

    public aela(ovx ovx) {
        this.a = (ovx) amqw.a((Object) ovx);
    }

    public final void a(owt owt) {
        this.a.a(owt);
    }

    public final long a(ovm ovm) {
        ovm a;
        long b = this.b.b();
        if (this.e != null && b - this.f > this.c) {
            e();
        }
        if (!aeky.a(ovm.a, this.d)) {
            e();
        }
        if (this.e != null) {
            Uri uri = ovm.a;
            amqw.a(this.d);
            amqw.a(this.e);
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(uri.getQueryParameterNames());
            linkedHashSet.addAll(this.d.getQueryParameterNames());
            xvo a2 = xvo.a(this.e);
            for (String str : linkedHashSet) {
                if (!TextUtils.equals(uri.getQueryParameter(str), this.d.getQueryParameter(str))) {
                    String queryParameter = uri.getQueryParameter(str);
                    if (queryParameter == null) {
                        a2.a(str);
                    } else {
                        a2.a(str, queryParameter);
                    }
                }
            }
            a = ovm.a(a2.a());
        } else {
            a = ovm;
        }
        try {
            long a3 = this.a.a(a);
            Uri b2 = this.a.b();
            if (!aeky.a(a.a, b2)) {
                this.d = ovm.a;
                this.e = b2;
                this.f = this.b.b();
            }
            return a3;
        } catch (owb e) {
            e();
            throw e;
        }
    }

    public final void a() {
        try {
            this.a.a();
        } catch (owb e) {
            e();
            throw e;
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        try {
            return this.a.a(bArr, i, i2);
        } catch (owb e) {
            e();
            throw e;
        }
    }

    private final void e() {
        this.d = null;
        this.e = null;
        this.f = 0;
    }

    public final Uri b() {
        return this.a.b();
    }

    public final void a(String str, String str2) {
        this.a.a(str, str2);
    }

    public final void d() {
        this.a.d();
    }

    public final Map c() {
        return this.a.c();
    }
}
