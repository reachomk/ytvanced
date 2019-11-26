package defpackage;

import com.google.protos.youtube.api.innertube.UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint;
import java.util.Map;

/* renamed from: wrp */
public final class wrp extends wmi {
    public final wsa a;
    public final aaas b;
    private final wmh c;

    public wrp(wmh wmh, wsa wsa, aaas aaas) {
        super(wmh);
        this.c = wmh;
        this.a = wsa;
        this.b = aaas;
    }

    public final void a(apxu apxu, Map map) {
        this.c.a(new wro(this, apxu));
        super.a(apxu, map);
    }

    /* Access modifiers changed, original: protected|final */
    public final String a(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.unlimitedCreateFamilyEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        return ((UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint) b).b;
    }

    /* Access modifiers changed, original: protected|final */
    public final String b(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.unlimitedCreateFamilyEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint = (UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint) b;
        return !unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.g.isEmpty() ? unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.g : null;
    }
}
