package defpackage;

import android.os.Bundle;
import com.google.android.libraries.youtube.common.gcore.gcoreclient.gcm.impl.GcmTaskServiceDelegator;

/* renamed from: xec */
public class xec implements xdu {
    public final qfg a = new qfg();

    xec() {
    }

    /* renamed from: b */
    public xec a(Bundle bundle) {
        throw new UnsupportedOperationException("Not implemented, upgrade GMS version to Reblochon.");
    }

    public final xdu b(boolean z) {
        this.a.g = z;
        return this;
    }

    public xdu a(int i) {
        throw new UnsupportedOperationException("Not implemented, upgrade GMS version to Queso.");
    }

    public xdu c(boolean z) {
        throw new UnsupportedOperationException("Not implemented, upgrade GMS version to Queso.");
    }

    /* renamed from: b */
    public xec a(xdw xdw) {
        throw new UnsupportedOperationException("Not implemented, upgrade GMS version to Saga.");
    }

    public final /* bridge */ /* synthetic */ xdu a(long j, long j2) {
        qfg qfg = this.a;
        qfg.a = j;
        qfg.b = j2;
        return this;
    }

    public final /* synthetic */ xdy a() {
        this.a.d = GcmTaskServiceDelegator.class.getName();
        return new xed(this.a.a());
    }
}
