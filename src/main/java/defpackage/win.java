package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;

/* renamed from: win */
final /* synthetic */ class win implements OnClickListener {
    private final wih a;
    private final String b;
    private final View c;

    win(wih wih, String str, View view) {
        this.a = wih;
        this.b = str;
        this.c = view;
    }

    public final void onClick(View view) {
        wih wih = this.a;
        String str = this.b;
        View view2 = this.c;
        wih.b.a(str, xwe.a(wih.a, R.attr.cmtCreatorHeartTooltipBg, 0), view2);
    }
}
