package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Locale;

/* renamed from: guy */
final class guy implements OnClickListener {
    private final /* synthetic */ guz a;

    guy(guz guz) {
        this.a = guz;
    }

    public final void onClick(View view) {
        String str = "android.intent.action.VIEW";
        this.a.a.startActivity(new Intent(str, Uri.parse(String.format("%s?hl=%s", new Object[]{"https://support.google.com/accounts/answer/3118687", Locale.getDefault().getLanguage()}))));
    }
}
