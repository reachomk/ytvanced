package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: wtx */
public final class wtx implements akot {
    public final View a;
    public final ViewGroup b;
    private final YouTubeTextView c = ((YouTubeTextView) this.a.findViewById(R.id.primary_button));
    private final akyy d;
    private final YouTubeTextView e;
    private final akyy f;
    private final Context g;
    private final aaas h;
    private final akkq i;
    private final wuf j;

    public wtx(Context context, wub wub, akzb akzb, aaas aaas, akkq akkq) {
        this.g = context;
        this.h = aaas;
        this.i = akkq;
        this.j = new wuf(context, akkq, R.layout.sponsorships_header_layout_celebration);
        this.a = LayoutInflater.from(context).inflate(R.layout.sponsorships_celebration_layout, null, false);
        this.d = akzb.a(this.c);
        this.e = (YouTubeTextView) this.a.findViewById(R.id.secondary_button);
        this.f = akzb.a(this.e);
        this.b = (ViewGroup) this.a.findViewById(R.id.content);
        this.d.c = new wtw(wub);
        this.f.c = new wtz(wub);
        ((ViewGroup) this.a.findViewById(R.id.header_view)).addView(this.j.a);
    }

    public final View K_() {
        return this.a;
    }

    /* renamed from: a */
    public final void a_(akor akor, axsl axsl) {
        anze anze;
        acvx acvx = akor.a;
        akyy akyy = this.d;
        if ((axsl.a & 2) != 0) {
            anze = axsl.c;
            if (anze == null) {
                anze = axak.a;
            }
        } else {
            anze = null;
        }
        akyy.a((aphg) ajzv.a((ajzw) ajzv.a(anze, ajzw.class), aphg.class), acvx);
        akyy = this.f;
        if ((axsl.a & 4) != 0) {
            anze = axsl.d;
            if (anze == null) {
                anze = axak.a;
            }
        } else {
            anze = null;
        }
        akyy.a((aphg) ajzv.a((ajzw) ajzv.a(anze, ajzw.class), aphg.class), acvx);
        wuf wuf = this.j;
        boolean z = true;
        if ((axsl.a & 1) != 0) {
            anze = axsl.b;
            if (anze == null) {
                anze = axak.a;
            }
        } else {
            anze = null;
        }
        wuf.a((axsp) ajzv.a((ajzw) ajzv.a(anze, ajzw.class), axsp.class));
        for (axak a : axsl.e) {
            ajzw a2 = ajzv.a(a);
            if (ajzv.b(a2, axsv.class)) {
                wnx wnx = new wnx(this.h);
                wug wug = new wug(this.g, wnx, this.i);
                wug.a_(akor, (axsv) ajzv.a(a2, axsv.class));
                this.b.addView(wug.a);
                wnx.a(new woc(new wty(this, wug)));
            }
        }
        View view = this.b;
        if (view.getChildCount() <= 0) {
            z = false;
        }
        xpr.a(view, z);
        acvx.a(axsl.f.d(), null);
    }

    public final void a(akpb akpb) {
        this.b.removeAllViews();
    }
}
