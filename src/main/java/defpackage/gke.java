package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import com.google.android.youtube.R;

/* renamed from: gke */
public final class gke extends AsyncTask {
    public final CancellationSignal a = new CancellationSignal();
    private int b;
    private final gkf c;
    private final gkg d;

    public gke(gkf gkf, gkg gkg) {
        this.c = gkf;
        this.d = gkg;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onProgressUpdate(Object[] objArr) {
        this.d.a();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        Context context = ((Context[]) objArr)[0];
        for (babk babk : this.c.keySet()) {
            gki gki = (gki) this.c.get(babk);
            if (this.c.a(babk) == null && gki.c.a()) {
                yg ygVar = new yg("com.google.android.gms.fonts", "com.google.android.gms", (String) gki.c.b(), (int) R.array.com_google_android_gms_fonts_certs_yt);
                try {
                    String str = "Requesting font: ";
                    String valueOf = String.valueOf((String) gki.c.b());
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        str.concat(valueOf);
                    }
                    ym a = yj.a(context, this.a, ygVar);
                    if (isCancelled()) {
                        break;
                    } else if (a == null) {
                        xtl.c("fetchFonts returned null");
                    } else {
                        yp[] ypVarArr = a.b;
                        if (ypVarArr == null || ypVarArr.length == 0) {
                            xtl.c("fetchFonts failed (empty result)");
                        } else {
                            int i = ypVarArr[0].e;
                            if (i == 0) {
                                Typeface a2 = yj.a(context, this.a, ypVarArr);
                                if (isCancelled()) {
                                    break;
                                } else if (a2 != null) {
                                    this.c.a(babk, a2);
                                    int i2 = this.b + 1;
                                    this.b = i2;
                                    if (i2 == 1) {
                                        publishProgress(new Void[0]);
                                    }
                                } else {
                                    xtl.c("Failed to create Typeface.");
                                }
                            } else {
                                StringBuilder stringBuilder = new StringBuilder(42);
                                stringBuilder.append("fetchFonts result is not OK. (");
                                stringBuilder.append(i);
                                stringBuilder.append(")");
                                xtl.c(stringBuilder.toString());
                            }
                        }
                    }
                } catch (NameNotFoundException unused) {
                }
            }
        }
        return null;
    }
}
