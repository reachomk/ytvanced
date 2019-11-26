package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: aiuq */
public final class aiuq implements aiuy {
    public final aivb a;
    public AlertDialog b;
    private final Activity c;
    private final Context d;

    public aiuq(Activity activity, aivb aivb) {
        this.c = activity;
        this.d = activity;
        this.a = aivb;
    }

    public final void a(String str, String str2, aiva aiva, awdy awdy) {
        aiut aiut = new aiut(this, aiva, awdy);
        this.b = new Builder(this.d).setTitle(str).setMessage(str2).setPositiveButton(R.string.confirm, aiut).setNegativeButton(R.string.cancel, aiut).setOnCancelListener(aiut).show();
    }

    public final Activity a() {
        return this.c;
    }

    public final void b() {
        this.b = null;
    }
}
