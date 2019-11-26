package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;

/* renamed from: nef */
final class nef implements msk {
    private final /* synthetic */ ndt a;

    public final void a() {
        if (!TextUtils.isEmpty(this.a.F) && mrp.a(this.a.C)) {
            try {
                this.a.c.d(acwc.PLAYER_YOU_TUBE_BUTTON.dU);
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
            ndt ndt = this.a;
            Context context = ndt.C;
            context.startActivity(mrp.a(context, ndt.F));
        }
    }

    /* synthetic */ nef(ndt ndt) {
        this.a = ndt;
    }
}
