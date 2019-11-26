package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: pmf */
final class pmf extends BasePendingResult {
    pmf() {
        super(null);
    }

    protected static pma b(Status status) {
        return new pmq(status);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ ptn a(Status status) {
        return pmf.b(status);
    }
}
