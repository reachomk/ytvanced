package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: pwt */
public final class pwt implements ryc {
    public final /* synthetic */ Object a(ryi ryi) {
        if (((Boolean) ryi.d()).booleanValue()) {
            return null;
        }
        throw new psx(new Status(13, "listener already unregistered"));
    }
}
