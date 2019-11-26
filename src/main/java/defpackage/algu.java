package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;

/* renamed from: algu */
final class algu extends AsyncTask {
    private final axif a;
    private final PackageManager b;
    private final ResolveInfo c;
    private final aloh d;
    private final /* synthetic */ algt e;

    public algu(algt algt, axif axif, PackageManager packageManager, ResolveInfo resolveInfo, aloh aloh) {
        this.e = algt;
        this.a = (axif) amqw.a((Object) axif);
        this.b = (PackageManager) amqw.a((Object) packageManager);
        this.c = (ResolveInfo) amqw.a((Object) resolveInfo);
        this.d = (aloh) amqw.a((Object) aloh);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        zz zzVar = (zz) obj;
        this.e.a.put(this.a, zzVar);
        this.d.a(this.a, (CharSequence) zzVar.a, (Drawable) zzVar.b);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return new zz(this.c.loadLabel(this.b), this.c.loadIcon(this.b));
    }
}
