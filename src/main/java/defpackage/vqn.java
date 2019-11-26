package defpackage;

import android.net.Uri;

/* renamed from: vqn */
public final class vqn implements aftl {
    private final wal a;

    public vqn(wal wal) {
        this.a = wal;
    }

    public final String a(Uri uri, String str) {
        Integer num = (Integer) vqq.a.get(str);
        if (num == null || num.intValue() != 61) {
            return null;
        }
        return this.a.a(uri != null ? uri.getQueryParameter("ai") : "");
    }

    public final String a() {
        return vqn.class.getSimpleName();
    }
}
