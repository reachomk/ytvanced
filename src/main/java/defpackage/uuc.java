package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.io.IOException;

/* renamed from: uuc */
public final class uuc extends utc {
    private final uzn b;
    private final tbg c;

    uuc(ute ute, Context context, tem tem, aott aott, tbg tbg, uzn uzn) {
        super(ute, context, tem, aott);
        this.c = (tbg) amqw.a((Object) tbg);
        this.b = (uzn) amqw.a((Object) uzn);
    }

    public final void a(Iterable iterable) {
    }

    public final afpz b(ust ust) {
        Bundle bundle;
        if (ust.e()) {
            bundle = new Bundle();
            bundle.putInt("delegation_type", 1);
            bundle.putString("delegatee_user_id", ust.a());
        } else {
            bundle = null;
        }
        return a(ust.b(), bundle);
    }

    /* Access modifiers changed, original: protected|final */
    public final String b(String str, Bundle bundle) {
        if (this.a) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("handle_notification", true);
        }
        if (bundle != null) {
            return this.c.a(str, this.b.d, bundle);
        }
        return this.c.a(str, this.b.d);
    }

    public final synchronized void c(ust ust) {
        afpz b = b(ust);
        if (b.a()) {
            a(b.c());
        }
    }

    private final synchronized void a(String str) {
        try {
            this.c.a(str);
        } catch (IOException e) {
            str = String.valueOf(e.toString());
            String str2 = "AuthTokenProvider: clearToken IOException:";
            xtl.c(str.length() == 0 ? new String(str2) : str2.concat(str));
        }
    }
}
