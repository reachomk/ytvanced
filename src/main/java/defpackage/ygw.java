package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ygw */
public final class ygw implements akot {
    public apxu a;
    private final View b;
    private final ImageView c = ((ImageView) this.b.findViewById(R.id.icon));
    private final TextView d = ((TextView) this.b.findViewById(R.id.text));
    private final akvp e;

    public ygw(Context context, akvp akvp, aaas aaas) {
        this.e = (akvp) amqw.a((Object) akvp);
        this.b = LayoutInflater.from(context).inflate(R.layout.invite_more_link, null, false);
        this.b.setOnClickListener(new ygv(this, aaas));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.b;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        int a;
        aphg aphg = (aphg) obj;
        boolean z = false;
        if ((aphg.a & 16) != 0) {
            akvp akvp = this.e;
            arwf arwf = aphg.e;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a2 = arwh.a(arwf.b);
            if (a2 == null) {
                a2 = arwh.UNKNOWN;
            }
            a = akvp.a(a2);
        } else {
            a = 0;
        }
        arml arml = null;
        if (a != 0) {
            this.c.setImageResource(a);
        } else {
            this.c.setImageDrawable(null);
        }
        TextView textView = this.d;
        if ((aphg.a & 128) != 0) {
            arml = aphg.g;
            if (arml == null) {
                arml = arml.f;
            }
        }
        textView.setText(ajqy.a(arml));
        a = aphg.a;
        apxu apxu;
        if ((a & 8192) != 0) {
            apxu = aphg.n;
            if (apxu == null) {
                apxu = apxu.d;
            }
            this.a = apxu;
        } else if ((a & 2048) != 0) {
            apxu = aphg.l;
            if (apxu == null) {
                apxu = apxu.d;
            }
            this.a = apxu;
        } else {
            apxu = aphg.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            this.a = apxu;
        }
        View view = this.b;
        if (this.a != null) {
            z = true;
        }
        view.setClickable(z);
    }
}
