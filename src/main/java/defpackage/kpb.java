package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.regex.Pattern;

/* renamed from: kpb */
final class kpb implements TextWatcher {
    private final /* synthetic */ koy a;

    kpb(koy koy) {
        this.a = koy;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        koy koy = this.a;
        String obj = editable.toString();
        koy.c.clear();
        if (obj.isEmpty()) {
            koy.c.addAll(koy.b);
        } else {
            Pattern compile = Pattern.compile(Pattern.quote(obj), 2);
            for (kpd kpd : koy.b) {
                if (compile.matcher(kpd.a()).find()) {
                    koy.c.add(kpd);
                }
            }
        }
        koy.e.m.aa_();
    }
}
