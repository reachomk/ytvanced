package defpackage;

import android.text.style.URLSpan;
import android.view.View;

/* renamed from: yzo */
final class yzo extends URLSpan {
    private final zas a;

    yzo(String str, zas zas) {
        super(str);
        this.a = (zas) amqw.a((Object) zas);
    }

    public final void onClick(View view) {
        this.a.a(getURL());
    }
}
