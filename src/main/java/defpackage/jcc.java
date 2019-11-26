package defpackage;

import android.content.Context;
import android.widget.Toast;

/* renamed from: jcc */
final /* synthetic */ class jcc implements Runnable {
    private final Context a;
    private final String b;
    private final boolean c;

    jcc(Context context, String str, boolean z) {
        this.a = context;
        this.b = str;
        this.c = z;
    }

    public final void run() {
        Toast.makeText(this.a, this.b, this.c).show();
    }
}
