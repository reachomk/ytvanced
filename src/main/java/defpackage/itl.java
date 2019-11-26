package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: itl */
public final class itl extends iss {
    private final YouTubeTextView b;
    private final akou c;

    public itl(Context context, flu flu, aaas aaas) {
        super(context, aaas);
        this.c = (akou) amqw.a((Object) flu);
        this.b = (YouTubeTextView) View.inflate(context, R.layout.did_you_mean_item, null);
        flu.a(this.b);
    }

    public final View K_() {
        return this.c.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        aqpv aqpv = (aqpv) obj;
        arml arml2 = null;
        akor.a.a(aqpv.e.d(), null);
        YouTubeTextView youTubeTextView = this.b;
        if ((aqpv.a & 1) != 0) {
            arml = aqpv.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a = ajqy.a(arml);
        if ((aqpv.a & 2) != 0) {
            arml2 = aqpv.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        Spanned a2 = ajqy.a(arml2);
        apxu apxu = aqpv.d;
        if (apxu == null) {
            apxu = apxu.d;
        }
        youTubeTextView.setText(a(a, a2, apxu, akor.a.d()));
        this.c.a(akor);
    }
}
