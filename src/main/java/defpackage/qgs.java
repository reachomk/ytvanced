package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;

/* renamed from: qgs */
final class qgs extends qgc {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ Bitmap h = null;
    private final /* synthetic */ WeakReference i;
    private final /* synthetic */ qfx j;

    qgs(qfx qfx, ptd ptd, Intent intent, WeakReference weakReference) {
        this.j = qfx;
        this.a = intent;
        this.i = weakReference;
        super(ptd);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(qgj qgj) {
        GoogleHelp googleHelp = (GoogleHelp) this.a.getParcelableExtra("EXTRA_GOOGLE_HELP");
        GoogleHelp googleHelp2 = new qha(googleHelp).a;
        qfu qfu = googleHelp2.i;
        qdu qdu = googleHelp2.j;
        qgn qgn = new qgn(googleHelp);
        qgv qgv = new qgv(this, qgj, this, qdu);
        GoogleHelp googleHelp3 = qgn.a;
        try {
            qgj qgj2 = qgv.a;
            qgs qgs = qgv.e;
            qgc qgc = qgv.b;
            qgj2.a(googleHelp3, null, new qgy(qgs.a, qgs.i, qgc, null, qgv.d));
        } catch (RemoteException e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
            qgv.e.c(qfx.a);
        }
    }
}
