package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.ads.player.ui.AdProgressTextView;

/* renamed from: ibx */
final /* synthetic */ class ibx implements OnClickListener {
    private final ibv a;
    private final vzr b;

    ibx(ibv ibv, vzr vzr) {
        this.a = ibv;
        this.b = vzr;
    }

    public final void onClick(View view) {
        ibv ibv = this.a;
        vzr vzr = this.b;
        amqw.a(ibv.l);
        if (vzr.e && ((AdProgressTextView) vzr.c).a.a) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("menu_as_bottom_sheet", true);
            ibv.l.a(bundle);
        }
    }
}
