package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: aidl */
public final class aidl extends aiua implements aicu, aidj, OnClickListener {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.livestream_line1));
    private final TextView c = ((TextView) this.a.findViewById(R.id.livestream_line2));
    private final TextView d = ((TextView) this.a.findViewById(R.id.livestream_notification_text));
    private final View e = this.a.findViewById(R.id.livestream_notification_button);
    private final ImageView f = ((ImageView) this.a.findViewById(R.id.livestream_notification_icon));
    private final ImageView g = ((ImageView) this.a.findViewById(R.id.livestream_channel_image));
    private aict h;
    private aidm i;
    private int j;
    private int k;
    private CharSequence l;
    private CharSequence m;
    private final View n;
    private final TextView o;

    public aidl(Context context) {
        super(context);
        this.a = LayoutInflater.from(context).inflate(R.layout.livestream_offline_slate, this, true);
        this.e.setOnClickListener(this);
        this.n = this.a.findViewById(R.id.livestream_replay_button);
        this.o = (TextView) this.a.findViewById(R.id.livestream_replay_text);
        this.n.setOnClickListener(this);
        setClickable(false);
        setBackgroundColor(0);
        this.f.setImageAlpha(128);
        ag_();
    }

    public final void a(Bitmap bitmap) {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
            setClickable(bitmap != null);
        }
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final void a(aict aict) {
        this.h = (aict) amqw.a((Object) aict, (Object) "listener cannot be null");
    }

    public final void a(aidm aidm) {
        this.i = aidm;
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        this.b.setText(charSequence);
        this.c.setText(charSequence2);
        setVisibility(0);
        this.o.setText(charSequence3);
        this.e.setVisibility(8);
        this.n.setVisibility(0);
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, boolean z, CharSequence charSequence3, int i, CharSequence charSequence4, int i2) {
        this.b.setText(charSequence);
        this.c.setText(charSequence2);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.b.getLayoutParams();
        if (!TextUtils.isEmpty(charSequence2) || TextUtils.isEmpty(charSequence)) {
            layoutParams.addRule(2, R.id.livestream_text_anchor);
            layoutParams.removeRule(15);
        } else {
            layoutParams.removeRule(2);
            layoutParams.addRule(15);
        }
        this.b.setLayoutParams(layoutParams);
        int i3 = 0;
        setVisibility(0);
        aidm aidm = this.i;
        if (aidm != null) {
            aidm.f(true);
        }
        this.j = i2;
        this.k = i;
        this.l = charSequence4;
        this.m = charSequence3;
        a(z);
        this.n.setVisibility(8);
        View view = this.e;
        if (i <= 0) {
            i3 = 8;
        }
        view.setVisibility(i3);
    }

    public final void ag_() {
        setVisibility(8);
        aidm aidm = this.i;
        if (aidm != null) {
            aidm.f(false);
        }
    }

    public final void onClick(View view) {
        View view2 = this.e;
        if (view == view2) {
            a(view2.isSelected() ^ 1);
            this.h.b();
        }
        if (view == this.n) {
            this.h.a();
        }
    }

    private final void a(boolean z) {
        this.e.setSelected(z);
        int i = this.j;
        if (i != 0) {
            int i2 = this.k;
            if (i2 != 0) {
                ImageView imageView = this.f;
                if (!z) {
                    i = i2;
                }
                imageView.setImageResource(i);
            }
        }
        this.d.setText(!z ? this.m : this.l);
    }
}
