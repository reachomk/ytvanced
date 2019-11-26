package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.google.android.youtube.R;

/* renamed from: bahf */
final class bahf implements OnClickListener {
    private final /* synthetic */ Context a;

    bahf(Context context) {
        this.a = context;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://google.com/cardboard/cfg")));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this.a, R.string.no_browser_text, 1).show();
        }
    }
}
