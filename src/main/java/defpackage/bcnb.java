package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;

/* renamed from: bcnb */
final class bcnb implements Runnable {
    private final /* synthetic */ bcmw a;

    bcnb(bcmw bcmw) {
        this.a = bcmw;
    }

    public final void run() {
        bcnx bcnx = this.a.r;
        if (bcnx != null) {
            try {
                bcnx.c();
            } catch (IOException e) {
                Log.e(bcmw.a, "Exception when closing OutputChannel", e);
            }
        }
        HttpURLConnection httpURLConnection = this.a.q;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.a.q = null;
        }
    }
}
