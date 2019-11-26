package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: lsw */
public final class lsw implements yar {
    public String a;
    private final aaas b;
    private final bqa c;
    private String d;
    private Map e;

    public lsw(aaas aaas, bqa bqa) {
        this.b = aaas;
        this.c = bqa;
    }

    public final void a(aafv aafv) {
        if (aafv != null) {
            List<apxu> list = aafv.d;
            if (list != null) {
                for (apxu apxu : list) {
                    anxr access$000 = anxl.checkIsLite(PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.prefetchSharePanelEndpoint);
                    apxu.a(access$000);
                    if (apxu.h.a(access$000.d)) {
                        Object obj;
                        access$000 = anxl.checkIsLite(PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.prefetchSharePanelEndpoint);
                        apxu.a(access$000);
                        Object b = apxu.h.b(access$000.d);
                        if (b == null) {
                            obj = access$000.b;
                        } else {
                            obj = access$000.a(b);
                        }
                        String str = ((PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint) obj).b;
                        if (!TextUtils.isEmpty(str)) {
                            if (!TextUtils.equals(this.a, str)) {
                                if (this.e == null) {
                                    this.e = Collections.singletonMap("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
                                }
                                a();
                                this.a = str;
                                this.b.a(apxu, this.e);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void a(String str, String str2) {
        if (TextUtils.equals(this.a, str)) {
            a();
            this.d = str2;
        }
    }

    public final void a(String str) {
        if (TextUtils.equals(this.a, str)) {
            this.a = null;
        }
    }

    public final void a() {
        if (!TextUtils.isEmpty(this.d)) {
            this.c.c(this.d);
            this.d = null;
        }
    }
}
