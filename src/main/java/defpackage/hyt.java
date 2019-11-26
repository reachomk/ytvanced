package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: hyt */
public final class hyt implements aimd, akot {
    public apxu a;
    private final akkq b;
    private final View c;
    private final ImageView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final OnClickListener h;
    private aime i;
    private acvx j;
    private byte[] k;

    hyt(Context context, ViewGroup viewGroup, akkq akkq, aaas aaas, boolean z) {
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = LayoutInflater.from(context).inflate(!z ? R.layout.app_related_end_screen_playlist_item : R.layout.app_related_end_screen_playlist_item_performance, viewGroup, false);
        this.d = (ImageView) this.c.findViewById(R.id.thumbnail);
        this.e = (TextView) this.c.findViewById(R.id.title);
        this.g = (TextView) this.c.findViewById(R.id.metadata);
        this.f = (TextView) this.c.findViewById(R.id.video_count);
        this.h = new hys(this, aaas);
    }

    public final void a(float f, boolean z) {
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
            this.c.setOnClickListener(this.h);
            byte[] bArr = this.k;
            if (bArr != null) {
                this.j.a(new acvs(bArr), null);
            }
            return;
        }
        this.c.setOnClickListener(null);
        this.c.setClickable(false);
        abe.b(this.c, 4);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        CharSequence a;
        areh areh = (areh) obj;
        this.j = akor.a;
        this.k = areh.i.d();
        akkq akkq = this.b;
        ImageView imageView = this.d;
        aygk aygk = areh.c;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        TextView textView = this.e;
        arml arml = areh.b;
        if (arml == null) {
            arml = arml.f;
        }
        textView.setText(ajqy.a(arml));
        this.c.setContentDescription(this.e.getText());
        textView = this.g;
        if ((areh.a & 64) != 0) {
            arml = areh.f;
            if (arml == null) {
                arml = arml.f;
            }
            a = ajqy.a(arml);
        } else {
            arml = areh.g;
            if (arml == null) {
                arml = arml.f;
            }
            a = ajqy.a(arml);
        }
        textView.setText(a);
        textView = this.f;
        arml = areh.h;
        if (arml == null) {
            arml = arml.f;
        }
        textView.setText(ajqy.a(arml));
        this.f.setImportantForAccessibility(2);
        apxu apxu = areh.d;
        if (apxu == null) {
            apxu = apxu.d;
        }
        this.a = apxu;
        this.i = (aime) akor.a("visibility_change_listener");
        this.i.a(this);
        a(this.i.a);
    }
}
