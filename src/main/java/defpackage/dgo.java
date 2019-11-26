package defpackage;

import android.content.Intent;
import android.net.Uri;

/* renamed from: dgo */
public final class dgo {
    static {
        Uri.parse("http://plus.google.com/").buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static Intent a() {
        return new Intent("android.settings.DATE_SETTINGS");
    }

    public static Intent a(String str) {
        Uri fromParts = Uri.fromParts("package", str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    public static Intent b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details").buildUpon().appendQueryParameter("id", str).build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }
}
