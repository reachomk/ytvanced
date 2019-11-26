package defpackage;

import android.content.Intent;

/* renamed from: hld */
public final class hld {
    public final fpt a;

    public hld(fpt fpt) {
        this.a = fpt;
    }

    public final Intent a() {
        return this.a.a().addFlags(67108864).putExtra("pane", hrt.f());
    }

    public final Intent a(String str) {
        return this.a.a().addFlags(67108864).putExtra("pane", hki.a(str, false, null));
    }
}
