package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.youtube.R;

/* renamed from: kaf */
public final class kaf extends akpl {
    private final etb a;
    private final View b;

    public kaf(Context context, etd etd) {
        this.b = LayoutInflater.from(context).inflate(R.layout.toggle_button, null);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.channel_list_toggle_button_padding);
        this.b.setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        this.a = ((etd) amqw.a((Object) etd)).a(this.b);
    }

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
        this.a.a(null);
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ void a(akor akor, Object obj) {
        this.a.a((aphv) obj);
    }
}
