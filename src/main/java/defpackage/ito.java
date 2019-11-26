package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ito */
public final class ito extends akpl implements OnClickListener, OnLayoutChangeListener {
    private final Activity a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final akkq e;
    private final ImageView f;
    private final ImageView g;
    private final ImageView h;
    private final ImageView i;
    private String j;
    private arqr k;
    private float l = 0.0f;

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i != i7 - i5) {
            this.l = ((float) this.h.getWidth()) / ((float) this.h.getHeight());
            b();
        }
    }

    private final void b() {
        if (this.k != null) {
            ImageView imageView;
            int round;
            if (this.h.getVisibility() == 0) {
                float f = this.l;
                if (f != 0.0f) {
                    imageView = this.h;
                    round = Math.round(f * 300.0f);
                } else {
                    return;
                }
            }
            imageView = this.g;
            round = 300;
            Builder path = new Builder().scheme("https").authority("maps.googleapis.com").path("/maps/api/staticmap");
            arqt arqt = this.k.f;
            if (arqt == null) {
                arqt = arqt.f;
            }
            path = path.appendQueryParameter("key", arqt.e);
            StringBuilder stringBuilder = new StringBuilder(23);
            stringBuilder.append(round);
            stringBuilder.append("x300");
            Builder appendQueryParameter = path.appendQueryParameter("size", stringBuilder.toString());
            arqt arqt2 = this.k.f;
            if (arqt2 == null) {
                arqt2 = arqt.f;
            }
            double d = arqt2.b;
            arqt arqt3 = this.k.f;
            if (arqt3 == null) {
                arqt3 = arqt.f;
            }
            double d2 = arqt3.c;
            StringBuilder stringBuilder2 = new StringBuilder(49);
            stringBuilder2.append(d);
            stringBuilder2.append(",");
            stringBuilder2.append(d2);
            appendQueryParameter = appendQueryParameter.appendQueryParameter("markers", stringBuilder2.toString());
            if (this.k.g.size() > 0) {
                StringBuilder stringBuilder3 = new StringBuilder();
                for (int i = 0; i < this.k.g.size(); i++) {
                    if (i > 0) {
                        stringBuilder3.append('|');
                    }
                    stringBuilder3.append(((arqv) this.k.g.get(i)).b);
                    stringBuilder3.append(',');
                    stringBuilder3.append(((arqv) this.k.g.get(i)).c);
                }
                appendQueryParameter.appendQueryParameter("visible", stringBuilder3.toString());
            }
            String.valueOf(appendQueryParameter.build()).length();
            this.e.a(imageView, appendQueryParameter.build());
        }
    }

    public final void onClick(View view) {
        String str = this.j;
        if (str != null) {
            this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        arqr arqr = (arqr) obj;
        int i = arqr.a;
        if ((i & 1) != 0 && (i & 16) != 0) {
            this.k = arqr;
            arqt arqt = arqr.f;
            if (arqt == null) {
                arqt = arqt.f;
            }
            this.j = arqt.d;
            TextView textView = this.c;
            arml arml = arqr.b;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
            textView = this.d;
            arml = arqr.c;
            if (arml == null) {
                arml = arml.f;
            }
            textView.setText(ajqy.a(arml));
            aygk aygk = arqr.d;
            if (aygk == null) {
                aygk = aygk.f;
            }
            if (aklb.a(aygk)) {
                akkq akkq = this.e;
                ImageView imageView = this.f;
                aygk aygk2 = arqr.d;
                if (aygk2 == null) {
                    aygk2 = aygk.f;
                }
                akkq.a(imageView, aygk2);
                this.f.setVisibility(0);
                this.g.setVisibility(0);
                this.h.setVisibility(4);
                b();
                return;
            }
            this.f.setVisibility(4);
            this.g.setVisibility(4);
            this.h.setVisibility(0);
            if (this.l > 0.0f) {
                b();
            }
        }
    }

    /* synthetic */ ito(Activity activity, akkq akkq, ViewGroup viewGroup) {
        this.a = activity;
        this.e = akkq;
        this.b = LayoutInflater.from(activity).inflate(R.layout.geo_details_card, viewGroup, false);
        this.c = (TextView) this.b.findViewById(R.id.place_name);
        this.d = (TextView) this.b.findViewById(R.id.place_address);
        this.f = (ImageView) this.b.findViewById(R.id.place_image);
        this.g = (ImageView) this.b.findViewById(R.id.place_map);
        this.h = (ImageView) this.b.findViewById(R.id.wide_place_map);
        this.i = (ImageView) this.b.findViewById(R.id.place_link_icon);
        this.g.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.b.addOnLayoutChangeListener(this);
    }
}
