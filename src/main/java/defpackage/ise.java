package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;

/* renamed from: ise */
public abstract class ise {
    public abstract boolean a();

    public abstract String b();

    public abstract abhw c();

    public abstract apxu d();

    public abstract atgy e();

    public abstract atgl f();

    public static ish g() {
        return new iqa();
    }

    public final abib h() {
        abib a = c().a();
        if (!TextUtils.isEmpty(b())) {
            a.c(b());
        }
        if (d() != null) {
            apxu d = d();
            anxr access$000 = anxl.checkIsLite(SearchEndpointOuterClass.searchEndpoint);
            d.a(access$000);
            if (d.h.a(access$000.d)) {
                d = d();
                access$000 = anxl.checkIsLite(SearchEndpointOuterClass.searchEndpoint);
                d.a(access$000);
                Object b = d.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                axcv axcv = (axcv) b;
                if (TextUtils.isEmpty(b())) {
                    a.c(axcv.b);
                }
                if (!axcv.c.isEmpty()) {
                    a.b = aali.b(axcv.c);
                }
                if (!axcv.e.isEmpty()) {
                    a.c = aali.b(axcv.e);
                }
            }
        }
        if (f() != null) {
            a.e = f();
        }
        if (e() != null) {
            a.d = e();
        }
        a.a(foe.a(d()));
        a.i = a();
        return a;
    }
}
