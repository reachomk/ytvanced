package defpackage;

import android.content.Context;

/* renamed from: pby */
public class pby {
    public pbp a;

    protected pby() {
    }

    public final String a(Context context, byte[] bArr) {
        return this.a.a(qct.a((Object) context), bArr);
    }

    public final void a(pcy pcy) {
        if (pcy == null) {
            throw new IllegalArgumentException("advertisingIdInfo must not be null");
        } else if (!this.a.a(pcy.a, pcy.b)) {
            throw new pbx();
        }
    }
}
