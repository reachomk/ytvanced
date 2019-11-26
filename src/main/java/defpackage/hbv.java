package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hbv */
public final class hbv extends absu {
    private final aaas b;
    private final abqn c;

    hbv(Context context, aaas aaas, bcaa bcaa, akvz akvz) {
        super(context, akvz);
        this.b = aaas;
        this.c = new hbu(bcaa);
    }

    /* Access modifiers changed, original: protected|final */
    public final int b() {
        return R.layout.live_chat_light_auto_mod_item;
    }

    public final int f() {
        return R.layout.live_chat_auto_mod_button_grey_light;
    }

    /* Access modifiers changed, original: protected|final */
    public final View c() {
        return this.a.findViewById(R.id.warning_icon);
    }

    /* Access modifiers changed, original: protected|final */
    public final TextView d() {
        return (TextView) this.a.findViewById(R.id.header_text);
    }

    /* Access modifiers changed, original: protected|final */
    public final ViewGroup e() {
        return (ViewGroup) this.a.findViewById(R.id.auto_mod_buttons);
    }

    /* Access modifiers changed, original: protected|final */
    public final ViewGroup g() {
        return (ViewGroup) this.a.findViewById(R.id.auto_moderated_item);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(apxu apxu) {
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.c);
        this.b.a(apxu, hashMap);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(apxu apxu) {
        this.b.a(apxu, null);
    }
}
