package defpackage;

import com.google.protos.youtube.api.innertube.UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint;
import java.util.Map;

/* renamed from: wrq */
public final class wrq extends wml implements wmj {
    public wrq(wmh wmh) {
        super(wmh);
        wmh.a((wmj) this);
    }

    public final void a(boolean z) {
    }

    public final boolean e() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final String b(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.unlimitedManageFamilyEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint = (UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint) b;
        if (!unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.b.isEmpty()) {
            return unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.b;
        }
        return (String) xsb.a(map, (Object) "accountName", String.class);
    }
}
