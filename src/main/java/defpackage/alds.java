package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import com.google.android.youtube.R;

/* renamed from: alds */
public final class alds extends akpl {
    public final CheckBox a = ((CheckBox) this.c.findViewById(R.id.checkbox));
    public String b;
    private final View c;

    alds(Context context) {
        this.c = LayoutInflater.from(context).inflate(R.layout.subscription_notification_secondary_option, null);
        this.a.setClickable(false);
        this.c.setOnClickListener(new aldv(this));
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        this.b = null;
        this.a.setOnCheckedChangeListener(null);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        arml arml;
        axxv axxv = (axxv) obj;
        this.b = (String) amqw.a((axxv.a & 32) != 0 ? axxv.f : null);
        if ((axxv.a & 4) != 0) {
            arml = axxv.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        Spanned a = ajqy.a(arml);
        this.a.setText(a);
        this.a.setContentDescription(a);
        aldp aldp = (aldp) akor.a(aldp.o);
        this.a.setOnCheckedChangeListener(null);
        if (aldp.b()) {
            this.c.setEnabled(false);
            this.c.setAlpha(0.5f);
            this.a.setEnabled(false);
            this.a.setChecked(false);
        } else {
            this.c.setEnabled(true);
            this.c.setAlpha(1.0f);
            this.a.setEnabled(true);
            this.a.setChecked(aldp.a(this.b));
        }
        this.a.setOnCheckedChangeListener(new aldu(this, aldp));
    }
}
