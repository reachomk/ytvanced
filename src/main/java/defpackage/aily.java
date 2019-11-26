package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: aily */
public final class aily implements aimd, akot {
    public apxu a;
    private final akkq b;
    private final View c;
    private final View d = this.c.findViewById(R.id.gradient_overlay);
    private final ImageView e = ((ImageView) this.c.findViewById(R.id.thumbnail));
    private final TextView f = ((TextView) this.c.findViewById(R.id.title));
    private final TextView g = ((TextView) this.c.findViewById(R.id.video_count));
    private final OnClickListener h;
    private aime i;
    private acvx j;
    private byte[] k;

    public aily(Context context, ViewGroup viewGroup, akkq akkq, aaas aaas) {
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = LayoutInflater.from(context).inflate(R.layout.related_end_screen_playlist_item, viewGroup, false);
        this.h = new ailx(this, aaas);
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        this.i.b(this);
    }

    public final void a(int i, int i2, int i3) {
        a(i2);
    }

    private final void a(int i) {
        if (i == 2) {
            abe.b(this.c, 0);
            this.e.setOnClickListener(this.h);
            this.j.a(this.k, null);
            return;
        }
        this.e.setOnClickListener(null);
        abe.b(this.c, 4);
    }

    public final void a(float f, boolean z) {
        this.d.setAlpha(f);
        this.f.setAlpha(f);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        areh areh = (areh) obj;
        this.j = akor.a;
        this.k = areh.i.d();
        akkq akkq = this.b;
        ImageView imageView = this.e;
        aygk aygk = areh.c;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        arml arml = areh.b;
        if (arml == null) {
            arml = arml.f;
        }
        Spanned a = ajqy.a(arml);
        this.f.setText(a);
        this.f.setImportantForAccessibility(2);
        this.e.setContentDescription(a);
        TextView textView = this.g;
        arml arml2 = areh.h;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        textView.setText(ajqy.a(arml2));
        this.g.setImportantForAccessibility(2);
        apxu apxu = areh.d;
        if (apxu == null) {
            apxu = apxu.d;
        }
        this.a = apxu;
        this.i = (aime) akor.a("visibility_change_listener");
        this.i.a(this);
        a(this.i.a);
        a(this.i.b, false);
    }
}
