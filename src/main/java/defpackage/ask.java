package defpackage;

import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;

/* renamed from: ask */
public final class ask {
    public static void a(View view, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        if (asn.b != null && asn.b.a == view) {
            asn.a(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (asn.c != null && asn.c.a == view) {
                asn.c.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        asn asn = new asn(view, charSequence);
    }
}
