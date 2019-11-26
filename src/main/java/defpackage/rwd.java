package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: rwd */
public final class rwd {
    @Deprecated
    public static final pso a = new pso("Phenotype.API", d, c);
    @Deprecated
    public static final rwc b = new rwk();
    private static final psv c = new psv();
    private static final psq d = new rxt();

    public static rwf a(Context context) {
        return new rwf(context);
    }

    public static Uri a(String str) {
        str = String.valueOf(Uri.encode(str));
        String str2 = "content://com.google.android.gms.phenotype/";
        return Uri.parse(str.length() == 0 ? new String(str2) : str2.concat(str));
    }
}
