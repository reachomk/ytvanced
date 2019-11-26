package defpackage;

import android.os.AsyncTask;
import android.util.Log;

/* renamed from: shl */
final class shl extends AsyncTask {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ shi c;

    shl(shi shi, String str, String str2) {
        this.c = shi;
        this.a = str;
        this.b = str2;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        try {
            Object obj;
            sga.b.a().a(this.a, this.b);
            ap apVar = this.c.a;
            if (isCancelled()) {
                obj = shk.CANCELED;
            } else {
                obj = shk.SUCCESS;
            }
            apVar.b(obj);
        } catch (IllegalArgumentException e) {
            Log.e("ConsentViewModel", "Failed to get and/or set cookie", e);
            this.c.a.b(shk.FAILED);
        }
        return null;
    }
}
