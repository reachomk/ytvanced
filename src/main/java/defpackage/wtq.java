package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: wtq */
public final class wtq implements akot {
    private final aaas a;
    private final View b;
    private final YouTubeTextView c = ((YouTubeTextView) this.b.findViewById(R.id.alert_message_view));
    private final YouTubeTextView d = ((YouTubeTextView) this.b.findViewById(R.id.action_button));
    private final akyy e;
    private final YouTubeTextView f;
    private final akyy g;

    public wtq(Context context, aaas aaas, akzb akzb) {
        this.a = aaas;
        this.b = LayoutInflater.from(context).inflate(R.layout.sponsorships_alert_layout, null, false);
        this.e = akzb.a(this.d);
        this.f = (YouTubeTextView) this.b.findViewById(R.id.secondary_action_button);
        this.g = akzb.a(this.f);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        anze anze;
        axsh axsh = (axsh) obj;
        acvx acvx = akor.a;
        TextView textView = this.c;
        anze anze2 = null;
        if ((axsh.a & 1) != 0) {
            arml = axsh.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, aabb.a(arml, this.a, false));
        akyy akyy = this.e;
        if ((axsh.a & 2) != 0) {
            anze = axsh.c;
            if (anze == null) {
                anze = axak.a;
            }
        } else {
            anze = null;
        }
        akyy.a((aphg) ajzv.a((ajzw) ajzv.a(anze, ajzw.class), aphg.class), acvx);
        akyy = this.g;
        if ((axsh.a & 4) != 0) {
            anze2 = axsh.d;
            if (anze2 == null) {
                anze2 = axak.a;
            }
        }
        akyy.a((aphg) ajzv.a((ajzw) ajzv.a(anze2, ajzw.class), aphg.class), acvx);
    }
}
