package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;

/* renamed from: htf */
public final class htf {
    public final Context a;
    private final htc b;
    private final uud c;

    public htf(htc htc, Context context, uud uud) {
        this.b = htc;
        this.a = context;
        this.c = uud;
    }

    public final void a(String str, String str2) {
        rwf rwf = (rwf) this.b.get();
        if (psh.b(rwf.a, 12451000) != 0) {
            rym.a(new psx(new Status(16)));
        } else {
            rwf.a(new rwy(str, str2));
        }
    }

    public final String a() {
        String str = this.c.d().b;
        return TextUtils.isEmpty(str) ? "" : str;
    }
}
