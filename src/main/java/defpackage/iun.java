package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: iun */
public final class iun extends iss {
    private final View b;
    private final YouTubeTextView c = ((YouTubeTextView) this.b.findViewById(R.id.showing_results_for));
    private final YouTubeTextView d = ((YouTubeTextView) this.b.findViewById(R.id.search_instead_for));
    private final akou e;

    public iun(Context context, flu flu, aaas aaas) {
        super(context, aaas);
        this.e = (akou) amqw.a((Object) flu);
        this.b = View.inflate(context, R.layout.showing_results_for_item, null);
        flu.a(this.b);
    }

    public final View K_() {
        return this.e.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        arml arml2;
        aqqf aqqf = (aqqf) obj;
        arml arml3 = null;
        akor.a.a(aqqf.h.d(), null);
        YouTubeTextView youTubeTextView = this.c;
        if ((aqqf.a & 1) != 0) {
            arml = aqqf.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a = ajqy.a(arml);
        if ((aqqf.a & 2) != 0) {
            arml2 = aqqf.c;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        Spanned a2 = ajqy.a(arml2);
        apxu apxu = aqqf.d;
        if (apxu == null) {
            apxu = apxu.d;
        }
        youTubeTextView.setText(a(a, a2, apxu, akor.a.d()));
        youTubeTextView = this.d;
        if ((aqqf.a & 8) != 0) {
            arml = aqqf.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        a = ajqy.a(arml);
        if ((aqqf.a & 16) != 0) {
            arml3 = aqqf.f;
            if (arml3 == null) {
                arml3 = arml.f;
            }
        }
        Spanned a3 = ajqy.a(arml3);
        apxu apxu2 = aqqf.g;
        if (apxu2 == null) {
            apxu2 = apxu.d;
        }
        youTubeTextView.setText(a(a, a3, apxu2, akor.a.d()));
        this.e.a(akor);
    }
}
