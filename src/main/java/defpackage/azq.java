package defpackage;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: azq */
final class azq implements OnClickListener {
    private final /* synthetic */ azl a;

    azq(azl azl) {
        this.a = azl;
    }

    public final void onClick(View view) {
        wd wdVar = this.a.A;
        if (wdVar != null) {
            PendingIntent d = wdVar.a.d();
            if (d != null) {
                try {
                    d.send();
                    this.a.dismiss();
                } catch (CanceledException unused) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(d);
                    stringBuilder.append(" was not sent, it had been canceled.");
                    Log.e("MediaRouteCtrlDialog", stringBuilder.toString());
                }
            }
        }
    }
}
