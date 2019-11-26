package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Set;

/* renamed from: alex */
public final class alex implements OnDismissListener {
    public final Context a;
    public final aaas b;
    public final Set c = new HashSet();
    public View d;
    public albo e;
    public aqhy f;
    public boolean g;
    public apxu h;

    public alex(Context context, aaas aaas) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (aaas) amqw.a((Object) aaas);
    }

    public final void onDismiss() {
        if (!this.g) {
            apxu apxu = this.h;
            if (apxu != null) {
                this.b.a(apxu, null);
            }
        }
        this.c.add(this.f);
        this.f = null;
        this.e = null;
        this.h = null;
        this.d = null;
    }

    public final void a(int i, aphj aphj) {
        aphg aphg;
        CharSequence charSequence = null;
        if (aphj == null) {
            aphg = null;
        } else {
            aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
        }
        TextView textView = (TextView) this.d.findViewById(i);
        textView.setOnClickListener(new alew(this, aphg));
        if (aphg != null) {
            arml arml = aphg.g;
            if (arml == null) {
                arml = arml.f;
            }
            charSequence = ajqy.a(arml);
        }
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(charSequence);
        textView.setVisibility(0);
    }
}
