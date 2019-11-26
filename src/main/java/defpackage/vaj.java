package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.widget.Button;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: vaj */
public final class vaj {
    public final Context a;
    public final aqhy b;
    public final aaas c;
    public final van d;
    public AlertDialog e;
    public ContentLoadingProgressBar f;
    public YouTubeTextView g;
    public Button h;
    public Button i;
    private final Object j;

    public vaj(Context context, aqhy aqhy, aaas aaas, van van, Object obj) {
        amqw.a((Object) context);
        this.a = new ahw(context, (int) R.style.VerificationDialogStyle);
        this.b = (aqhy) amqw.a((Object) aqhy);
        this.c = aaas;
        this.d = van;
        this.j = obj;
    }

    public final void a() {
        amqw.a(this.e, (Object) "showDialog() must be called before dismissDialog().");
        this.e.dismiss();
    }

    public final void a(aphg aphg) {
        if (aphg != null) {
            int i = aphg.a;
            aaas aaas;
            apxu apxu;
            if ((i & 4096) != 0) {
                aaas = this.c;
                apxu = aphg.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, b());
            } else if ((i & 2048) != 0) {
                aaas = this.c;
                apxu = aphg.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, b());
            }
        }
    }

    private final Map b() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.j);
        hashMap.put(acwi.b, Boolean.TRUE);
        return hashMap;
    }
}
