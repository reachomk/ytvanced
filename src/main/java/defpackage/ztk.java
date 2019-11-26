package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.preference.Preference;
import com.google.android.youtube.R;

/* renamed from: ztk */
public final class ztk extends Preference {
    public arqh a;
    public final aaas b;

    public ztk(Activity activity, aaas aaas, akkq akkq, zta zta, arqh arqh) {
        arml arml = null;
        super(activity, null);
        this.b = (aaas) amqw.a((Object) aaas);
        this.a = (arqh) amqw.a((Object) arqh);
        if ((arqh.a & 1) != 0) {
            arml = arqh.b;
            if (arml == null) {
                arml = arml.f;
            }
        }
        setTitle(ajqy.a(arml));
        if (zta.b()) {
            b();
            zta.a(new ztn(this));
        } else {
            a();
        }
        setOnPreferenceClickListener(new ztm(this));
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.third_party_icon_size);
        aygk aygk = arqh.e;
        if (aygk == null) {
            aygk = aygk.f;
        }
        Uri b = aklb.b(aygk, dimensionPixelSize);
        if (b != null) {
            setIcon(ra.a((Context) activity, (int) R.drawable.third_party_icon_placeholder));
            akkq.b(b, new ztp(this, activity));
        }
    }

    public final void a() {
        CharSequence a;
        arqh arqh = this.a;
        arml arml = null;
        if (arqh.f) {
            if ((arqh.a & 2) != 0) {
                arml = arqh.c;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            a = ajqy.a(arml);
        } else {
            if ((arqh.a & 4) != 0) {
                arml = arqh.d;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            a = ajqy.a(arml);
        }
        setSummary(a);
        setEnabled(true);
    }

    public final void b() {
        setSummary(" ");
        setEnabled(false);
    }
}
