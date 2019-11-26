package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: wul */
public final class wul implements akot {
    public final ViewGroup a;
    private final Context b;
    private final aaas c;
    private final akkq d;
    private final YouTubeTextView e;
    private final ViewGroup f;
    private final ArrayList g = new ArrayList();
    private int h = -1;

    public wul(Context context, aaas aaas, akkq akkq) {
        this.b = context;
        this.c = aaas;
        this.d = akkq;
        this.a = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.sponsorships_loyalty_badges_layout, null, false);
        this.e = (YouTubeTextView) this.a.findViewById(R.id.description);
        this.f = (ViewGroup) this.a.findViewById(R.id.badges);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    public final void a(axsz axsz) {
        arml arml;
        TextView textView = this.e;
        if ((axsz.a & 1) != 0) {
            arml = axsz.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, aabb.a(arml, this.c, false));
        this.h = axsz.d;
        for (axak axak : axsz.c) {
            wui wui = new wui(this.b, this.c, this.d);
            wui.a((axsx) ajzv.a(ajzv.a(axak), axsx.class));
            this.f.addView(wui.a);
            this.g.add(wui);
        }
    }

    public final void a(boolean z) {
        int i = 0;
        while (i < this.g.size()) {
            wui wui = (wui) this.g.get(i);
            int i2 = 4;
            int i3;
            if (z) {
                i3 = this.h;
                if (i3 != -1) {
                    wui.a(i3 == i ? 1 : 2);
                } else {
                    wui.a(4);
                }
            } else {
                i3 = this.h;
                if (i3 == -1) {
                    i3 = 0;
                }
                if (i != i3) {
                    i2 = 3;
                }
                wui.a(i2);
            }
            i++;
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        a((axsz) obj);
    }
}
