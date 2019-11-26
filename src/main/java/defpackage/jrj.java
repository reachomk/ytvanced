package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: jrj */
final class jrj implements OnClickListener {
    private final /* synthetic */ jrk a;

    public final void onClick(View view) {
        jrk jrk = this.a;
        aagw aagw = jrk.e;
        if (aagw != null) {
            aaha aaha = jrk.f;
            if (aaha != null) {
                waw waw = jrk.b;
                xak.a();
                if (waw.i != null) {
                    waw.i.a(aagw, aaha);
                }
                aaha aaha2 = jrk.f;
                int i = aaha2.a;
                if (i == 19) {
                    if (!jrk.c.a(jrk.e)) {
                        jrk.c.a(jrk.e, aoqh.ANDROID_ADS_DEBOUNCE_ENDPOINT_TYPE_APP_INSTALL);
                        Uri uri = jrk.f.b;
                        wxk.a(jrk.a, jrk.e.d.h, uri != null ? uri.getQueryParameter("referrer") : "", null, null, true, jrk.d.j(), jrk.d.h(), null, null);
                    }
                } else if (i == 4) {
                    jrk.a.startActivity(new Intent("android.intent.action.VIEW", aaha2.b));
                }
            }
        }
    }

    /* synthetic */ jrj(jrk jrk) {
        this.a = jrk;
    }
}
