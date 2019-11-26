package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.style.URLSpan;
import android.view.View;

/* renamed from: ajqz */
final class ajqz extends URLSpan {
    public ajqz(String str) {
        super(str);
    }

    public final void onClick(View view) {
        Context context = view.getContext();
        context.startActivity(ajqy.a(context, new Intent("android.intent.action.VIEW", Uri.parse(getURL()))));
    }
}
